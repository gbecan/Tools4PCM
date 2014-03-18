package interpreters

import java.util.regex.Matcher
import pcmmm.Constraint
import pcmmm.PcmmmFactory

class InconsistentPatternInterpreter (
    validHeaders : List[String],
    regex : String,
    parameters : List[String])
    extends PatternInterpreter(validHeaders, regex, parameters) {
  
  override def createConstraint(s : String, matcher : Matcher, parameters : List[String]) : Constraint = {
		  val constraint = PcmmmFactory.eINSTANCE.createInconsistent()
		  constraint.setName(s)
		  constraint
  }

}