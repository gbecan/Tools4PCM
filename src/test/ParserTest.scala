package test

import org.scalatest.FlatSpec
import scala.io.Source
import parser.WikipediaPCMParser
import org.scalatest.Matchers
import pcm.PCM
import scala.xml.XML
import scalaj.http.Http
import scalaj.http.HttpOptions
import java.net.URL
import java.io.FileWriter
import org.scalatest.prop.TableDrivenPropertyChecks
import java.net.UnknownHostException

class ParserTest extends FlatSpec with Matchers with TableDrivenPropertyChecks {
  
  def parsePCMFromFile(file : String) : List[PCM]= {
    val reader= Source.fromFile(file)
    val code = reader.mkString
    reader.close
    val parser = new WikipediaPCMParser
    parser.parse(code)
  }
  
  def parseFromTitle(title : String) : List[PCM] = {
    (new WikipediaPCMParser).parseOnlineArticle(title)
  }
  
  def testArticle(title : String) : List[PCM] = {
    val pcms = parseFromTitle(title)
    val writer = new FileWriter("output/" + title.replaceAll(" ", "_") + ".html")
    pcms.foreach(pcm => writer.write(pcm.toHTML))
    writer.close()
    pcms
  }

  "The PCM parser" should "parse the example of tables from Wikipedia" in {
    val pcms = parsePCMFromFile("resources/example.pcm")
    pcms.foreach(println)
    pcms.size should be (1)
   }
  
  it should "parse Comparison of AMD processors" in {
    val pcms = testArticle("Comparison of AMD processors")
    pcms.size should be (1)
    
  }
  
   it should "parse Comparison of European Traffic Laws" in {
    val pcms = testArticle("Comparison of European traffic laws")
    pcms.size should be (1)
  }
   
   it should "parse List of free and open-source Android applications" in {
    val pcms = testArticle("List_of_free_and_open-source_Android_applications")
    pcms.size should be (6)
  }
   
   it should "parse this file correctly" in {
    val pcms = testArticle("Comparison_of_web_browsers")
   }
      
   
   it should "parse the same PCM from a URL and from a file containing the code" in {
     val fromFile = parsePCMFromFile("resources/amd.pcm")
     val fromURL = parseFromTitle("Comparison_of_AMD_processors")
     
     fromFile.size should be (1)
     fromURL.size should be (1)
     fromFile(0).toString should be (fromURL(0).toString)
     
   }
   
   it should "parse every available PCM in Wikipedia" in {
	   val wikipediaPCMs = Source.fromFile("resources/list_of_PCMs.txt").getLines.toList
	   for(article <- wikipediaPCMs) {
	     println(article)
	     var retry = false
	     do {
		     try {
		    	 val pcms = testArticle(article)
		     } catch {
		       case e : UnknownHostException => retry = true 
		     }  
	     } while (retry)
	   }
   }
   
   

   
   "Scalaj-http" should "download the code of a wikipedia page" in {
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
