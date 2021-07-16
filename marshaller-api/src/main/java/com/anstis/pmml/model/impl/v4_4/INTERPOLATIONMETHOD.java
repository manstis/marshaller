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
 * <p>Java class for INTERPOLATION-METHOD.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="INTERPOLATION-METHOD"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="linear"/&gt;
 *     &lt;enumeration value="exponentialSpline"/&gt;
 *     &lt;enumeration value="cubicSpline"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "INTERPOLATION-METHOD")
@XmlEnum
@JsType
@GWT3Export
public enum INTERPOLATIONMETHOD {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("linear")
    LINEAR("linear"),
    @XmlEnumValue("exponentialSpline")
    EXPONENTIAL_SPLINE("exponentialSpline"),
    @XmlEnumValue("cubicSpline")
    CUBIC_SPLINE("cubicSpline");
    private final String value;

    INTERPOLATIONMETHOD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static INTERPOLATIONMETHOD fromValue(String v) {
        for (INTERPOLATIONMETHOD c: INTERPOLATIONMETHOD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
