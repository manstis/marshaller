//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.03 at 09:25:28 AM BST 
//


package com.anstis.pmml.model.impl.v4_4;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}CorrelationFields"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}CorrelationValues"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}CorrelationMethods" minOccurs="0"/&gt;
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
    "extension",
    "correlationFields",
    "correlationValues",
    "correlationMethods"
})
@XmlRootElement(name = "Correlations")
@JsType
@GWT3Export
public class Correlations {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "CorrelationFields", required = true)
    protected CorrelationFields correlationFields;
    @XmlElement(name = "CorrelationValues", required = true)
    protected CorrelationValues correlationValues;
    @XmlElement(name = "CorrelationMethods")
    protected CorrelationMethods correlationMethods;

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the correlationFields property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationFields }
     *     
     */
    public CorrelationFields getCorrelationFields() {
        return correlationFields;
    }

    /**
     * Sets the value of the correlationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationFields }
     *     
     */
    public void setCorrelationFields(CorrelationFields value) {
        this.correlationFields = value;
    }

    /**
     * Gets the value of the correlationValues property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationValues }
     *     
     */
    public CorrelationValues getCorrelationValues() {
        return correlationValues;
    }

    /**
     * Sets the value of the correlationValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationValues }
     *     
     */
    public void setCorrelationValues(CorrelationValues value) {
        this.correlationValues = value;
    }

    /**
     * Gets the value of the correlationMethods property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationMethods }
     *     
     */
    public CorrelationMethods getCorrelationMethods() {
        return correlationMethods;
    }

    /**
     * Sets the value of the correlationMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationMethods }
     *     
     */
    public void setCorrelationMethods(CorrelationMethods value) {
        this.correlationMethods = value;
    }

}
