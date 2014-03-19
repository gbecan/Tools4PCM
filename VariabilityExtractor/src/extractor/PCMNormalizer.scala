package extractor

import pcmmm.PCM
import scala.collection.JavaConversions._
import pcmmm.Header
import pcmmm.PcmmmFactory
import pcmmm.Cell
import pcmmm.Extra
import pcmmm.Matrix
import java.util.ListIterator

class PCMNormalizer {
  
  // TODO : remove matrices without variability (user input)
  
  
  def setHeaders(matrix : Matrix, numberOfRows : Int = 1, numberOfColumns : Int = 1) {
    val it = matrix.getCells().listIterator()
    while(it.hasNext()) {
      val cell = it.next()
      val row = cell.getRow()
      val column = cell.getColumn()

      // TODO : handle row/colspan 
      // TODO : handle product and feature clusters
      if (row < numberOfRows && column < numberOfColumns) { // Top left header
        val newCell = PcmmmFactory.eINSTANCE.createExtra
        convertCell(it, cell, newCell)
      } else if (row < numberOfRows) { // Top header
        if (!cell.isInstanceOf[Header]) {
	        val newCell = PcmmmFactory.eINSTANCE.createHeader
	        convertCell(it, cell, newCell)  
        }
      } else if (column < numberOfColumns) { // Left header
        if (!cell.isInstanceOf[Header]) {
        	val newCell = PcmmmFactory.eINSTANCE.createHeader
        	convertCell(it, cell, newCell)
        }
      } else { // Inner cell
        val newCell = PcmmmFactory.eINSTANCE.createValuedCell
        convertCell(it, cell, newCell)
      }
      
    }
  }
  
  def removeHeaderRowsAndColumns(matrix : Matrix, rows : List[Int], columns : List[Int]) {
    // TODO : change type of cell instead of removing it?
	  val it = matrix.getCells().listIterator()
	  while(it.hasNext()) {
	    val cell = it.next()
	    if (rows.contains(cell.getRow()) || columns.contains(cell.getColumn())) {
	    	it.remove()
	    }
	  }
  }
  
  
  def convertCell(it : ListIterator[Cell], cell : Cell, newCell : Cell) {
    // Copy cell to new cell
    newCell.setName(cell.getName())
    newCell.setVerbatim(cell.getVerbatim())
    newCell.setRow(cell.getRow())
    newCell.setRowspan(cell.getRowspan())
    newCell.setColumn(cell.getColumn())
    newCell.setColspan(cell.getColspan())
    
    // Change cell to new cell
    it.remove()
    it.add(newCell)
  }
  
}