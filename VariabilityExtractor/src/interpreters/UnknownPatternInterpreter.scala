package interpreters

import java.util.regex.Matcher
import scala.collection.immutable.List
import pcmmm.Constraint
import pcmmm.PcmmmFactory
import pcmmm.Product
import pcmmm.Feature

class UnknownPatternInterpreter (
    validHeaders : List[String],
    regex : String,
    parameters : List[String])
    extends PatternInterpreter(validHeaders, regex, parameters) {

  override def createConstraint(s : String, matcher : Matcher, parameters : List[String], products : List[Product], features : List[Feature]) : Constraint = {
		 val constraint =  PcmmmFactory.eINSTANCE.createUnknown()
		 constraint.setName(s)
		 constraint
  }

}