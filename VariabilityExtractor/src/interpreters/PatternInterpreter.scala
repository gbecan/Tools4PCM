package interpreters

import pcmmm.Constraint
import java.util.regex.Pattern
import java.util.regex.Matcher
import scala.collection.JavaConversions._
import pcmmm.Header
import pcmmm.Feature
import pcmmm.PCM
import pcmmm.Product

abstract class PatternInterpreter(
	val validHeaders : List[String],
    regex : String,
    val parameters : List[String]
    ) {
  
	private val pattern : Pattern =  Pattern.compile(regex)

	private var validProducts : List[Product] = Nil
    private var validFeatures : List[Feature] = Nil
    
	// FIXME : in some cases (Multi, Partial for example), 
	// we need to restart all the pattern matching rule on sub-elements of the pattern
	
    def config(pcm : PCM) {
	  // Find concepts in validHeaders and separate them in products and features
	   for (concept <- pcm.getConcepts())  {
	     if (validHeaders.contains(concept.getName())) {
	    	 concept match {
	    	   case p : Product => validProducts = p :: validProducts 
	    	   case f : Feature => validFeatures = f :: validFeatures
	    	 }
	     }
	   }
	}
    
	def interpret(s : String, products : List[Product], features : List[Feature]) : Option[Constraint] = {

	  if ((validProducts.isEmpty || !products.intersect(validProducts).isEmpty)
	  && (validFeatures.isEmpty || !features.intersect(validFeatures).isEmpty)) {
	  
		  val matcher = pattern.matcher(format(s))
		  if (matcher.matches()) {
			Some(createConstraint(matcher, parameters))
		  } else {
		    None
		  }
	    
	  } else {
	    None
	  }
	  
	}
	
	def createConstraint(matcher : Matcher, parameters : List[String]) : Constraint
	
	def format (s : String) : String = {
	  val words = for (word <- s.split("\\s") if !word.isEmpty()) yield word
      val formattedContent = words.mkString("", " ", "").toLowerCase()
      formattedContent
	}
	
	
  
}

