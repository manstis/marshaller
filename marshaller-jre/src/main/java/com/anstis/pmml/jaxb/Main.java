package com.anstis.pmml.jaxb;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.anstis.pmml.model.Attribute;
import com.anstis.pmml.model.PMML;
import com.anstis.pmml.model.SimplePredicate;

public class Main {

    public static void main(String[] args) throws Exception {
        JAXBContext context = JAXBContext.newInstance(PMML.class);

        PMML pmml = testPMMLUnmarshalling(context);
        testPMMLMarshalling(context, pmml);

        testAttributeSimplePredicateMarshalling();
    }

    private static PMML testPMMLUnmarshalling(JAXBContext context) throws Exception {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        InputStream in = Main.class.getResourceAsStream("/jaxb/pmml.xml");
        PMML pmml = (PMML) unmarshaller.unmarshal(in);
        return pmml;
    }

    private static void testPMMLMarshalling(JAXBContext context, PMML pmml) throws Exception {
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(pmml, System.out);
    }

    //See https://github.com/treblereel/mapper-xml/issues/84#issuecomment-873138776
    private static void testAttributeSimplePredicateMarshalling() throws Exception {
        Attribute attribute = new Attribute();
        SimplePredicate simplePredicate = new SimplePredicate();
        attribute.setPredicate(simplePredicate);

        JAXBContext context = JAXBContext.newInstance(Attribute.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(attribute, System.out);
    }
}
