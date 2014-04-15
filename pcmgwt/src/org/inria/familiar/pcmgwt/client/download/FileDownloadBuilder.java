package org.inria.familiar.pcmgwt.client.download;

import com.google.gwt.core.client.GWT;

public class FileDownloadBuilder {
public static FileDownload createFileDownload(){
	return GWT.create(FileDownload.class);
}
}
