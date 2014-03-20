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
  private val cellContentInterpreter = new CellContentInterpreter(Nil)
  private val domainExtractor = new DomainExtractor
  private var simpleParameters : Map[String, Int] = Map()
  private var complexParameters : Map[String,List[String]] = Map()
  
  def setPatternInterpreters(interpreters : List[PatternInterpreter]) {
    cellContentInterpreter.setInterpreters(interpreters)
  }
  
  def parseConfigurationFile(configFile : String) {
	  val configParser = new ParserTools
	  configParser.readParameters(configFile)
	  val patternInterpreters = (for (pattern <- configParser.patterns) yield {
		  concept2PatternInterpreter(pattern)
	  }).toList
	  cellContentInterpreter.setInterpreters(patternInterpreters)
	  
	  simpleParameters = configParser.simpleParameters.map(e => (e._1,e._2.toInt)).toMap
	  complexParameters = configParser.complexParameters.map(e => (e._1,e._2.toList)).toMap
//	  println(simpleParameters)
//	  println(complexParameters)
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
	  val matricesToIgnore = complexParameters.get("ignore-matrix")
	  if (matricesToIgnore.isDefined) {
	    pcmNormalizer.removeMatrices(pcm, matricesToIgnore.get)
	  }
	  
	  for  (matrix <- pcm.getMatrices()) {
		  pcmNormalizer.setHeaders(matrix) // FIXME : requires configuration
	  }

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