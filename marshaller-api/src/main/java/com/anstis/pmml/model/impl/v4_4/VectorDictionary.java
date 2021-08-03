//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.03 at 09:25:28 AM BST 
//


package com.anstis.pmml.model.impl.v4_4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}VectorFields"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}VectorInstance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="numberOfVectors" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
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
    "vectorFields",
    "vectorInstance"
})
@XmlRootElement(name = "VectorDictionary")
@JsType
@GWT3Export
public class VectorDictionary {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "VectorFields", required = true)
    protected VectorFields vectorFields;
    @XmlElement(name = "VectorInstance")
    protected List<VectorInstance> vectorInstance;
    @XmlAttribute(name = "numberOfVectors")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfVectors;

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
     * Gets the value of the vectorFields property.
     * 
     * @return
     *     possible object is
     *     {@link VectorFields }
     *     
     */
    public VectorFields getVectorFields() {
        return vectorFields;
    }

    /**
     * Sets the value of the vectorFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link VectorFields }
     *     
     */
    public void setVectorFields(VectorFields value) {
        this.vectorFields = value;
    }

    /**
     * Gets the value of the vectorInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vectorInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVectorInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VectorInstance }
     * 
     * 
     */
    public List<VectorInstance> getVectorInstance() {
        if (vectorInstance == null) {
            vectorInstance = new ArrayList<VectorInstance>();
        }
        return this.vectorInstance;
    }

    /**
     * Gets the value of the numberOfVectors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVectors() {
        return numberOfVectors;
    }

    /**
     * Sets the value of the numberOfVectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVectors(BigInteger value) {
        this.numberOfVectors = value;
    }

}
