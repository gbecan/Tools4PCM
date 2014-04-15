package clustering

import ch.usi.inf.sape.hac.experiment.Experiment
import pcmmm.Cell

class ClusteringExperiment[T](values : IndexedSeq[T]) extends Experiment {

  val observations = values
  
	override def getNumberOfObservations() : Int = {
		observations.size
	}
  
	def getObservation(index : Int) : T = {
		observations(index)
	}
  
}