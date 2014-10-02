package org.inria.familiar.pcmgwt.shared.experiment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class ExperimentData implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue
	long id;
	
	String pcmName;
	
	String firstName;
	String lastName;
	String mail;
	
	@Temporal(TemporalType.DATE)
	Date date;
	
	String globalRemarks;



	@OneToMany(cascade=CascadeType.PERSIST)
	@JoinColumn(name="experimentId")
	List<ExperimentDataCell> cells = new ArrayList<ExperimentDataCell>();

	public ExperimentData() {
		date = new Date(System.currentTimeMillis());
	}
	
	public ExperimentData(String pcmName, String firstName, String lastName,
			String mail, Date date, String globalRemarks) {
		super();
		this.pcmName = pcmName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.date = date;
		this.globalRemarks = globalRemarks;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getPcmName() {
		return pcmName;
	}


	public void setPcmName(String pcmName) {
		this.pcmName = pcmName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getGlobalRemarks() {
		return globalRemarks;
	}


	public void setGlobalRemarks(String globalRemarks) {
		this.globalRemarks = globalRemarks;
	}

	public List<ExperimentDataCell> getCells() {
		return cells;
	}


	public void setCells(List<ExperimentDataCell> cells) {
		this.cells = cells;
	}



	@Override
	public String toString() {
		return "ExperimentData [id=" + id + ", pcmName=" + pcmName
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mail=" + mail + ", date=" + date + ", globalRemarks="
				+ globalRemarks + ", cells=" + cells + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cells == null) ? 0 : cells.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((globalRemarks == null) ? 0 : globalRemarks.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((pcmName == null) ? 0 : pcmName.hashCode());
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
		ExperimentData other = (ExperimentData) obj;
		if (cells == null) {
			if (other.cells != null)
				return false;
		} else if (!cells.equals(other.cells))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (globalRemarks == null) {
			if (other.globalRemarks != null)
				return false;
		} else if (!globalRemarks.equals(other.globalRemarks))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (pcmName == null) {
			if (other.pcmName != null)
				return false;
		} else if (!pcmName.equals(other.pcmName))
			return false;
		return true;
	}
	

}
