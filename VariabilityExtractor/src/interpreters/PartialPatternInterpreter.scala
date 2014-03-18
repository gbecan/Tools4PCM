package interpreters

import java.util.regex.Matcher
import pcmmm.Constraint
import pcmmm.PcmmmFactory
import extractor.CellContentInterpreter

class PartialPatternInterpreter (
    validHeaders : List[String],
    regex : String,
    parameters : List[String])
    extends PatternInterpreter(validHeaders, regex, parameters) {

  override def createConstraint(s : String, matcher : Matcher, parameters : List[String]) : Constraint = {
		 val constraint = PcmmmFactory.eINSTANCE.createPartial()
		 if (matcher.groupCount() == 2) {
		   // Interpret argument
		   val argument = matcher.group(1)
		   val argInterpretation = cellContentInterpreter.findInterpretation(argument, Nil, Nil)
		   if (argInterpretation.isDefined) {
			   constraint.setArgument(argInterpretation.get)  
		   }
		   
		   // Interpret condition
		   val condition = matcher.group(2)
		   val condInterpretation = cellContentInterpreter.findInterpretation(condition, Nil, Nil)
		   if (condInterpretation.isDefined) {
		     constraint.setCondition(condInterpretation.get)
		   }
		 }
		 constraint
  }

}