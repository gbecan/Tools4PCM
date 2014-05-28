package org.inria.familiar.pcmgwt.client.handler;

import org.inria.familiar.pcmgwt.client.ExperimentDataCellSingleton;
import org.inria.familiar.pcmgwt.client.GreetingServiceAsync;
import org.inria.familiar.pcmgwt.shared.PCM;
import org.inria.familiar.pcmgwt.shared.PCMGuiBuilder;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.smartgwt.client.types.ClickMaskMode;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Img;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;



public class ValidateHandler implements ClickHandler{

	DynamicForm form;
	DynamicForm form1;
	TabSet theTabs;
	Tab item;
	IButton validateButton;
	IButton demoButton;
	boolean demo;
	
	public ValidateHandler(DynamicForm form, DynamicForm form1, TabSet theTabs, 
			GreetingServiceAsync greetingService,IButton validateButton, IButton demoButton, boolean demo) {
		super();
		this.form = form;
		this.form1 = form1;
		this.theTabs = theTabs;
		this.greetingService = greetingService;
		this.validateButton = validateButton;
		this.demoButton = demoButton;
		this.demo = demo;
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
			validateButton.setDisabled(true);
			demoButton.setDisabled(true);
			final VLayout vLayoutmask = new VLayout();
			vLayoutmask.setAutoHeight();
			vLayoutmask.setAutoWidth();
			Img i = new Img();
			i.setSrc(GWT.getHostPageBaseURL()+ "images/large-loading.gif");
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
					.loadModel(demo,new AsyncCallback<PCM>() {

						@Override
						public void onSuccess(
								PCM pcm) {
													
							new PCMGuiBuilder(pcm).mkTabs(theTabs);

						}

						@Override
						public void onFailure(Throwable caught) {
							// TODO Auto-generated method stub

						}
					});
					
		}
	}
}
