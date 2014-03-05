package parser

import de.fau.cs.osr.ptk.common.AstVisitor
import org.sweble.wikitext.`lazy`.parser.LazyParsedPage
import de.fau.cs.osr.ptk.common.ast.NodeList
import org.sweble.wikitext.`lazy`.postprocessor.ImTagOpen
import de.fau.cs.osr.ptk.common.ast.Text
import org.sweble.wikitext.`lazy`.parser.Whitespace
import org.sweble.wikitext.`lazy`.postprocessor.ImTagClose
import org.sweble.wikitext.`lazy`.parser.Table
import org.sweble.wikitext.`lazy`.parser.Section
import de.fau.cs.osr.ptk.common.ast.AstNode
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ListBuffer
import org.sweble.wikitext.`lazy`.parser.Itemization
import org.sweble.wikitext.`lazy`.parser.InternalLink
import org.sweble.wikitext.`lazy`.utils.XmlAttributeGarbage
import org.sweble.wikitext.`lazy`.preprocessor.LazyPreprocessedPage
import pcm.PCM
import org.sweble.wikitext.`lazy`.parser.DefinitionList
import org.sweble.wikitext.`lazy`.parser.XmlElementClose
import org.sweble.wikitext.`lazy`.parser.XmlElementOpen
import org.sweble.wikitext.`lazy`.parser.SemiPre
import org.sweble.wikitext.`lazy`.parser.Ticks
import org.sweble.wikitext.`lazy`.parser.ExternalLink
import org.sweble.wikitext.`lazy`.parser.XmlElementEmpty
import org.sweble.wikitext.`lazy`.utils.XmlEntityRef
import org.sweble.wikitext.`lazy`.parser.Url

class PageVisitor extends AstVisitor{
  
  var pcms : ListBuffer[PCM] = ListBuffer()

  def getPCMs() : List[PCM] = {
    pcms.toList
  }
  
  def visit(e : LazyParsedPage) = {
    iterate(e)
  }
  
  def visit(e : NodeList) = {
    iterate(e)
  }
  
  def visit(e : Table) = {
	  val tableVisitor = new TableVisitor
	  tableVisitor.go(e)
	  pcms += tableVisitor.pcm
  }
  
  def visit(e : ImTagOpen) = {
    
  }
  
  def visit(e : ImTagClose) = {

  }
  
  
  def visit(e : Text) = {

  }
  
  def visit(e : Whitespace) = {

  }
  
  def visit(e : Section) = {
	  iterate(e)
  }
  
  def visit(e : Itemization) = {
    
  }
  
  def visit(e : InternalLink) = {
    
  }
  
  def visit(e : ExternalLink) = {
	  
  }
  
  def visit(e : DefinitionList) = {
    
  }
  
  def visit(e : XmlElementOpen) = {
    
  }
  
  def visit(e : XmlElementClose) = {
    
  }
  
  def visit(e : XmlElementEmpty) = {
    
  }

  def visit(e : XmlEntityRef) = {

  }
  	
  def visit(e : SemiPre) = {

  }
  
  def visit(e : Ticks) = {

  }
  
  	def visit(e : Url) = {

	}
  
  
}