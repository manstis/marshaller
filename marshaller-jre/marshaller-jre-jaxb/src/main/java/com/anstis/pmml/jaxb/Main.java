package com.anstis.pmml.jaxb;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.anstis.pmml.model.impl.v4_4.Attribute;
import com.anstis.pmml.model.impl.v4_4.DataField;
import com.anstis.pmml.model.impl.v4_4.PMML;

public class Main {

    public static void main(String[] args) throws Exception {
        JAXBContext pmmlContext = JAXBContext.newInstance(PMML.class);
        PMML pmml = testPMMLUnmarshalling(pmmlContext);
        testPMMLMarshalling(pmmlContext, pmml);

        JAXBContext attributeContext = JAXBContext.newInstance(Attribute.class);
        Attribute attribute = testAttributeSimplePredicateUnmarshalling(attributeContext);
        testAttributeSimplePredicateMarshalling(attributeContext, attribute);

        JAXBContext dataFieldContext = JAXBContext.newInstance(DataField.class);
        DataField dataField = testDataFieldDefaultAttributeUnmarshalling(dataFieldContext);
        testDataFieldDefaultAttributeMarshalling(dataFieldContext, dataField);
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
    private static Attribute testAttributeSimplePredicateUnmarshalling(JAXBContext context) throws Exception {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        InputStream in = Main.class.getResourceAsStream("/jaxb/attribute.xml");
        Attribute attribute = (Attribute) unmarshaller.unmarshal(in);
        return attribute;
    }

    //See https://github.com/treblereel/mapper-xml/issues/84#issuecomment-873138776
    private static void testAttributeSimplePredicateMarshalling(JAXBContext context, Attribute attribute) throws Exception {
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(attribute, System.out);
    }

    //See https://issues.redhat.com/browse/KOGITO-5499
    private static DataField testDataFieldDefaultAttributeUnmarshalling(JAXBContext context) throws Exception {
        Unmarshaller unmarshaller = context.createUnmarshaller();
        InputStream in = Main.class.getResourceAsStream("/jaxb/dataField.xml");
        DataField dataField = (DataField) unmarshaller.unmarshal(in);
        return dataField;
    }

    //See https://issues.redhat.com/browse/KOGITO-5499
    private static void testDataFieldDefaultAttributeMarshalling(JAXBContext context, DataField dataField) throws Exception {
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(dataField, System.out);
    }
}
