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
import configuration.ConfigurationFileParser
import configuration.PCMConfiguration
import configuration.PCMConfiguration
import configuration.PCMConfiguration

class VariabilityExtractor {

  private var config : PCMConfiguration = new PCMConfiguration
  private val pcmNormalizer = new PCMNormalizer
  private val variabilityConceptExtractor = new VariabilityConceptExtractor
  private val cellContentInterpreter = new CellContentInterpreter
  private val domainExtractor = new DomainExtractor
  private var simpleParameters : Map[String, Int] = Map()
  private var complexParameters : Map[String,List[String]] = Map()
  
  def parseConfigurationFile(configFile : String) {
    val configParser = new ConfigurationFileParser
	config = configParser.parse(configFile)
  }
  
  def extractVariability(pcm : PCM) {
	  // Normalize PCM
	  pcmNormalizer.normalizePCM(pcm, config)

	  // Extract features and products from headers
	  variabilityConceptExtractor.extractConceptsFromHeaders(pcm, config)
	  
	  // Interpret contents in cells (detect variability patterns (e.g. Boolean pattern))
	  // and specify header products and features related to each cell
	  cellContentInterpreter.interpretCells(pcm, config)
	  
	  // Extract features and products from cells
	  variabilityConceptExtractor.extractConceptsFromInterpretedCells(pcm)
	  
	  // Extract feature's domains
	  domainExtractor.extractDomains(pcm)
  }
}