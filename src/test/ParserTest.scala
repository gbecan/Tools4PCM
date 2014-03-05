package test

import org.scalatest.FlatSpec
import scala.io.Source
import parser.WikipediaPCMParser
import org.scalatest.Matchers
import pcm.PCM
import scala.xml.XML
import scalaj.http.Http
import scalaj.http.HttpOptions

class ParserTest extends FlatSpec with Matchers {
  
  def parsePCMFromFile(file : String) : List[PCM]= {
    val reader= Source.fromFile(file)
    val code = reader.mkString
    reader.close
    val parser = new WikipediaPCMParser
    val preprocessedCode = parser.expandTemplates(code)
//    println(preprocessedCode)
    parser.parsePreprocessedCode(preprocessedCode)
  }
  
  def parsePCMFromURL(title : String) : List[PCM] = {
    (new WikipediaPCMParser).parseOnlineArticle(title)
  }

  "The PCM parser" should "parse the example of tables from Wikipedia" in {
    val pcms = parsePCMFromFile("resources/example.pcm")
    pcms.foreach(println)
    pcms.size should be (1)
   }
  
  it should "parse Comparison of AMD processors" in {
    val pcms = parsePCMFromFile("resources/amd.pcm")
    pcms.foreach(println)
    pcms.size should be (1)
  }
  
   it should "parse Comparison of European Traffic Laws" in {
    val pcms = parsePCMFromFile("resources/european_traffic_laws.pcm")
    pcms.foreach(println)
    pcms.size should be (1)
  }
   
   it should "parse List of free and open-source Android applications" in {
    val pcms = parsePCMFromURL("List_of_free_and_open-source_Android_applications")
    pcms.foreach(println)
    pcms.size should be (6)
  }
   
   
   
   it should "parse the same PCM from a URL and from a file containing the code" in {
     val fromFile = parsePCMFromFile("resources/amd.pcm")
     val fromURL = (new WikipediaPCMParser).parseOnlineArticle("Comparison_of_AMD_processors")
     
     fromFile.size should be (1)
     fromURL.size should be (1)
     fromFile(0).toString should be (fromURL(0).toString)
     
   }
 
   
   "Scala" should "download the code of a wikipedia page" in {
	   val xmlPage = Http("http://en.wikipedia.org/w/index.php?title=Comparison_of_AMD_processors&action=edit")
	   .option(HttpOptions.connTimeout(1000))
	   .option(HttpOptions.readTimeout(10000))
	   .asXml
	   //XML.load("http://en.wikipedia.org/w/index.php?title=Comparison_of_AMD_processors&action=edit")
	   val code = (xmlPage \\ "textarea").text
	   
	   val expectedCode = Source.fromFile("resources/amd.pcm").mkString
	   code should be (expectedCode)
	   
   }
   
   it should "download the code of a wikipedia template" in {
     val xmlPage = Http.post("https://en.wikipedia.org/wiki/Special:ExpandTemplates")
     .params("wpInput" -> "{{yes}}")
     .asXml
     
     val code = (xmlPage \\ "textarea").filter(_.attribute("id") exists (_.text == "output")).text
     code should be ("style=\"background: #90ff90; color: black; vertical-align: middle; text-align: center; \" class=\"table-yes\"|Yes")

     
     
   }
}
