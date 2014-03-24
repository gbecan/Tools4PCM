package interpreters

import java.util.regex.Matcher
import pcmmm.Constraint
import pcmmm.PcmmmFactory
import extractor.CellContentInterpreter
import pcmmm.Feature
import pcmmm.Product

class PartialPatternInterpreter (
    validHeaders : List[String],
    regex : String,
    parameters : List[String])
    extends PatternInterpreter(validHeaders, regex, parameters) {

  override def createConstraint(s : String, matcher : Matcher, parameters : List[String], products : List[Product], features : List[Feature]) : Option[Constraint] = {
		 val constraint = PcmmmFactory.eINSTANCE.createPartial()
		 var fullyInterpreted : Boolean = true
		 
		 if (matcher.groupCount() >= 1) {
		   // Interpret argument
		   val argument = matcher.group(1)
		   lastCall = Some(s, products, features) 
		   val argInterpretation = cellContentInterpreter.findInterpretation(argument, products, features)
		   if (argInterpretation.isDefined) {
			   constraint.setArgument(argInterpretation.get)  
		   } else {
		     fullyInterpreted = false
		   }
		 }
		 if (matcher.groupCount() >= 2) {  
		   // Interpret condition
		   val condition = matcher.group(2)
		   lastCall = Some(s, products, features) 
		   val condInterpretation = cellContentInterpreter.findInterpretation(condition, products, features)
		   if (condInterpretation.isDefined) {
		     constraint.setCondition(condInterpretation.get)
		     // Invert argument and condition if specified by parameter
		     if (parameters.contains("inverted")) {
		       constraint.setCondition(constraint.getArgument())
		       constraint.setArgument(condInterpretation.get)
		     }
		   } else {
		     fullyInterpreted = false
		   }
		 }
		 
		 if (fullyInterpreted) {
			 Some(constraint)
		 } else {
			 None
		 }
  }

}