package clustering

import ch.usi.inf.sape.hac.experiment.Experiment
import uk.ac.shef.wit.simmetrics.similaritymetrics.Levenshtein
import ch.usi.inf.sape.hac.experiment.DissimilarityMeasure

class CellDissimilarityMeasure
(val dissimilarityMetric : DissimilarityMetric)
extends DissimilarityMeasure {

  
	override def computeDissimilarity(experiment : Experiment, observation1 : Int, observation2 : Int) : Double = {
		val pcmExperiment = experiment.asInstanceOf[PCMExperiment]
		val cell1 = pcmExperiment.getObservation(observation1)
		val cell2 = pcmExperiment.getObservation(observation2)
		
		dissimilarityMetric.dissimilarity(cell1.getVerbatim(), cell2.getVerbatim())
	}
  
}