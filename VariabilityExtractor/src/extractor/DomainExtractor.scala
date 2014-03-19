package extractor

import pcmmm.PCM
import pcmmm.PcmmmFactory

class DomainExtractor {

  
  def extractDomains(pcm : PCM) {
	  val domainCollection = PcmmmFactory.eINSTANCE.createDomainCollection()
	  pcm.setDomainCollection(domainCollection)
  }
  
}