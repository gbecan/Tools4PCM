package interpreters

import pcmmm.Constraint
import java.util.regex.Pattern
import java.util.regex.Matcher
import scala.collection.JavaConversions._
import pcmmm.Header
import pcmmm.Feature
import pcmmm.PCM
import pcmmm.Product
import extractor.CellContentInterpreter
import extractor.CellContentInterpreter
import extractor.CellContentInterpreter
import extractor.CellContentInterpreter

abstract class PatternInterpreter(
	val validHeaders : List[String],
    regex : String,
    val parameters : List[String]
    ) {
  
	private val pattern : Pattern =  Pattern.compile(regex)

	private var validProducts : List[Product] = Nil
    private var validFeatures : List[Feature] = Nil
    
    var cellContentInterpreter : CellContentInterpreter = new CellContentInterpreter(Nil)
    
    def setCellContentInterpreter(interpreter : CellContentInterpreter) {
	  cellContentInterpreter = interpreter
	}
    
	// FIXME : in some cases (Multi, Partial for example), 
	// we need to restart all the pattern matching rule on sub-elements of the pattern
	
    def config(pcm : PCM) {
	  validProducts = Nil
	  validFeatures = Nil
	  
	  // Find concepts in validHeaders and separate them in products and features
	   for (concept <- pcm.getConcepts(); validHeader <- validHeaders)  {
	     if (format(validHeader).equals(format(concept.getName()))) {
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
			Some(createConstraint(s, matcher, parameters))
		  } else {
		    None
		  }
	    
	  } else {
	    None
	  }
	  
	}
	
	def createConstraint(s : String, matcher : Matcher, parameters : List[String]) : Constraint
	
	def format (s : String) : String = {
	  val words = for (word <- s.split("\\s") if !word.isEmpty()) yield word
      val formattedContent = words.mkString("", " ", "").toLowerCase()
      formattedContent
	}
	
	
  
}

