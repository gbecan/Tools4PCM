package org.inria.familiar.pcmgwt.shared;

import java.io.Serializable;

public class Cell extends AbstractCell implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Type type;
	
	public Cell(int x, int y, String value, Type type) {
		super();
		this.x = x;
		this.y = y;
		this.value = value;

	}
	public Cell() {
		
	}
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Cell other = (Cell) obj;
		if (type != other.type)
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
}
