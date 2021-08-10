package com.anstis.pmml;

import javax.xml.stream.XMLStreamException;

import com.anstis.pmml.model.impl.v4_4.PMML;
import com.anstis.pmml.model.impl.v4_4.PMML_XMLMapperImpl;
import jsinterop.annotations.JsType;

@JsType
public class Loader {

    private static final PMML_XMLMapperImpl mapper = new PMML_XMLMapperImpl();

    public static PMML load(String xml) throws XMLStreamException {
        return mapper.read(xml);
    }

    public static String save(PMML pmml) throws XMLStreamException {
        return mapper.write(pmml);
    }
}
