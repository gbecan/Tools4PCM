package pcmindexer;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.*;

import org.apache.log4j.Logger;

public class ParserTools {
	// sets of regexs patterns defining special items such as structures
	// (sections like, figures, lists ...)
	public ArrayList<Concept> patterns;
	public ArrayList<String> warnings;
	public Map<String,List<String>> complexParameters;
	public Map<String,Integer> simpleParameters;

	public static Logger myLogger = Logger.getLogger("ConfigTool");

	public ParserTools() {
		patterns = new ArrayList<Concept>();
		warnings = new ArrayList<String>();
		complexParameters = new HashMap<String, List<String>>();
		simpleParameters = new HashMap<String, Integer>();
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
			readLine(s);
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

	public void readLine(String s) {
		// Parse configuration for selecting matrices and cells
		boolean ok = false;
		ok = ok || readSimpleParameter(s);
		ok = ok || readComplexParameter(s);
		
		// Parse rules for detecting variability patterns
		ok = ok || (readRule(s) != null);

		if (!ok) {
			myLogger.fatal("The line is not written correctly: " + s);
		}
		
	}
	
	public boolean readSimpleParameter(String s) {
		Pattern pattern = Pattern.compile("\\s*(.*?)\\s*=\\s*(\\d+)\\s*");
		Matcher matcher = pattern.matcher(s);
		if (matcher.matches()) {
			String key = matcher.group(1);
			String value = matcher.group(2);
			try {
				Integer intValue = Integer.parseInt(value);
				simpleParameters.put(key, intValue);
			} catch (NumberFormatException e) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean readComplexParameter(String s) {
		Pattern configPattern = Pattern.compile("\\s*(.*?)\\s*=\\s*\\{(\".*?\"(,\".*?\")*)?\\}\\s*");
		Matcher configMatcher = configPattern.matcher(s);
		if (configMatcher.matches()) {
			String key = configMatcher.group(1);
			List<String> parameters = new ArrayList<String>();
			for (int i = 2; i < configMatcher.groupCount(); i++) {
				String group = configMatcher.group(i);
				if (group != null) {
					String[] values = group.split(",");
					for (String value : values) {
						parameters.add(value.substring(value.indexOf("\"")+1,value.lastIndexOf("\"")));
					}
				}
			}
			complexParameters.put(key, parameters);
			return true;
		} else   {
			return false;
		}
	}

	public Concept readRule(String s) {
		Pattern rulePattern = Pattern
				.compile("(\".*\")*(\\s|\\t)*(\\w+)(\\s|\\t)*(\".*\")(\\s|\\t)*(\\{.*\\})*");
		Matcher ruleMatcher = rulePattern.matcher(s);
		if (ruleMatcher.matches()) {
			// managing headers
			String headers = ruleMatcher.group(1);
			ArrayList<String> h = new ArrayList<String>();
			if (headers != null) {
				String[] temp = headers.split("\\s(?=\")|(?<=\")\\s");
				for (String t : temp) {
					t = t.replace("\"", "");
					h.add(t);
				}
			}
			// getting the rule name
			String ruleName = ruleMatcher.group(3);
			// getting the rule expression
			String ruleExp = ruleMatcher.group(5);
			int size = ruleExp.length();
			ruleExp = ruleExp.substring(1, size - 1);
			// gettings the rule parameters
			String params = ruleMatcher.group(7);
			ArrayList<String> p = new ArrayList<String>();
			if (params != null) {
				size = params.length();
				params = params.substring(1, size - 1);
				String[] temp = params.split(" ");
				for (String t : temp) {
					p.add(t);
				}
				//						p.add(params);
			}
			Concept concept = new Concept(h, ruleName, ruleExp, p);
			patterns.add(concept);
			return concept;
		} else {
			return null;
		}
	}
}