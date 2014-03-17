package interpreters

import java.util.regex.Matcher
import scala.collection.immutable.List
import pcmmm.Constraint
import pcmmm.PcmmmFactory

class UnknownPatternInterpreter (
    validRowHeaders : List[String],
    validColumnHeaders : List[String],
    regex : String,
    parameters : List[String])
    extends PatternInterpreter(validRowHeaders, validColumnHeaders, regex, parameters) {

  override def createConstraint(matcher : Matcher, parameters : List[String]) : Constraint = {
		  PcmmmFactory.eINSTANCE.createUnknown()
  }

}