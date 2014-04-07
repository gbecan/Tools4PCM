package extractor

import pcmmm.PCM
import pcmmm.PcmmmFactory
import clustering.HierarchicalClusterer
import uk.ac.shef.wit.simmetrics.similaritymetrics.Levenshtein
import scala.collection.JavaConversions._
import pcmmm.Feature
import pcmmm.Cell
import pcmmm.Multiple
import pcmmm.ValuedCell
import pcmmm.Constraint
import pcmmm.Partial
import pcmmm.Unknown
import pcmmm.Inconsistent
import pcmmm.Empty
import pcmmm.Domain

class DomainExtractor {

  val metric = new Levenshtein
  val dissimilarityMetric : (String, String) => Double = (v1, v2) => 
	     1 - metric.getSimilarity(v1, v2)
  val cellClusterer = new HierarchicalClusterer(dissimilarityMetric, 0.5)
  
  def extractDomains(pcm : PCM) {
	  val domainCollection = PcmmmFactory.eINSTANCE.createDomainCollection()
	  pcm.setDomainCollection(domainCollection)
	  
	  val domains = for (concept <- pcm.getConcepts()) yield {
		  concept match {
		    case feature : Feature if !feature.getMyValuedCells().isEmpty() => 
		     	Some(extractDomain(pcm, feature))
		    case _ => None
		  }
	  } 
	  domainCollection.getDomains().addAll(domains.flatten.toList)
  }
  
  def extractDomain(pcm : PCM, feature : Feature) : Domain = {
	  println("FOR : " + feature.getName())
	  val significantCells = feature.getMyValuedCells().filter(_ match {
	    case _ : Inconsistent => false
	    case _ : Unknown => false
	    case _ : Empty => false
	    case _ => true
	  }) 
	  
	  println("CHECK : " + significantCells.forall(!_.isInstanceOf[Unknown]))
	  
	  val values = significantCells.flatMap(cell => listValues(cell.getInterpretation())).toList
	  
	  println("values")
	  println(values)

	  // Types
	  val intValues = (
	      PcmmmFactory.eINSTANCE.createIntType(), 
	      values.filter(_.matches("\\d+"))
	      )
	  val doubleValues = (
	      PcmmmFactory.eINSTANCE.createDoubleType(),
	      values.filter(_.matches("\\d+(\\.\\d+)?"))
	      )
	  val booleanValues = feature.getMyValuedCells().filter(_.getInterpretation().isInstanceOf[pcmmm.Boolean])
	  val unknownValues = feature.getMyValuedCells().filter(_.getInterpretation().isInstanceOf[Unknown])
	  val inconsistentValues = feature.getMyValuedCells().filter(_.getInterpretation().isInstanceOf[Inconsistent])

	  
	  
	  // Clustering
	  println("clusters")
	  val clusters = cellClusterer.cluster(values)
	  val significantClusters = clusters.filter(cluster => isSignificantCluster(cluster, clusters.size))
	  
	  for (cluster <- clusters) {
		   	println(cluster + " : " + cluster.size )
	   }
	  println()
	  
	  // Create domain
	  val domain = PcmmmFactory.eINSTANCE.createEnum()
	  val domainValues = if (significantClusters.isEmpty) {
	    Set.empty
	  } else {
	    significantClusters.reduceLeft(_ union _)
	  }
	  domain.getValues().addAll(domainValues)
	  
	  // Add domain to the feature
	  feature.setDomain(domain)
	  
	  domain
  }
  
  def listValues(interpretation : Constraint) : List[String] = {
     interpretation match {
	    case c : Multiple => c.getContraints().flatMap(listValues(_)).toList
	    case c : Partial => listValues(c.getArgument()) ::: listValues(c.getCondition())
	  	case c if Option(c).isDefined => List(c.getName())
	  	case _ => Nil
	  }
  }
  
  def isSignificantCluster(cluster : List[String], nbOfClusters : Int) : Boolean = {
		val bigClusterThreshold = 0.3
		(cluster.size.toDouble / nbOfClusters.toDouble) > bigClusterThreshold
  }
  

  
}