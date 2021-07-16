//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.16 at 10:37:58 AM BST 
//


package com.anstis.pmml.model.impl.v4_4;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="antecedent" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="consequent" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="support" use="required" type="{http://www.dmg.org/PMML-4_4}PROB-NUMBER" /&gt;
 *       &lt;attribute name="confidence" use="required" type="{http://www.dmg.org/PMML-4_4}PROB-NUMBER" /&gt;
 *       &lt;attribute name="lift" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="leverage" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="affinity" type="{http://www.dmg.org/PMML-4_4}PROB-NUMBER" /&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extension"
})
@XmlRootElement(name = "AssociationRule")
@JsType
@GWT3Export
public class AssociationRule {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "antecedent", required = true)
    protected String antecedent;
    @XmlAttribute(name = "consequent", required = true)
    protected String consequent;
    @XmlAttribute(name = "support", required = true)
    protected double support;
    @XmlAttribute(name = "confidence", required = true)
    protected double confidence;
    @XmlAttribute(name = "lift")
    protected Double lift;
    @XmlAttribute(name = "leverage")
    protected Double leverage;
    @XmlAttribute(name = "affinity")
    protected Double affinity;
    @XmlAttribute(name = "id")
    protected String id;

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
     * Gets the value of the antecedent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntecedent() {
        return antecedent;
    }

    /**
     * Sets the value of the antecedent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntecedent(String value) {
        this.antecedent = value;
    }

    /**
     * Gets the value of the consequent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsequent() {
        return consequent;
    }

    /**
     * Sets the value of the consequent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsequent(String value) {
        this.consequent = value;
    }

    /**
     * Gets the value of the support property.
     * 
     */
    public double getSupport() {
        return support;
    }

    /**
     * Sets the value of the support property.
     * 
     */
    public void setSupport(double value) {
        this.support = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     */
    public double getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     */
    public void setConfidence(double value) {
        this.confidence = value;
    }

    /**
     * Gets the value of the lift property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLift() {
        return lift;
    }

    /**
     * Sets the value of the lift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLift(Double value) {
        this.lift = value;
    }

    /**
     * Gets the value of the leverage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLeverage() {
        return leverage;
    }

    /**
     * Sets the value of the leverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLeverage(Double value) {
        this.leverage = value;
    }

    /**
     * Gets the value of the affinity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAffinity() {
        return affinity;
    }

    /**
     * Sets the value of the affinity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAffinity(Double value) {
        this.affinity = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}