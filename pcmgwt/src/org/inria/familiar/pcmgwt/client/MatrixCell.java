package org.inria.familiar.pcmgwt.client;  
  
import com.smartgwt.client.widgets.grid.ListGridRecord;  
  
/** 
 * ProductRevenue record class. 
 */  
public class MatrixCell extends ListGridRecord {  
  
    public MatrixCell(String product, String feature, String value) {  
    	setFeature(feature);
    	setProduct(product);
    	setValue(value);  
    }  
    
    public String getProduct() {
        return getAttributeAsString("product");  
	}

	public void setProduct(String product) {
	      setAttribute("product", product);  
	}

	public String getFeature() {
        return getAttributeAsString("feature");  
	}

	public void setFeature(String feature) {
	      setAttribute("feature", feature);  
	}


    
  
    public void setValue(String value) {  
        setAttribute("_value", value);  
    }  
  
    public Integer getValue() {  
        return getAttributeAsInt("_value");  
    }  
  
  
    public void setHilite(String hilite) {  
        setAttribute("_hilite", hilite);  
    }  
  
    public String getHilite(String hilite) {  
        return getAttribute("_hilite");  
    }  
}  