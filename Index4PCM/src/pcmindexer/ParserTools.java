package pcmindexer;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.*;


public class ParserTools {
	//sets of regexs patterns defining special items such as structures (sections like, figures, lists ...)
	public  ArrayList<Concept> patterns;
	public ArrayList<Concept> yesNOPatterns;
	public ArrayList<Concept> partialPatterns;
	public ArrayList<Concept> singlePatterns;
	public ArrayList<Concept> multiPatterns;
	public ArrayList<Concept> unknownPatterns;
	public ArrayList<Concept> inconsistenPatterns;
	public ArrayList<Concept> separatorPatterns;
	
	public ArrayList<String> warnings;


	public ParserTools() {
		// all regexs
		patterns = new ArrayList<Concept>();
		// special regexep collections
		yesNOPatterns = new ArrayList<Concept>();
		partialPatterns = new ArrayList<Concept>();
		singlePatterns = new ArrayList<Concept>();
		multiPatterns = new ArrayList<Concept>();
		unknownPatterns = new ArrayList<Concept>();
		inconsistenPatterns = new ArrayList<Concept>();
		separatorPatterns = new ArrayList<Concept>();
		
		warnings = new ArrayList<String>();
	}

	/**
	 * read the document configuration file : i.e rules that define fragments
	 * and additional metadata Content is presented using following template:
	 * name = rule, where "=" is used as separator There is no limitation on the
	 * number of metadata/rules
	 * 
	 * @param confFile
	 *            confFile is the configuration where are stored meta-data
	 *            (fragment definition rules, titles, ...) for the document to
	 *            parse
	 * @throws IOException
	 */
	public void readParameters(String confFile) throws IOException {
		File f = new File(confFile);
		InputStream ips = new FileInputStream(f);
		InputStreamReader ipsr = new InputStreamReader(ips);
		BufferedReader br = new BufferedReader(ipsr);
		String s = "";
		while ((s = br.readLine()) != null) {
			String name = s.split("\\s=\\s")[0];
			String rule = s.split("\\s=\\s")[1];
			patterns.add(new Concept(name, rule));

			// to complete in order to fill the special collections
			if (Pattern.matches("", name)) {
				//listPatterns.add(new Concept(name, rule));
			}
		}
		br.close();
	}

	
	/**
	 * 	returns the type of the fragment s
	 * @param s
	 * @return the type of the string s, from . 
	 * If errors are found, warning are stored and suspicious fragments are typed as simple texts
	 */
	public String findDefinition(String s){
		String type = "";
		int cpt=0;
		for (Concept p : patterns) {
			if (Pattern.matches(p.getAssociatedRule(), s)) {
				type = type +" "+ p.getName();
				cpt++;
			}
		}
		if (cpt == 0) {
			System.out.println("no type found for : " + s);
			warnings.add(s);
			return "text";
		}
		if (cpt > 1) {
			System.out.println("More than one type (" + type + ") had been found for " + s);
			warnings.add(s);
			return s;
		}
		return type.substring(1);
	}
	
	 /**
	 * Renvoie le nombre d'occurrences du pattern spécifié dans la chaine de caractères spécifiée
	 * @param text chaine de caractères initiale
	 * @param regex expression régulière dont le nombre d'occurrences doit etre compté
	 * @return le nombre d'occurrences du pattern spécifié dans la chaine de caractères spécifiée
	 */
	 public final int regexOccur(String text, String regex) {
	    Matcher matcher = Pattern.compile(regex).matcher(text);
	    int occur = 0;
	    while(matcher.find()) {
	        occur ++;
	    }
	    return occur;
	}
}
