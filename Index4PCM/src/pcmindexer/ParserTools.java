package pcmindexer;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.*;

import org.apache.log4j.Logger;

public class ParserTools {
	// sets of regexs patterns defining special items such as structures
	// (sections like, figures, lists ...)
	public ArrayList<Concept> patterns;
	public ArrayList<String> warnings;

	public static Logger myLogger = Logger.getLogger("ConfigTool");

	public ParserTools() {
		patterns = new ArrayList<Concept>();
		warnings = new ArrayList<String>();
	}

	/**
	 * read the document configuration file with respect to the following syntax
	 * ("headers")* name "rule" ({(parameters)+})?
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
			patterns.add(readLine(s));
		}
		br.close();
	}

	/**
	 * returns the type of the fragment s
	 * 
	 * @param s
	 * @return the type of the string s, from . If errors are found, warning are
	 *         stored and suspicious fragments are typed as simple texts
	 */
	public String findDefinition(String s) {
		String type = "";
		int cpt = 0;
		for (Concept p : patterns) {
			if (Pattern.matches(p.getAssociatedRule(), s)) {
				type = type + " " + p.getName();
				cpt++;
			}
		}
		if (cpt == 0) {
			System.out.println("no type found for : " + s);
			warnings.add(s);
			return "text";
		}
		if (cpt > 1) {
			System.out.println("More than one type (" + type
					+ ") had been found for " + s);
			warnings.add(s);
			return s;
		}
		return type.substring(1);
	}

	/**
	 * Renvoie le nombre d'occurrences du pattern spécifié dans la chaine de
	 * caractères spécifiée
	 * 
	 * @param text
	 *            chaine de caractères initiale
	 * @param regex
	 *            expression régulière dont le nombre d'occurrences doit etre
	 *            compté
	 * @return le nombre d'occurrences du pattern spécifié dans la chaine de
	 *         caractères spécifiée
	 */
	public final int regexOccur(String text, String regex) {
		Matcher matcher = Pattern.compile(regex).matcher(text);
		int occur = 0;
		while (matcher.find()) {
			occur++;
		}
		return occur;
	}

	public static Concept readLine(String s) {
		Pattern configPattern = Pattern
				.compile("(\".*\")*(\\s|\\t)*(\\w+)(\\s|\\t)*(\".*\")(\\s|\\t)*(\\{.*\\})*");
		Matcher m = configPattern.matcher(s);
		if (m.matches()) {
			// managing headers
			String headers = m.group(1);
			ArrayList<String> h = new ArrayList<String>();
			if (headers != null) {
				String[] temp = headers.split("\\s(?=\")|(?<=\")\\s");
				for (String t : temp) {
					t = t.replace("\"", "");
					h.add(t);
				}
			}
			// getting the rule name
			String ruleName = m.group(3);
			// getting the rule expression
			String ruleExp = m.group(5);
			int size = ruleExp.length();
			ruleExp = ruleExp.substring(1, size - 1);
			// gettings the rule parameters
			String params = m.group(7);
			ArrayList<String> p = new ArrayList<String>();
			if (params != null) {
				size = params.length();
				params = params.substring(1, size - 1);
				String[] temp = params.split(" ");
				for (String t : temp) {
					p.add(t);
				}
//				p.add(params);
			}
			return new Concept(h, ruleName, ruleExp, p);
		}
		myLogger.fatal("The rule is not written correctly: " + s);
		return null;
	}
}