package org.inria.familiar.pcmgwt.client;

import java.util.List;

import org.inria.familiar.pcmgwt.shared.Matrix;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {

	void loadModel(AsyncCallback<List<Matrix>> callback);

}
