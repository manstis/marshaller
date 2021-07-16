//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.16 at 10:37:52 AM BST 
//


package com.anstis.pmml.model.api;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Baseline"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Alternate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="field" use="required" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *       &lt;attribute name="testStatistic" use="required" type="{http://www.dmg.org/PMML-4_4}BASELINE-TEST-STATISTIC" /&gt;
 *       &lt;attribute name="resetValue" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" default="0.0" /&gt;
 *       &lt;attribute name="windowSize" type="{http://www.dmg.org/PMML-4_4}INT-NUMBER" default="0" /&gt;
 *       &lt;attribute name="weightField" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *       &lt;attribute name="normalizationScheme" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface TestDistributions {


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
     * Gets the value of the baseline property.
     * 
     * @return
     *     possible object is
     *     {@link Baseline }
     *     
     */
    Baseline getBaseline();

    /**
     * Sets the value of the baseline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Baseline }
     *     
     */
    void setBaseline(Baseline value);

    /**
     * Gets the value of the alternate property.
     * 
     * @return
     *     possible object is
     *     {@link Alternate }
     *     
     */
    Alternate getAlternate();

    /**
     * Sets the value of the alternate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Alternate }
     *     
     */
    void setAlternate(Alternate value);

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getField();

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setField(String value);

    /**
     * Gets the value of the testStatistic property.
     * 
     * @return
     *     possible object is
     *     {@link BASELINETESTSTATISTIC }
     *     
     */
    BASELINETESTSTATISTIC getTestStatistic();

    /**
     * Sets the value of the testStatistic property.
     * 
     * @param value
     *     allowed object is
     *     {@link BASELINETESTSTATISTIC }
     *     
     */
    void setTestStatistic(BASELINETESTSTATISTIC value);

    /**
     * Gets the value of the resetValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    double getResetValue();

    /**
     * Sets the value of the resetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    void setResetValue(Double value);

    /**
     * Gets the value of the windowSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    BigInteger getWindowSize();

    /**
     * Sets the value of the windowSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    void setWindowSize(BigInteger value);

    /**
     * Gets the value of the weightField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getWeightField();

    /**
     * Sets the value of the weightField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setWeightField(String value);

    /**
     * Gets the value of the normalizationScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getNormalizationScheme();

    /**
     * Sets the value of the normalizationScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setNormalizationScheme(String value);

}
