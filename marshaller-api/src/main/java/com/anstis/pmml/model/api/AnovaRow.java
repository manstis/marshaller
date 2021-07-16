//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.16 at 10:37:52 AM BST 
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
 *       &lt;attribute name="type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Model"/&gt;
 *             &lt;enumeration value="Error"/&gt;
 *             &lt;enumeration value="Total"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="sumOfSquares" use="required" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="degreesOfFreedom" use="required" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="meanOfSquares" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="fValue" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="pValue" type="{http://www.dmg.org/PMML-4_4}PROB-NUMBER" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface AnovaRow {


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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getType();

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setType(String value);

    /**
     * Gets the value of the sumOfSquares property.
     * 
     */
    double getSumOfSquares();

    /**
     * Sets the value of the sumOfSquares property.
     * 
     */
    void setSumOfSquares(double value);

    /**
     * Gets the value of the degreesOfFreedom property.
     * 
     */
    double getDegreesOfFreedom();

    /**
     * Sets the value of the degreesOfFreedom property.
     * 
     */
    void setDegreesOfFreedom(double value);

    /**
     * Gets the value of the meanOfSquares property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    Double getMeanOfSquares();

    /**
     * Sets the value of the meanOfSquares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    void setMeanOfSquares(Double value);

    /**
     * Gets the value of the fValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    Double getFValue();

    /**
     * Sets the value of the fValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    void setFValue(Double value);

    /**
     * Gets the value of the pValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    Double getPValue();

    /**
     * Sets the value of the pValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    void setPValue(Double value);

}
