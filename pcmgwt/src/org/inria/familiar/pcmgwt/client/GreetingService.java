package org.inria.familiar.pcmgwt.client;

import java.util.List;

import org.inria.familiar.pcmgwt.shared.Matrix;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	public List<Matrix> loadModel(); 
}
