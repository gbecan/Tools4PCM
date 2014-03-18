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
    
	  val modelFolder = new File("../WikipediaPCMParser/output/models")
	  for (file <- modelFolder.listFiles()) {
	    println(file.getName())
	    val pcm = loadPCMModel(file)
	    val configFile = "input/configs/" + file.getName.substring(0, file.getName.size - 4) + ".config"  
	    variabilityExtractor.parseConfigurationFile(configFile)
	    variabilityExtractor.extractVariability(pcm)
	    savePCMModel(pcm, file.getName())
	    
	    for (matrix <- pcm.getMatrices()) {
		  val cells = matrix.getCells()
		  val nonHeaderCells = cells.count(cell => !cell.isInstanceOf[Header])
		  val nonExtraCells = cells.count(cell => !cell.isInstanceOf[Extra] && !cell.isInstanceOf[Header])
		  println("\t\t" + (nonExtraCells * 100) / nonHeaderCells + "% of interpreted cells")
	    }
	  }
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
		  val cells = matrix.getCells()
		  val nonExtraCells = cells.count(cell => !cell.isInstanceOf[Extra])
		  
		  println((nonExtraCells * 100) / cells.size() + "% of non extra cells")
	  }
  }
  
  
   "PCMNormalizer" should "set headers correctly" in {
	  val pcmNormalizer = new PCMNormalizer
	  val file = new File("../WikipediaPCMParser/output/models/Comparison_of_Nikon_DSLR_cameras.pcm")
	  val pcm = loadPCMModel(file)
	  
	  val rowsToRemove = List(4,5,6)
	  val columnsToRemove = List(9)
	  
	  // Set headers
	  for  (matrix <- pcm.getMatrices()) {
		  pcmNormalizer.setHeaders(matrix)
		  pcmNormalizer.removeHeaderRowsAndColumns(matrix, rowsToRemove, columnsToRemove)
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
	    
	    // Check that specified rows and columns are removed
	    rowsToRemove should not contain row
	    columnsToRemove should not contain column
	  }
  }
}