package interpreters

import java.util.regex.Matcher
import pcmmm.Constraint
import pcmmm.PcmmmFactory
import pcmmm.Product
import pcmmm.Feature

class InconsistentPatternInterpreter (
    validHeaders : List[String],
    regex : String,
    parameters : List[String])
    extends PatternInterpreter(validHeaders, regex, parameters) {
  
  override def createConstraint(s : String, matcher : Matcher, parameters : List[String], products : List[Product], features : List[Feature]) : Option[Constraint] = {
		  val constraint = PcmmmFactory.eINSTANCE.createInconsistent()
		  constraint.setName(s)
		  Some(constraint)
  }

}