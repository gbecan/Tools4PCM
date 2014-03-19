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
import org.sweble.wikitext.`lazy`.parser.Ticks
import org.sweble.wikitext.`lazy`.parser.SemiPre
import org.sweble.wikitext.`lazy`.parser.ExternalLink
import org.sweble.wikitext.`lazy`.utils.XmlCharRef
import org.sweble.wikitext.`lazy`.parser.TableCaption
import org.sweble.wikitext.`lazy`.parser.DefinitionList
import org.sweble.wikitext.`lazy`.parser.Section
import org.sweble.wikitext.`lazy`.parser.Itemization
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Stack
import org.sweble.wikitext.`lazy`.parser.DefinitionDefinition
import pcm.Matrix
import pcm.Cell
import java.util.regex.Pattern

class TableVisitor extends AstVisitor {

	val matrices : ListBuffer[Matrix] = ListBuffer()
  
	private val matrixStack : Stack[Matrix] = new Stack()
	private def currentMatrix = matrixStack.top
	
	private val rowStack : Stack[Int] = new Stack()
	private val columnStack : Stack[Int] = new Stack()
	
	private var row : Int = 0
	private var column : Int = 0
	
	private var rowspan : Int = 0
	private var colspan : Int = 0
	
	private var cellContent : StringBuilder = new StringBuilder
		
	private var inXMLElement : Boolean = false

	private val trimPattern : Pattern = Pattern.compile("\\s*(.*?)\\s*")
	/**
	 * Remove spaces before and after the string
	 */
	def trim(s : String) : String = {
	  val matcher = trimPattern.matcher(s)
	  if (matcher.matches() && matcher.groupCount() == 1) {
		  matcher.group(1)
	  } else {
		  ""
	  }
	}
	
	def visit(e : Table) = {
	  val matrix = new Matrix
	  matrixStack.push(matrix)
	  matrices += matrix
	  
	  // Save old values of row and column
	  rowStack.push(row)
	  columnStack.push(column)
	  row = 0
	  column = 0
	  
	  // Iterate over each row
	  iterate(e)
	  
	  matrixStack.pop
	  
	  // Clear previous cell
	  cellContent = new StringBuilder()
	  
	  // Restore old values of row and column
	  rowStack.pop
	  columnStack.pop
	  if (!rowStack.isEmpty && !columnStack.isEmpty) {
		  row = rowStack.top
		  column = columnStack.top  
	  }
	}

	def visit(e : NodeList) = {
		iterate(e)
	}

	def visit(e : XmlAttribute) = {
	  	val name = e.getName()

	  	if (!e.getValue().isEmpty()) {
	  		val value = e.getValue().get(0) match {
	  			case t:Text => t.getContent() 
	  			case _ => ""
	  		}
	  	
	  		name match {
	  		case "rowspan" => rowspan = getNumberFromString(value)
	  		case "colspan" => colspan = getNumberFromString(value)
	  		case _ => 
	  		}
	  	}

	}
	
	def getNumberFromString(s: String) : Int = {
	  val numberRegex = "(\\d)*".r
	  (numberRegex findFirstIn s).getOrElse("0").toInt
	}
		
	def visit(e : TableRow) = {
	  if (row == 0 && !currentMatrix.cells.isEmpty) {
	    row += 1
	    column = 0
	  }
	  if (!e.getBody().isEmpty()) {
		  iterate(e)
		  row += 1
		  column = 0  
	  }
	}

	def visit(e : TableHeader) = {
		handleCell(e, true)
	}

	def visit(e : TableCell) = {
		handleCell(e, false)
	}
	
	def handleCell(e : AstNode, isHeader : Boolean) {
//		println(e)

		rowspan = 1
		colspan = 1

		if (!inXMLElement) {
			// Skip cells defined by rowspan
			while (currentMatrix.getCell(row, column).isDefined) {
				column += 1
			}
		}

		cellContent = new StringBuilder()
		iterate(e)

		if(!inXMLElement) {
		  val cell = new Cell(trim(cellContent.toString), isHeader, row, rowspan, column, colspan)
			
		  // Handle rowspan and colspan
		  for (rowShift <- 0 until rowspan; colShift <- 0 until colspan) {
			  currentMatrix.setCell(cell, row + rowShift, column + colShift)
		  }
		  
		  column += colspan
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
		    val target = e.getTarget()
		    cellContent ++= target.getProtocol() + ":" + target.getPath()
		  } else {
		    dispatch(e.getTitle())
		  }
	  }
	}
	
	def visit(e : LinkTitle) = {
	  iterate(e)
	}

	def visit(e : Whitespace) = {
//	  if (e.getHasNewline()) {
//	    cellContent += '\n'
//	  }
	}

	def visit(e : XmlElementOpen) = {
	  e.getName() match {
	    case "br" => cellContent += '\n'
	    case "small" => 
	    case "abbr" =>
	    case "center" =>
//	    case "span" =>
	    case _ => inXMLElement = true 
	  }
	}

	def visit(e : XmlElementClose) = {
		inXMLElement = false
	}

	def visit(e : XmlElementEmpty) = {
		e.getName() match {
		case "br" => cellContent += '\n'
		case _ =>
		}
	}

	def visit(e : XmlEntityRef) = {
	  if (!inXMLElement) {
	    val value = e.getName() match {
	      case "nbsp" => 160.toChar.toString
	      case _ => ""
	    }
	    
	    cellContent ++= value
	  }
	}

	def visit(e : XmlCharRef) = {
	  cellContent += e.getCodePoint().toChar
	} 
	
	def visit(e : XmlAttributeGarbage) = {
		cellContent ++= e.getContent() + "|"
	}

	def visit(e : Url) = {
//		println(e.getPath())
	}
	
	def visit(e : Ticks) = {
	  
    }
	
	def visit(e : SemiPre) = {

	}
	
	def visit(e : TableCaption) {
	  
	}
	
	def visit(e : DefinitionList) {
	  val it = e.getContent().iterator()
	  var first = true
	  
	  while (it.hasNext()) {
	    val definition = it.next()
	    
	    // Each element of a definition list is separated by a line break
	    if (first) {
	      first = false
	    } else {
	      cellContent += '\n'
	    }
	    
	    dispatch(definition)
	  }
	}
	
	def visit(e : DefinitionDefinition) {
	  iterate(e)
	}
	
	def visit(e : Section) {
	  
	}
	
	def visit(e : Itemization) {
	  
	}

}