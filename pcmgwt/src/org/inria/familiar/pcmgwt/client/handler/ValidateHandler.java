package org.inria.familiar.pcmgwt.client.handler;

import java.util.List;

import org.inria.familiar.pcmgwt.client.ExperimentDataCellSingleton;
import org.inria.familiar.pcmgwt.client.GreetingServiceAsync;
import org.inria.familiar.pcmgwt.client.MatrixCell;
import org.inria.familiar.pcmgwt.client.MatrixCellData;
import org.inria.familiar.pcmgwt.shared.Matrix;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.smartgwt.client.types.ClickMaskMode;
import com.smartgwt.client.types.HoverMode;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Img;
import com.smartgwt.client.widgets.cube.CubeGrid;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.smartgwt.client.widgets.grid.events.CellContextClickEvent;
import com.smartgwt.client.widgets.grid.events.CellContextClickHandler;
import com.smartgwt.client.widgets.grid.events.CellSelectionChangedEvent;
import com.smartgwt.client.widgets.grid.events.CellSelectionChangedHandler;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.menu.Menu;
import com.smartgwt.client.widgets.menu.MenuItem;
import com.smartgwt.client.widgets.menu.events.MenuItemClickEvent;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;



public class ValidateHandler implements ClickHandler{

	DynamicForm form;
	DynamicForm form1;
	TabSet theTabs;
	Tab item;
	public ValidateHandler(DynamicForm form, DynamicForm form1, TabSet theTabs, 
			GreetingServiceAsync greetingService) {
		super();
		this.form = form;
		this.form1 = form1;
		this.theTabs = theTabs;
		this.greetingService = greetingService;
	}

	GreetingServiceAsync greetingService;
	
	@Override
	public void onClick(ClickEvent event) {
		boolean res = form1.validate();

		ExperimentDataCellSingleton.getData().setFirstName(form.getValueAsString("firstName"));
		ExperimentDataCellSingleton.getData().setLastName(form.getValueAsString("lastName"));
		ExperimentDataCellSingleton.getData().setMail(form1.getValueAsString("email"));
		System.err.println(form.getValueAsString("firstName"));
		
		if (res) {
			final VLayout vLayoutmask = new VLayout();
			vLayoutmask.setAutoHeight();
			vLayoutmask.setAutoWidth();
			Img i = new Img();
			i.setSrc(GWT.getHostPageBaseURL()+"/images/large-loading.gif");
			i.setWidth(32);
			i.setHeight(32);
			vLayoutmask.addMember(i);
			vLayoutmask.showClickMask(null, ClickMaskMode.HARD,
					null);
			vLayoutmask.setTop((Window.getClientHeight() / 2) - 32);
			vLayoutmask.setLeft((Window.getClientWidth() / 2) - 32);
			final Canvas c = new Canvas();
			c.setWidth100();
			c.setHeight100();
			c.setBackgroundColor("#333333");
			c.setOpacity(60);
			c.bringToFront();
			vLayoutmask.bringToFront();
			c.draw();
			vLayoutmask.draw();
			greetingService
					.loadModel(new AsyncCallback<List<Matrix>>() {

						@Override
						public void onSuccess(
								List<Matrix> result) {

							for(Matrix res : result){
								
								Tab item1 = new Tab("Experiment" + res.getId());
								theTabs.addTab(item1, theTabs.getTabs().length-1);
								
								theTabs.selectTab(item1);

							
							
							
							final CubeGrid cubeGrid = new CubeGrid()
							{  
								@Override
						           protected String getCellCSSText(ListGridRecord record, int rowNum, int colNum) {
					               String style = super.getCellCSSText(record, rowNum, colNum);

					               // conditions can check values in record using rowNum, colNum as well as record attributes
					              /* if (record.getAttribute("<grid-field-name>").equals("toto")) {
					                   if (this.getFieldName(colNum).equals("<certain-grid-field-name>") && record.getAttribute("<grid-field-name>").equals("toto")) {
					                       style = "font-weight:bold"; // only that cell in that row becomes bold
					                   } else {
					                       style = "color:red"; // all other cells in that row become red
					                   }
					               } else if (record.getAttribute("<other-grid-field-name>").equals("toto")) {
					                   style = "color:green"; // entire row changed to green if one column in this row contain a specific value
					               }*/
					               
					               
					               if(super.getCellRecord(rowNum,colNum) != null  && ExperimentDataCellSingleton.getInstance(((MatrixCell)super.getCellRecord(rowNum,colNum)).getMatrixId()).getDatasKeys().contains(((MatrixCell)super.getCellRecord(rowNum,colNum)).getCell()))
					               		style = "color:green";
					               return style;
					           }
							}
							;
							cubeGrid.setHoverWidth(170);
							// in order to enable charting, the
							// Drawing module must be
							// present
							//if (SC.hasDrawing()) {
							//	cubeGrid.setEnableCharting(true);
							//}
							cubeGrid.setData(MatrixCellData
									.getData(res));

							cubeGrid.setWidth100();
							cubeGrid.setHeight100();
							// cubeGrid.setHideEmptyFacetValues(true);
							cubeGrid.setShowCellContextMenus(true);
							cubeGrid.setCanDragSelect(true);
							cubeGrid.setCanSelectCells(true);
							cubeGrid.setShowCellContextMenus(true);

						
							cubeGrid.setHoverCustomizer(new GridHoverCustomizer());

							
							cubeGrid.setHoverMode(HoverMode.DETAILS);
							cubeGrid.setHoverDelay(10);
							cubeGrid.setCanHover(true);
							cubeGrid.setCanSort(true);
							cubeGrid.setCanEdit(true);

							cubeGrid.setCellFormatter(new GridCellFormatter());

							// cubeGrid.setColumnFacets("quarter",
							// "month", "metric");
							// cubeGrid.setRowFacets("region",
							// "product");
							cubeGrid.setRowFacets("feature");
							cubeGrid.setColumnFacets("product");

							
							
							/*
							cubeGrid.addCellSelectionChangedHandler(new CellSelectionChangedHandler() {

								@Override
								public void onCellSelectionChanged(
										CellSelectionChangedEvent event) {
																		
								}
							});*/

							/*
							 * Window.alert(""+cubeGrid.
							 * getGridComponents().length);
							 * 
							 * for (ListGridComponent c :
							 * cubeGrid.getGridComponents()){
							 * System.err.println(c.name());
							 * System.err.println(c.getValue());
							 * }
							 */

							cubeGrid.addCellContextClickHandler(new CellContextClickHandler() {

								@Override
								public void onCellContextClick(
										CellContextClickEvent event) {


									ExperimentDataCellSingleton.getInstance(((MatrixCell)cubeGrid.getSelectedCells()[0]).getMatrixId()).getSelectedCell().clear();						

									
									for (int i =0;i< cubeGrid.getSelectedCells().length;i++)
									{

										ExperimentDataCellSingleton.getInstance(((MatrixCell)cubeGrid.getSelectedCells()[i]).getMatrixId()).getSelectedCell().add(		
											
											((MatrixCell)cubeGrid.getSelectedCells()[i]).getCell());
									}

									
									
									Menu m = new Menu();
									final MenuItem hangupItem = new MenuItem(
											"Validate", GWT.getHostPageBaseURL()+"/images/icons/16/approved.png");
									
									
									
//									hangupItem.setIcon(new Img("icons/16/approved.png").);
//);

									final MenuItem correctItem = new MenuItem(
											"Correct",
											GWT.getHostPageBaseURL()+"/images/icons/24/text_align_left_Down.png");

									//									import com.smartgwt.client.widgets.events.ClickHandler;

									hangupItem
											.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
												public void onClick(
														MenuItemClickEvent event) {
													ExperimentDataCellSingleton.getInstance(((MatrixCell)cubeGrid.getSelectedCells()[0]).getMatrixId()).validate();
/*													SC.confirm(
															"Are you sure ? ",
															new BooleanCallback() {
																public void execute(
																		Boolean value) {
																	if (value != null
																			&& value) {
																		
																		
																		//ExperimentDataCellSingleton.getInstance().getDatas()	
																	} else {
																		// Window.alert("Cancel...");
																	}
																}
															});*/
												}
											});
									
									correctItem.addClickHandler(new CellContextMenuWidget()  );
									m.addItem(hangupItem);
									m.addItem(correctItem);
									m.setTop(event.getY());
									m.setLeft(event.getX());
									m.show();
									cubeGrid.setContextMenu(m);
									event.cancel();
								}
							});
							// cubeGrid.getCellRecord(0, 0).
							// cubeGrid.getContextMenu().addItem(hangupItem);
							// cubeGrid.draw();
							item1.setPane(cubeGrid);
							}
							vLayoutmask.destroy();
							vLayoutmask.hide();
							c.hide();
							c.destroy();
							

						}

						@Override
						public void onFailure(Throwable caught) {
							// TODO Auto-generated method stub

						}
					});
					
		}
	}
}
