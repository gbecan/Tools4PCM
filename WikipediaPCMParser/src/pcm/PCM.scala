package pcm

import scala.xml.PrettyPrinter
import scala.xml.Text
import scala.xml.XML
import scala.xml.Elem


class PCM {

  var cells : Map[(Int, Int), Cell] = Map()
  
  def setCell(cell : Cell, row : Int, column : Int) {
    cells += ((row, column) -> cell)
  }
  
  def getCell(row : Int, column : Int) : Option[Cell] = {
    cells get (row, column)
  }
  
  def getNumberOfRows() : Int = {
    if (!cells.isEmpty) {
    	cells.keys.maxBy(_._1)._1 + 1
    } else {
      0
    }
  }
  
  def getNumberOfColumns() : Int = {
    if (!cells.isEmpty) {
    	cells.keys.maxBy(_._2)._2 + 1
    } else {
      0
    }
  }
  
  override def toString() : String = {
    val result = new StringBuilder
    for (row <- 0 until getNumberOfRows; column <- 0 until getNumberOfColumns) {
      result ++= row + "," + column + ":"
      
      val cell = cells get (row, column)
      if (cell.isDefined) {
        result ++= cell.get.content 
      } else {
        result ++= "/!\\ This cell is not defined /!\\"
      }
      result += '\n'
    }
    result.toString
  }
  
  def toHTML() : Elem = {
    val htmlCode = 
    <table border="1">
    { 
    	for {row <- 0 until getNumberOfRows} 
	    yield <tr> 
      	  {
		    for {column <- 0 until getNumberOfColumns} 
		  	yield <th>
		  	{
		  	  val cell = cells.get((row, column))
		  	  if (cell.isDefined) {
		  	    // Convert new lines in <br/>
		  	    val lines = cell.get.content.split("\n")
		  	    var firstLine = true
		  	    for (line <- lines) yield {
		  	      if (firstLine) {
		  	        firstLine = false
		  	        Text(line)
		  	      } else {
		  	        <br/> ++ Text(line)
		  	      }
		  	    }
		  	  } else {
		  	    "/!\\ Not defined /!\\"
		  	  }
		  	}
		  	</th>
		  }
    	</tr>
	} 
    </table>
    
    htmlCode
  }
}