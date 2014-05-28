package org.inria.familiar.pcmgwt.client;

import java.util.Collection;
import java.util.List;

import org.inria.familiar.pcmgwt.shared.Matrix;
import org.inria.familiar.pcmgwt.shared.PCM;
import org.inria.familiar.pcmgwt.shared.experiment.ExperimentData;
import org.inria.familiar.pcmgwt.shared.experiment.ExperimentDataCell;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {


	void createExperimentdata(ExperimentData data,
			Collection<ExperimentDataCell> datas,
			AsyncCallback<Boolean> callback);

	@Deprecated
	void loadModel(boolean demo, AsyncCallback<PCM> callback);
	

}
