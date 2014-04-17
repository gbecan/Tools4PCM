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
import scala.xml.PrettyPrinter
import scala.concurrent._
import scala.concurrent.duration._
import scala.io.Codec
import java.nio.charset.Charset
import java.util.concurrent.Executors
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import java.util.Collections
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import java.io.StringWriter
import java.io.PrintWriter
import parser.WikipediaPCMParser

class ParserTest extends FlatSpec with Matchers {
  
  val executionContext = ExecutionContext.fromExecutor(Executors.newFixedThreadPool(20))
  
  def parsePCMFromFile(file : String) : PCM= {
    val reader= Source.fromFile(file)
    val code = reader.mkString
    reader.close
    val parser = new WikipediaPCMParser
    parser.preprocessAndParse(code)
  }
  
  def parseFromTitle(title : String) : PCM = {
    (new WikipediaPCMParser).parseOnlineArticle(title)
  }
  
  def parseFromOfflineCode(title : String) : PCM = {
    val parser = new WikipediaPCMParser
    val code = Source.fromFile("input/" + title.replaceAll(" ", "_") + ".txt").getLines.mkString("\n")
    parser.parse(code)
  }
  
  def testArticle(title : String) : PCM = {
    val pcm = parseFromOfflineCode(title)
    writeToHTML(title, pcm)
    dumpCellsInFile(title, pcm)
    writeToPCMModel(title, pcm)
    writeToCSV(title, pcm)
    pcm
  }
  
  def writeToHTML(title : String, pcm : PCM) {
    val writer = new FileWriter("output/html/" + title.replaceAll(" ", "_") + ".html")
    writer.write((new PrettyPrinter(80,2)).format(pcm.toHTML))
    writer.close()
  }
  
  def dumpCellsInFile(title : String, pcm : PCM) {
    val writer = new FileWriter("output/dump/" + title.replaceAll(" ", "_") + ".txt")
    for(matrix <- pcm.getMatrices; 
    row <- 0 until matrix.getNumberOfRows; 
    column <- 0 until matrix.getNumberOfColumns) {
      val cell = matrix.getCell(row, column)
      if (cell.isDefined) {
        val content = cell.get.content
        val words = for (word <- content.split("\\s") if !word.isEmpty()) yield word
        val formattedContent = words.mkString("", " ", "").toLowerCase()
        writer.write(formattedContent + "\n")
      }
    }
    writer.close()
  }
  
  def writeToPCMModel(title : String, pcm : PCM) {
     val path = "output/models/" + title.replaceAll(" ", "_") + ".pcm"
     
    // Save model in file
     val reg = Resource.Factory.Registry.INSTANCE;
     val m = reg.getExtensionToFactoryMap();
     m.put("pcm", new XMIResourceFactoryImpl());
     val resSet = new ResourceSetImpl();
     val resource = resSet.createResource(URI.createURI(path));
     val pcmModel = pcm.toPCMModel
     pcmModel.setName(title.replaceAll(" ", "_"))
     resource.getContents().add(pcmModel);
     resource.save(Collections.EMPTY_MAP);
  }

  def writeToCSV(title : String, pcm : PCM) {
    val writer = new FileWriter("output/csv/" + title.replaceAll(" ", "_") + ".csv")
    writer.write(pcm.toCSV)
    writer.close()
  }
  
  "The PCM parser" should "parse the example of tables from Wikipedia" in {
    val pcm = parsePCMFromFile("resources/example.pcm")
    println(pcm)
    pcm.getMatrices.size should be (1)
   }
  
  it should "parse Comparison of AMD processors" in {
    val pcm = testArticle("Comparison of AMD processors")
    pcm.getMatrices.size should be (1)
    
  }
  
   it should "parse Comparison of European Traffic Laws" in {
    val pcm = testArticle("Comparison of European traffic laws")
    pcm.getMatrices.size should be (1)
  }
   
   it should "parse List of free and open-source Android applications" in {
    val pcm = testArticle("List_of_free_and_open-source_Android_applications")
    pcm.getMatrices.size should be (6)
  }
   
   it should "parse this file correctly" in {
    val pcms = testArticle("Comparison_of_web_browsers")
   }
      
   
   it should "parse the same PCM from a URL and from a file containing the code" in {
     val fromFile = parsePCMFromFile("resources/amd.pcm")
     val fromURL = parseFromTitle("Comparison_of_AMD_processors")
     
     fromFile.getMatrices.size should be (1)
     fromURL.getMatrices.size should be (1)
     fromFile.getMatrices(0).toString should be (fromURL.getMatrices(0).toString)
     
   }
   
   it should "parse every available PCM in Wikipedia" in {
	   val wikipediaPCMsFile = Source.fromFile("resources/list_of_PCMs.txt")
	   val wikipediaPCMs = wikipediaPCMsFile.getLines.toList
	   wikipediaPCMsFile.close
	   
	   for(article <- wikipediaPCMs) {
	     if (article.startsWith("//")) {
	       println("IGNORED : " + article)
	     } else {
	    	 println(article)
	    	 try {
	    		 val pcms = testArticle(article)
	    	 } catch {
	    	 case e : Throwable => e.printStackTrace() 
	    	 }    
	     }
	   } 

   }
   
   it should "parse these PCMs" in {
	   val wikipediaPCMs = Source.fromFile("resources/pcms_to_test.txt").getLines.toList
	   val tasks : Seq[Future[String]] = for(article <- wikipediaPCMs) yield future {
	     var result = new StringBuilder
	     if (article.startsWith("//")) {
	       result ++= "IGNORED : " + article
	     } else {
	    	 result ++= article
	    	 var retry = false
	    	 do {
	    		 try {
	    			 val pcms = testArticle(article)
	    		 } catch {
//	    		 case e : UnknownHostException => retry = true
	    		 case e : Throwable => 
	    		 	val sw = new StringWriter();
					val pw = new PrintWriter(sw);
					e.printStackTrace(pw);
					result ++= sw.toString();
	    		 }  
	    	 } while (retry)
	     }
	     result.toString
	   } (executionContext)
	   
	   for (task <- tasks) {
         val result = Await.result(task, 10.minutes)
         println(result)
       }
   }
   
   
   it should "export to PCM Metamodel" in {
     val title = "Comparison of AMD processors".replaceAll(" ", "_")
     val pcm = parseFromTitle(title)
     writeToPCMModel(title, pcm)
   }
   
   it should "preprocess every available Wikipedia PCM" in {
      val wikipediaPCMsFile = Source.fromFile("resources/list_of_PCMs.txt")
	   val wikipediaPCMs = wikipediaPCMsFile.getLines.toList
	   wikipediaPCMsFile.close
	   
	   val tasks : Seq[Future[String]] = for(article <- wikipediaPCMs) yield future {
	     var result = new StringBuilder
	     if (article.startsWith("//")) {
	       result ++= "IGNORED : " + article
	     } else {
	    	 result ++= article
	    	 var retry = false
	    	 do {
	    		 try {
	    			 val parser = new WikipediaPCMParser
	    			 val preprocessedCode = parser.preprocessOnlineArticle(article)
	    			 val writer = new FileWriter("input/" + article.replaceAll(" ", "_") + ".txt")
	    			 writer.write(preprocessedCode)
	    			 writer.close()
	    		 } catch {
//	    		 case e : UnknownHostException => retry = true 
	    		 	case e : Throwable => 
		    		 	val sw = new StringWriter();
						val pw = new PrintWriter(sw);
						e.printStackTrace(pw);
						result ++= sw.toString();
	    		 }    
	    	 } while (retry)
	     }
	     result.toString
	   } (executionContext)

       for (task <- tasks) {
         val result = Await.result(task, 10.minutes)
         println(result)
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
