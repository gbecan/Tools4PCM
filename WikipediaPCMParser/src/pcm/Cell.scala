package pcm

import pcmmm.PcmmmFactory

class Cell(
  val content : String,
  val isHeader : Boolean,
  val row : Int,
  val rowspan : Int,
  val column : Int,
  val colspan : Int
  ) {
  
  override def toString() : String = {
     content
  }
  
  def toPCMModel() : pcmmm.Cell = {
    val model = if (isHeader) {
      PcmmmFactory.eINSTANCE.createHeader()
    } else {
      PcmmmFactory.eINSTANCE.createExtra()
    }
    model.setVerbatim(content)
    
    val words = for (word <- content.split("\\s") if !word.isEmpty()) yield word
	var formattedContent = words.mkString("", " ", "").toLowerCase()
	formattedContent = formattedContent.substring(0, 50.min(formattedContent.size))
	model.setName(row + "," + column + ": " + formattedContent)
    model.setRow(row)
    model.setRowspan(rowspan)
    model.setColumn(column)
    model.setColspan(colspan)
    
    model
  }
}