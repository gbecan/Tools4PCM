package pcmindexer;

import java.util.ArrayList;


public class Concept {
	private ArrayList<String> headers;
	private String name;
	private String associatedRule;
	private ArrayList<String> parameters;	
	
	/**
	 * 
	 * @param headers
	 * @param name
	 * @param associatedRule
	 * @param parameters
	 */
	public Concept(ArrayList<String> headers, String name, String associatedRule, ArrayList<String> parameters) {
		super();
		this.headers = headers;
		this.name = name;
		this.associatedRule = associatedRule;
		this.parameters = parameters;
	}

	public void setAssociatedRule(String associatedRule) {
		this.associatedRule = associatedRule;
	}
	public String getAssociatedRule() {
		return associatedRule;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public ArrayList<String> getHeaders() {
		return headers;
	}

	public void setHeaders(ArrayList<String> headers) {
		this.headers = headers;
	}

	public ArrayList<String> getParameters() {
		return parameters;
	}

	public void setParameters(ArrayList<String> parameters) {
		this.parameters = parameters;
	}
}
