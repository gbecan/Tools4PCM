package test;


import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;

import pcmindexer.PCMIndexer;
import pcmindexer.Token;
import junit.framework.TestCase;



public class IndexerTest extends TestCase{
	PCMIndexer myIndexer;
	
	public void setUp() throws IOException {
		BasicConfigurator.configure();
		myIndexer = new PCMIndexer("index", "index-English", "PCMsource");
	}
	
	public void tearDown() throws IOException {
		myIndexer.standardWriter.close();
		myIndexer.englishWriter.close();
	}
	
	/**
	 * testing different patterns for cell values in order to determine generic cell types (YES/NO, WORD, NUMBER, ONLY, IF, etc.)
	 */
	public void testManageCell(){
		String s = "true";
		assertEquals("YES/NO", myIndexer.manageCell(s));
		s = "1.4";
		assertEquals("VERSION", myIndexer.manageCell(s));
		s = "microsoft";
		assertEquals("WORD", myIndexer.manageCell(s));
		s = "??";
		assertEquals("UNKNOWN", myIndexer.manageCell(s));
		s = "n/a";
		assertEquals("UNKNOWN", myIndexer.manageCell(s));
		s = "---";
		assertEquals("UNKNOWN", myIndexer.manageCell(s));
		s = "—";
		assertEquals("UNKNOWN", myIndexer.manageCell(s));
		s = "ddr3";
		assertEquals("WORD", myIndexer.manageCell(s));
	}
	
	public void testManageCellEsperanto(){
		String s = "esperantopatro nia, kiu estas en la ĉielo, via nomo estu sanktigita. venu via regno, plenumiĝu via volo, kiel en la ĉielo, tiel ankaŭ sur la tero. nian panon ĉiutagan donu al ni hodiaŭ. kaj pardonu al ni niajn ŝuldojn, kiel ankaŭ ni pardonas al niaj ŝuldantoj. kaj ne konduku nin en tenton, sed liberigu nin de la malbono.";
		System.out.println(myIndexer.manageCell(s));
	}

	public void testIndex() throws Exception {
		PCMIndexer.myLogger.setLevel(Level.INFO);
		PCMIndexer.myLogger.info("begining of the indexing phase");
		myIndexer.launchIndexer();
		PCMIndexer.myLogger.info("writing litterals in dedicated files");
		for (Token token : myIndexer.tokens){
			myIndexer.writeLitterals(token);
		}
	}
	
}
