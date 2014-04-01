package org.inria.familiar.pcmgwt.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Matrix implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4808990536928917006L;
	List<Header> headers = new ArrayList<Header>();
	List<Cell> cells = new ArrayList<Cell>();
	Extra e = new Extra();
	
	public Extra getExtra() {
		return e;
	}
	public void setExtra(Extra e) {
		this.e = e;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;
	

	public Matrix(){
		
	}
	
	public Matrix(String name) {
		super();
		this.name = name;
	}
	public List<Header> getHeaders() {
		return headers;
	}
	public void setHeaders(List<Header> headers) {
		this.headers = headers;
	}
	public List<Cell> getCells() {
		return cells;
	}
	public void setCells(List<Cell> cells) {
		this.cells = cells;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cells == null) ? 0 : cells.hashCode());
		result = prime * result + ((headers == null) ? 0 : headers.hashCode());
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
		Matrix other = (Matrix) obj;
		if (cells == null) {
			if (other.cells != null)
				return false;
		} else if (!cells.equals(other.cells))
			return false;
		if (headers == null) {
			if (other.headers != null)
				return false;
		} else if (!headers.equals(other.headers))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	

}

