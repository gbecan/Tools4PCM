package org.inria.familiar.pcmgwt.client.download;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class Blob extends JavaScriptObject{

	public static String TYPE_APPLICATION_OCTET_STREM="application/octet-stream";
	
	protected Blob(){}
	
	
	public  static final  Blob createBlob(JavaScriptObject object,String type){
	@SuppressWarnings("unchecked")
	JsArray<JavaScriptObject> arrays=(JsArray<JavaScriptObject>) JsArray.createArray();
	arrays.push(object);
	return createBlob(arrays,type);
	}
	
	public  static final native Blob createBlob(String text,String type)/*-{
    return new $wnd.Blob([text],{type:type});
  	}-*/;
	
	public  static final native Blob createBlob(String text)/*-{
    return new $wnd.Blob([text],{type:"text/plain;charset=UTF-8"});
  	}-*/;
	
	public  static final native Blob createBlob(JsArray<JavaScriptObject> arrays,String type)/*-{
    return new $wnd.Blob(arrays,{type:type});
  	}-*/;
	
	public static final Blob createBlob(byte[] bytes){
		Uint8Array array=Uint8Array.createUint8(bytes);
		return createBlob(array, TYPE_APPLICATION_OCTET_STREM);
	}
	
	public  static final native Blob createBlob(Uint8Array arrays,String type)/*-{
    return new $wnd.Blob([arrays],{type:type});
  	}-*/;
	/**
	 * support not base64 contain text
	 * @param dataURI
	 * @param type
	 * @return
	 */
	public  static final native Blob createBase64Blob(String dataURI,String type)/*-{
	 var BASE64_MARKER = ';base64,';
	  var index=dataURI.indexOf(BASE64_MARKER);
	  var base64Index=0;
	  if(index!=-1){
	  	 base64Index=index  + BASE64_MARKER.length
	  }
	  var base64 = dataURI.substring(base64Index);
	  var raw = $wnd.atob(base64);
	  var rawLength = raw.length;
	  var uInt8Array = new $wnd.Uint8Array(rawLength);

	  for (var i = 0; i < rawLength; ++i) {
	    uInt8Array[i] = raw.charCodeAt(i);
	  }
    return new $wnd.Blob([uInt8Array],{type:type});
  	}-*/;
	
	
	

}
