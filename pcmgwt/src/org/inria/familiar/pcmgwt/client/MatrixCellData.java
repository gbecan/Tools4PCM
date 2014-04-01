package org.inria.familiar.pcmgwt.client;  

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.inria.familiar.pcmgwt.shared.AbstractCell;
import org.inria.familiar.pcmgwt.shared.Cell;
import org.inria.familiar.pcmgwt.shared.Header;
import org.inria.familiar.pcmgwt.shared.Matrix;

import com.google.gwt.user.client.rpc.core.java.util.Collections;
import com.smartgwt.client.widgets.grid.ListGridRecord;
  
/** 
 * ProductRevenue data 
 */  
public class MatrixCellData {  
  

	public static ListGridRecord[] getData(List<Matrix> result) {
		Map<Integer,String> row = new HashMap<Integer,String>();
		Map<Integer,String> column = new HashMap<Integer,String>();
		
		List<MatrixCell> data = new ArrayList<MatrixCell>();
		
		
		for (Matrix m : result){
			for (Header h : m.getHeaders()){
				if (h.getX()==0)
					column.put(h.getY(), h.getValue());
				else 
					row.put(h.getX(), h.getValue());
			}
			for (Cell h : m.getCells()){
				data.add(new MatrixCell(column.get(h.getY()),row.get(h.getX()),  h.getValue() ));
			}
		}
		
		MatrixCell[] val = data.toArray(new MatrixCell[data.size()]);
		
		return val;
	}  
}  