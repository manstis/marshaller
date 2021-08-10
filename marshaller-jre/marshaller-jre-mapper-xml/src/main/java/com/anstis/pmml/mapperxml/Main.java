package com.anstis.pmml.mapperxml;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import com.anstis.pmml.model.impl.v4_4.PMML;
import com.anstis.pmml.model.impl.v4_4.PMML_XMLMapperImpl;

public class Main {

    private static final PMML_XMLMapperImpl mapper = new PMML_XMLMapperImpl();

    public static void main(String[] args) throws Exception {
        PMML pmml = testPMMLUnmarshalling();
        System.out.println(testPMMLMarshalling(pmml));
    }

    private static PMML testPMMLUnmarshalling() throws Exception {
        InputStream in = Main.class.getResourceAsStream("/jaxb/pmml.xml");
        String xml = new BufferedReader(new InputStreamReader(in))
                .lines().collect(Collectors.joining("\n"));
        PMML pmml = mapper.read(xml);
        return pmml;
    }

    private static String testPMMLMarshalling(PMML pmml) throws Exception {
        return mapper.write(pmml);
    }
}
