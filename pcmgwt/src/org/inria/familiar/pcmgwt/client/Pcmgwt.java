package org.inria.familiar.pcmgwt.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

import org.inria.familiar.pcmgwt.client.download.HTML5Download;
import org.inria.familiar.pcmgwt.client.handler.ValidateHandler;
import org.inria.familiar.pcmgwt.shared.Matrix;
import org.inria.familiar.pcmgwt.shared.PCM;
import org.inria.familiar.pcmgwt.shared.PCMGuiBuilder;
import org.inria.familiar.pcmgwt.shared.experiment.ExperimentDataCell;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.ListBox;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.data.fields.DataSourceTextField;
import com.smartgwt.client.types.Overflow;
import com.smartgwt.client.util.BooleanCallback;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.RichTextEditor;
import com.smartgwt.client.widgets.Window;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.smartgwt.client.widgets.form.validator.RegExpValidator;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.menu.Menu;
import com.smartgwt.client.widgets.menu.MenuItem;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Pcmgwt implements EntryPoint {
	
	private static Logger _LOGGER = Logger.getLogger("Pcmgwt");
	
	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private final GreetingServiceAsync greetingService = (GreetingServiceAsync) GWT
			.create(GreetingService.class);

	

	Matrix matrix;

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		final TabSet theTabs = new TabSet();
		theTabs.setWidth100();
		theTabs.setHeight100();
		Menu m1 = new Menu();
		MenuItem m2 = new MenuItem();
		m1.addItem(m2);
		theTabs.setContextMenu(m1);

		theTabs.setCanCloseTabs(false);

		Tab item = new Tab();
		item.setTitle("Contact");
	

		VLayout layout1 = new VLayout();

		layout1.setMembersMargin(5);

		final RichTextEditor richTextEditor = new RichTextEditor();
		richTextEditor.setHeight(155);
		richTextEditor.setOverflow(Overflow.HIDDEN);
		richTextEditor.setCanDragResize(true);
		richTextEditor.setShowEdges(true);

		richTextEditor.setHeight100();
		// Standard control group options include
		// "fontControls", "formatControls", "styleControls" and "colorControls"
		// richTextEditor.setControlGroups(new String[]{"fontControls",
		// "styleControls"});
		layout1.addMember(richTextEditor);

		Tab item2 = new Tab();
		item2.setTitle("Comments");
		item2.setPane(layout1);

		final DynamicForm form = new DynamicForm();
		form.setWidth(400);

		TextItem firstName = new TextItem("firstName", "First name");
		firstName.setMask(">?<??????????");
		firstName.setHint("<nobr>>?<??????????????<nobr>");

		TextItem lastName = new TextItem("lastName", "Last name");
		lastName.setMask(">?<??????????????");
		lastName.setHint("<nobr>>?<??????????????<nobr>");

		DataSource dataSource = new DataSource();
		dataSource.setID("regularExpression");

		RegExpValidator regExpValidator = new RegExpValidator();
		regExpValidator
				.setExpression("^([a-zA-Z0-9_.\\-+])+@(([a-zA-Z0-9\\-])+\\.)+[a-zA-Z0-9]{2,4}$");

		DataSourceTextField dsTextField = new DataSourceTextField("email");
		dsTextField.setTitle("Email");
		dsTextField.setValidators(regExpValidator);

		dataSource.setFields(dsTextField);

		final DynamicForm form1 = new DynamicForm();
		form1.setWidth(600);
		form1.setDataSource(dataSource);

		form.setFields(firstName, lastName);
		
		// returns the list of PCM files (their ids) available in the PCM repository
		final PCMRepositoryAsync pcmRepo = 
				(PCMRepositoryAsync) GWT
				.create(PCMRepository.class);
				// new PCMDirectoryRepo("../evaluation/output/models/") ; // TODO workaround
		
		final ListBox lb = new ListBox();	 
	    lb.setVisibleItemCount(1);	

		
		pcmRepo.getIDs(new AsyncCallback<Collection<String>>() {
			
			@Override
			public void onSuccess(Collection<String> pcmIDs) {
	
				for (String pcmID : pcmIDs) {
					lb.addItem(pcmID);			
				}
		
				lb.addChangeHandler(new com.google.gwt.event.dom.client.ChangeHandler() {
					
					

					@Override
					public void onChange(ChangeEvent event) {
						int i = lb.getSelectedIndex();
						String val = lb.getValue(i);
						_LOGGER.info("PCM id:" + val);
						
						
						pcmRepo.getPCM(val, new AsyncCallback<PCM>() {
							
								@Override
								public void onFailure(Throwable caught) {
									// TODO Auto-generated method stub
									
								}

								@Override
								public void onSuccess(PCM pcm) {
									
									/*
									 * RESET previous ones
									 * except 0 (contact) and the final (comments here)
									 */
									for (int j = 1; j < theTabs.getTabs().length-1; j++) {
										theTabs.removeTab(j);
									}
									
									
									Collection<Tab> tabs = new PCMGuiBuilder(pcm).mkTabs();
									for (Tab tab : tabs) {
										theTabs.addTab(tab, theTabs.getTabs().length-1);
									}
									
									theTabs.selectTab(theTabs.getNumTabs()-1);
									theTabs.selectTab(1);
														
								}
						});
						
					}
				});
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
	
		




		IButton validateButton = new IButton();
		validateButton.setTitle("Start");
		IButton deoButton = new IButton();
		deoButton.setTitle("Demo");
		IButton restartButton = new IButton();
		restartButton.setTitle("Restart");

		restartButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				com.google.gwt.user.client.Window.Location.reload();
			}
		});
		
		validateButton
				.addClickHandler(new ValidateHandler(form,form1, theTabs, greetingService, validateButton, deoButton, false));
		
		deoButton.addClickHandler(new ValidateHandler(form,form1, theTabs, greetingService, deoButton, validateButton, true));

		
		VLayout vLayout = new VLayout();
		vLayout.setMembersMargin(10);
		vLayout.addMember(form);
		vLayout.addMember(form1);
		HLayout hLayout1  = new HLayout();
		
		hLayout1.setPadding(30);
		hLayout1.setMargin(30);
		hLayout1.setMembersMargin(40);
		hLayout1.addMember(validateButton);
		hLayout1.addMember(deoButton);
		hLayout1.addMember(restartButton);
		hLayout1.addMember(lb);
		
		vLayout.addMember(hLayout1);
		
		// vLayout.draw();
		item.setPane(vLayout);

		theTabs.setTabs(item, item2);

		IButton submit = new IButton();
		submit.setTitle("Submit");
		submit.addClickHandler(new com.smartgwt.client.widgets.events.ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				
				SC.ask("Do you validate all the matrix (different tabs)",new BooleanCallback() {
					
					@Override
					public void execute(Boolean value) {
						if (value){
							ExperimentDataCellSingleton.getData().setGlobalRemarks(richTextEditor.getValue());

							
							StringBuffer fileContent =new StringBuffer();
							for (String s : ExperimentDataCellSingleton.getInstances().keySet()){
								fileContent.append(ExperimentDataCellSingleton.getInstance(s).toCsv());
								fileContent.append("\n\n");
							}				
							
							com.google.gwt.user.client.ui.Anchor h = HTML5Download.get().generateTextDownloadLink(fileContent.toString(), "DownloadData.txt", "Download");
							
							Collection<ExperimentDataCell> datas  =new ArrayList<ExperimentDataCell>();
							for (String s : ExperimentDataCellSingleton.getInstances().keySet()){
								datas.addAll(ExperimentDataCellSingleton.getInstance(s).getDatas());
							}	
							ExperimentDataCellSingleton.getData().getCells().clear();
							greetingService.createExperimentdata(ExperimentDataCellSingleton.getData(), datas, new AsyncCallback<Boolean>() {

								@Override
								public void onFailure(Throwable caught) {
									
									caught.printStackTrace();
									System.err.println("data not saved");
								}

								@Override
								public void onSuccess(Boolean result) {
									System.err.println("data saved");
								}
							});
							
							
							final Window winModal = new Window();  
					        winModal.setWidth(250);  
					        winModal.setHeight(22);
					        winModal.setTitle("");  
					        winModal.setShowMinimizeButton(false);  
					        winModal.setIsModal(true);  
					        winModal.setShowModalMask(true);  
					        winModal.centerInPage();  
					        winModal.addCloseClickHandler(new CloseClickHandler() {  
					            public void onCloseClick(CloseClickEvent event) {  
					                winModal.destroy();  
					            }  
					        });  
					        winModal.addChild(h);
							winModal.show();
							
						}
					}
				} );
				

				
				
			}
		});

		
		
		VLayout vLayoutRoot = new VLayout();
		vLayoutRoot.setWidth100();
		vLayoutRoot.setHeight100();
		vLayoutRoot.setMembersMargin(10);
		vLayoutRoot.addMember(theTabs);
		vLayoutRoot.addMember(submit);
		vLayoutRoot.draw();

	}
}
