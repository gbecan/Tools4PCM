package extractor

import pcmmm.PCM
import scala.collection.JavaConversions._
import pcmmm.Header
import pcmmm.VariabilityConcept
import pcmmm.Feature
import pcmmm.PcmmmFactory

class VariabilityConceptExtractor {

  /**
   * Extract variability concepts (products and features) from headers
   * @param pcm : model of PCM
   * @param transposed : true if the rows and columns represent respectively features and products
   */
  def extractConceptsFromHeaders(pcm : PCM, numberOfRows : Int = 1, numberOfColumns : Int = 1, transposed : Boolean = false) {
    // FIXME : should we consider that PCM headers start from first row and column ???
	  for (
	      matrix <- pcm.getMatrices();
	      cell <- matrix.getCells().filter(_ .isInstanceOf[Header])
	  ) {

		  val concept : VariabilityConcept = 
			  if (cell.getRow() < numberOfRows) {
			    if (!transposed) {
			    	PcmmmFactory.eINSTANCE.createFeature()
			    } else {
			    	PcmmmFactory.eINSTANCE.createProduct()
			    }
			  } else {
			    if (!transposed) {
			    	PcmmmFactory.eINSTANCE.createProduct()
			    } else {
			    	PcmmmFactory.eINSTANCE.createFeature()
			    }
			  }
		  
		  concept.setName(cell.getVerbatim())	  
		  pcm.getConcepts().add(concept)
	  }
  }
  
  
}