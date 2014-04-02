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

class CellClusterer(
	val dissimilarityMetric : DissimilarityMetric,
    val threshold : Double
) {

  
	def cluster(values : Set[Cell]) : Set[Set[Cell]] = {
		val experiment = new PCMExperiment(values) 
		val dissimilarityMeasure : DissimilarityMeasure = new CellDissimilarityMeasure(dissimilarityMetric)
		val agglomerationMethod : AgglomerationMethod = new AverageLinkage
		val dendrogramBuilder = new DendrogramBuilder(experiment.getNumberOfObservations())
		val clusterer = new HierarchicalAgglomerativeClusterer(experiment, dissimilarityMeasure, agglomerationMethod)
		clusterer.cluster(dendrogramBuilder)
		extractClusters(experiment, dendrogramBuilder.getDendrogram)
	}
	
	def extractClusters(experiment : PCMExperiment, dendrogram : Dendrogram) : Set[Set[Cell]] = {
			def extractClustersRecursion(node : DendrogramNode) : Set[Set[Cell]] = {
				node match {
				  case n : MergeNode if n.getDissimilarity() > threshold => 
				    extractClustersRecursion(n.getLeft()) union extractClustersRecursion(n.getRight())
				  case n : MergeNode => 
				    val left = extractClustersRecursion(n.getLeft())
				    val right = extractClustersRecursion(n.getRight())
				    Set((left union right).reduce((s1, s2) => s1 union s2))
				  case n : ObservationNode => Set(Set(experiment.getObservation(n.getObservation())))
				}
			}
			extractClustersRecursion(dendrogram.getRoot())
	}
  
}