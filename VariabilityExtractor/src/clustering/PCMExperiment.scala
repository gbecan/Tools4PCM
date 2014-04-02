package clustering

import ch.usi.inf.sape.hac.experiment.Experiment
import pcmmm.Cell

class PCMExperiment(cells : Set[Cell]) extends Experiment {

  val observations : Array[Cell] = cells.toArray
  
	override def getNumberOfObservations() : Int = {
		observations.size
	}
  
	def getObservation(index : Int) : Cell = {
		observations(index)
	}
  
}