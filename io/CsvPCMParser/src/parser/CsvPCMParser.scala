package parser

import pcmmm.PCM
import pcmmm.PcmmmFactory
import com.github.tototoshi.csv.CSVParser
import com.github.tototoshi.csv.CSVReader

class CsvPCMParser {

	def parse(path : String, title : String) : PCM = {
		val reader = CSVReader.open(path)
		
		val pcm = PcmmmFactory.eINSTANCE.createPCM()
		pcm.setName(title)
		val matrix = PcmmmFactory.eINSTANCE.createMatrix()
		pcm.getMatrices().add(matrix)
		
		var row = 0
		for (line <- reader) {
		  var column = 0
		  for (cellContent <- line) {
			val cell = PcmmmFactory.eINSTANCE.createExtra()
			cell.setName(cellContent.substring(0, 20.min(cellContent.size)))
			cell.setVerbatim(cellContent)
			cell.setRow(row)
			cell.setColumn(column)
			cell.setRowspan(1)
			cell.setColspan(1)
			matrix.getCells().add(cell)
			column += 1	
		  }
		  row += 1
		}
		
		pcm
	}
   
}