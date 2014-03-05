package parser

import de.fau.cs.osr.ptk.common.AstVisitor
import org.sweble.wikitext.`lazy`.parser.Table
import de.fau.cs.osr.ptk.common.ast.NodeList
import org.sweble.wikitext.`lazy`.utils.XmlAttribute
import org.sweble.wikitext.`lazy`.parser.TableRow
import org.sweble.wikitext.`lazy`.parser.TableHeader
import org.sweble.wikitext.`lazy`.parser.TableCell
import org.sweble.wikitext.`lazy`.postprocessor.ImTagOpen
import org.sweble.wikitext.`lazy`.postprocessor.ImTagClose
import de.fau.cs.osr.ptk.common.ast.Text
import org.sweble.wikitext.`lazy`.parser.InternalLink
import org.sweble.wikitext.`lazy`.parser.Whitespace
import org.sweble.wikitext.`lazy`.parser.XmlElementOpen
import org.sweble.wikitext.`lazy`.parser.Url
import org.sweble.wikitext.`lazy`.parser.XmlElementClose
import org.sweble.wikitext.`lazy`.parser.XmlElementEmpty
import org.sweble.wikitext.`lazy`.utils.XmlEntityRef
import org.sweble.wikitext.`lazy`.parser.LinkTitle
import de.fau.cs.osr.ptk.common.ast.AstNode
import org.sweble.wikitext.`lazy`.utils.XmlAttributeGarbage
import org.sweble.wikitext.`lazy`.parser.MagicWord
import pcm.Cell
import pcm.PCM
import org.sweble.wikitext.`lazy`.parser.Ticks
import org.sweble.wikitext.`lazy`.parser.SemiPre
import org.sweble.wikitext.`lazy`.parser.ExternalLink

class TableVisitor extends AstVisitor {

	val pcm : PCM = new PCM
	
	var row : Int = 0
	var column : Int = 0
	
	var currentCell : Cell = _
	var cellContent : StringBuilder = _
	
	var inXMLElement : Boolean = false

	def visit(e : Table) = {
		iterate(e)
	}

	def visit(e : NodeList) = {
		iterate(e)
	}

	def visit(e : XmlAttribute) = {
	  	val name = e.getName()
	  	val value = e.getValue().get(0) match {
	  	  case t:Text => t.getContent() 
	  	  case _ => ""
	  	}
	  	
	  	name match {
	  	  case "rowspan" => handleRowspan(value.toInt)
	  	  case "colspan" => handleColspan(value.toInt)
	  	  case _ => 
	  	}

	}
	
	def handleRowspan(value : Int) {
		if (!inXMLElement) {
			for (i <- 1 until value) {
				pcm.setCell(currentCell, row + i, column)
			}
		}
	}
	
	def handleColspan(value : Int) {
		if (!inXMLElement) {
			for (i <- 1 until value) {
				column += 1
						pcm.setCell(currentCell, row, column)
			}
		}
	}

	def visit(e : TableRow) = {
	  if (row == 0 && !pcm.cells.isEmpty) {
	    row += 1
	    column = 0
	  }
	  iterate(e)
	  row += 1
	  column = 0
	}

	def visit(e : TableHeader) = {
		handleCell(e)
		currentCell.isHeader = true
	}

	def visit(e : TableCell) = {
		handleCell(e)
		currentCell.isHeader = false
	}
	
	def handleCell(e : AstNode) {
	  if (!inXMLElement) {
		  // Skip cells defined by rowspan
		  while (pcm.getCell(row, column).isDefined) {
			  column += 1
		  }

		  currentCell = new Cell()  
		  pcm.setCell(currentCell, row, column)

		  cellContent = new StringBuilder()
		  iterate(e)
//		  cellContent ++= " ----- " + e.toString()
		  currentCell.content = cellContent.toString
		  
		  column += 1
	  } else {
	    currentCell = new Cell()  
	    iterate(e)
	  }
	} 

	
	def visit(e : ImTagOpen) = {

	}

	def visit(e : ImTagClose) = {

	}

	def visit(e : Text) = {
	  if (!inXMLElement) {
	    cellContent ++= e.getContent()
	  }
	  iterate(e) 
	}

	def visit(e : InternalLink) = {
	  if (!inXMLElement) {
		  if (e.getTitle().getContent().isEmpty()) {
		    cellContent ++= e.getTarget()
		  } else {
		    dispatch(e.getTitle())
		  }
	  }
	}
	
	def visit(e : ExternalLink) = {
	  if (!inXMLElement) {
		  if (e.getTitle().isEmpty()) {
		    cellContent ++= e.getTarget().getPath()
		  } else {
		    dispatch(e.getTitle())
		  }
	  }
	}
	
	def visit(e : LinkTitle) = {
	  iterate(e)
	}

	def visit(e : Whitespace) = {
	  
	}

	def visit(e : XmlElementOpen) = {
	  e.getName() match {
	    case "br" => 
	      inXMLElement = false
	      cellContent += '\n'
	    case "small" => inXMLElement = false
	    case "abbr" => inXMLElement = false
	    case _ => inXMLElement = true 
	  }
	}

	def visit(e : XmlElementClose) = {
		inXMLElement = false
	}

	def visit(e : XmlElementEmpty) = {

	}

	def visit(e : XmlEntityRef) = {

	}

	def visit(e : XmlAttributeGarbage) = {
		cellContent ++= e.getContent() + "|"
	}

	def visit(e : Url) = {
//		println(e.getPath())
	}
	
	def visit(e : Ticks) = {
	  
    }
	

}