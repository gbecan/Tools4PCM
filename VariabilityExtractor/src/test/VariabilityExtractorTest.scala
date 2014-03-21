package test

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import scala.io.Source
import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import pcmmm.PCM
import org.eclipse.emf.common.util.URI
import extractor.VariabilityExtractor
import java.util.Collections
import pcmmm.PcmmmPackage
import extractor.PCMNormalizer
import scala.collection.JavaConversions._
import pcmmm.Extra
import pcmmm.Header
import interpreters.PatternInterpreter
import interpreters.SimplePatternInterpreter
import interpreters.BooleanPatternInterpreter
import interpreters.MultiplePatternInterpreter
import interpreters.UnknownPatternInterpreter
import export.PCM2HTML
import java.io.FileWriter
import scala.xml.PrettyPrinter
import pcmmm.ValuedCell
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.common.util.Diagnostic

class VariabilityExtractorTest extends FlatSpec with Matchers {

  def loadPCMModel(file : File) : PCM = {
    // Initialize the model
    PcmmmPackage.eINSTANCE.eClass();
    
    // Register the XMI resource factory for the .website extension

    val reg = Resource.Factory.Registry.INSTANCE
    val m = reg.getExtensionToFactoryMap()
    m.put("pcm", new XMIResourceFactoryImpl())

    // Obtain a new resource set
    val resSet = new ResourceSetImpl()

    // Get the resource
    val resource = resSet.getResource(URI.createURI(file.getAbsolutePath()), true)
    // Get the first model element and cast it to the right type, in my
    // example everything is hierarchical included in this first node
    val pcm = resource.getContents().get(0).asInstanceOf[PCM]
    pcm
  }
  
  def savePCMModel(pcm : PCM, name : String) {
     val path = "output/models/" + name
     
     // Save model in file
     val reg = Resource.Factory.Registry.INSTANCE;
     val m = reg.getExtensionToFactoryMap();
     m.put("pcm", new XMIResourceFactoryImpl());
     val resSet = new ResourceSetImpl();
     val resource = resSet.createResource(URI.createURI(path));
     resource.getContents().add(pcm);
     resource.save(Collections.EMPTY_MAP);
     
     // Save model in HTML file
     val htmlExport = new PCM2HTML
     val htmlCode = htmlExport.pcm2HTML(pcm)
     val title = name.substring(0, name.size - 4)
     
     val writer = new FileWriter("output/html/" + title.replaceAll(" ", "_") + ".html")
	 writer.write((new PrettyPrinter(80,2)).format(htmlCode))
	 writer.close()
	    
  }
  
  "VariabilityExtractor" should "run on every input file" in {
	  val variabilityExtractor = new VariabilityExtractor
    
	  var sumValuedCells : Double = 0
	  var sumInterpretedCells : Double = 0
	  var sumAveragePerMatrix : Double = 0
	  var nbMatrix : Double = 0
	  
	  val modelFolder = new File("../WikipediaPCMParser/output/models")
	  for (file <- modelFolder.listFiles()) {
	    // Load model
	    println(file.getName())
	    val pcm = loadPCMModel(file)
	    
	    // Load configuration
	    val configFile = "input/configs/" + file.getName.substring(0, file.getName.size - 4) + ".config"  
//	    variabilityExtractor.parseConfigurationFile(configFile)
	    
	    // Extract variability
	    variabilityExtractor.extractVariability(pcm)
	    
	    // Validate and save model
	    val diagnostic = Diagnostician.INSTANCE.validate(pcm)
	    if (diagnostic.getSeverity() == Diagnostic.OK) {
	      println("OK")
	    } else {
	      println("NOT VALID")
	    }
	    
	    // Save model
	    savePCMModel(pcm, file.getName())
	    	
	    // Compute stats on interpreted cells
	    for (matrix <- pcm.getMatrices()) yield {
		  val cells = matrix.getCells()
		  
		  val valuedCells = cells.filter(cell => cell.isInstanceOf[ValuedCell])
		  val interpretedCells = valuedCells.filter(cell => Option(cell.asInstanceOf[ValuedCell].getInterpretation()).isDefined)
		  
		  if (valuedCells.size > 0) {
			  sumValuedCells += valuedCells.size
			  sumInterpretedCells += interpretedCells.size
			  val averageMatrix : Double = interpretedCells.size.toDouble / valuedCells.size.toDouble
			  sumAveragePerMatrix += averageMatrix
			  nbMatrix += 1
		  	  println("\t\t" + (averageMatrix * 100).toInt + "% of interpreted cells")
		  }else {
		    println("\t\tno valued cells")
		  }
		  
	    }
	  }
	  
	  println("Average per cell : " + ((sumInterpretedCells * 100) / sumValuedCells).toInt + "%" + " (" + sumInterpretedCells.toInt + "/" + sumValuedCells.toInt + ")")
	  println("Average per matrix : " + ((sumAveragePerMatrix * 100)/ nbMatrix).toInt + "%")
  }
  
  it should "run on nikon DSLR PCM" in {
      val file = new File("../WikipediaPCMParser/output/models/Comparison_of_Nikon_DSLR_cameras.pcm")
      val configFile = new File("input/configs/Comparison_of_Nikon_DSLR_cameras.config")
	  val pcm = loadPCMModel(file)
	  
	  val variabilityExtractor = new VariabilityExtractor
      variabilityExtractor.parseConfigurationFile(configFile.getAbsolutePath())
	  variabilityExtractor.extractVariability(pcm)
	  savePCMModel(pcm, file.getName())
	  
	  for (matrix <- pcm.getMatrices()) {
		  val valuedCells = matrix.getCells().filter(cell => cell.isInstanceOf[ValuedCell])
		  val interpretedCells = valuedCells.filter(cell => Option(cell.asInstanceOf[ValuedCell].getInterpretation()).isDefined)
		  if (valuedCells.size != 0) {
			  println((interpretedCells.size * 100) / valuedCells.size + "% of non extra cells"  + 
			      " (" + interpretedCells.size + "/" + valuedCells.size + ")")
		  }
		  
	  }
  }
  
  it should "run on the test set" in {
	  // get files from test set
	  val testSetFile = Source.fromFile("input/test_set.txt") 
	  val files = for (line <- testSetFile.getLines) yield {
	    new File("../WikipediaPCMParser/output/models/" + line + ".pcm")
	  }
	  
	  val variabilityExtractor = new VariabilityExtractor
	
	  var sumValuedCells : Double = 0
	  var sumInterpretedCells : Double = 0
	  var sumAveragePerMatrix : Double = 0
	  var nbMatrix : Double = 0
	
	  for (file <- files) {
		  // Load model
	  println(file.getName())
	  val pcm = loadPCMModel(file)
	
	  // Load configuration
	  val configFile = "input/configs/" + file.getName.substring(0, file.getName.size - 4) + ".config"  
	  variabilityExtractor.parseConfigurationFile(configFile)
	
	  // Extract variability
	  variabilityExtractor.extractVariability(pcm)
	
	  // Validate and save model
	  val diagnostic = Diagnostician.INSTANCE.validate(pcm)
	  if (diagnostic.getSeverity() == Diagnostic.OK) {
		  println("OK")
	  } else {
		  println("NOT VALID")
	  }
	
	  // Save model
	  savePCMModel(pcm, file.getName())
	
	  // Compute stats on interpreted cells
	  for (matrix <- pcm.getMatrices()) yield {
		  val cells = matrix.getCells()
	
				  val valuedCells = cells.filter(cell => cell.isInstanceOf[ValuedCell])
				  val interpretedCells = valuedCells.filter(cell => Option(cell.asInstanceOf[ValuedCell].getInterpretation()).isDefined)
	
				  if (valuedCells.size > 0) {
					  sumValuedCells += valuedCells.size
							  sumInterpretedCells += interpretedCells.size
							  val averageMatrix : Double = interpretedCells.size.toDouble / valuedCells.size.toDouble
							  sumAveragePerMatrix += averageMatrix
							  nbMatrix += 1
							  println("\t\t" + (averageMatrix * 100).toInt + "% of interpreted cells")
	  }else {
		  println("\t\tno valued cells")
					  }
	
		  }
	  }
	
	  println("Average per cell : " + ((sumInterpretedCells * 100) / sumValuedCells).toInt + "%" + " (" + sumInterpretedCells.toInt + "/" + sumValuedCells.toInt + ")")
	  println("Average per matrix : " + ((sumAveragePerMatrix * 100)/ nbMatrix).toInt + "%")
  }
  
  
   "PCMNormalizer" should "set headers correctly" in {
	  val pcmNormalizer = new PCMNormalizer
	  val file = new File("../WikipediaPCMParser/output/models/Comparison_of_Nikon_DSLR_cameras.pcm")
	  val pcm = loadPCMModel(file)
	  
	  // Set headers
	  for  (matrix <- pcm.getMatrices()) {
		  pcmNormalizer.setHeaders(matrix)
	  }
	  
	  // Check matrices
	  for (matrix <- pcm.getMatrices(); cell <- matrix.getCells()) {
	    val row = cell.getRow()
	    val column = cell.getColumn()
	    
	    // Check that headers are in first row and column
	    if (row == 0 && column == 0 ) {
	      cell shouldBe an [Extra]
	    } else if (row == 0) {
	      cell shouldBe a [Header]
	    } else if (column == 0) {
	      cell shouldBe a [Header]
	    } else {
	      cell should not be a [Header]
	    }
	    
	  }
  }
   
   
}