//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.09 at 01:19:52 PM BST 
//


package com.anstis.pmml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}REAL-ARRAY"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "realarray"
})
@XmlRootElement(name = "FinalPredictedNoise")
@JsType
@GWT3Export
public class FinalPredictedNoise {

    @XmlElement(name = "REAL-ARRAY", required = true)
    protected REALARRAY realarray;

    /**
     * Gets the value of the realarray property.
     * 
     * @return
     *     possible object is
     *     {@link REALARRAY }
     *     
     */
    public REALARRAY getREALARRAY() {
        return realarray;
    }

    /**
     * Sets the value of the realarray property.
     * 
     * @param value
     *     allowed object is
     *     {@link REALARRAY }
     *     
     */
    public void setREALARRAY(REALARRAY value) {
        this.realarray = value;
    }

}
