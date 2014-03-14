package pcmindexer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.lucene.analysis.en.EnglishAnalyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

public class PCMIndexer {


	public String corpusDir;
	public static Logger myLogger = Logger.getLogger("Indexer");

	public IndexWriter standardWriter;
	public IndexWriter englishWriter;
	public StandardAnalyzer anaStandard;
	public EnglishAnalyzer anaEnglish;
	
	public ArrayList<Token> tokens;
	
	/**
	 * constructor of two indexers that will create 
	 * one StandardAnalyzer index in directory StandardIndex, 
	 * one EnglishAnalyzer index documents from CorpusDir in EnglishIndex (English language + default stop-word removing + stemming)
	 * @param standardIndex the location of the Standard index dir
	 * @param englishIndex the location of the English index dir
	 * @param corpus the corpus to index
	 * @throws IOException
	 */
	public PCMIndexer(String standardIndex, String englishIndex, String corpus) throws IOException {
		
		corpusDir = corpus;
		
		anaStandard = new StandardAnalyzer(Version.LUCENE_35);
		IndexWriterConfig standardConfigurator = new IndexWriterConfig(Version.LUCENE_35, anaStandard);
		standardConfigurator.setOpenMode(IndexWriterConfig.OpenMode.CREATE);
		Directory dirStandard = FSDirectory.open(new File(standardIndex));
		standardWriter = new IndexWriter(dirStandard, standardConfigurator);
				
		
		anaEnglish = new EnglishAnalyzer(Version.LUCENE_35);
		IndexWriterConfig englishConfigurator = new IndexWriterConfig(Version.LUCENE_35, anaEnglish);
		englishConfigurator.setOpenMode(IndexWriterConfig.OpenMode.CREATE);
		Directory dirEnglish = FSDirectory.open(new File(englishIndex));
		englishWriter = new IndexWriter(dirEnglish, englishConfigurator);
		
		tokens = new ArrayList<Token>();
		tokens.add(new Token("yesno")); 
		tokens.add(new Token("unknown"));
		tokens.add(new Token("inconsistent"));
		tokens.add(new Token("number"));
		tokens.add(new Token("word"));
		tokens.add(new Token("freeProprietary"));
		tokens.add(new Token("only"));
		tokens.add(new Token("iffile"));
		tokens.add(new Token("partial"));
		tokens.add(new Token("version"));
		tokens.add(new Token("single"));
	}
	

	/**
	 * constructor of an indexer that will create its index in directory indexDir, index documents from CorpusDir with an EnglishAnalyzer(english language + default stop-word removing + stemming)
	 * @param index
	 * @param ana
	 * @param corpus
	 * @throws IOException
	 */
	public PCMIndexer(String index, EnglishAnalyzer ana, String corpus) throws IOException {
		Directory dir = FSDirectory.open(new File(index));
		IndexWriterConfig englishConfigurator = new IndexWriterConfig(Version.LUCENE_35, anaEnglish);
		englishConfigurator.setOpenMode(IndexWriterConfig.OpenMode.CREATE);
		englishWriter = new IndexWriter(dir, englishConfigurator);
		corpusDir = corpus;
	}

	/**
	 * constructor of an indexer that will create its index in directory indexDir, index documents from CorpusDir with an Standardanalyzer
	 * @param index
	 * @param ana
	 * @param corpus
	 * @throws IOException
	 */
	public PCMIndexer(String index, StandardAnalyzer ana, String corpus) throws IOException {
		Directory dir = FSDirectory.open(new File(index));
		IndexWriterConfig standardConfigurator = new IndexWriterConfig(Version.LUCENE_35, anaStandard);
		standardConfigurator.setOpenMode(IndexWriterConfig.OpenMode.CREATE);
		standardWriter = new IndexWriter(dir, standardConfigurator);
		corpusDir = corpus;
	}

	/**
	 * launch the indexing method provided each file of the corpus directory
	 * exists / is accessible / readable / is not a subDir
	 * @param corpusDir
	 * @param filter
	 * @return
	 * @throws Exception
	 */
	public int index(String corpusDir, FileFilter filter) throws Exception {
		myLogger.trace("entering index method");
		File[] files = new File(corpusDir).listFiles();
		for (File f : files) {
			if (!f.isDirectory() && !f.isHidden() && f.exists() && f.canRead()
					&& (filter.accept(f) || filter == null)) {
				myLogger.info("next document to index: " + f.getName());
				getDocument(f);
			}
		}
		return standardWriter.numDocs();
	}

	private void getDocument(File f) throws IOException {	
		
		InputStream ips = new FileInputStream(f);
		InputStreamReader ipsr = new InputStreamReader(ips);
		BufferedReader br = new BufferedReader(ipsr);
		String s = "";
		// parsing each cell of the PCM
		while ((s = br.readLine()) != null) {
			myLogger.debug("reading cell: " + s);
			s = s.toLowerCase();
			s = s.trim();
			Document doc = new Document();
			doc.add(new Field("content", manageCell(s), Field.Store.YES, Field.Index.NOT_ANALYZED));
			doc.add(new Field("verbatim", s, Field.Store.YES, Field.Index.NOT_ANALYZED));
			doc.add(new Field("fileName", f.getName(), Field.Store.YES,	Field.Index.NO));
			doc.add(new Field("fullpath", f.getCanonicalPath(), Field.Store.YES, Field.Index.NO));
			
			standardWriter.addDocument(doc);
			englishWriter.addDocument(doc);
		}
		br.close();
	}


	public String manageCell(String s) {
		String[] temp = s.split(" ");
		for (String tmp : temp) {

			if (tmp.equals("yes")) {addLitteral("yesno", s); return "YES/NO";}
			if (tmp.equals("no")) {addLitteral("yesno", s); return "YES/NO";}
			if (tmp.equals("true")) {addLitteral("yesno", s); return "YES/NO";}
			if (tmp.equals("false")) {addLitteral("yesno", s); return "YES/NO";}
			if (tmp.equals("✓")) {addLitteral("yesno", s); return "YES/NO";}

			if (s.contains("?")) {addLitteral("unknown", s); return "UNKNOWN";}
			if (s.equals("unknown")) {addLitteral("unknown", s); return "UNKNOWN";}
			if (s.contains("only*")) {addLitteral("only", s); return "ONLY";}
			if (s.matches("if")) {addLitteral("iffile", s); return "IF";}

			if (s.contains("free")) {addLitteral("freeProprietary", s);	return "FREE/PROPRIETARY";}
			if (s.contains("proprietary")) {addLitteral("freeProprietary", s); return "FREE/PROPRIETARY";			}
			if (s.contains("(paid*")) {addLitteral("freeProprietary", s); return "FREE/PROPRIETARY";}

			if (s.contains("partial")) {addLitteral("partial", s); return "PARTIAL";}

			if (s.matches("(\\d+(\\.\\d+)+)")) {addLitteral("version", s); return "VERSION";}

			if (s.equals("n/a")) {addLitteral("unknown", s); return "UNKNOWN";}
			if (s.matches("[-]+")) {addLitteral("unknown", s); return "UNKNOWN";}
			if (s.matches("[—]+")) {addLitteral("unknown", s); return "UNKNOWN";}

			if (s.matches("[0-9]+")) {addLitteral("number", s); return "NUMBER";}

			if (s.matches("([a-z]|[0-9])+")) {addLitteral("word", s); return "WORD";}

			if (s.matches("\\w+(\\s\\w+)*")) {addLitteral("single", s); return "SINGLE";}
		}

		return s;
	}

	private void addLitteral(String token, String s) {
		for (Token t : tokens){
			if (t.getName().equals(token)){
				myLogger.debug("identifying token" + token);
				if (!t.getLitterals().contains(s)) {
					myLogger.debug("adding \"" + s + ("\" to token"));
					t.getLitterals().add(s);
					}
			}
		}
	}


	public void launchIndexer() throws Exception{
		long start=System.currentTimeMillis();
		int numIndexed = 0;
		try {
			numIndexed = index(corpusDir, new TextFileFilter());
		}
		catch (Exception e) {myLogger.error("error during indexing, index was closed" + e.toString());}
		
		finally {
			standardWriter.close();
			englishWriter.close();
			}
		
		long end=System.currentTimeMillis();
		myLogger.info("Indexing " + numIndexed + " files took " + (end-start) + "ms");		
	}


	private class TextFileFilter implements FileFilter {
		public boolean accept(File path) {
			return path.getName().toLowerCase().endsWith(".txt");
		}
	}
	
	/**
	 * Write all the token litterals into a dedicated file
	 * @param s the token list to write
	 * @throws IOException
	 */
	public void writeLitterals(Token token) throws IOException{
		File f = new File("tokenLitterals/"+token.getName()+".txt");
		FileWriter fw = new FileWriter(f);
		for (String lit : token.getLitterals()){
			fw.write(lit + "\n");
		}
		fw.close();		
	}

}
