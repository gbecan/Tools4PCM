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
import interpreters.YesOnlyPatternInterpreter

class VariabilityExtractor {

  private val pcmNormalizer = new PCMNormalizer
  private val variabilityConceptExtractor = new VariabilityConceptExtractor
  private val cellContentInterpreter = new CellContentInterpreter
  private val domainExtractor = new DomainExtractor
  private var simpleParameters : Map[String, Int] = Map()
  private var complexParameters : Map[String,List[String]] = Map()
  
  def setPatternInterpreters(interpreters : List[PatternInterpreter]) {
    cellContentInterpreter.setInterpreters(interpreters)
  }
  
  def parseConfigurationFile(configFile : String) {
	  val configParser = new ParserTools
	  configParser.readParameters(configFile)
	  val patternInterpreters : List[PatternInterpreter] = (
	      for (pattern <- configParser.patterns;
	    	val patternInterpreter = concept2PatternInterpreter(pattern)
	    	if patternInterpreter.isDefined
	      ) yield {
		    patternInterpreter.get
		  }).toList
	  cellContentInterpreter.setInterpreters(patternInterpreters)
	  
	  simpleParameters = simpleParameters.map(e => (e._1,e._2.toInt)).toMap
	  complexParameters = configParser.complexParameters.map(e => (e._1,e._2.toList)).toMap
  }
  
  def concept2PatternInterpreter(pattern : Concept) : Option[PatternInterpreter] = {
    pattern.getName() match {
      case "Boolean" => Some(new BooleanPatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList))
      case "Simple" => Some(new SimplePatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList))
      case "Partial" => Some(new PartialPatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList))
      case "Multiple" => Some(new MultiplePatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList))
      case "Unknown" => Some(new UnknownPatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList))
      case "Empty" => Some(new EmptyPatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList))
      case "Inconsistent" => Some(new InconsistentPatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList))
      case "YesOnly" => Some(new YesOnlyPatternInterpreter(pattern.getHeaders().toList, pattern.getAssociatedRule(), pattern.getParameters().toList))
      case _ => None
    }
    
  }
    
  def extractVariability(pcm : PCM) {
	  // Normalize PCM
	  pcmNormalizer.normalizePCM(pcm, simpleParameters, complexParameters)

	  // Extract features and products from headers
	  variabilityConceptExtractor.extractConceptsFromHeaders(pcm)
	  
	  // Interpret contents in cells (detect variability patterns (e.g. Boolean pattern))
	  // and specify header products and features related to each cell
	  cellContentInterpreter.interpretCells(pcm)
	  
	  // Extract features and products from cells
	  variabilityConceptExtractor.extractConceptsFromInterpretedCells(pcm)
	  
	  // Extract feature's domains
	  domainExtractor.extractDomains(pcm)
  }
}