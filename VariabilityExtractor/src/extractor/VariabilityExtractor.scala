package extractor

import pcmmm.PCM
import scala.collection.JavaConversions._
import interpreters.PatternInterpreter
import interpreters.BooleanPatternInterpreter
import interpreters.UnknownPatternInterpreter
import interpreters.SimplePatternInterpreter
import interpreters.MultiplePatternInterpreter
import pcmindexer.ParserTools
import interpreters.PatternInterpreter
import pcmindexer.Concept
import interpreters.PatternInterpreter
import interpreters.BooleanPatternInterpreter

class VariabilityExtractor {

  private val pcmNormalizer = new PCMNormalizer
  private val variabilityConceptExtractor = new VariabilityConceptExtractor
  private val cellContentInterpreter = new CellContentInterpreter
  
  private var patternInterpreters : List[PatternInterpreter] = Nil
  
  def setPatternInterpreters(interpreters : List[PatternInterpreter]) {
    patternInterpreters = interpreters
  }
  
  def parseConfigurationFile(configFile : String) {
	  val configParser = new ParserTools
	  configParser.readParameters(configFile)
	  patternInterpreters = (for (pattern <- configParser.patterns) yield {
		  concept2PatternInterpreter(pattern)
	  }).toList
	  
  }
  
  def concept2PatternInterpreter(pattern : Concept) : PatternInterpreter = {
    pattern.getName() match {
      case _ => new BooleanPatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList)
    }
    
  }
    
  def extractVariability(pcm : PCM) {
	  // Normalize PCM
	  for  (matrix <- pcm.getMatrices()) {
		  pcmNormalizer.setHeaders(matrix) // FIXME : requires configuration
	  }

	  // Extract features and products from headers
	  variabilityConceptExtractor.extractConceptsFromHeaders(pcm)
	  
	  // Separate contents in cells (detect Simple, Multi or Partial patterns)
	  
	  cellContentInterpreter.interpretCells(pcm, patternInterpreters) // FIXME : requires configuration
	  
	  // Extract features and products from cells
	  
	  // Extract feature's domains
	  
	  // Extract constraints
  }
}