//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.03 at 09:25:28 AM BST 
//


package com.anstis.pmml.model.impl.v4_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import jsinterop.annotations.JsType;
import org.treblereel.j2cl.processors.annotations.GWT3Export;

/**
 * <p>Java class for GAP.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GAP"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="true"/&gt;
 *     &lt;enumeration value="false"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GAP")
@XmlEnum
@JsType
@GWT3Export
public enum GAP {

    @XmlEnumValue("true")
    TRUE("true"),
    @XmlEnumValue("false")
    FALSE("false"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    GAP(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GAP fromValue(String v) {
        for (GAP c: GAP.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
