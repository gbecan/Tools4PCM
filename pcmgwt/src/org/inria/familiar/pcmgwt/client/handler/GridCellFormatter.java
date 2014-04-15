package org.inria.familiar.pcmgwt.client.handler;

import com.google.gwt.i18n.client.NumberFormat;
import com.smartgwt.client.widgets.grid.ListGridRecord;

public class GridCellFormatter implements com.smartgwt.client.widgets.grid.CellFormatter{

	final NumberFormat numberFormat = NumberFormat
			.getFormat("0,000");

	
	
	
	public String format(
			Object value,
			ListGridRecord record,
			int rowNum, int colNum) {
		if (value == null)
			return null;
		try {
			return numberFormat
					.format(((Number) value)
							.longValue());
		} catch (Exception e) {
			return value.toString();
		}
	}
	
}
