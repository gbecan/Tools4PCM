package org.inria.familiar.pcmgwt.client;

import java.util.Collection;

import org.inria.familiar.pcmgwt.shared.PCM;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface PCMRepositoryAsync {

	void getIDs(AsyncCallback<Collection<String>> callback);

	void getPCM(String id, AsyncCallback<PCM> callback);

}
