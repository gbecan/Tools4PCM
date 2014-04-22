package org.inria.familiar.pcmgwt.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Constraint implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Constraint(Type type,String name) {
		super();
		this.type = type;
		this.name= name;
	}
	public Constraint() {
		// TODO Auto-generated constructor stub
	}
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Type type;
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public List<Constraint> getConstraints() {
		return constraints;
	}
	public void setConstraints(List<Constraint> constraints) {
		this.constraints = constraints;
	}
	List<Constraint> constraints = new ArrayList<Constraint>();
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append(type.toString());
		if (name != null)
			buf.append( "(" + this.getName()+")");
		if (constraints.size()>0)
			buf.append(" : <br>");
		for (Constraint c : constraints){
//			if (c.equals(constraints.get(constraints.size()-1)))
				buf.append("&nbsp;&nbsp;&nbsp;" + c.toString() +"<br>");
//			else
//				buf.append("\t" + c.toString() + "\n");
		}
			buf.append(" : <br>");
		
		return buf.toString();
	}
	

}
