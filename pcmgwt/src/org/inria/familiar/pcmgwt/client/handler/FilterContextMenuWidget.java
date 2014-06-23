package org.inria.familiar.pcmgwt.client.handler;

import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Window;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.SliderItem;
import com.smartgwt.client.widgets.menu.events.MenuItemClickEvent;

public class FilterContextMenuWidget implements
		com.smartgwt.client.widgets.menu.events.ClickHandler {

	public void foo() {
		final Window winModal = new Window();
		winModal.setWidth(360);
		winModal.setHeight(230);

		winModal.setTitle("Filters");
		winModal.setShowMinimizeButton(false);
		//winModal.setIsModal(true);
		//winModal.setShowModalMask(true);
		winModal.centerInPage();
		winModal.addCloseClickHandler(new CloseClickHandler() {
			public void onCloseClick(CloseClickEvent event) {
				winModal.destroy();
			}
		});
		final DynamicForm form = new DynamicForm();
		form.setHeight100();
		form.setWidth100();
		form.setPadding(5);
		form.setLayoutAlign(VerticalAlignment.BOTTOM);

		// - l'utilisateur choisi une autre interprétation parmi les concepts du
		// métamodèle (liste déroulante).
		// - l'utilisateur ne trouve pas son bonheur dans le meta-modèle et
		// décrit un concept à ajouter au MM (commentaire).
		// - l'utilisateur considère qu'il n'y a pas d'interprétation pour cette
		// cellule.

		//	form.setFields(radioGroupItem, cbItem, text, validate);

        SliderItem sliderItem = new SliderItem();  
        sliderItem.setTitle("Min Video battery life");  
        sliderItem.setHeight(40);  
        sliderItem.setWidth(180);  
        
        sliderItem.setMinValue(3);  
        sliderItem.setMaxValue(7);  
        sliderItem.setNumValues(7);  
        sliderItem.setDefaultValue(3);  
		

        SliderItem sliderItem1 = new SliderItem();  
        sliderItem1.setTitle("Max Video battery life");  
        sliderItem1.setHeight(40);  
        sliderItem1.setWidth(180);  
        
        sliderItem1.setMinValue(3);  
        sliderItem1.setMaxValue(7);  
        sliderItem1.setNumValues(7);  
        sliderItem1.setDefaultValue(7);  

        
        form.setFields(sliderItem,sliderItem1);
		winModal.addItem(form);
		winModal.show();

	}

	@Override
	public void onClick(MenuItemClickEvent event) {
		foo();

	}

}
