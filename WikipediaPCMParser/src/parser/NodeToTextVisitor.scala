package parser

import de.fau.cs.osr.ptk.common.AstVisitor
import de.fau.cs.osr.ptk.common.ast.NodeList
import de.fau.cs.osr.ptk.common.ast.Text

class NodeToTextVisitor extends AstVisitor {
  
	private val builder = new StringBuilder
  
	def getText() : String = {
		builder.toString
	}
	
	
	def visit(e : NodeList) {
		iterate(e)
	}
	
	def visit(e : Text) {
		builder ++= e.getContent()
	}
	

}