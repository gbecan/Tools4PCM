package extractor

import pcmmm.PCM
import scala.collection.JavaConversions._
import pcmmm.Extra
import pcmmm.Cell
import java.util.ListIterator
import pcmmm.PcmmmFactory
import pcmmm.Constraint
import interpreters.PatternInterpreter
import pcmmm.Matrix
import pcmmm.Header

class CellContentInterpreter {

  def interpretCells(pcm : PCM, patternInterpreters : List[PatternInterpreter]) {
    for (matrix <- pcm.getMatrices) {
      
      val it = matrix.getCells().listIterator()
      while (it.hasNext()) {
        val cell = it.next()

        // If cell is not yet interpreted, we interpret it
        if (cell.isInstanceOf[Extra]) {
           var interpretation : Option[Constraint] = None
           val (rowHeaders, columnHeaders) = findHeadersFor(cell, matrix)
        
           for (patternInterpreter <- patternInterpreters if !interpretation.isDefined) {
        	 interpretation = patternInterpreter.interpret(cell.getVerbatim(), rowHeaders, columnHeaders)
	    		
    		 if (interpretation.isDefined) {
    			 val newCell = PcmmmFactory.eINSTANCE.createValuedCell()
    			 convertCell(it, cell, newCell)
    			 newCell.setInterpretation(interpretation.get)
    			 // FIXME : what about recursive interpretation (Multi or Partial for example)?
	    	 }
           }
        }
      }
    }
    
  }
  
  
  // TODO : capitalize this method somewhere because it is redundant with the same one in PCMNormalizer
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
  
  /**
   * Find headers for a cell
   * @return the verbatims of the cell's headers
   */
  def findHeadersFor(cell : Cell, matrix : Matrix) : (List[String], List[String]) = {
    val cellRows = cell.getRow() until cell.getRow() + cell.getRowspan()
    val cellColumns = cell.getColumn() until cell.getColumn() + cell.getColspan()

    var rowHeaders : List[String] = Nil
    var columnHeaders : List[String] = Nil
    
    for (header <- matrix.getCells() if header.isInstanceOf[Header])  {
      
      val headerRows = header.getRow() until header.getRow() + header.getRowspan()
      val headerColumns = header.getColumn() until header.getColumn() + header.getColspan()
      
      if (!headerRows.intersect(cellRows).isEmpty) {
        rowHeaders = header.getVerbatim() :: rowHeaders
      } else if (!headerColumns.intersect(cellColumns).isEmpty) {
        columnHeaders = header.getVerbatim() :: columnHeaders
      }
      
    }
    
    (rowHeaders, columnHeaders)
  }
}