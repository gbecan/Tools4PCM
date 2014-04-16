package test

import scala.io.Source
import extractor.VariabilityExtractor
import java.io.File
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.common.util.Diagnostic
import scala.collection.JavaConversions._

object ASEEvaluation {

	val MODEL_EXT = ".pcm"
	val HTML_EXT = ".html"
	val CONFIG_EXT = ".config"
	  
	val INPUT_DIR = "../evaluation/input/models/"
	val CONFIG_DIR = "../evaluation/config_files/"
	val OUTPUT_DIR_MODELS = "../evaluation/output/models/"
	val OUTPUT_DIR_HTML = "../evaluation/output/html/"
  
	val TEST_SET_FILE = "../evaluation/1-pcm.txt"

    def main(args: Array[String]) {
       	// Get list of PCMs to test from a file
    	val testSetFile = Source.fromFile(TEST_SET_FILE)
    	
    	val files = for (line <- testSetFile.getLines) yield {
    				new File(INPUT_DIR + line + MODEL_EXT)
    	}
	  
    	val variabilityExtractor = new VariabilityExtractor
	
    	var nbCells = 0
    	for (file <- files) {
		  // Load model
		  println(file.getName())
		  val pcm = VariabilityExtractor.loadPCMModel(file.getAbsolutePath())
		
		  // Load configuration
		  val configFile = CONFIG_DIR + file.getName.substring(0, file.getName.size - 4) + CONFIG_EXT  
		  variabilityExtractor.setConfiguration(VariabilityExtractor.parseConfigurationFile(configFile))
		
		  // Extract variability
		  variabilityExtractor.extractVariability(pcm)
		
		  // Validate model
		  val diagnostic = Diagnostician.INSTANCE.validate(pcm)
		  if (diagnostic.getSeverity() == Diagnostic.OK) {
			  println("... model is OK")
		  } else {
			  println("... model is NOT VALID")
		  }
	
		  // Save model
		  val name = file.getName().substring(0, file.getName().size - 4)
		  
		  val modelPath = OUTPUT_DIR_MODELS + name + MODEL_EXT
		  VariabilityExtractor.exportPCM2Model(pcm, modelPath)
		  
		  val htmlPath = OUTPUT_DIR_HTML + name + HTML_EXT
		  VariabilityExtractor.exportPCM2HTML(pcm, htmlPath)
		  
		  // Stats
		  for (matrix <- pcm.getMatrices()) {
			  nbCells += matrix.getCells().size()
		  }
    	}
    	
    	println("Total number of cells: " + nbCells)
	  
    }
}