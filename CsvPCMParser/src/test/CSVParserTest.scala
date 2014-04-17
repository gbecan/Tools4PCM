package test

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import parser.CsvPCMParser
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import java.util.Collections

class CSVParserTest extends FlatSpec with Matchers {

  "CSV PCM Parser" should "work" in {
	  	val in = "../evaluation/input/demo.csv"
	  	val out = "../evaluation/input/demo.pcm"
    
		val parser = new CsvPCMParser
		val pcm = parser.parse(in, "Demo")
	  
		
		// Save model in file
		val reg = Resource.Factory.Registry.INSTANCE;
		val m = reg.getExtensionToFactoryMap();
		m.put("pcm", new XMIResourceFactoryImpl());
		val resSet = new ResourceSetImpl();
		val resource = resSet.createResource(URI.createURI(out));
		resource.getContents().add(pcm);
		resource.save(Collections.EMPTY_MAP);
  }
  
}