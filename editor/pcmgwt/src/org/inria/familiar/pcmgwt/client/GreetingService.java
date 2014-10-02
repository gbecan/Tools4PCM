package org.inria.familiar.pcmgwt.client;

import java.util.Collection;

import org.inria.familiar.pcmgwt.shared.PCM;
import org.inria.familiar.pcmgwt.shared.experiment.ExperimentData;
import org.inria.familiar.pcmgwt.shared.experiment.ExperimentDataCell;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	
	/**
	 * Load a PCM model (random or demo) for the purpose of experiment. 
	 * @param demo
	 * @return PCM model (either a random PCM from a pre-defined list, or the PCM of the demo) 
	 */
	@Deprecated
	PCM loadModel(boolean demo); 
	 
	public boolean createExperimentdata(ExperimentData data,Collection<ExperimentDataCell> datas);

}
