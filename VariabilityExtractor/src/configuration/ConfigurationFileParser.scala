package configuration

import scala.io.Source
import java.util.regex.Pattern
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ListBuffer

class ConfigurationFileParser {
  
  private var pcmConfig : PCMConfiguration = _
  private var matrixConfig : MatrixConfiguration = _

  def parse(path : String) : PCMConfiguration = {
    pcmConfig = new PCMConfiguration
    matrixConfig = pcmConfig.defaultConfiguration
        
    val configFile = Source.fromFile(path)
    for (line <- configFile.getLines) {
      parseLine(line)
    }
    
    pcmConfig
  }
  
  
  def parseLine(line : String) = {
		var ok : Boolean = false
    	ok = ok || parseRule(line)
  }
  
  
  /**
   * Parse a pattern configuration
   */
  def parseRule(s : String) : Boolean = {
		val rulePattern = Pattern
				.compile("(\".*\")*(\\s|\\t)*(\\w+)(\\s|\\t)*(\".*\")(\\s|\\t)*(\\{.*\\})*");
		val ruleMatcher = rulePattern.matcher(s);
		if (ruleMatcher.matches()) {
			// managing headers
			val headers = ruleMatcher.group(1);
			val h : ListBuffer[String] = ListBuffer()
			if (Option(headers).isDefined) {
				val temp = headers.split("\\s(?=\")|(?<=\")\\s");
				for (t <- temp) {
					h += t.replace("\"", "")
				}
			}
			// getting the rule name
			val ruleName = ruleMatcher.group(3);

			// getting the rule expression
			var ruleExp = ruleMatcher.group(5);
			var size = ruleExp.length();
			ruleExp = ruleExp.substring(1, size - 1);
			
			// gettings the rule parameters
			var params = ruleMatcher.group(7);
			var p : ListBuffer[String] = ListBuffer()
			if (Option(params).isDefined) {
				size = params.length();
				params = params.substring(1, size - 1);
				val temp = params.split(" ");
				for (t <- temp) {
					p += t;
				}
			}
			val patternConfig = new PatternConfiguration(h.toList, ruleName, ruleExp, p.toList)
			matrixConfig.addPattern(patternConfig)
			true
		} else {
			false
		}
	}
  
  
  	def readSimpleParameter(s : String) : Boolean = {
		val pattern = Pattern.compile("\\s*(.*?)\\s*=\\s*(\\d+)\\s*");
		val matcher = pattern.matcher(s);
		if (matcher.matches()) {
			val key = matcher.group(1);
			val value = matcher.group(2);
			key match {
			  case "header-rows" => matrixConfig.headerRows = convertToInt(value)
			  case "header-columns" => matrixConfig.headerColumns = convertToInt(value)
			  case "ignored" => matrixConfig.ignored = convertToBoolean(value)
			  case _ => 
			}
			true;
		} else {
			false;
		}
	}

	def readComplexParameter(s : String) : Boolean = {
		val configPattern = Pattern.compile("\\s*(.*?)\\s*=\\s*\\{(\".*?\"(,\".*?\")*)?\\}\\s*")
		val configMatcher = configPattern.matcher(s)
		if (configMatcher.matches()) {
			val key = configMatcher.group(1)
			val parameters : ListBuffer[String] = ListBuffer()
			for (i <- 2 until configMatcher.groupCount) {
				val group = configMatcher.group(i)
				if (Option(group).isDefined) {
					val values = group.split(",")
					for (value <- values) {
						parameters += (value.substring(value.indexOf("\"")+1,value.lastIndexOf("\"")))
					}
				}
			}
			
			key match {
			  case "ignore-rows" => matrixConfig.ignoreRows = convertToListOfInt(parameters.toList)
			  case "ignore-columns" => matrixConfig.ignoreColumns = convertToListOfInt(parameters.toList)
			  case _ => 
			}
			true
		} else   {
			false
		}
	}
	
	def convertToListOfInt(strings : List[String]) : List[Int] = {
	  	val integers : ListBuffer[Int] = ListBuffer()
	  	for (string <- strings) {
	  		try {
				val integer = Integer.parseInt(string)
				integers += integer
			} catch {
			  case e : NumberFormatException =>  
			}
	  	}
	  	integers.toList
	}
	
	def convertToInt(string : String) : Int = {
		try {
			string.toInt
		} catch {
			case e : NumberFormatException => -1 
		}
	}
	
	def convertToBoolean(string : String) : Boolean = {
		try {
			string.toBoolean
		} catch {
			case e : IllegalArgumentException => false
		}
	}
}