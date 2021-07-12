package com.anstis.pmml;

import com.anstis.pmml.model.Header;
import com.anstis.pmml.model.PMML;
import com.anstis.pmml.model.PMML_XMLMapperImpl;
import com.anstis.pmml.model.Scorecard;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
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
                String xml = Resources.INSTANCE.xml().getText();
                final PMML pmml = mapper.read(xml);
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
                GWT.log(xml);
            } catch (Exception e) {
                Window.alert(e.getMessage());
            }
        });

        final Button roundTripXMLButtonButton = new Button("Roundtrip XML");
        RootPanel.get("roundTripXMLButtonContainer").add(roundTripXMLButtonButton);
        roundTripXMLButtonButton.addClickHandler(clickEvent -> {
            final PMML_XMLMapperImpl mapper = new PMML_XMLMapperImpl();
            try {
                final String read = Resources.INSTANCE.xml().getText();
                GWT.log("Read -->\n");
                GWT.log(read);
                final PMML pmml = mapper.read(read);
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
