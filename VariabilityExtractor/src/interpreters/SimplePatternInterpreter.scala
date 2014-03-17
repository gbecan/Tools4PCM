package interpreters

import pcmmm.Constraint
import java.util.regex.Matcher
import pcmmm.PcmmmFactory

class SimplePatternInterpreter (
    validHeaders : List[String],
    regex : String,
    parameters : List[String])
    extends PatternInterpreter(validHeaders, regex, parameters) {
 
  override def createConstraint(matcher : Matcher, parameters : List[String]) : Constraint = {
		  PcmmmFactory.eINSTANCE.createSimple()
  }
  
}