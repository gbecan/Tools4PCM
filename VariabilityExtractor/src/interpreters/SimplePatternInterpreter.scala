package interpreters

import pcmmm.Constraint
import java.util.regex.Matcher
import pcmmm.PcmmmFactory

class SimplePatternInterpreter (
    validRowHeaders : List[String],
    validColumnHeaders : List[String],
    regex : String,
    parameters : List[String])
    extends PatternInterpreter(validRowHeaders, validColumnHeaders, regex, parameters) {
 
  override def createConstraint(matcher : Matcher, parameters : List[String]) : Constraint = {
		  PcmmmFactory.eINSTANCE.createSimple()
  }
  
}