package org.inria.familiar.pcmgwt.server;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.inria.familiar.pcmgwt.client.GreetingService;
import org.inria.familiar.pcmgwt.shared.Matrix;
import org.inria.familiar.pcmgwt.shared.experiment.ExperimentData;
import org.inria.familiar.pcmgwt.shared.experiment.ExperimentDataCell;

import pcmmm.PcmmmPackage;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {

	Resource r;
	private EntityManager manager;
	private EntityManagerFactory factory;

	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		factory = Persistence
				.createEntityManagerFactory("dev");
		manager = factory.createEntityManager();
	}
	
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

	@Override
	public boolean createExperimentdata(ExperimentData data,
			Collection<ExperimentDataCell> datas) {
		
		EntityTransaction tx = manager.getTransaction();
		if (!tx.isActive())
			tx.begin();
		data.getCells().clear();
		data.getCells().addAll(datas);
		manager.persist(data);
		
		tx.commit();
		
		return true;
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		manager.clear();
		manager.close();
		factory.close();
		
	}
	
}
