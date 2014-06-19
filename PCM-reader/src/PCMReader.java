import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import pcmmm.PCM;
import pcmmm.PcmmmPackage;


/**
 * A class to read a .pcm file
 * @author macher1
 *
 */
public class PCMReader {
	
	private static Logger _LOGGER = Logger.getLogger("PCMReader");
	
	private static final String _DEFAULT_DIRECTORY =  "input/" ;
	
	/**
	 * directory in which the files are located 
	 */
	private String _dir = _DEFAULT_DIRECTORY;
	
	
	public PCMReader(String directory) {
		_dir = directory ; 		
	}
	
	public PCMReader() {
		
	}
	
	/**
	 * @param pcmId name of the PCM file  
	 * @return a PCM "model"
	 */
	public PCM getPCM(String pcmId) {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"pcm", new XMIResourceFactoryImpl());

		ResourceSet rs = new ResourceSetImpl();
		rs.getPackageRegistry().put(PcmmmPackage.eINSTANCE.getNsURI(),
				PcmmmPackage.eINSTANCE);
		

		URI uri = URI.createFileURI(mkFileName(pcmId));

		Resource r = rs.getResource(uri, true);
		PCM m = (PCM) r.getContents().get(0);
		_LOGGER.info("Loaded PCM model: " + m);
		_LOGGER.info("Errors (if any): " + r.getErrors());
		
		return m;

	}

	
	private String mkFileName(String pcmId) {
		return _dir + pcmId ;
	}
	
	
}
