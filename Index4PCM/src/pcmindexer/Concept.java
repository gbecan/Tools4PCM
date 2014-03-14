package pcmindexer;


public class Concept {
	private String name;
	private String associatedRule;
	
	public Concept(String n, String r){
		name=n;
		associatedRule=r;
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
}
