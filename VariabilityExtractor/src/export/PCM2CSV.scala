package export

import pcmmm.PCM
import com.github.tototoshi.csv.CSVWriter
import scala.collection.JavaConversions._
import pcmmm.Feature
import pcmmm.Product

class PCM2CSV {

	def convertPCM2CSV(pcm : PCM, writer : CSVWriter) {
		val (features, products) = getFeaturesAndProducts(pcm)
		
		val domains = features.map(_.getDomain().getName()) 
		// FIXME : get string representation of domains like ENUM, INT(32) or BOOLEAN
		
		writer.writeRow(features.map(_.getName()))
		writer.writeRow(domains)
		writer.writeRow(products.map(_.getMyValuedCells().sortBy(c => (c.getRow,c.getColumn))))
		// FIXME : write products in the same order as features
	}
	
	def getFeaturesAndProducts(pcm : PCM) : (Seq[Feature], Seq[Product]) = {
	  // Other solution :
//		val concepts = for (concept <- pcm.getConcepts()) yield {
//			concept match {
//			  case f : Feature => (Some(f.asInstanceOf[Feature]), None)
//			  case p : Product => (None, Some(p.asInstanceOf[Product]))
//			}
//		}
//
//		val (features, products) = concepts.unzip
//		(features.flatten.toList, products.flatten.toList)
	  
	  val features = for (concept <- pcm.getConcepts() if concept.isInstanceOf[Feature]) yield {
	    concept.asInstanceOf[Feature]
	  }
	  
	  val products = for (concept <- pcm.getConcepts() if concept.isInstanceOf[Product]) yield {
	    concept.asInstanceOf[Product]
	  }
	  
	  (features.toSeq, products.toSeq)
	}
  
}