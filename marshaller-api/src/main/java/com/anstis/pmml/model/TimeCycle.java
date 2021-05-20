//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.14 at 12:47:30 PM UTC 
//

package com.anstis.pmml.model;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import jsinterop.annotations.JsType;
import org.treblereel.j2cl.processors.annotations.GWT3Export;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.dmg.org/PMML-4_4}INT-ARRAY" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="length" type="{http://www.dmg.org/PMML-4_4}INT-NUMBER" /&gt;
 *       &lt;attribute name="type" type="{http://www.dmg.org/PMML-4_4}VALID-TIME-SPEC" /&gt;
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "array"
})
@XmlRootElement(name = "TimeCycle")
@JsType
@GWT3Export
public class TimeCycle {

    @XmlElement(name = "Array")
    protected ArrayType array;
    @XmlAttribute(name = "length")
    protected BigInteger length;
    @XmlAttribute(name = "type")
    protected VALIDTIMESPEC type;
    @XmlAttribute(name = "displayName")
    protected String displayName;

    /**
     * Gets the value of the array property.
     *
     * @return possible object is
     * {@link ArrayType }
     */
    public ArrayType getArray() {
        return array;
    }

    /**
     * Sets the value of the array property.
     *
     * @param value allowed object is
     *              {@link ArrayType }
     */
    public void setArray(ArrayType value) {
        this.array = value;
    }

    /**
     * Gets the value of the length property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link VALIDTIMESPEC }
     */
    public VALIDTIMESPEC getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link VALIDTIMESPEC }
     */
    public void setType(VALIDTIMESPEC value) {
        this.type = value;
    }

    /**
     * Gets the value of the displayName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }
}
