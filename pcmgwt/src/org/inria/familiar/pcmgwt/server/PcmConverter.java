package org.inria.familiar.pcmgwt.server;

import java.util.ArrayList;
import java.util.List;

import pcmmm.And;
import pcmmm.Boolean;
import pcmmm.Cell;
import pcmmm.Extra;
import pcmmm.Header;
import pcmmm.Matrix;
import pcmmm.Multiple;
import pcmmm.Or;
import pcmmm.PCM;
import pcmmm.Partial;
import pcmmm.Simple;
import pcmmm.Unknown;
import pcmmm.ValuedCell;
import pcmmm.XOr;
import pcmmm.util.PcmmmSwitch;

public class PcmConverter extends PcmmmSwitch{
	
	
	List<org.inria.familiar.pcmgwt.shared.Matrix> matrices = new ArrayList<org.inria.familiar.pcmgwt.shared.Matrix>();
	
	org.inria.familiar.pcmgwt.shared.Matrix m;
	
	
	@Override
	public Object casePCM(PCM object) {
		for (Matrix c : 	object.getMatrices()){
			matrices.add((org.inria.familiar.pcmgwt.shared.Matrix) doSwitch(c));
		}
		
		return super.casePCM(object);
	}

	
	@Override
	public Object caseMatrix(Matrix object) {
		m = new org.inria.familiar.pcmgwt.shared.Matrix(object.getName());
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
		
		
		
		org.inria.familiar.pcmgwt.shared.Cell c = new org.inria.familiar.pcmgwt.shared.Cell(object.getColumn(),object.getRow(),object.getVerbatim(),(org.inria.familiar.pcmgwt.shared.Type) doSwitch(object.getInterpretation()) );
		m.getCells().add(c);
		return super.caseValuedCell(object);
	}
	
	@Override
	public Object caseBoolean(Boolean object) {
		return org.inria.familiar.pcmgwt.shared.Type.Boolean;
	}

	@Override
	public Object casePartial(Partial object) {
		return org.inria.familiar.pcmgwt.shared.Type.Partial;
	}

	@Override
	public Object caseSimple(Simple object) {
		return org.inria.familiar.pcmgwt.shared.Type.Simple;
	}

	@Override
	public Object caseMultiple(Multiple object) {
		return org.inria.familiar.pcmgwt.shared.Type.Multiple;
		
	}

	@Override
	public Object caseUnknown(Unknown object) {
		return org.inria.familiar.pcmgwt.shared.Type.Unknown;
	}



	@Override
	public Object caseAnd(And object) {
		return org.inria.familiar.pcmgwt.shared.Type.And;
	}

	@Override
	public Object caseOr(Or object) {
		return org.inria.familiar.pcmgwt.shared.Type.Or;
	}

	@Override
	public Object caseXOr(XOr object) {
		return org.inria.familiar.pcmgwt.shared.Type.Xor;
	}
	
	@Override
	public Object caseExtra(Extra object) {
		org.inria.familiar.pcmgwt.shared.Extra h = new org.inria.familiar.pcmgwt.shared.Extra(object.getColumn(),  object.getRow(),  object.getName());
		m.setExtra(h);
		return super.caseExtra(object);
	}
	

}
