package extractor

import pcmmm.PCM
import pcmmm.PcmmmFactory
import clustering.HierarchicalClusterer
import uk.ac.shef.wit.simmetrics.similaritymetrics.Levenshtein
import scala.collection.JavaConversions._
import pcmmm.Feature
import pcmmm.Cell

class DomainExtractor {

  val metric = new Levenshtein
  val dissimilarityMetric : (String, String) => Double = (v1, v2) => 
	     1 - metric.getSimilarity(v1, v2)
  val cellClusterer = new HierarchicalClusterer(dissimilarityMetric, 0.5)
  
  def extractDomains(pcm : PCM) {
	  val domainCollection = PcmmmFactory.eINSTANCE.createDomainCollection()
	  pcm.setDomainCollection(domainCollection)
	  
	  for (concept <- pcm.getConcepts()) {
		  concept match {
		    case feature : Feature if !feature.getMyValuedCells().isEmpty() => 
		      extractDomain(pcm, feature)
		    case _ => 
		  }
	  } 
  }
  
  def extractDomain(pcm : PCM, feature : Feature) {
	  val values = feature.getMyValuedCells().map(_.getVerbatim()).toList
	  
    
	  // Types
	  
//	  val intCells = values.
    
    
	  // Clustering
	  val clusters = cellClusterer.cluster(values)
	  val significantClusters = clusters.filter(cluster => isSignificantCluster(cluster, clusters.size))
	  
	  println("FOR : " + feature.getName())
	  for (cluster <- clusters) {
		   	println(cluster + " : " + cluster.size )
	   }
	  println()
	  
	  // Create domain
	  val domain = PcmmmFactory.eINSTANCE.createDomain()
	  val domainValues = if (significantClusters.isEmpty) {
	    Set.empty
	  } else {
	    significantClusters.reduceLeft(_ union _)
	  }
	  domain.getDomainLitteral().addAll(domainValues)
	  
	  // Add domain to the PCM and the feature
	  val domains = pcm.getDomainCollection().getDomains()
	  domains.add(domain)
	  // TODO : add the domain to the feature
  }
  
  def isSignificantCluster(cluster : List[String], nbOfClusters : Int) : Boolean = {
		val bigClusterThreshold = 0.3
		(cluster.size.toDouble / nbOfClusters.toDouble) > bigClusterThreshold
  }
  
  
}