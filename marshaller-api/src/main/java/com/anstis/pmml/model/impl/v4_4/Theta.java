//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.16 at 10:37:58 AM BST 
//


package com.anstis.pmml.model.impl.v4_4;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="i" type="{http://www.dmg.org/PMML-4_4}INT-NUMBER" /&gt;
 *       &lt;attribute name="j" type="{http://www.dmg.org/PMML-4_4}INT-NUMBER" /&gt;
 *       &lt;attribute name="theta" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Theta")
@JsType
@GWT3Export
public class Theta {

    @XmlAttribute(name = "i")
    protected BigInteger i;
    @XmlAttribute(name = "j")
    protected BigInteger j;
    @XmlAttribute(name = "theta")
    protected Double theta;

    /**
     * Gets the value of the i property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getI() {
        return i;
    }

    /**
     * Sets the value of the i property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setI(BigInteger value) {
        this.i = value;
    }

    /**
     * Gets the value of the j property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJ() {
        return j;
    }

    /**
     * Sets the value of the j property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJ(BigInteger value) {
        this.j = value;
    }

    /**
     * Gets the value of the theta property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTheta() {
        return theta;
    }

    /**
     * Sets the value of the theta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTheta(Double value) {
        this.theta = value;
    }

}