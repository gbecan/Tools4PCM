package patterns

import pcmmm.PcmmmFactory
import pcmmm.Constraint

class BooleanInterpreter extends PatternInterpreter {

  override def interpret(s: String) : Option[Constraint] = {
    val constraint = PcmmmFactory.eINSTANCE.createBoolean()
    constraint.setName(s)

    format(s) match {
      case "yes" => constraint.setValue(true) 
      case "no" => constraint.setValue(false)
      case "true" => constraint.setValue(true)
      case "false" => constraint.setValue(false)
      case "✓" => constraint.setValue(true)
      case _ => return None
    }
        
    Some(constraint)
  }
}