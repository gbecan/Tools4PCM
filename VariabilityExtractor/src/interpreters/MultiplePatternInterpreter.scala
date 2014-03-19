package interpreters

import java.util.regex.Matcher
import pcmmm.Constraint
import pcmmm.PcmmmFactory
import extractor.CellContentInterpreter
import pcmmm.Product
import pcmmm.Feature

class MultiplePatternInterpreter (
    validHeaders : List[String],
    regex : String,
    parameters : List[String])
    extends PatternInterpreter(validHeaders, regex, parameters) {

  override def createConstraint(s : String, matcher : Matcher, parameters : List[String], products : List[Product], features : List[Feature]) : Constraint = {
		  val constraint = parameters match {
		    case "and" :: Nil => PcmmmFactory.eINSTANCE.createAnd()
		    case "xor" :: Nil => PcmmmFactory.eINSTANCE.createXOr()
		    case "or" :: Nil => PcmmmFactory.eINSTANCE.createOr()
		    case _ => PcmmmFactory.eINSTANCE.createMultiple()
		  }
		   
		  for (groupID <- 1 to matcher.groupCount()) {
			  val subConstraint = matcher.group(groupID)
			  if (subConstraint != null) {
				  val subCInterpretation = cellContentInterpreter.findInterpretation(subConstraint, products, features)
				  if (subCInterpretation.isDefined) {
				    constraint.getContraints().add(subCInterpretation.get)
				  }
			  }
			  
		  }
		  constraint
  }

}