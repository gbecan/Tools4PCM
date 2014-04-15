package org.inria.familiar.pcmgwt.client;  

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.inria.familiar.pcmgwt.shared.Cell;
import org.inria.familiar.pcmgwt.shared.Header;
import org.inria.familiar.pcmgwt.shared.Matrix;

import com.smartgwt.client.widgets.grid.ListGridRecord;
  
/** 
 * ProductRevenue data 
 */  
public class MatrixCellData {  
	static Map<Integer,String> row ;
	static Map<Integer,String> column;
	static Map<Coordinate,MatrixCell> data;
	
	
	public static ListGridRecord[] getData(List<Matrix> result) {
		 row = new HashMap<Integer,String>();
		 column = new HashMap<Integer,String>();
		
		data = new HashMap<Coordinate,MatrixCell>();
		
		
		for (Matrix m : result){
			for (Header h : m.getHeaders()){
				if (h.getX()==0)
					column.put(h.getY(), h.getValue());
				else 
					row.put(h.getX(), h.getValue());
			}
			for (Cell h : m.getCells()){
				data.put(new Coordinate(h.getX(), h.getY()), new MatrixCell(row.get(h.getX()),column.get(h.getY()),  h.getValue(),h, h.getX(),h.getY() ));
			}
		}
		
		MatrixCell[] val = data.values().toArray(new MatrixCell[data.size()]);
		
		return val;
	}  
}  
class Coordinate{
	int row;
	public int getRow() {
		return row;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + column;
		result = prime * result + row;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinate other = (Coordinate) obj;
		if (column != other.column)
			return false;
		if (row != other.row)
			return false;
		return true;
	}
	public Coordinate(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	int column;
	
}