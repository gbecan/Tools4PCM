package interpreters

import java.util.regex.Matcher
import pcmmm.Constraint
import pcmmm.PcmmmFactory
import extractor.CellContentInterpreter

class MultiplePatternInterpreter (
    validHeaders : List[String],
    regex : String,
    parameters : List[String])
    extends PatternInterpreter(validHeaders, regex, parameters) {

  override def createConstraint(s : String, matcher : Matcher, parameters : List[String]) : Constraint = {
		  val constraint = PcmmmFactory.eINSTANCE.createMultiple()
		  for (groupID <- 1 to matcher.groupCount()) {
			  val subConstraint = matcher.group(groupID)
			  val subCInterpretation = cellContentInterpreter.findInterpretation(subConstraint, Nil, Nil)
			  if (subCInterpretation.isDefined) {
			    constraint.getContraints().add(subCInterpretation.get)
			  }
		  }
		  constraint
  }

}