package extractor

import pcmmm.PCM
import scala.collection.JavaConversions._
import interpreters.PatternInterpreter
import interpreters.BooleanPatternInterpreter

class VariabilityExtractor {

  private val pcmNormalizer = new PCMNormalizer
  private val variabilityConceptExtractor = new VariabilityConceptExtractor
  private val cellContentInterpreter = new CellContentInterpreter
  
  private val patternInterpreters : List[PatternInterpreter] = List(
		  new BooleanPatternInterpreter(Nil,Nil,"yes|no",Nil)
  )
  
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