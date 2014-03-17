package interpreters

import pcmmm.Constraint

abstract class PatternInterpreter(
    headers : List[String],
    regex : String,
    parameters : List[String]
    ) {
  
	def interpret(s : String) : Option[Constraint]
	
	def format (s : String) : String = {
	  val words = for (word <- s.split("\\s") if !word.isEmpty()) yield word
      val formattedContent = words.mkString("", " ", "").toLowerCase()
      formattedContent
	}
	
	
  
}

