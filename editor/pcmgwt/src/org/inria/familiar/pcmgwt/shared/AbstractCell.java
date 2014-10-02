package org.inria.familiar.pcmgwt.shared;

import java.io.Serializable;

public class AbstractCell implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x;
	int y;
	String value;

	String matrixId;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((matrixId == null) ? 0 : matrixId.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractCell other = (AbstractCell) obj;
		if (matrixId == null) {
			if (other.matrixId != null)
				return false;
		} else if (!matrixId.equals(other.matrixId))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public String getMatrixId() {
		return matrixId;
	}

	@Override
	public String toString() {
		return "AbstractCell [x=" + x + ", y=" + y + ", value=" + value
				+ ", matrixId=" + matrixId + "]";
	}

	public void setMatrixId(String matrixId) {
		this.matrixId = matrixId;
	}

	public AbstractCell(int x, int y, String value) {
		super();
		this.x = x;
		this.y = y;
		this.value = value;
	}

	public AbstractCell(){
		
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}



}
