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

import jsinterop.annotations.JsType;
import org.treblereel.j2cl.processors.annotations.GWT3Export;

/**
 * <p>Java class for ALGORITHM-TYPE.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ALGORITHM-TYPE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="iforest"/&gt;
 *     &lt;enumeration value="ocsvm"/&gt;
 *     &lt;enumeration value="clusterMeanDist"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "ALGORITHM-TYPE")
@XmlEnum
@JsType
@GWT3Export
public enum ALGORITHMTYPE {

    @XmlEnumValue("iforest")
    IFOREST("iforest"),
    @XmlEnumValue("ocsvm")
    OCSVM("ocsvm"),
    @XmlEnumValue("clusterMeanDist")
    CLUSTER_MEAN_DIST("clusterMeanDist"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ALGORITHMTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ALGORITHMTYPE fromValue(String v) {
        for (ALGORITHMTYPE c : ALGORITHMTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
