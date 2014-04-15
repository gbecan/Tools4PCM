package org.inria.familiar.pcmgwt.shared;

import java.io.Serializable;

public class Cell extends AbstractCell implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Constraint constraint;
	
	public Constraint getConstraint() {
		return constraint;
	}
	public void setConstraint(Constraint constraint) {
		this.constraint = constraint;
	}
	public Cell(int x, int y, String value,Constraint constraint) {
		super();
		this.x = x;
		this.y = y;
		this.value = value;
		this.constraint = constraint;
	}
	public Cell() {
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((constraint == null) ? 0 : constraint.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (constraint == null) {
			if (other.constraint != null)
				return false;
		} else if (!constraint.equals(other.constraint))
			return false;
		return true;
	}
	

	
	}
