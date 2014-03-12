package pcm

import scala.xml.Elem
import scala.xml.Text
import pcmmm.PcmmmFactory

class Matrix {

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
  
  def toPCMModel() : pcmmm.Matrix = {
    val model = PcmmmFactory.eINSTANCE.createMatrix
    
    for (row <- 0 until getNumberOfRows; column <- 0 until getNumberOfColumns) {
    	val cell = cells.get((row, column))
    	if (cell.isDefined) {
    	  val cellModel = cell.get.toPCMModel
    	   val words = for (word <- cellModel.getVerbatim().split("\\s") 
    			   if !word.isEmpty()) yield word
    	   var formattedContent = words.mkString("", " ", "").toLowerCase()
    	   formattedContent = formattedContent.substring(0, 50.min(formattedContent.size))
    	  cellModel.setName(row + "," + column + ": " + formattedContent)
    	  cellModel.setRow(row)
    	  cellModel.setColumn(column)
    	  model.getCells().add(cellModel)
    	}
    }
    
    model
  }
}