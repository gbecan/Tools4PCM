package org.inria.familiar.pcmgwt.client;

import java.util.Collection;

import org.inria.familiar.pcmgwt.shared.PCM;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * Can be a local directory, a remote resource, whatever
 * @author macher1
 *
 */
@RemoteServiceRelativePath("repository")
public interface PCMRepository extends RemoteService {

	/**
	 * @return the list of PCM identifiers (at the moment string-based IDs)
	 */
	Collection<String> getIDs();

	/**
	 * @param id
	 * @return the PCM model with ID in the repo
	 */
	PCM getPCM(String id);

}
