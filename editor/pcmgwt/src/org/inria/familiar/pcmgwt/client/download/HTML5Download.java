package org.inria.familiar.pcmgwt.client.download;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;



public class HTML5Download implements FileDownload {

	public   native final DownloadURL URL()/*-{
	return   window.webkitURL || window.URL;
	}-*/;
	
	//for implement FileDownload 
	private static HTML5Download html5download=new HTML5Download();
	private DownloadURL windowURL;
	public static HTML5Download get(){
		return html5download;
	}
	public HTML5Download(){
		windowURL=DownloadURL.get();
	}

	
	/**
	 * IE not support this use generateDownloadLink
	 */
	public  Anchor generateTextDownloadLink(String text,String fileName,String anchorText){
		return generateTextDownloadLink(text,fileName,anchorText,false);
	}
	/**
	 * IE not support this use generateDownloadLink
	 */
	public  Anchor generateTextDownloadLink(String text,String fileName,String anchorText,boolean autoRemove){
		String mimeType="text/plain;charset=UTF-8";
		/*
		DownloadBlobBuilder bb=BlobBuilder();
		
		bb.append(text);
		*/
		
		final Anchor link=new Anchor(anchorText);
		String url=windowURL.createObjectURL(Blob.createBlob(text));
		link.setHref(url);
		link.getElement().setAttribute("download", fileName);
		link.getElement().setAttribute("dataset.downloadurl", mimeType+":"+fileName+":"+url);
		if(autoRemove){
			link.addClickHandler(new ClickHandler() {
				
				@Override
				public void onClick(ClickEvent event) {
					link.removeFromParent();
				}
			});
		}
		return link;
	}
	
	
	/**
	 * IE not support this use generateDownloadLink
	 */
	/**
	 * not tested yet
	 * @param text
	 * @param mimeType
	 * @param fileName
	 * @param anchorText
	 * @param autoRemove
	 * @return
	 */
	public  Anchor generateTextDownloadLink(String text,String mimeType,String fileName,String anchorText,boolean autoRemove){
		final Anchor link=new Anchor(anchorText);
		String url=windowURL.createObjectURL(Blob.createBlob(text,mimeType));
		link.setHref(url);
		link.getElement().setAttribute("download", fileName);
		link.getElement().setAttribute("dataset.downloadurl", mimeType+":"+fileName+":"+url);
		if(autoRemove){
			link.addClickHandler(new ClickHandler() {
				
				@Override
				public void onClick(ClickEvent event) {
					link.removeFromParent();
				}
			});
		}
		return link;
	}
	
	/**
	 * IE not support this use generateDownloadLink
	 */
	//TODO support it
	public  Anchor generateBase64DownloadLink(String urlData,String mimeType,String fileName,String anchorText,boolean autoRemove){
		
		
		final Anchor link=new Anchor(anchorText);
		String url=windowURL.createObjectURL(Blob.createBase64Blob(urlData,mimeType));
		//String url=URL().createObjectURL(bb.getBlob(mimeType));
		link.setHref(url);
		link.getElement().setAttribute("download", fileName);
		link.getElement().setAttribute("dataset.downloadurl", mimeType+":"+fileName+":"+url);
		if(autoRemove){
			link.addClickHandler(new ClickHandler() {
				
				@Override
				public void onClick(ClickEvent event) {
					link.removeFromParent();
				}
			});
		}
		return link;
	}
	
	
	/**
	 * if you would like to support IE,keep blob in field.
	 */
	
	//blob have mimetype?
	public  Anchor generateDownloadLink(Blob blob,String mimeType,String fileName,String anchorText){
		return generateDownloadLink(blob,mimeType,fileName,anchorText,false);
	}
	
	public  Anchor generateDownloadLink(Blob blob,String mimeType,String fileName,String anchorText,boolean autoRemove){
		final Anchor link=new Anchor(anchorText);
		String url=windowURL.createObjectURL(blob);
		link.setHref(url);
		link.getElement().setAttribute("download", fileName);
		link.getElement().setAttribute("dataset.downloadurl", mimeType+":"+fileName+":"+url);
		
		if(autoRemove){
			link.addClickHandler(new ClickHandler() {
				
				@Override
				public void onClick(ClickEvent event) {
					link.removeFromParent();
				}
			});
		}
		return link;
	}
	

}
