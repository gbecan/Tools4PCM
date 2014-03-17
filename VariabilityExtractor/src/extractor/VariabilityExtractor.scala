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
import interpreters.PartialPatternInterpreter
import interpreters.EmptyPatternInterpreter
import interpreters.InconsistentPatternInterpreter

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
      case "Boolean" => new BooleanPatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList)
      case "Simple" => new SimplePatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList)
      case "Partial" => new PartialPatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList)
      case "Multiple" => new MultiplePatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList)
      case "Unknown" => new UnknownPatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList)
      case "Empty" => new EmptyPatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList)
      case "Inconsistent" => new InconsistentPatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList)
      case _ => new UnknownPatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList)
    }
    
  }
    
  def extractVariability(pcm : PCM) {
	  // Normalize PCM
	  for  (matrix <- pcm.getMatrices()) {
		  pcmNormalizer.setHeaders(matrix) // FIXME : requires configuration
	  }

	  // Extract features and products from headers
	  variabilityConceptExtractor.extractConceptsFromHeaders(pcm)
	  
	  // Interpret contents in cells (detect variability patterns (e.g. Boolean pattern)
	  // and specify header products and features related to each cell 
	  cellContentInterpreter.interpretCells(pcm, patternInterpreters)
	  
	  // Extract features and products from cells
	  variabilityConceptExtractor.extractConceptsFromInterpretedCells(pcm)
	  
	  // Extract feature's domains
	  
	  // Extract constraints
  }
}