package interpreters

import pcmmm.Constraint
import java.util.regex.Pattern
import java.util.regex.Matcher

abstract class PatternInterpreter(
    val validRowHeaders : List[String],
    val validColumnHeaders : List[String],
    val regex : String,
    val parameters : List[String]
    ) {
  
	private val pattern : Pattern =  Pattern.compile(regex)

	// FIXME : in some cases (Multi, Partial for example), 
	// we need to restart all the pattern matching rule on sub-elements of the pattern
	
	def interpret(s : String, rowHeaders : List[String], columnHeaders : List[String]) : Option[Constraint] = {

	  if ((validRowHeaders.isEmpty || !rowHeaders.intersect(validRowHeaders).isEmpty)
	  && (validColumnHeaders.isEmpty || !columnHeaders.intersect(validColumnHeaders).isEmpty)) {
	  
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

