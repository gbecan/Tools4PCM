package test;

import pcmindexer.Concept;
import pcmindexer.ParserTools;
import junit.framework.TestCase;

public class ParserToolsTest extends TestCase{
	
	public void testReadLine1(){
		String s1 = "\"me\" \"me1\" single \"✓\" {2 1}";
		Concept c = ParserTools.readLine(s1);
		assertEquals("me", c.getHeaders().get(0));
		assertEquals("me1", c.getHeaders().get(1));
		assertEquals("single", c.getName());
		assertEquals("✓", c.getAssociatedRule());
		assertEquals("2", c.getParameters().get(0));
		assertEquals("1", c.getParameters().get(1));
	}
	public void testReadLine2(){
		String s2 = "single \"myrule\"";
		Concept c = ParserTools.readLine(s2);
		assertTrue(c.getHeaders().isEmpty());
		assertEquals("single", c.getName());
		assertEquals("myrule", c.getAssociatedRule());
		assertTrue(c.getParameters().isEmpty());

	}
	public void testReadLine3(){
		String s3 = "multi \"myRegExp\" {1}";
		Concept c = ParserTools.readLine(s3);
		assertTrue(c.getHeaders().isEmpty());
		assertEquals("multi", c.getName());
		assertEquals("myRegExp", c.getAssociatedRule());
		assertEquals("1", c.getParameters().get(0));

	}
	public void testReadLine4(){
		String s4 = "\"header\" yesno \"true\"";
		Concept c = ParserTools.readLine(s4);
		assertEquals("header", c.getHeaders().get(0));
		assertEquals("yesno", c.getName());
		assertEquals("true", c.getAssociatedRule());
		assertTrue(c.getParameters().isEmpty());
	}
	
	public void testReadLine5(){
		String s5 = "\"LCD monitor\" multi \"(.*\")\\s(.*)\" {AND}";
		Concept c = ParserTools.readLine(s5);
		assertEquals("LCD monitor", c.getHeaders().get(0));
		assertEquals("multi", c.getName());
		assertEquals("(.*\")\\s(.*)", c.getAssociatedRule());
		assertEquals("AND", c.getParameters().get(0));
	}
	
	public void testReadLine6(){
		String s5 = "\"LCD monitor\" \"Digital display\" multiple \"(.*\")\\s(.*)\" {AND}";
		Concept c = ParserTools.readLine(s5);
		assertEquals("LCD monitor", c.getHeaders().get(0));
		assertEquals("Digital display", c.getHeaders().get(1));
		assertEquals("multiple", c.getName());
		assertEquals("(.*\")\\s(.*)", c.getAssociatedRule());
		assertEquals("AND", c.getParameters().get(0));
	}

}
