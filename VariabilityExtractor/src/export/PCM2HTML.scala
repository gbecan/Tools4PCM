package export

import pcmmm.PCM
import scala.xml.Elem
import scala.collection.JavaConversions._
import pcmmm.Matrix

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
    val htmlCode = 
    <table>
    </table>
    htmlCode
  }
}