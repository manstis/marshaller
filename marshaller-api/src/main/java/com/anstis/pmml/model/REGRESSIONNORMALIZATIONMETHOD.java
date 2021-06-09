//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.09 at 01:19:52 PM BST 
//


package com.anstis.pmml.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import jsinterop.annotations.JsType;
import org.treblereel.j2cl.processors.annotations.GWT3Export;

/**
 * <p>Java class for REGRESSIONNORMALIZATIONMETHOD.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="REGRESSIONNORMALIZATIONMETHOD"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="simplemax"/&gt;
 *     &lt;enumeration value="softmax"/&gt;
 *     &lt;enumeration value="logit"/&gt;
 *     &lt;enumeration value="probit"/&gt;
 *     &lt;enumeration value="cloglog"/&gt;
 *     &lt;enumeration value="exp"/&gt;
 *     &lt;enumeration value="loglog"/&gt;
 *     &lt;enumeration value="cauchit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "REGRESSIONNORMALIZATIONMETHOD")
@XmlEnum
@JsType
@GWT3Export
public enum REGRESSIONNORMALIZATIONMETHOD {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("simplemax")
    SIMPLEMAX("simplemax"),
    @XmlEnumValue("softmax")
    SOFTMAX("softmax"),
    @XmlEnumValue("logit")
    LOGIT("logit"),
    @XmlEnumValue("probit")
    PROBIT("probit"),
    @XmlEnumValue("cloglog")
    CLOGLOG("cloglog"),
    @XmlEnumValue("exp")
    EXP("exp"),
    @XmlEnumValue("loglog")
    LOGLOG("loglog"),
    @XmlEnumValue("cauchit")
    CAUCHIT("cauchit");
    private final String value;

    REGRESSIONNORMALIZATIONMETHOD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static REGRESSIONNORMALIZATIONMETHOD fromValue(String v) {
        for (REGRESSIONNORMALIZATIONMETHOD c: REGRESSIONNORMALIZATIONMETHOD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
