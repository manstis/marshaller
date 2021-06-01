package com.anstis.pmml.jaxb;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.anstis.pmml.model.PMML;

public class Main {

    public static void main(String[] args) throws Exception {
        JAXBContext context = JAXBContext.newInstance(PMML.class);

        PMML pmml = unmarshall(context);

        marshall(context, pmml);
    }

    private static PMML unmarshall(JAXBContext context) throws Exception {
        Unmarshaller unmarshaller = context.createUnmarshaller();

        InputStream in = Main.class.getResourceAsStream("/jaxb/pmml.xml");
        PMML pmml = (PMML) unmarshaller.unmarshal(in);

        return pmml;
    }

    private static void marshall(JAXBContext context, PMML pmml) throws Exception {
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(pmml, System.out);
    }
}
