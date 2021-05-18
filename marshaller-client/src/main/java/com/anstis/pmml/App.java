package com.anstis.pmml;

import com.anstis.pmml.model.PMML;
import com.anstis.pmml.model.PMML_XMLMapperImpl;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class App implements EntryPoint {

    public void onModuleLoad() {
        final Button showXMLButton = new Button("Show XML");
        RootPanel.get("showXMLButtonContainer").add(showXMLButton);
        showXMLButton.addClickHandler(clickEvent -> Window.alert(Resources.INSTANCE.xml().getText()));

        final Button loadXMLButton = new Button("Load XML");
        RootPanel.get("loadXMLButtonContainer").add(loadXMLButton);
        loadXMLButton.addClickHandler(clickEvent -> {
            final PMML_XMLMapperImpl mapper = new PMML_XMLMapperImpl();
            try {
                final PMML pmml = mapper.read(Resources.INSTANCE.xml().getText());
                Window.alert(pmml.getHeader().getDescription());
            } catch (Exception e) {
                Window.alert(e.getMessage());
            }
        });
    }
}
