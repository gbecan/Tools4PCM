package test

import pcmmm.Constraint
import pcmmm.Cell

case class InterpretationEvaluation(cell : Cell, constraint : Constraint, evaluation : Evaluation) {
  
}

abstract class Evaluation
case class NotEvaluated extends Evaluation
case class Incoherent(evaluations : List[Evaluation]) extends Evaluation
case class Valid extends Evaluation
case class DontKnow extends Evaluation
case class NoInterpretation extends Evaluation
case class CorrectedInMM(concept : String) extends Evaluation
case class NewConcept(concept : String) extends Evaluation

