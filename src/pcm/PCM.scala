package pcm


class PCM {

  var cells : Map[(Int, Int), Cell] = Map()
  
  def setCell(cell : Cell, row : Int, column : Int) {
    cells += ((row, column) -> cell)
  }
  
  def getCell(row : Int, column : Int) : Option[Cell] = {
    cells get (row, column)
  }
  
  override def toString() : String = {
    val result = new StringBuilder
    val maxRow = cells.keys.maxBy(_._1)._1
    val maxColumn = cells.keys.maxBy(_._2)._2
    for (row <- 0 to maxRow; column <- 0 to maxColumn) {
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
}