package test

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import java.io.File
import scala.io.Source
import extractor.VariabilityExtractor
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.common.util.Diagnostic
import com.github.tototoshi.csv.CSVWriter
import java.io.FileWriter
import scala.collection.JavaConversions._
import pcmmm.Header
import pcmmm.Extra
import pcmmm.ValuedCell
import pcmmm.Boolean
import pcmmm.Integer
import pcmmm.Double
import pcmmm.VariabilityConceptRef
import pcmmm.Partial
import pcmmm.Unknown
import pcmmm.Empty
import pcmmm.Inconsistent
import pcmmm.And
import pcmmm.Or
import pcmmm.XOr

class ASEEvaluation extends FlatSpec with Matchers {

  	val MODEL_EXT = ".pcm"
	val HTML_EXT = ".html"
	val CONFIG_EXT = ".config"
	  
	val INPUT_DIR = "../evaluation/input/models/"
	val CONFIG_DIR = "../evaluation/config_files/"
	val OUTPUT_DIR_MODELS = "../evaluation/output/models/"
	val OUTPUT_DIR_HTML = "../evaluation/output/html/"
  
	val TEST_SET_FILE = "../evaluation/1-pcm.txt"

	val STATS_FILE = "../evaluation/stats.csv"
	  
  
  "The evaluation" should "extract variability from every input PCM" in {
		val testSetFile = Source.fromFile(TEST_SET_FILE)
    	
    	val files = for (line <- testSetFile.getLines) yield {
    				new File(INPUT_DIR + line + MODEL_EXT)
    	}
		
	   	val variabilityExtractor = new VariabilityExtractor
		  
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
		  
    	}
	 
  }
  
  it should "compute stats about the PCMs" in {
	  // Initialize CSV writer for stats
    	val csvWriter = new CSVWriter(new FileWriter(STATS_FILE))
    	val headers = Seq("Name", 
    	    "Matrices", 
    	    "Rows",
    	    "Columns",
    	    "Cells",
    	    "Header",
    	    "Extra",
    	    "Valued",
    	    "Boolean",
    	    "Integer",
    	    "Double",
    	    "VariabilityConceptRef",
    	    "Partial",
    	    "Unknown",
    	    "Empty",
    	    "Inconsistent",
    	    "And",
    	    "Or",
    	    "XOr")
    	    
		csvWriter.writeRow(headers)
		
		val testSetFile = Source.fromFile(TEST_SET_FILE)
    	
    	val files = for (line <- testSetFile.getLines) yield {
    				new File(OUTPUT_DIR_MODELS + line + MODEL_EXT)
    	}
    	
		for (file <- files) {
		  // Load model
		  println(file.getName())
		  val pcm = VariabilityExtractor.loadPCMModel(file.getAbsolutePath())
		  	  
		  // Compute stats
		  val name = file.getName().substring(0, file.getName().size - 4)
		  
		  val nbMatrices = pcm.getMatrices().size()
		  
		  val cells = (for (matrix <- pcm.getMatrices()) yield {
			  matrix.getCells()
		  }).flatten.toList
		  
		  val rows = cells.map(_.getRow()).max + 1 
		  val columns = cells.map(_.getColumn()).max + 1
		  
		  val headers = cells.count(_.isInstanceOf[Header])
		  val extras = cells.count(_.isInstanceOf[Extra])
		  val valueds = cells.count(_.isInstanceOf[ValuedCell])
		  
		  val interpretations = cells.map( c =>
		  	if (c.isInstanceOf[ValuedCell]) {
		  		Some(c.asInstanceOf[ValuedCell].getInterpretation())
		  	} else {
		  		None
		  	}
		  ).flatten
		  
		  val booleans = interpretations.count(_.isInstanceOf[Boolean])
		  val integers = interpretations.count(_.isInstanceOf[Integer])
		  val doubles = interpretations.count(_.isInstanceOf[Double])
		  val vcRefs = interpretations.count(_.isInstanceOf[VariabilityConceptRef])
		  val partials = interpretations.count(_.isInstanceOf[Partial])
		  val unknowns = interpretations.count(_.isInstanceOf[Unknown])
		  val emptys = interpretations.count(_.isInstanceOf[Empty])
		  val inconsistents = interpretations.count(_.isInstanceOf[Inconsistent])
		  val ands = interpretations.count(_.isInstanceOf[And])
		  val ors = interpretations.count(_.isInstanceOf[Or])
		  val xors = interpretations.count(_.isInstanceOf[XOr])
		  
		  // Write stats to CSV file
		  val stats = Seq(name, nbMatrices, rows, columns, cells.size, headers, extras, valueds,
		      booleans, integers, doubles, vcRefs, partials, unknowns, emptys, inconsistents, ands, ors, xors)
		  
		  csvWriter.writeRow(stats)
		  
		}
    	
    	csvWriter.close
	}
	
	it should "analyze the results of the user-study from the database" in {
	  
	}  
}