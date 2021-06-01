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
 * <p>Java class for RULE-FEATURE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RULE-FEATURE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="antecedent"/&gt;
 *     &lt;enumeration value="consequent"/&gt;
 *     &lt;enumeration value="rule"/&gt;
 *     &lt;enumeration value="ruleId"/&gt;
 *     &lt;enumeration value="confidence"/&gt;
 *     &lt;enumeration value="support"/&gt;
 *     &lt;enumeration value="lift"/&gt;
 *     &lt;enumeration value="leverage"/&gt;
 *     &lt;enumeration value="affinity"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RULE-FEATURE")
@XmlEnum
@JsType
@GWT3Export
public enum RULEFEATURE {

    @XmlEnumValue("antecedent")
    ANTECEDENT("antecedent"),
    @XmlEnumValue("consequent")
    CONSEQUENT("consequent"),
    @XmlEnumValue("rule")
    RULE("rule"),
    @XmlEnumValue("ruleId")
    RULE_ID("ruleId"),
    @XmlEnumValue("confidence")
    CONFIDENCE("confidence"),
    @XmlEnumValue("support")
    SUPPORT("support"),
    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("leverage")
    LEVERAGE("leverage"),
    @XmlEnumValue("affinity")
    AFFINITY("affinity");
    private final String value;

    RULEFEATURE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RULEFEATURE fromValue(String v) {
        for (RULEFEATURE c: RULEFEATURE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
