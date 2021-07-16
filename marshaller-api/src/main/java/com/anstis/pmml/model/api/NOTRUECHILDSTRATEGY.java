//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.16 at 10:37:52 AM BST 
//


package com.anstis.pmml.model.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for NO-TRUE-CHILD-STRATEGY.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NO-TRUE-CHILD-STRATEGY"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="returnNullPrediction"/&gt;
 *     &lt;enumeration value="returnLastPrediction"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NO-TRUE-CHILD-STRATEGY")
@XmlEnum
public enum NOTRUECHILDSTRATEGY {

    @XmlEnumValue("returnNullPrediction")
    RETURN_NULL_PREDICTION("returnNullPrediction"),
    @XmlEnumValue("returnLastPrediction")
    RETURN_LAST_PREDICTION("returnLastPrediction");
    private final String value;

    NOTRUECHILDSTRATEGY(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NOTRUECHILDSTRATEGY fromValue(String v) {
        for (NOTRUECHILDSTRATEGY c: NOTRUECHILDSTRATEGY.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
