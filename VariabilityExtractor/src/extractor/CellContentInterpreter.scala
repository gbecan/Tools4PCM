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
import pcmmm.Feature
import pcmmm.Product

class CellContentInterpreter {

  /**
   * Interpret each cell and specify its product and feature headers
   * @param pcm : model of PCM
   * @param patternInterpreters : variability pattern interpreters
   */
  def interpretCells(pcm : PCM, patternInterpreters : List[PatternInterpreter]) {
    // Configure pattern interpreters to this PCM 
      for (patternInterpreter <- patternInterpreters) {
        patternInterpreter.config(pcm)
      }
    
    for (matrix <- pcm.getMatrices) {
      
      // Interpret every uninterpreted cells 
      val it = matrix.getCells().listIterator()
      while (it.hasNext()) {
        val cell = it.next()

        if (cell.isInstanceOf[Extra]) {
           var interpretation : Option[Constraint] = None
           val (products, features) = findConceptsFor(cell, matrix)
        
           for (patternInterpreter <- patternInterpreters if !interpretation.isDefined) {
        	 interpretation = patternInterpreter.interpret(cell.getVerbatim(), products, features)
	    		
    		 if (interpretation.isDefined) {
    			 // Create valued cell
    			 val newCell = PcmmmFactory.eINSTANCE.createValuedCell()
    			 convertCell(it, cell, newCell)
    			 
    			 // Set product and feature headers
    			 if (!products.isEmpty) {
    			   newCell.setMyHeaderProduct(products.head)
    			 } 
    			 if (!features.isEmpty) {
    			   newCell.setMyHeaderFeature(features.head)
    			 } 
    			 
    			 // Set interpretation
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
   * Find concepts for a cell
   * @return products and features related to the cell
   */
  def findConceptsFor(cell : Cell, matrix : Matrix) : (List[Product], List[Feature]) = {
    val cellRows = cell.getRow() until cell.getRow() + cell.getRowspan()
    val cellColumns = cell.getColumn() until cell.getColumn() + cell.getColspan()

    var products : List[Product] = Nil
    var features : List[Feature] = Nil
    
    for (header <- matrix.getCells().filter(_.isInstanceOf[Header]))  {
      val headerRows = header.getRow() until header.getRow() + header.getRowspan()
      val headerColumns = header.getColumn() until header.getColumn() + header.getColspan()
      

      val concept = header.asInstanceOf[Header].getConcept()
      
      if ((!headerRows.intersect(cellRows).isEmpty) || (!headerColumns.intersect(cellColumns).isEmpty)) {
        concept match {
          case p : Product => products = p :: products
          case f : Feature => features = f :: features
        }
      }
    }
    
    (products, features)
  }
}