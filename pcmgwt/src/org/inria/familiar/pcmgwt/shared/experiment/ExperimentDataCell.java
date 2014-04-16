package org.inria.familiar.pcmgwt.shared.experiment;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.inria.familiar.pcmgwt.shared.Type;
@Entity
public class ExperimentDataCell implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	long id;

	int row, column;
	
	String matriceId;
	
	boolean validate;
	
	boolean noInterpretation=false;
	
	
	public boolean isNoInterpretation() {
		return noInterpretation;
	}

	public void setNoInterpretation(boolean noInterpretation) {
		this.noInterpretation = noInterpretation;
	}

	@Enumerated(EnumType.STRING)
	Type newType;
	public Type getNewType() {
		return newType;
	}

	public void setNewType(Type newType) {
		this.newType = newType;
	}

	String remarks;

	public ExperimentDataCell() {
	}

	public ExperimentDataCell(int row, int column, boolean validate,
			String remarks) {
		super();
		this.row = row;
		this.column = column;
		this.validate = validate;
		this.remarks = remarks;
	}

	public ExperimentDataCell(int row, int column, boolean validate, Type type,
			String remarks) {
		super();
		this.row = row;
		this.column = column;
		this.validate = validate;
		this.remarks = remarks;
		this.newType = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public boolean isValidate() {
		return validate;
	}

	public void setValidate(boolean validate) {
		this.validate = validate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}




	public String getMatriceId() {
		return matriceId;
	}

	public void setMatriceId(String matriceId) {
		this.matriceId = matriceId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + column;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result
				+ ((matriceId == null) ? 0 : matriceId.hashCode());
		result = prime * result + ((newType == null) ? 0 : newType.hashCode());
		result = prime * result + (noInterpretation ? 1231 : 1237);
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		result = prime * result + row;
		result = prime * result + (validate ? 1231 : 1237);
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
		ExperimentDataCell other = (ExperimentDataCell) obj;
		if (column != other.column)
			return false;
		if (id != other.id)
			return false;
		if (matriceId == null) {
			if (other.matriceId != null)
				return false;
		} else if (!matriceId.equals(other.matriceId))
			return false;
		if (newType != other.newType)
			return false;
		if (noInterpretation != other.noInterpretation)
			return false;
		if (remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!remarks.equals(other.remarks))
			return false;
		if (row != other.row)
			return false;
		if (validate != other.validate)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ExperimentDataCell [id=" + id + ", row=" + row + ", column="
				+ column + ", matriceId=" + matriceId + ", validate="
				+ validate + ", noInterpretation=" + noInterpretation
				+ ", newType=" + newType + ", remarks=" + remarks + "]";
	}

}
