package clustering

import uk.ac.shef.wit.simmetrics.similaritymetrics.AbstractStringMetric

class SimmetricsDissimilarityMetric
(val metric : AbstractStringMetric)
extends DissimilarityMetric{

	override def dissimilarity(s1 : String, s2 : String) : Double = {
			1 - metric.getSimilarity(s1, s2)
	}
  
}