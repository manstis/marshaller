//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.16 at 10:37:58 AM BST 
//


package com.anstis.pmml.model.impl.v4_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import jsinterop.annotations.JsType;
import org.treblereel.j2cl.processors.annotations.GWT3Export;

/**
 * <p>Java class for SVM-REPRESENTATION.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SVM-REPRESENTATION"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SupportVectors"/&gt;
 *     &lt;enumeration value="Coefficients"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SVM-REPRESENTATION")
@XmlEnum
@JsType
@GWT3Export
public enum SVMREPRESENTATION {

    @XmlEnumValue("SupportVectors")
    SUPPORT_VECTORS("SupportVectors"),
    @XmlEnumValue("Coefficients")
    COEFFICIENTS("Coefficients");
    private final String value;

    SVMREPRESENTATION(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SVMREPRESENTATION fromValue(String v) {
        for (SVMREPRESENTATION c: SVMREPRESENTATION.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}