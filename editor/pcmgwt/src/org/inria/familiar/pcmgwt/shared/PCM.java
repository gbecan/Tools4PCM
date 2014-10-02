package org.inria.familiar.pcmgwt.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PCM implements Serializable{
	private static final long serialVersionUID = 3989994318725983511L;
	String name;
	
	public String getName() {
		return name;
	}

	public List<Matrix> getMatrix() {
		return matrix;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMatrix(List<Matrix> matrix) {
		this.matrix = matrix;
	}

	List<Matrix> matrix = new ArrayList<Matrix>();

	@Override
	public String toString() {
		return "PCM [name=" + name + ", matrix=" + matrix + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matrix == null) ? 0 : matrix.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		PCM other = (PCM) obj;
		if (matrix == null) {
			if (other.matrix != null)
				return false;
		} else if (!matrix.equals(other.matrix))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
