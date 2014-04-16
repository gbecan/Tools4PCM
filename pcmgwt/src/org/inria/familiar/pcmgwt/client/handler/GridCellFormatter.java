package org.inria.familiar.pcmgwt.client.handler;

import com.smartgwt.client.widgets.grid.ListGridRecord;

public class GridCellFormatter implements com.smartgwt.client.widgets.grid.CellFormatter{


	
	
	
	public String format(
			Object value,
			ListGridRecord record,
			int rowNum, int colNum) {
		if (value == null)
			return null;

		return value.toString();
	}
	
}
