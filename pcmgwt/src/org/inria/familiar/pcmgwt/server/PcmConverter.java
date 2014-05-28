package org.inria.familiar.pcmgwt.server;

import org.inria.familiar.pcmgwt.shared.Constraint;

import pcmmm.And;
import pcmmm.Boolean;
import pcmmm.Cell;
import pcmmm.Double;
import pcmmm.Empty;
import pcmmm.Extra;
import pcmmm.Header;
import pcmmm.Inconsistent;
import pcmmm.Integer;
import pcmmm.Matrix;
import pcmmm.Multiple;
import pcmmm.Or;
import pcmmm.PCM;
import pcmmm.Partial;
import pcmmm.Simple;
import pcmmm.Unknown;
import pcmmm.ValuedCell;
import pcmmm.VariabilityConcept;
import pcmmm.VariabilityConceptRef;
import pcmmm.XOr;
import pcmmm.util.PcmmmSwitch;

public class PcmConverter extends PcmmmSwitch{
	//List<org.inria.familiar.pcmgwt.shared.Matrix> matrices = new ArrayList<org.inria.familiar.pcmgwt.shared.Matrix>();

	org.inria.familiar.pcmgwt.shared.PCM pcm = new org.inria.familiar.pcmgwt.shared.PCM();
	org.inria.familiar.pcmgwt.shared.Matrix m;
	
	
	@Override
	public Object casePCM(PCM object) {
		pcm.setName(object.getName());
		for (Matrix c : 	object.getMatrices()){
			pcm.getMatrix().add((org.inria.familiar.pcmgwt.shared.Matrix) doSwitch(c));
		}
		
		return super.casePCM(object);
	}

	
	@Override
	public Object caseMatrix(Matrix object) {
		m = new org.inria.familiar.pcmgwt.shared.Matrix(object.getName(),object.getId());
		for (Cell c : 	object.getCells()){
			doSwitch(c);
		}
		return m;
	}
	




	@Override
	public Object caseHeader(Header object) {
		org.inria.familiar.pcmgwt.shared.Header h = new org.inria.familiar.pcmgwt.shared.Header(object.getColumn(),  object.getRow(),  object.getVerbatim());
		m.getHeaders().add(h);
		return super.caseHeader(object);
	}

	@Override
	public Object caseValuedCell(ValuedCell object) {
		
		Constraint cons = (Constraint) doSwitch(object.getInterpretation());
		org.inria.familiar.pcmgwt.shared.Cell c = new org.inria.familiar.pcmgwt.shared.Cell(object.getColumn(),object.getRow(),object.getVerbatim(),cons ,m.getId());
		m.getCells().add(c);
		return super.caseValuedCell(object);
	}
	
	@Override
	public Object caseBoolean(Boolean object) {
		return new Constraint(org.inria.familiar.pcmgwt.shared.Type.Boolean,object.getVerbatim());
	}

	@Override
	public Object casePartial(Partial object) {
		Constraint res = new Constraint(org.inria.familiar.pcmgwt.shared.Type.Partial,object.getVerbatim());
			res.getConstraints().add((Constraint) doSwitch(object.getCondition()));
			res.getConstraints().add((Constraint) doSwitch(object.getArgument()));
			return res;
		
	}

	@Override
	public Object caseSimple(Simple object) {
		return new Constraint(org.inria.familiar.pcmgwt.shared.Type.Simple,object.getVerbatim());
	}

	@Override
	public Object caseMultiple(Multiple object) {
		Constraint res = new Constraint(org.inria.familiar.pcmgwt.shared.Type.Multiple,object.getVerbatim());
		for (pcmmm.Constraint co :   object.getContraints()){
			res.getConstraints().add((Constraint) doSwitch(co));
		}
		return 	res;
	}

	@Override
	public Object caseUnknown(Unknown object) {
		return new Constraint(org.inria.familiar.pcmgwt.shared.Type.Unknown,object.getVerbatim());
	}



	@Override
	public Object caseAnd(And object) {
		Constraint res = new Constraint(org.inria.familiar.pcmgwt.shared.Type.And,object.getVerbatim());
		for (pcmmm.Constraint co :   object.getContraints()){
			res.getConstraints().add((Constraint) doSwitch(co));
		}
		
		
		return 	res;
	}

	@Override
	public Object caseOr(Or object) {
		Constraint res = new Constraint(org.inria.familiar.pcmgwt.shared.Type.Or,object.getVerbatim());
		for (pcmmm.Constraint co :   object.getContraints()){
			res.getConstraints().add((Constraint) doSwitch(co));
		}
		
		
		return 	res;
	}

	@Override
	public Object caseXOr(XOr object) {
		Constraint res = new Constraint(org.inria.familiar.pcmgwt.shared.Type.Xor,object.getVerbatim());
		for (pcmmm.Constraint co :   object.getContraints()){
			res.getConstraints().add((Constraint) doSwitch(co));
		}
		return 	res;
	}
	
	@Override
	public Object caseExtra(Extra object) {
		org.inria.familiar.pcmgwt.shared.Extra h = new org.inria.familiar.pcmgwt.shared.Extra(object.getColumn(),  object.getRow(),  object.getName());
		m.setExtra(h);
		return super.caseExtra(object);
	}


	@Override
	public Object caseDouble(Double object) {
		return new Constraint(org.inria.familiar.pcmgwt.shared.Type.Double,object.getVerbatim());
	}


	@Override
	public Object caseEmpty(Empty object) {
		return new Constraint(org.inria.familiar.pcmgwt.shared.Type.Empty,object.getVerbatim());
	}


	@Override
	public Object caseInteger(Integer object) {
		return new Constraint(org.inria.familiar.pcmgwt.shared.Type.Integer,object.getVerbatim());
	}


	@Override
	public Object caseVariabilityConcept(VariabilityConcept object) {
		return super.caseVariabilityConcept(object);
	}


	@Override
	public Object caseVariabilityConceptRef(VariabilityConceptRef object) {
		return new Constraint(org.inria.familiar.pcmgwt.shared.Type.VariabilityConceptRef,object.getVerbatim());
		
		
	}


	@Override
	public Object caseInconsistent(Inconsistent object) {
		return new Constraint(org.inria.familiar.pcmgwt.shared.Type.Inconsistent,object.getVerbatim());
	}


	public org.inria.familiar.pcmgwt.shared.PCM getPCM() {
		return pcm;
	}
	
	
}
