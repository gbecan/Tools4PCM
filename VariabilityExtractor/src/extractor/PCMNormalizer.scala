package extractor

import pcmmm.PCM
import scala.collection.JavaConversions._
import pcmmm.Header
import pcmmm.PcmmmFactory
import pcmmm.Cell
import pcmmm.Extra
import pcmmm.Matrix
import java.util.ListIterator
import org.eclipse.emf.common.util.EList

class PCMNormalizer {
  
  /**
   * Define headers in a matrix
   * @param matrix 
   * @param numberOfRows : number of top rows that are headers
   * @param numberOfColumns : number of left columns that are headers
   */
  def setHeaders(matrix : Matrix, numberOfRows : Int = 1, numberOfColumns : Int = 1) {
    val cells = matrix.getCells()
    val sortedCells = cells.sortBy(c => (c.getRow(), c.getColumn())).toList
  
    for(cell <- sortedCells) {
      val row = cell.getRow()
      val column = cell.getColumn()

      // TODO : handle row/colspan 
      // TODO : handle product and feature clusters
      if (row < numberOfRows && column < numberOfColumns) { // Top left header
        val newCell = PcmmmFactory.eINSTANCE.createExtra
        copyAndReplaceCell(cells, cell, newCell)
      } else if (row < numberOfRows) { // Top header
        if (!cell.isInstanceOf[Header]) {
	        val newCell = PcmmmFactory.eINSTANCE.createHeader
	        copyAndReplaceCell(cells, cell, newCell)
        }
      } else if (column < numberOfColumns) { // Left header
        if (!cell.isInstanceOf[Header]) {
        	val newCell = PcmmmFactory.eINSTANCE.createHeader
        	copyAndReplaceCell(cells, cell, newCell)
        }
      } else { // Inner cell
        val newCell = PcmmmFactory.eINSTANCE.createValuedCell
        copyAndReplaceCell(cells, cell, newCell)
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
	    	val newCell = PcmmmFactory.eINSTANCE.createExtra()
	    	copyCell(cell, newCell)
	    	it.add(newCell)
	    }
	  }
  }
  
  
  /**
   * Copy the content of a cell to another one
   */
  def copyCell(cell : Cell, newCell : Cell) {
    newCell.setName(cell.getName())
    newCell.setVerbatim(cell.getVerbatim())
    newCell.setRow(cell.getRow())
    newCell.setRowspan(cell.getRowspan())
    newCell.setColumn(cell.getColumn())
    newCell.setColspan(cell.getColspan())
  }

  /**
   * Copy the content of a cell to another one and replace it in the list
   * @param cells : list of cells containing the old one
   * @param cell
   * @param newCell 
   */
  def copyAndReplaceCell(cells : EList[Cell], cell : Cell, newCell : Cell) {
    copyCell(cell, newCell)
    cells.remove()
    cells.add(newCell)
  }
  
  
  def removeMatrices(pcm : PCM, matrixNames : List[String]) {
	  val it = pcm.getMatrices().iterator()
	  while(it.hasNext()) {
		  val matrix = it.next()
		  if (matrixNames.contains(matrix.getName())) {
			  it.remove()
		  }
	  }
  }
  
}