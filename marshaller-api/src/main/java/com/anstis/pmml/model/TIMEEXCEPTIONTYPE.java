//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.01 at 10:52:05 AM BST 
//


package com.anstis.pmml.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import jsinterop.annotations.JsType;
import org.treblereel.j2cl.processors.annotations.GWT3Export;

/**
 * <p>Java class for TIME-EXCEPTION-TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TIME-EXCEPTION-TYPE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="exclude"/&gt;
 *     &lt;enumeration value="include"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TIME-EXCEPTION-TYPE")
@XmlEnum
@JsType
@GWT3Export
public enum TIMEEXCEPTIONTYPE {

    @XmlEnumValue("exclude")
    EXCLUDE("exclude"),
    @XmlEnumValue("include")
    INCLUDE("include");
    private final String value;

    TIMEEXCEPTIONTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TIMEEXCEPTIONTYPE fromValue(String v) {
        for (TIMEEXCEPTIONTYPE c: TIMEEXCEPTIONTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
