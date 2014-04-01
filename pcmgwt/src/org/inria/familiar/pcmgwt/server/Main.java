package org.inria.familiar.pcmgwt.server;



import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import pcmmm.PcmmmPackage;

public class Main {

	
	public static void main(String[] args) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("pcm", new XMIResourceFactoryImpl());
		
		
		ResourceSet rs =new ResourceSetImpl();
		rs.getPackageRegistry().put(PcmmmPackage.eINSTANCE.getNsURI(), PcmmmPackage.eINSTANCE);
		URI uri = URI.createFileURI("Comparison_of_Nikon_DSLR_cameras.pcm");
		
		
		Resource r = rs.getResource(uri,true);
		System.err.println(r.getContents().get(0));
		
		PcmConverter convert = new PcmConverter();
		convert.doSwitch(r.getContents().get(0));
		
		System.err.println(convert.m);
		
		
		
	}
}
