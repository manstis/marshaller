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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ROCGraph"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="positiveTargetFieldValue" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="positiveTargetFieldDisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="negativeTargetFieldValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="negativeTargetFieldDisplayValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface ROC {


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
     * Gets the value of the rocGraph property.
     * 
     * @return
     *     possible object is
     *     {@link ROCGraph }
     *     
     */
    ROCGraph getROCGraph();

    /**
     * Sets the value of the rocGraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link ROCGraph }
     *     
     */
    void setROCGraph(ROCGraph value);

    /**
     * Gets the value of the positiveTargetFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPositiveTargetFieldValue();

    /**
     * Sets the value of the positiveTargetFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPositiveTargetFieldValue(String value);

    /**
     * Gets the value of the positiveTargetFieldDisplayValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPositiveTargetFieldDisplayValue();

    /**
     * Sets the value of the positiveTargetFieldDisplayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPositiveTargetFieldDisplayValue(String value);

    /**
     * Gets the value of the negativeTargetFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getNegativeTargetFieldValue();

    /**
     * Sets the value of the negativeTargetFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setNegativeTargetFieldValue(String value);

    /**
     * Gets the value of the negativeTargetFieldDisplayValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getNegativeTargetFieldDisplayValue();

    /**
     * Sets the value of the negativeTargetFieldDisplayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setNegativeTargetFieldDisplayValue(String value);

}
