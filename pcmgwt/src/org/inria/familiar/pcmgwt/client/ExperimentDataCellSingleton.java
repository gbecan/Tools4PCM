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

	private static Map<String,ExperimentDataCellSingleton> instances = new HashMap<String, ExperimentDataCellSingleton>();

	public static Map<String, ExperimentDataCellSingleton> getInstances() {
		return instances;
	}

	public static ExperimentDataCellSingleton getInstance(String matrixId) {
		if (!instances.containsKey(matrixId))
			instances.put(matrixId, new ExperimentDataCellSingleton());
		return instances.get(matrixId);
	}

	Map<Cell, ExperimentDataCell> datas = new HashMap<Cell, ExperimentDataCell>();

	static ExperimentData data = new ExperimentData();

	public static  ExperimentData getData() {
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

	static List<Cell>  selectedCell = new ArrayList<Cell>();

	public static List<Cell> getSelectedCell() {
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
			cell.setMatriceId(c.getMatrixId());
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
			cell.setMatriceId(c.getMatrixId());

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
			cell.setMatriceId(c.getMatrixId());

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
			cell.setMatriceId(c.getMatrixId());

		}
	}

	public String toCsv() {
		StringBuffer buf = new StringBuffer();
		buf.append(data.getFirstName() + "\t" + data.getLastName() + "\t"
				+ data.getGlobalRemarks() + "\t" + data.getPcmName() + "\t"
				+ data.getMail() + "\t" + data.getDate() + "\n");
		for (ExperimentDataCell c : datas.values()){
			buf.append(c.getMatriceId() + "\t" + c.getRow() + "\t" + c.getColumn() + "\t" + c.isValidate() + "\t"+ c.isNoInterpretation() +"\t"+c.isNoIdea()+"\t" +c.getNewType() + "\t" +c.getRemarks() + "\n");					}
		return buf.toString();
		
	}

	public void noIdea() {
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
			cell.setNoInterpretation(false);
			cell.setNoIdea(true);
			cell.setMatriceId(c.getMatrixId());

		}
		
	}

}
