package org.inria.familiar.pcmgwt.server;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.inria.familiar.pcmgwt.client.GreetingService;
import org.inria.familiar.pcmgwt.shared.Matrix;

import pcmmm.PcmmmPackage;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {

	Resource r;

	public List<Matrix> loadModel() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"pcm", new XMIResourceFactoryImpl());

		ResourceSet rs = new ResourceSetImpl();
		rs.getPackageRegistry().put(PcmmmPackage.eINSTANCE.getNsURI(),
				PcmmmPackage.eINSTANCE);
		URI uri = URI.createFileURI("Comparison_of_Nikon_DSLR_cameras.pcm");

		Resource r = rs.getResource(uri, true);
		System.err.println(r.getContents().get(0));

		PcmConverter convert = new PcmConverter();
		convert.doSwitch(r.getContents().get(0));

		return convert.matrices;

	}

}
