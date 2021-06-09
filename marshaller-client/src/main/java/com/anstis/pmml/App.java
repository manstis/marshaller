package com.anstis.pmml;

import com.anstis.pmml.model.Header;
import com.anstis.pmml.model.PMML;
import com.anstis.pmml.model.PMML_XMLMapperImpl;
import com.anstis.pmml.model.Scorecard;
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
                // See https://github.com/treblereel/mapper-xml/issues/84
                // XmlElementRefs are no correctly deserialised
                final PMML pmml = mapper.read(Resources.INSTANCE.xml().getText());
                Window.alert(pmml.getHeader().getDescription());
            } catch (Exception e) {
                Window.alert(e.getMessage());
            }
        });

        final Button saveXMLButton = new Button("Save as XML");
        RootPanel.get("saveXMLButtonContainer").add(saveXMLButton);
        saveXMLButton.addClickHandler(clickEvent -> {
            final PMML_XMLMapperImpl mapper = new PMML_XMLMapperImpl();
            try {
                // See https://github.com/treblereel/mapper-xml/issues/84
                // XmlElementRefs are no correctly serialised
                final PMML pmml = new PMML();
                final Header header = new Header();
                header.setDescription("Test description");
                header.setCopyright("Test copyright");
                header.setModelVersion("Test");
                pmml.setHeader(header);

                final Scorecard scorecard = new Scorecard();
                pmml.getModel().add(scorecard);

                final String xml = mapper.write(pmml);
                Window.alert(xml);
            } catch (Exception e) {
                Window.alert(e.getMessage());
            }
        });
    }
}
