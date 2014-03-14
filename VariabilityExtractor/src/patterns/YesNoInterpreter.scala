package patterns

import pcmmm.PcmmmFactory
import pcmmm.Constraint

class YesNoInterpreter extends PatternInterpreter {

  override def interpret(s: String) : Option[Constraint] = {
    val constraint = PcmmmFactory.eINSTANCE.createBoolean()
    constraint.setName(s)

    format(s) match {
      case "yes" => constraint.setValue(true) 
      case "no" => constraint.setValue(false)
      case _ => return None
    }
        
    Some(constraint)
  }
}