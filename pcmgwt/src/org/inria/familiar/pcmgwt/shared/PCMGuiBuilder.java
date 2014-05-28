package org.inria.familiar.pcmgwt.shared;

import org.inria.familiar.pcmgwt.client.ExperimentDataCellSingleton;
import org.inria.familiar.pcmgwt.client.MatrixCell;
import org.inria.familiar.pcmgwt.client.MatrixCellData;
import org.inria.familiar.pcmgwt.client.handler.CellContextMenuWidget;
import org.inria.familiar.pcmgwt.client.handler.FilterContextMenuWidget;
import org.inria.familiar.pcmgwt.client.handler.GridCellFormatter;
import org.inria.familiar.pcmgwt.client.handler.GridHoverCustomizer;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.smartgwt.client.types.ClickMaskMode;
import com.smartgwt.client.types.HoverMode;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.Img;
import com.smartgwt.client.widgets.cube.CubeGrid;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.smartgwt.client.widgets.grid.events.CellContextClickEvent;
import com.smartgwt.client.widgets.grid.events.CellContextClickHandler;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.menu.Menu;
import com.smartgwt.client.widgets.menu.MenuItem;
import com.smartgwt.client.widgets.menu.events.MenuItemClickEvent;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;

public class PCMGuiBuilder {

	private PCM _pcm;

	public PCMGuiBuilder(PCM pcm) {
		_pcm = pcm ; 
	}


	public void mkTabs(TabSet theTabs) {
		
		final VLayout vLayoutmask = new VLayout();
		vLayoutmask.setAutoHeight();
		vLayoutmask.setAutoWidth();
		Img i = new Img();
		i.setSrc(GWT.getHostPageBaseURL() + "images/large-loading.gif");
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
		

		ExperimentDataCellSingleton.getData().setPcmName(_pcm.getName());

		for(Matrix res : _pcm.getMatrix()){

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
               if(super.getCellRecord(rowNum,colNum) != null  && ((MatrixCell)super.getCellRecord(rowNum,colNum)).getCell().getValue().equals("24 (4th gen.) 18 (1st. - 3rd gen.)"))
               		style = "background-color:orange";
               if(super.getCellRecord(rowNum,colNum) != null  && ((MatrixCell)super.getCellRecord(rowNum,colNum)).getCell().getValue().equals("480 × 320 (4th gen. 960 × 640)"))
               		style = "background-color:orange";
               if(super.getCellRecord(rowNum,colNum) != null  && ((MatrixCell)super.getCellRecord(rowNum,colNum)).getCell().getValue().equals("Predecessor: 24"))
               		style = "background-color:orange";
               if(super.getCellRecord(rowNum,colNum) != null  && ((MatrixCell)super.getCellRecord(rowNum,colNum)).getCell().getValue().equals("Yes (ex. 1st gen.)"))
               		style = "background-color:orange";					               

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

/*							cubeGrid.addRowContextClickHandler(new RowContextClickHandler() {
			
			@Override
			public void onRowContextClick(RowContextClickEvent event) {
				
				Menu m = new Menu();
				
				final MenuItem correctItem = new MenuItem(
						"Filter",
						GWT.getHostPageBaseURL()+"/images/icons/24/text_align_left_Down.png");
				m.addItem(correctItem);
				m.setTop(event.getY());
				m.setLeft(event.getX());
				m.show();
				cubeGrid.setContextMenu(m);
				event.cancel();
			

				
			}
		});*/


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
						"Validate", GWT.getHostPageBaseURL()+"images/icons/16/approved.png");



//				hangupItem.setIcon(new Img("icons/16/approved.png").);
//);

				final MenuItem correctItem = new MenuItem(
						"Correct",
						GWT.getHostPageBaseURL()+"images/icons/24/text_align_left_Down.png");

				final MenuItem filterIem = new MenuItem(
						"Filter",
						GWT.getHostPageBaseURL()+"images/other/magnifier.png");

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
				filterIem.addClickHandler(new FilterContextMenuWidget()  );
				m.addItem(hangupItem);
				m.addItem(correctItem);
				m.addItem(filterIem);
				m.setTop(event.getY());
				m.setLeft(event.getX());
				m.show();
				cubeGrid.setContextMenu(m);
				event.cancel();
			}
		});
		// cubeGrid.getCellRecord(0, 0).
		// cubeGrid.getContextMenu().addItem(hangupItem);
		;
		item1.setPane(cubeGrid);
		}
		vLayoutmask.destroy();
		vLayoutmask.hide();
		c.hide();
		c.destroy();


		theTabs.selectTab(theTabs.getNumTabs()-1);
		theTabs.selectTab(1);

		
		
		
	}

}
