package interpreters

import pcmmm.Constraint
import java.util.regex.Matcher
import pcmmm.PcmmmFactory

class SimplePatternInterpreter (
    validHeaders : List[String],
    regex : String,
    parameters : List[String])
    extends PatternInterpreter(validHeaders, regex, parameters) {
 
  override def createConstraint(s : String, matcher : Matcher, parameters : List[String]) : Constraint = {
		  val constraint = PcmmmFactory.eINSTANCE.createSimple()
		  constraint.setName(s)
		  constraint
  }
  
}