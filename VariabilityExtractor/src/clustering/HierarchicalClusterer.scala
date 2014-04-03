package clustering

import pcmmm.Cell
import ch.usi.inf.sape.hac.experiment.DissimilarityMeasure
import ch.usi.inf.sape.hac.agglomeration.AgglomerationMethod
import ch.usi.inf.sape.hac.agglomeration.AverageLinkage
import ch.usi.inf.sape.hac.dendrogram.DendrogramBuilder
import ch.usi.inf.sape.hac.experiment.Experiment
import ch.usi.inf.sape.hac.HierarchicalAgglomerativeClusterer
import ch.usi.inf.sape.hac.dendrogram.Dendrogram
import ch.usi.inf.sape.hac.dendrogram.DendrogramNode
import ch.usi.inf.sape.hac.dendrogram.MergeNode
import ch.usi.inf.sape.hac.dendrogram.ObservationNode

class HierarchicalClusterer[T](
		val dissimilarityMetric : (T,T) => Double,
		val threshold : Double
) {

  
	def cluster(values : List[T]) : Set[List[T]] = {
		val experiment = new ClusteringExperiment(values.toIndexedSeq) 
		val dissimilarityMeasure = new ClusteringDissimilarityMeasure(dissimilarityMetric)
		val agglomerationMethod : AgglomerationMethod = new AverageLinkage
		val dendrogramBuilder = new DendrogramBuilder(experiment.getNumberOfObservations())
		val clusterer = new HierarchicalAgglomerativeClusterer(experiment, dissimilarityMeasure, agglomerationMethod)
		clusterer.cluster(dendrogramBuilder)
		extractClusters(experiment, threshold, dendrogramBuilder.getDendrogram)
	}
	
	private def extractClusters[T](experiment : ClusteringExperiment[T], threshold : Double, dendrogram : Dendrogram) : Set[List[T]] = {
			def extractClustersRecursion(node : DendrogramNode) : Set[List[T]] = {
				node match {
				  case n : MergeNode if n.getDissimilarity() > threshold => 
				    extractClustersRecursion(n.getLeft()) union extractClustersRecursion(n.getRight())
				  case n : MergeNode => 
				    val left = extractClustersRecursion(n.getLeft())
				    val right = extractClustersRecursion(n.getRight())
				    Set((left union right).reduce(_ ::: _))
				  case n : ObservationNode => Set(List(experiment.getObservation(n.getObservation())))
				}
			}
			if (Option(dendrogram.getRoot()).isDefined) {
				extractClustersRecursion(dendrogram.getRoot())
			} else {
			  Set.empty
			}
	}
  
}