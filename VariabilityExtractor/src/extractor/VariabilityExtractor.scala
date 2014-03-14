package extractor

import pcmmm.PCM
import scala.collection.JavaConversions._

class VariabilityExtractor {

  def extractVariability(pcm : PCM) {
	  // Normalize PCM
	  val pcmNormalizer = new PCMNormalizer
	  for  (matrix <- pcm.getMatrices()) {
		  pcmNormalizer.setHeaders(matrix) // FIXME : Requires configuration
	  }

	  // Extract features and products from headers
	  val variabilityConceptExtractor = new VariabilityConceptExtractor
	  variabilityConceptExtractor.extractConceptsFromHeaders(pcm)
	  
	  // Separate contents in cells (detect Simple, Multi or Partial patterns)
	  
	  // Extract features and products from cells
	  
	  // Extract feature's domains
	  
	  // Extract constraints
  }
}