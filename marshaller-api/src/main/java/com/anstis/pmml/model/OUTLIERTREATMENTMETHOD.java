//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.14 at 12:47:30 PM UTC 
//

package com.anstis.pmml.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for OUTLIER-TREATMENT-METHOD.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OUTLIER-TREATMENT-METHOD"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="asIs"/&gt;
 *     &lt;enumeration value="asMissingValues"/&gt;
 *     &lt;enumeration value="asExtremeValues"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "OUTLIER-TREATMENT-METHOD")
@XmlEnum
public enum OUTLIERTREATMENTMETHOD {

    @XmlEnumValue("asIs")
    AS_IS("asIs"),
    @XmlEnumValue("asMissingValues")
    AS_MISSING_VALUES("asMissingValues"),
    @XmlEnumValue("asExtremeValues")
    AS_EXTREME_VALUES("asExtremeValues");
    private final String value;

    OUTLIERTREATMENTMETHOD(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OUTLIERTREATMENTMETHOD fromValue(String v) {
        for (OUTLIERTREATMENTMETHOD c : OUTLIERTREATMENTMETHOD.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
