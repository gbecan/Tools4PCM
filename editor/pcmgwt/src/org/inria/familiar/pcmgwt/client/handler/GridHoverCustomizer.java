package org.inria.familiar.pcmgwt.client.handler;

import org.inria.familiar.pcmgwt.client.MatrixCell;
import org.inria.familiar.pcmgwt.shared.Cell;

import com.smartgwt.client.widgets.grid.ListGridRecord;

public class GridHoverCustomizer extends com.smartgwt.client.widgets.grid.HoverCustomizer{

	

	@Override
	public String hoverHTML(
			
			Object value,
			ListGridRecord record,
			int rowNum, int colNum) {

		StringBuffer buf = new StringBuffer();
		Cell c = ((MatrixCell) record)
				.getCell();
		buf.append(c.getConstraint()
				+ "\n");
		// buf.append(c.getValue() +
		// "\n");
		return buf.toString();
	}
}
