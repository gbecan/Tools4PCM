package org.inria.familiar.pcmgwt.server;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.inria.familiar.pcmgwt.client.PCMRepository;
import org.inria.familiar.pcmgwt.shared.PCM;

import pcmmm.PcmmmPackage;

import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.google.gwt.util.tools.Utility;

/**
 * A local repository (present in a local folder of the file system)
 * @author macher1
 *
 */

public class PCMDirectoryRepo extends RemoteServiceServlet implements PCMRepository {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static Logger _LOGGER = Logger.getLogger("PCMDirectoryRepo");
	
	private static final String _DEFAULT_DIRECTORY =  "/Users/macher1/git/Tools4PCM/evaluation/output/models/" ;
			// "./" ; // war folder 

	
	
	private String _dir = _DEFAULT_DIRECTORY;

	
	
	/**
	 * @TODO workaround because of difficulty to pass a parameter to a constructor with deffered binding...
	 * It is weird because 
	 *  - it adds some noise to the implemented parent interface (setDirectory)
	 *  - you have to be aware that you have to call setDirectory before doing anything  
	 * @param dir
	 */
	public void setDirectory(String dir) {
		_dir = dir ; 
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	/* 
	 * OK so GWT does not allow we use java.io.File
	 * ID = file of the name 
	 */
	@Override
	public Collection<String> getIDs() {
		try {
			File fDir = Utility.getDirectory(_dir, false);
			List<String> results = new ArrayList<String>();
			File[] files = fDir.listFiles();

			for (File file : files) {
			    if (file.isFile()) {
			        results.add(file.getName());
			    }
			}
			return results ; 
		} catch (IOException e) {
			// @TODO
			e.printStackTrace();
			return null ; 
		}
		
		
	}
	
	public PCM getPCM(String pcmId) {

			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
					"pcm", new XMIResourceFactoryImpl());

			ResourceSet rs = new ResourceSetImpl();
			rs.getPackageRegistry().put(PcmmmPackage.eINSTANCE.getNsURI(),
					PcmmmPackage.eINSTANCE);
			

			URI uri = URI.createFileURI(mkFileName(pcmId));

			// URI uri =
			// URI.createFileURI("Comparison_of_3D_computer_graphics_software.pcm");

			Resource r = rs.getResource(uri, true);
			_LOGGER.info("Loaded PCM model: " + r.getContents().get(0));
			_LOGGER.info("Errors (if any): " + r.getErrors());

			PcmConverter convert = new PcmConverter();
			convert.doSwitch(r.getContents().get(0));
			PCM rPCM = convert.getPCM() ; 
			rPCM.setName(pcmId);
			
			_LOGGER.info("Converted PCM model: " + rPCM);
			
			return rPCM;
		
	}

	private String mkFileName(String pcmId) {
		return _dir + pcmId ;
	}

}
