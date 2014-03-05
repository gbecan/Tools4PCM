package parser

import java.util.HashSet
import org.sweble.wikitext.`lazy`.LazyParser
import org.sweble.wikitext.engine.config.MagicWord
import org.sweble.wikitext.engine.utils.SimpleWikiConfiguration
import pcm.PCM
import java.net.URL
import scalaj.http.Http
import scalaj.http.HttpOptions
import scala.xml.XML
import org.ccil.cowan.tagsoup.jaxp.SAXFactoryImpl
import scala.io.Source
import org.xml.sax.InputSource
import scala.xml.parsing.NoBindingFactoryAdapter
import java.io.StringReader
import scala.xml.Node

class WikipediaPCMParser {
  
  def parseOnlineArticle(title : String) : List[PCM] = {
    val code = getPageCode(title)
    val preprocessedCode = expandTemplates(code)
    parsePreprocessedCode(preprocessedCode) 
  }

  /**
   * Get page code on English version of Wikipedia
   */
  def getPageCode(title : String) : String = {
    val editPage = Http("http://en.wikipedia.org/w/index.php")
    .params("title" -> title, "action" -> "edit")
    .option(HttpOptions.connTimeout(1000))
    .option(HttpOptions.readTimeout(30000))
    .asString
   
    val xml = parseHTMLAsXML(editPage)
    val code = (xml \\ "textarea").text
    
    code
  }
  
  /**
   * Expand templates in WikiCode with the special page on English version of Wikipedia
   */
  def expandTemplates(wikiCode : String) : String = {
    val expandTemplatesPage = Http.post("https://en.wikipedia.org/wiki/Special:ExpandTemplates")
     .params("wpInput" -> wikiCode, "wpRemoveComments" -> "1")
     .option(HttpOptions.connTimeout(1000))
	 .option(HttpOptions.readTimeout(30000))
     .asString
    
    val xml = parseHTMLAsXML(expandTemplatesPage)
     
    val textareas = (xml \\ "textarea")
    textareas.filter(_.attribute("id") exists (_.text == "output")).text
  }
  
  def parsePreprocessedCode(wikiCode : String) : List[PCM] = {
    val config = new SimpleWikiConfiguration()
    val aliases = new HashSet[String]()
    aliases.add("Yes")
    aliases.add("yes")
    config.addMagicWord(new MagicWord("Yes", false, aliases))
	val parser = new LazyParser(config)
	val ast = parser.parseArticle(wikiCode, "");
    val visitor = new PageVisitor
    visitor.go(ast)
    visitor.getPCMs()
  }
  
  private def parseHTMLAsXML(htmlCode : String) : Node = {
    val adapter = new NoBindingFactoryAdapter
    val htmlParser = (new SAXFactoryImpl).newSAXParser()
    val xml = adapter.loadXML(new InputSource(new StringReader(htmlCode)), htmlParser)
    xml
  }
  
}