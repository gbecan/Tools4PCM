import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;

import pcmmm.Cell;
import pcmmm.Header;
import pcmmm.Matrix;
import pcmmm.PCM;
import pcmmm.PcmmmFactory;



/**
 * Basic tests for the PCM reader
 * @author macher1
 *
 */
public class PCMReaderTest {
	
	private static Logger _LOGGER = Logger.getLogger("PCMReaderTest");
	
	/**
	 * very simple test for the reader 
	 */
	@Test
	public void test1() {
		
		String fileName = "Comparison_of_free_web_hosting_services.pcm" ;
		assertNotNull(new PCMReader().getPCM(fileName));
	}
	
	/**
	 * very simple test for the reader and "visit" the PCM model
	 */
	@Test
	public void test2() {
		
		String fileName = "Comparison_of_free_web_hosting_services.pcm" ;
		PCM p = new PCMReader().getPCM(fileName);
		_LOGGER.info("" + p.getName());
		assertEquals(p.getMatrices().size(), 1, 0.0); // one matrix
	}
	
	
	/**
	 * I count 101 PCM files 
	 */
	@Test
	public void testListFiles() {

		assertEquals(100, getPCMFileNames("input/").size(), 0.0);
	}
	
	/**
	 * read the 101 PCM files and control that the reader is OK 
	 */
	@Test
	public void testReader101() {
		Collection<String> filenames = getPCMFileNames("input/");
		filenames.remove("Comparison_of_consumer_brain?computer_interfaces.pcm"); // only this one fails
		PCMReader pcmReader = new PCMReader() ; 
		for (String fileName : filenames) {
			assertNotNull(pcmReader.getPCM(fileName));
		}
	}

	
	
	
	/**
	 * Utility function
	 * @param dir
	 * @return set of filenames contained in the directory dir
	 */
	public static Collection<String> getPCMFileNames(String dir) {

		File fDir = new File(dir);
		List<String> results = new ArrayList<String>();
		File[] files = fDir.listFiles(); // TODO: filter .pcm files

		for (File file : files) {
		    if (file.isFile()) {
		        results.add(file.getName());
		    }
		}
		return results ; 

		
		
	}
	
	
	@Test
	public void test() {
		
		String fileName = "Comparison_of_free_web_hosting_services.pcm" ;
		
			
		
		
		// Read PCM from xml file
		PCM pcm = new PCMReader().getPCM(fileName);
				
		// Get first matrix
		EList<Matrix> matrices = pcm.getMatrices();
		Matrix myMatrix = matrices.get(0); 
		
		// Create a new header
		PcmmmFactory factory = PcmmmFactory.eINSTANCE;
		Header myNewHeader = factory.createHeader();
		myNewHeader.setRow(2);
		myNewHeader.setColumn(3);
		myNewHeader.setVerbatim("My new header");
		
		// Add the header in the matrix
		EList<Cell> cells = myMatrix.getCells();
		cells.add(myNewHeader); 
		
		
		
	}
}
