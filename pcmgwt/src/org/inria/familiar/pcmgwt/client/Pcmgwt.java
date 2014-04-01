package org.inria.familiar.pcmgwt.client;

import java.util.List;

import org.inria.familiar.pcmgwt.shared.Matrix;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.smartgwt.client.types.HoverMode;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.cube.CubeGrid;
import com.smartgwt.client.widgets.events.HoverEvent;
import com.smartgwt.client.widgets.events.HoverHandler;
import com.smartgwt.client.widgets.grid.CellFormatter;
import com.smartgwt.client.widgets.grid.CellValueHoverFormatter;
import com.smartgwt.client.widgets.grid.HoverCustomizer;
import com.smartgwt.client.widgets.grid.ListGridRecord;
/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Pcmgwt implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = (GreetingServiceAsync) GWT
			.create(GreetingService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		/* final ListGrid countryGrid = new ListGrid() {  
	            @Override  
	            protected Canvas createRecordComponent(final ListGridRecord record, Integer colNum) {  
	  
	                String fieldName = this.getFieldName(colNum);  
	  
	                if (fieldName.equals("iconField")) {  
	                    HLayout recordCanvas = new HLayout(3);  
	                    recordCanvas.setHeight(22);  
	                    recordCanvas.setAlign(Alignment.CENTER);  
	                    ImgButton editImg = new ImgButton();  
	                    editImg.setShowDown(false);  
	                    editImg.setShowRollOver(false);  
	                    editImg.setLayoutAlign(Alignment.CENTER);  
	                    editImg.setSrc("silk/comment_edit.png");  
	                    editImg.setPrompt("Edit Comments");  
	                    editImg.setHeight(16);  
	                    editImg.setWidth(16);  
	                    editImg.addClickHandler(new ClickHandler() {  
	                        public void onClick(ClickEvent event) {  
	                            SC.say("Edit Comment Icon Clicked for country : " + record.getAttribute("countryName"));  
	                        }  
	                    });  
	  
	                    ImgButton chartImg = new ImgButton();  
	                    chartImg.setShowDown(false);  
	                    chartImg.setShowRollOver(false);  
	                    chartImg.setAlign(Alignment.CENTER);  
	                    chartImg.setSrc("silk/chart_bar.png");  
	                    chartImg.setPrompt("View Chart");  
	                    chartImg.setHeight(16);  
	                    chartImg.setWidth(16);  
	                    chartImg.addClickHandler(new ClickHandler() {  
	                        public void onClick(ClickEvent event) {  
	                            SC.say("Chart Icon Clicked for country : " + record.getAttribute("countryName"));  
	                        }  
	                    });  
	  
	                    recordCanvas.addMember(editImg);  
	                    recordCanvas.addMember(chartImg);  
	                    return recordCanvas;  
	                } else if (fieldName.equals("buttonField")) {  
	                    IButton button = new IButton();  
	                    button.setHeight(18);  
	                    button.setWidth(65);                      
	                    button.setIcon("flags/16/" + record.getAttribute("countryCode") + ".png");  
	                    button.setTitle("Info");  
	                    button.addClickHandler(new ClickHandler() {  
	                        public void onClick(ClickEvent event) {  
	                            SC.say(record.getAttribute("countryName") + " info button clicked.");  
	                        }  
	                    });  
	                    return button;  
	                } else {  
	                    return null;  
	                }  
	  
	            }  
	        };  
	        countryGrid.setShowRecordComponents(true);          
	        countryGrid.setShowRecordComponentsByCell(true);  
	        countryGrid.setCanRemoveRecords(true);  
	  
	        countryGrid.setWidth(550);  
	        countryGrid.setHeight(224);  
	        countryGrid.setShowAllRecords(true);  
	  
	        ListGridField countryCodeField = new ListGridField("countryCode", "Flag", 40);  
	        countryCodeField.setAlign(Alignment.CENTER);  
	        countryCodeField.setType(ListGridFieldType.IMAGE);  
	        countryCodeField.setImageURLPrefix("flags/16/");  
	        countryCodeField.setImageURLSuffix(".png");  
	  
	        ListGridField nameField = new ListGridField("countryName", "Country");  
	        ListGridField capitalField = new ListGridField("capital", "Capital");  
	        ListGridField continentField = new ListGridField("continent", "Continent");  
	  
	        ListGridField buttonField = new ListGridField("buttonField", "Info");  
	        buttonField.setAlign(Alignment.CENTER);  
	          
	        ListGridField iconField = new ListGridField("iconField", "Comments/Stats");  
	        iconField.setWidth(100);  
	  
	        countryGrid.setFields(countryCodeField, nameField, capitalField, continentField, buttonField, iconField);  
	        countryGrid.setCanResizeFields(true);  
	        countryGrid.setData(CountrySampleData.getRecords());  
	  
	        countryGrid.draw();  
		
 */
		
		greetingService.loadModel(new AsyncCallback<List<Matrix>>() {
			
			@Override
			public void onSuccess(List<Matrix> result) {
				System.err.println(result.size());
				
				CubeGrid cubeGrid = new CubeGrid();  
		        
				//in order to enable charting, the Drawing module must be present  
		        if(SC.hasDrawing()) {  
		            cubeGrid.setEnableCharting(true);  
		        }  
		        cubeGrid.setData(MatrixCellData.getData(result));  
		  
		        cubeGrid.setWidth100();  
		        cubeGrid.setHeight100();  
		        //cubeGrid.setHideEmptyFacetValues(true);  
		        cubeGrid.setShowCellContextMenus(true);  
		        
		        
		        
		        
		        final NumberFormat numberFormat = NumberFormat.getFormat("0,000");  
		  
		        
		        cubeGrid.setHoverCustomizer(new HoverCustomizer() {
					
					@Override
					public String hoverHTML(Object value, ListGridRecord record, int rowNum,
							int colNum) {
						// TODO Auto-generated method stub
						return "C'est trop cool";
					}
				});
		        cubeGrid.setHoverMode(HoverMode.DETAILS);
		        cubeGrid.setHoverDelay(10);
		        cubeGrid.setCanSort(true);
		        cubeGrid.setCanEdit(true);
		        cubeGrid.addHoverHandler(new HoverHandler() {
					
					@Override
					public void onHover(HoverEvent event) {
						System.err.println("toto");
					}
				});
		        
//		        cubeGrid.
		        
		        cubeGrid.setCellFormatter(new CellFormatter() {  
		            public String format(Object value, ListGridRecord record, int rowNum, int colNum) {  
		                if (value == null) return null;  
		                try {  
		                    return numberFormat.format(((Number) value).longValue());  
		                } catch (Exception e) {  
		                		return value.toString();  
		                }  
		            }  
		        });  
		        
		        
		        
		        
		  
		        //cubeGrid.setColumnFacets("quarter", "month", "metric");  
		        //cubeGrid.setRowFacets("region", "product");  
		        cubeGrid.setRowFacets("product");  
		        cubeGrid.setColumnFacets("feature");  
		        
/*		        Window.alert(""+cubeGrid.getGridComponents().length);
		        
		        for (ListGridComponent c :   cubeGrid.getGridComponents()){
		        	System.err.println(c.name());
		        	System.err.println(c.getValue());
		        }*/
		        
		        cubeGrid.draw();  
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}
		});
		
  }
}
