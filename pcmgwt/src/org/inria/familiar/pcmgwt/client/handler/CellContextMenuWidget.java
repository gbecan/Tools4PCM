package org.inria.familiar.pcmgwt.client.handler;

import org.inria.familiar.pcmgwt.client.ExperimentDataCellSingleton;
import org.inria.familiar.pcmgwt.shared.Type;

import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Window;
import com.smartgwt.client.widgets.events.CloseClickEvent;
import com.smartgwt.client.widgets.events.CloseClickHandler;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ButtonItem;
import com.smartgwt.client.widgets.form.fields.ComboBoxItem;
import com.smartgwt.client.widgets.form.fields.RadioGroupItem;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.smartgwt.client.widgets.form.fields.events.ChangedEvent;
import com.smartgwt.client.widgets.form.fields.events.ChangedHandler;
import com.smartgwt.client.widgets.form.fields.events.ClickEvent;
import com.smartgwt.client.widgets.form.fields.events.ClickHandler;
import com.smartgwt.client.widgets.menu.events.MenuItemClickEvent;

public class CellContextMenuWidget implements com.smartgwt.client.widgets.menu.events.ClickHandler{

	
	public void foo(){
		final Window winModal = new Window();  
        winModal.setWidth(360);  
        winModal.setHeight(230);

        winModal.setTitle("Modal Window");  
        winModal.setShowMinimizeButton(false);  
        winModal.setIsModal(true);  
        winModal.setShowModalMask(true);  
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
        
        
        //    - l'utilisateur choisi une autre interprétation parmi les concepts du métamodèle (liste déroulante).
        //- l'utilisateur ne trouve pas son bonheur dans le meta-modèle et décrit un concept à ajouter au MM (commentaire).
        //- l'utilisateur considère qu'il n'y a pas d'interprétation pour cette cellule.
        
        final RadioGroupItem radioGroupItem = new RadioGroupItem();  
        radioGroupItem.setTitle("Choose the correction");  
        radioGroupItem.setValueMap("Select an existing constraint", "Add your own constraint", "no interpretation for this cell");  
  
        
        
        final ComboBoxItem cbItem = new ComboBoxItem();  
        cbItem.setTitle("Existing constraints");  
        cbItem.setHint("<nobr>Existing constraints</nobr>");  
        cbItem.setType("comboBox");  
        cbItem.setValueMap(Type.And.toString(), Type.Boolean.toString(), Type.Empty.toString(), Type.header.toString(), Type.Inconsistent.toString(), Type.Multiple.toString(), Type.Or.toString(), Type.Partial.toString(), Type.Simple.toString(), Type.Unknown.toString(), Type.Xor.toString());  
        cbItem.setDisabled(true);
        
        
        final TextItem text = new TextItem("OwnIntepretation");
        text.setTitle("Enter your own interpretation");
        text.setDisabled(true);
        
        final ButtonItem validate = new ButtonItem("store");
        validate.setDisabled(true);
        
        validate.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				if ("Select an existing constraint".equals(radioGroupItem.getValue())){
					ExperimentDataCellSingleton.getInstance().setType(Type.valueOf(cbItem.getValueAsString()));
				}else if("Add your own constraint".equals(radioGroupItem.getValue())){
					ExperimentDataCellSingleton.getInstance().setRemark(form.getValueAsString("OwnIntepretation"));
				}else{
					ExperimentDataCellSingleton.getInstance().noInterpretation();
				}
				
				winModal.destroy(); 
			}
		});

        radioGroupItem.addChangedHandler(new ChangedHandler() {
			
			@Override
			public void onChanged(ChangedEvent event) {
//				System.err.println(radioGroupItem.getValue());
		        validate.setDisabled(false);

				if ("Select an existing constraint".equals(radioGroupItem.getValue())){
			        cbItem.setDisabled(false);
			        text.setDisabled(true);
				}else if("Add your own constraint".equals(radioGroupItem.getValue())){
			        cbItem.setDisabled(true);
			        text.setDisabled(false);					
				}else{
			        cbItem.setDisabled(true);
			        text.setDisabled(true);					
				}
				
			}
		});
        
        
        
        
        
        form.setFields(radioGroupItem,cbItem,text,validate);
        
        
        winModal.addItem(form);  
        winModal.show();  

	}

	@Override
	public void onClick(MenuItemClickEvent event) {
		foo();
		
		
	}
	
	
}
