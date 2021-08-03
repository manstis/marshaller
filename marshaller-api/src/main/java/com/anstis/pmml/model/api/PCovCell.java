//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.03 at 09:25:22 AM BST 
//


package com.anstis.pmml.model.api;

import java.util.List;

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
 *       &lt;attribute name="pRow" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="pCol" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tRow" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="tCol" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="value" use="required" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *       &lt;attribute name="targetCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface PCovCell {


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
    List<Extension> getExtension();

    /**
     * Gets the value of the pRow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPRow();

    /**
     * Sets the value of the pRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPRow(String value);

    /**
     * Gets the value of the pCol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPCol();

    /**
     * Sets the value of the pCol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPCol(String value);

    /**
     * Gets the value of the tRow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTRow();

    /**
     * Sets the value of the tRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTRow(String value);

    /**
     * Gets the value of the tCol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTCol();

    /**
     * Sets the value of the tCol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTCol(String value);

    /**
     * Gets the value of the value property.
     * 
     */
    double getValue();

    /**
     * Sets the value of the value property.
     * 
     */
    void setValue(double value);

    /**
     * Gets the value of the targetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTargetCategory();

    /**
     * Sets the value of the targetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTargetCategory(String value);

}
