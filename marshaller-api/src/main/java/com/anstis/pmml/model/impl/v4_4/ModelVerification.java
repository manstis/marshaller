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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}VerificationFields"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}InlineTable"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="recordCount" type="{http://www.dmg.org/PMML-4_4}INT-NUMBER" /&gt;
 *       &lt;attribute name="fieldCount" type="{http://www.dmg.org/PMML-4_4}INT-NUMBER" /&gt;
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
    "verificationFields",
    "inlineTable"
})
@XmlRootElement(name = "ModelVerification")
@JsType
@GWT3Export
public class ModelVerification
    implements com.anstis.pmml.model.api.ModelVerification
{

    @XmlElement(name = "Extension", type = Extension.class)
    protected List<com.anstis.pmml.model.api.Extension> extension;
    @XmlElement(name = "VerificationFields", required = true, type = VerificationFields.class)
    protected com.anstis.pmml.model.api.VerificationFields verificationFields;
    @XmlElement(name = "InlineTable", required = true, type = InlineTable.class)
    protected com.anstis.pmml.model.api.InlineTable inlineTable;
    @XmlAttribute(name = "recordCount")
    protected BigInteger recordCount;
    @XmlAttribute(name = "fieldCount")
    protected BigInteger fieldCount;

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
    public List<com.anstis.pmml.model.api.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<com.anstis.pmml.model.api.Extension>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the verificationFields property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationFields }
     *     
     */
    public com.anstis.pmml.model.api.VerificationFields getVerificationFields() {
        return verificationFields;
    }

    /**
     * Sets the value of the verificationFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationFields }
     *     
     */
    public void setVerificationFields(com.anstis.pmml.model.api.VerificationFields value) {
        this.verificationFields = value;
    }

    /**
     * Gets the value of the inlineTable property.
     * 
     * @return
     *     possible object is
     *     {@link InlineTable }
     *     
     */
    public com.anstis.pmml.model.api.InlineTable getInlineTable() {
        return inlineTable;
    }

    /**
     * Sets the value of the inlineTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link InlineTable }
     *     
     */
    public void setInlineTable(com.anstis.pmml.model.api.InlineTable value) {
        this.inlineTable = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordCount(BigInteger value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the fieldCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFieldCount() {
        return fieldCount;
    }

    /**
     * Sets the value of the fieldCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFieldCount(BigInteger value) {
        this.fieldCount = value;
    }

}
