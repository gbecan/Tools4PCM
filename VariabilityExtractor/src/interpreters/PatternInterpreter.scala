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
    
    var cellContentInterpreter : CellContentInterpreter = _
    
    protected var lastCall : Option[(String, List[Product], List[Feature])] = None
    
    def setCellContentInterpreter(interpreter : CellContentInterpreter) {
	  cellContentInterpreter = interpreter
	}
    
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

	  if (!lastCall.isDefined || (s, products, features) != lastCall.get) {
		  lastCall = None
	    
		  if ((validProducts.isEmpty || !products.intersect(validProducts).isEmpty)
				  && (validFeatures.isEmpty || !features.intersect(validFeatures).isEmpty)) {
		    
			  val matcher = pattern.matcher(format(s))
			  if (matcher.matches()) {
				return createConstraint(s, matcher, parameters, products, features)
			  }
			  
		  }
	  }
	  
	  None
	}
	
	def createConstraint(s : String, matcher : Matcher, parameters : List[String], products : List[Product], features : List[Feature]) : Option[Constraint]
	
	def format (s : String) : String = {
	  val words = for (word <- s.split("\\s") if !word.isEmpty()) yield word
      val formattedContent = words.mkString("", " ", "").toLowerCase()
      formattedContent
	}
	
	
  
}

