package org.inria.familiar.pcmgwt.client;  
  
import org.inria.familiar.pcmgwt.shared.Cell;

import com.smartgwt.client.widgets.grid.ListGridRecord;
  
/** 
 * ProductRevenue record class. 
 */  
public class MatrixCell extends ListGridRecord {  
  
    public MatrixCell(String product, String feature, String value,Cell obj, int row, int column) {  
    	setRow(row);
    	setColumn(column);
    	
    	setFeature(feature);
    	setProduct(product);
    	setValue(value);  
    	setCell(obj);
    }  
    
    public void setCell(Cell obj) {
    	setAttribute("cell", obj); 
		
	}
    public Cell getCell() {
        return (Cell) getAttributeAsObject("cell");  
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

    public void setRow(int row) {  
        setAttribute("row", row);  
    }  

    public int getRow() {  
        return getAttributeAsInt("row");  
    }  

    public void setColumn(int column) {  
        setAttribute("column", column);  
    }  

    public int getColumn() {  
        return getAttributeAsInt("column");  
    }  

    
    public String getHilite(String hilite) {  
        return getAttribute("_hilite");  
    }  
}  