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
     val path = "output/" + name
     
     // Save model in file
     val reg = Resource.Factory.Registry.INSTANCE;
     val m = reg.getExtensionToFactoryMap();
     m.put("pcm", new XMIResourceFactoryImpl());
     val resSet = new ResourceSetImpl();
     val resource = resSet.createResource(URI.createURI(path));
     resource.getContents().add(pcm);
     resource.save(Collections.EMPTY_MAP);
  }
  
  "VariabilityExtractor" should "run on every input file" in {
	  val variabilityExtractor = new VariabilityExtractor
    
	  val modelFolder = new File("../WikipediaPCMParser/output/models")
	  for (file <- modelFolder.listFiles()) {
	    val pcm = loadPCMModel(file)
	    variabilityExtractor.extractVariability(pcm)
	    savePCMModel(pcm, file.getName())
	  }
  }
  
  it should "run on nikon DSLR PCM" in {
      val variabilityExtractor = new VariabilityExtractor
      val file = new File("../WikipediaPCMParser/output/models/Comparison_of_Nikon_DSLR_cameras.pcm")
	  val pcm = loadPCMModel(file)
	  variabilityExtractor.extractVariability(pcm)
	  savePCMModel(pcm, file.getName())
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