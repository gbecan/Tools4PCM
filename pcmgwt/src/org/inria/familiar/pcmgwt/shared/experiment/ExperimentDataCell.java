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

	int mrow, mcolumn;
	
	String matriceId;
	
	boolean mvalidate;
	
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
		this.mrow = row;
		this.mcolumn = column;
		this.mvalidate = validate;
		this.remarks = remarks;
	}

	public ExperimentDataCell(int row, int column, boolean validate, Type type,
			String remarks) {
		super();
		this.mrow = row;
		this.mcolumn = column;
		this.mvalidate = validate;
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
		return mrow;
	}

	public void setRow(int row) {
		this.mrow = row;
	}

	public int getColumn() {
		return mcolumn;
	}

	public void setColumn(int column) {
		this.mcolumn = column;
	}

	public boolean isValidate() {
		return mvalidate;
	}

	public void setValidate(boolean validate) {
		this.mvalidate = validate;
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
		result = prime * result + mcolumn;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result
				+ ((matriceId == null) ? 0 : matriceId.hashCode());
		result = prime * result + ((newType == null) ? 0 : newType.hashCode());
		result = prime * result + (noInterpretation ? 1231 : 1237);
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		result = prime * result + mrow;
		result = prime * result + (mvalidate ? 1231 : 1237);
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
		if (mcolumn != other.mcolumn)
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
		if (mrow != other.mrow)
			return false;
		if (mvalidate != other.mvalidate)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ExperimentDataCell [id=" + id + ", row=" + mrow + ", column="
				+ mcolumn + ", matriceId=" + matriceId + ", validate="
				+ mvalidate + ", noInterpretation=" + noInterpretation
				+ ", newType=" + newType + ", remarks=" + remarks + "]";
	}

	boolean noIdea = false;


	public boolean isNoIdea() {
		return noIdea;
	}

	public void setNoIdea(boolean noIdea) {
		this.noIdea = noIdea;
	}

}
