package pcm

import pcmmm.PcmmmFactory

class Cell {

  var content = ""
  var isHeader : Boolean = false
  
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