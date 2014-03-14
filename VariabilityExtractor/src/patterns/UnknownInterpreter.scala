package patterns

import pcmmm.Constraint
import pcmmm.PcmmmFactory

class UnknownInterpreter extends PatternInterpreter {
  
  override def interpret(s: String) : Option[Constraint] = {
    val fs = format(s)

    if (
    	fs.contains("?") ||
        fs.equals("unknown") ||
        fs.equals("n/a") || 
        fs.matches("[-]+") ||
        fs.matches("[—]+")
    ) {
    	val constraint = PcmmmFactory.eINSTANCE.createUnknwon()
    	constraint.setName(s)
    	Some(constraint)
    } else {
      None
    }
   
  }
}