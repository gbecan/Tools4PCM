package patterns

import pcmmm.PcmmmFactory
import pcmmm.Constraint

class SimpleInterpreter extends PatternInterpreter {

	override def interpret(s: String) : Option[Constraint] = {
		if (format(s).matches("\\w+(\\s\\w+)*")) {
			val constraint = PcmmmFactory.eINSTANCE.createSimple()
			constraint.setName(s)
			Some(constraint)
		} else {
		  None
		}
	}

}