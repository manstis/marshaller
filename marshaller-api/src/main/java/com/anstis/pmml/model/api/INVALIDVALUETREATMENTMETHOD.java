//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.03 at 09:25:22 AM BST 
//


package com.anstis.pmml.model.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for INVALID-VALUE-TREATMENT-METHOD.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="INVALID-VALUE-TREATMENT-METHOD"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="returnInvalid"/&gt;
 *     &lt;enumeration value="asIs"/&gt;
 *     &lt;enumeration value="asMissing"/&gt;
 *     &lt;enumeration value="asValue"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "INVALID-VALUE-TREATMENT-METHOD")
@XmlEnum
public enum INVALIDVALUETREATMENTMETHOD {

    @XmlEnumValue("returnInvalid")
    RETURN_INVALID("returnInvalid"),
    @XmlEnumValue("asIs")
    AS_IS("asIs"),
    @XmlEnumValue("asMissing")
    AS_MISSING("asMissing"),
    @XmlEnumValue("asValue")
    AS_VALUE("asValue");
    private final String value;

    INVALIDVALUETREATMENTMETHOD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static INVALIDVALUETREATMENTMETHOD fromValue(String v) {
        for (INVALIDVALUETREATMENTMETHOD c: INVALIDVALUETREATMENTMETHOD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
