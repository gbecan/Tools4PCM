package pcm


class PCM {

  var cells : Map[(Int, Int), Cell] = Map()
  
  def setCell(cell : Cell, row : Int, column : Int) {
    cells += ((row, column) -> cell)
  }
  
  def getCell(row : Int, column : Int) : Option[Cell] = {
    cells get (row, column)
  }
  
  def getNumberOfRows() : Int = {
    cells.keys.maxBy(_._1)._1
  }
  
  def getNumberOfColumns() : Int = {
    cells.keys.maxBy(_._2)._2
  }
  
  override def toString() : String = {
    val result = new StringBuilder
    for (row <- 0 to getNumberOfRows; column <- 0 to getNumberOfColumns) {
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
  
  def toHTML() : String = {
    (<table border="1">
    { 
    	for {row <- 0 to getNumberOfRows} 
	    yield <tr> 
      	  {
		    for {column <- 0 to getNumberOfColumns} 
		  	yield <th> {cells.getOrElse((row, column), "/!\\ Not defined /!\\")} </th>
		  }
    	</tr>
	} 
    </table>).toString
  }
  
  
}