package export

import pcmmm.PCM
import scala.xml.Elem
import scala.collection.JavaConversions._
import pcmmm.Matrix
import pcmmm.Cell

class PCM2HTML {

  def pcm2HTML(pcm : PCM) : Elem = {
    val htmlCode = 
    <html>
    <head>
    		<meta charset="utf-8"/>
    </head>
    <body>
    	{ for(matrix <- pcm.getMatrices()) yield matrix2HTML(matrix)}
    </body>
    </html>	
    
    htmlCode
  }
  
  def matrix2HTML(matrix : Matrix) : Elem = {
    val cells = matrix.getCells()
//    val sortedCells = cells.sortWith((c1,c2) => (
//        c1.getRow() < c2.getRow()) 
//        || ((c1.getRow() == c2.getRow()) && (c1.getColumn() < c2.getColumn()))
//        )
    val rows = cells.groupBy(cell => cell.getRow()).toList
    val sortedRows = rows.sortBy(r => r._1).map(r => r._2)
        
    val htmlCode = 
    <table border="1">
    		{for (row <- sortedRows) yield {
    		  <tr> 
    		  {for (cell <- row.sortBy(c => c.getColumn())) yield {
    			  cell2HTML(cell)
    		  }}
    		  </tr>
    		}}
    </table>
    htmlCode
  }
  
  def cell2HTML(cell : Cell) : Elem = {
    val htmlCode = 
    <td 
    	rowspan={cell.getRowspan().toString}
    	colspan={cell.getColspan().toString}
    >
    		{cell.getVerbatim()}
    </td>
    htmlCode
  }
}