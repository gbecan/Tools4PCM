package org.inria.familiar.pcmgwt.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.inria.familiar.pcmgwt.shared.Cell;
import org.inria.familiar.pcmgwt.shared.Type;
import org.inria.familiar.pcmgwt.shared.experiment.ExperimentData;
import org.inria.familiar.pcmgwt.shared.experiment.ExperimentDataCell;

public class ExperimentDataCellSingleton {

	private ExperimentDataCellSingleton() {

	}

	private static ExperimentDataCellSingleton instance = new ExperimentDataCellSingleton();

	public static ExperimentDataCellSingleton getInstance() {
		return instance;
	}

	Map<Cell, ExperimentDataCell> datas = new HashMap<Cell, ExperimentDataCell>();

	ExperimentData data = new ExperimentData();

	public ExperimentData getData() {
		return data;
	}

	public Collection<ExperimentDataCell> getDatas() {
		List<ExperimentDataCell> res = new ArrayList<ExperimentDataCell>();
		res.addAll(datas.values());
		return res;
	}

	public Collection<Cell> getDatasKeys() {
		return datas.keySet();
	}

	/*
	 * public ExperimentDataCell getNewDataCell(){ ExperimentDataCell cell = new
	 * ExperimentDataCell(); datas.add(cell); return cell;
	 * 
	 * 
	 * }
	 */

	List<Cell> selectedCell = new ArrayList<Cell>();

	public List<Cell> getSelectedCell() {
		return selectedCell;
	}

	public void validate() {
		for (Cell c : selectedCell) {
			ExperimentDataCell cell = null;

			if (!datas.containsKey(c)) {
				cell = new ExperimentDataCell();
				datas.put(c, cell);
			} else {
				cell = datas.get(c);
			}

			cell.setRow(c.getX());
			cell.setColumn(c.getY());
			cell.setValidate(true);
			// System.err.println("validate " +c.getValue() + " " +c.getX()
			// +","+c.getY() );

		}

	}

	public void setType(Type type) {
		for (Cell c : selectedCell) {
			ExperimentDataCell cell = null;

			if (!datas.containsKey(c)) {
				cell = new ExperimentDataCell();
				datas.put(c, cell);
			} else {
				cell = datas.get(c);
			}

			cell.setRow(c.getX());
			cell.setColumn(c.getY());
			cell.setValidate(false);
			cell.setNewType(type);
		}
	}

	public void setRemark(String remark) {
		for (Cell c : selectedCell) {
			ExperimentDataCell cell = null;

			if (!datas.containsKey(c)) {
				cell = new ExperimentDataCell();
				datas.put(c, cell);
			} else {
				cell = datas.get(c);
			}
			cell.setRow(c.getX());
			cell.setColumn(c.getY());
			cell.setValidate(false);
			cell.setRemarks(remark);
		}
	}

	public void noInterpretation() {
		for (Cell c : selectedCell) {
			ExperimentDataCell cell = null;

			if (!datas.containsKey(c)) {
				cell = new ExperimentDataCell();
				datas.put(c, cell);
			} else {
				cell = datas.get(c);
			}
			cell.setRow(c.getX());
			cell.setColumn(c.getY());
			cell.setValidate(false);
			cell.setNoInterpretation(true);
		}
	}

	public String toCsv() {
		StringBuffer buf = new StringBuffer();
		buf.append(data.getFirstName() + "\t" + data.getLastName() + "\t"
				+ data.getGlobalRemarks() + "\t" + data.getPcmName() + "\t"
				+ data.getMail() + "\t" + data.getDate() + "\n");
		for (ExperimentDataCell c : datas.values()){
			buf.append(c.getRow() + "\t" + c.getColumn() + "\t" + c.isValidate() + "\t"+ c.isNoInterpretation() +"\t" +c.getNewType() + "\t" +c.getRemarks() + "\n");					}
		return buf.toString();
		
	}

}
