package patterns

import pcmmm.Constraint
import pcmmm.PcmmmFactory

class NumberInterpreter extends PatternInterpreter {

	override def interpret(s: String) : Option[Constraint] = {
	    val fs = format(s)
	
	    if (fs.matches("[0-9]+")) {
	    	val constraint = PcmmmFactory.eINSTANCE.createSimple()
	    	constraint.setName(s)
	    	Some(constraint)
	    } else {
	      None
	    }
   
	}
}