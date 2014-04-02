package extractor

import pcmmm.PCM
import pcmmm.PcmmmFactory
import clustering.CellClusterer
import clustering.SimmetricsDissimilarityMetric
import uk.ac.shef.wit.simmetrics.similaritymetrics.Levenshtein

class DomainExtractor {

  
  def extractDomains(pcm : PCM) {
	  val domainCollection = PcmmmFactory.eINSTANCE.createDomainCollection()
	  pcm.setDomainCollection(domainCollection)
	  
	  val metric = new SimmetricsDissimilarityMetric(new Levenshtein)
	  val cellClusterer = new CellClusterer(metric, 0.4)
	  
  }
  
}