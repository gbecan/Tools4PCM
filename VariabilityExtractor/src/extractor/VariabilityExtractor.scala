package extractor

import pcmmm.PCM

class VariabilityExtractor {

  def extractVariability(pcm : PCM) {
	  val pcmNormalizer = new PCMNormalizer
	  // TODO : normalize matrix
	  val variabilityConceptExtractor = new VariabilityConceptExtractor
	  variabilityConceptExtractor.extractConceptsFromHeaders(pcm)
  }
}