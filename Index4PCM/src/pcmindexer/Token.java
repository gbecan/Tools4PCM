package pcmindexer;

import java.util.ArrayList;

public class Token {
	private String name;
	private ArrayList<String> litterals;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getLitterals() {
		return litterals;
	}
	public void setLitterals(ArrayList<String> litterals) {
		this.litterals = litterals;
	}
	
	public Token(String s){
		name = s;
		litterals = new ArrayList<String>();
	}
	
}
