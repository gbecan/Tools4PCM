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
    model
  }
}