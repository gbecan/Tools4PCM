package interpreters

import pcmmm.Constraint
import java.util.regex.Matcher
import pcmmm.PcmmmFactory
import pcmmm.Product
import pcmmm.Feature

class SimplePatternInterpreter (
    validHeaders : List[String],
    regex : String,
    parameters : List[String])
    extends PatternInterpreter(validHeaders, regex, parameters) {
 
  override def createConstraint(s : String, matcher : Matcher, parameters : List[String], products : List[Product], features : List[Feature]) : Option[Constraint] = {
		  val constraint = PcmmmFactory.eINSTANCE.createSimple()
		  constraint.setName(s)
		  Some(constraint)
  }
  
}