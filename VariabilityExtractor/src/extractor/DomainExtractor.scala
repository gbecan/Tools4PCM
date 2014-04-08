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
import pcmmm.StringType

class DomainExtractor {

  val metric = new Levenshtein
  val dissimilarityMetric : (String, String) => Double = (v1, v2) => 
	     1 - metric.getSimilarity(v1.toLowerCase(), v2.toLowerCase())
  val cellClusterer = new HierarchicalClusterer(dissimilarityMetric, 0.5)
  
  def extractDomains(pcm : PCM) {
	  val domainCollection = PcmmmFactory.eINSTANCE.createDomainCollection()
	  pcm.setDomainCollection(domainCollection)
	  
	  val domains = for (concept <- pcm.getConcepts()) yield {
		  concept match {
		    case feature : Feature if !feature.getMyValuedCells().isEmpty() => 
		     	Some(extractDomain(feature))
		    case feature : Feature => Some(setDefaultDomain(feature))
		    case _ => None
		  }
	  } 
	  domainCollection.getDomains().addAll(domains.flatten.toList)
  }
  
  def extractDomain(feature : Feature) : Domain = {
	  val values = feature.getMyValuedCells().flatMap(cell => listValues(cell.getInterpretation())).toList
	  
	  // Separate values according to types
	  val intDomain = (
	      PcmmmFactory.eINSTANCE.createIntType(), 
	      values.filter(_.getName.matches("\\d+"))
	      )
	  val doubleDomain = (
	      PcmmmFactory.eINSTANCE.createDoubleType(),
	      values.filter(_.getName.matches("\\d+(\\.\\d+)?"))
	      )
	  val booleanDomain = (
	      PcmmmFactory.eINSTANCE.createBooleanType(),
	      values.filter(_.isInstanceOf[pcmmm.Boolean])
	      )
	  val stringDomain = (PcmmmFactory.eINSTANCE.createStringType(),
	      values
	      )
	      
	  // Get most represented type
	  val mainType = List(intDomain,doubleDomain,booleanDomain,stringDomain).maxBy(_._2.size)
	  
	  
	  // Cluster values if the type is String
	  val domainValues = if (mainType._1.isInstanceOf[StringType]) {
		  
		  val clusters = cellClusterer.cluster(values.map(_.getName()))
		  val significantClusters = clusters.filter(cluster => isSignificantCluster(cluster, clusters.size))
		  
//		  println("clusters")
//		  for (cluster <- clusters) {
//			   	println(cluster + " : " + cluster.size )
//		   }
//		  println()
		  
		  if (significantClusters.isEmpty) {
		    Nil
		  } else {
		    significantClusters.reduceLeft(_ union _)
		  }
	  } else {
		  mainType._2.map(_.getName())
	  }
	  
	  // Create domain
	  val domain = PcmmmFactory.eINSTANCE.createEnum()
	  domain.getValues().addAll(domainValues)
	  domain.setDomainType(mainType._1)
	  
	  // Add domain to the feature
	  feature.setDomain(domain)
	  
//	  println("FOR : " + feature.getName())
//	  println("\ttype : " + domain.getDomainType())
//	  println("\tvalues : " + domain.getValues())
	  
	  domain
  }
  
  /**
   * List Simple and Boolean constraints from the interpretation of a cell
   * (Unknown, Empty and Inconsistent constraints are ignored)
   * (Partial and Multiple constraints are decomposed) 
   */
  def listValues(interpretation : Constraint) : List[Constraint] = {
     interpretation match {
       	case _ : Inconsistent => Nil
	    case _ : Unknown => Nil
	    case _ : Empty => Nil
	    case c : Multiple => c.getContraints().flatMap(listValues(_)).toList
	    case c : Partial => listValues(c.getArgument()) ::: listValues(c.getCondition())
	  	case c if Option(c).isDefined => List(c)
	  	case _ => Nil
	  }
  }
  
  def isSignificantCluster(cluster : List[String], nbOfClusters : Int) : Boolean = {
		val bigClusterThreshold = 0.3
		(cluster.size.toDouble / nbOfClusters.toDouble) > bigClusterThreshold
  }
  
  
  def setDefaultDomain(feature : Feature) : Domain = {
		  val domain = PcmmmFactory.eINSTANCE.createEnum()
		  domain.setDomainType(PcmmmFactory.eINSTANCE.createBooleanType())
		  feature.setDomain(domain)
		  domain
  }

  
}