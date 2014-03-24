package configuration

import scala.collection.mutable.ListBuffer

class MatrixConfiguration {

  var ignored : Boolean = false
  
  var headerRows : Int = 1
  var headerColumns : Int = 1
  
  var ignoreRows : List[Int] = Nil
  var ignoreColumns : List[Int] = Nil
  
  private var patterns : ListBuffer[PatternConfiguration] = ListBuffer()
  
  def addPattern(pattern : PatternConfiguration) {
    	patterns += pattern
  }
  
  def getPatterns() : List[PatternConfiguration] = {
		  patterns.toList
  }
}