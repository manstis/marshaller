package com.anstis.pmml;

import com.anstis.pmml.model.impl.v4_4.PMML_XMLMapperImpl;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class App implements EntryPoint {

    private static final PMML_XMLMapperImpl mapper = new PMML_XMLMapperImpl();

    public void onModuleLoad() {
        final Button showXMLButton = new Button("Show XML");
        RootPanel.get("showXMLButtonContainer").add(showXMLButton);
        showXMLButton.addClickHandler(clickEvent -> Window.alert(Resources.INSTANCE.xml().getText()));

        final Button loadXMLButton = new Button("Load XML");
        RootPanel.get("loadXMLButtonContainer").add(loadXMLButton);
        loadXMLButton.addClickHandler(clickEvent -> {
            try {
                String xml = Resources.INSTANCE.xml().getText();
                final com.anstis.pmml.model.api.PMML pmml = mapper.read(xml);
                Window.alert(pmml.getHeader().getDescription());
                GWT.log(xml);
            } catch (Exception e) {
                Window.alert(e.getMessage());
            }
        });

        final Button saveXMLButton = new Button("Save as XML");
        RootPanel.get("saveXMLButtonContainer").add(saveXMLButton);
        saveXMLButton.addClickHandler(clickEvent -> {
            final PMML_XMLMapperImpl mapper = new PMML_XMLMapperImpl();
            try {
                final com.anstis.pmml.model.impl.v4_4.PMML pmml = new com.anstis.pmml.model.impl.v4_4.PMML();
                final com.anstis.pmml.model.api.Header header = new com.anstis.pmml.model.impl.v4_4.Header();
                header.setDescription("Test description");
                header.setCopyright("Test copyright");
                header.setModelVersion("Test");
                pmml.setHeader(header);

                // See https://issues.redhat.com/browse/KOGITO-5640
                // For now we need to use the concrete class type and not the interface
                final com.anstis.pmml.model.impl.v4_4.Scorecard scorecard = new com.anstis.pmml.model.impl.v4_4.Scorecard();
                pmml.getModel().add(scorecard);

                final String xml = mapper.write(pmml);
                Window.alert(xml);
                GWT.log(xml);
            } catch (Exception e) {
                Window.alert(e.getMessage());
            }
        });

        final Button roundTripXMLButtonButton = new Button("Roundtrip XML");
        RootPanel.get("roundTripXMLButtonContainer").add(roundTripXMLButtonButton);
        roundTripXMLButtonButton.addClickHandler(clickEvent -> {
            try {
                final String read = Resources.INSTANCE.xml().getText();
                GWT.log("Read -->\n");
                GWT.log(read);
                final com.anstis.pmml.model.impl.v4_4.PMML pmml = mapper.read(read);
                Window.alert(pmml.getHeader().getDescription());

                final String written = mapper.write(pmml);
                Window.alert(written);
                GWT.log("Written -->\n");
                GWT.log(written);
            } catch (Exception e) {
                Window.alert(e.getMessage());
            }
        });
    }
}
