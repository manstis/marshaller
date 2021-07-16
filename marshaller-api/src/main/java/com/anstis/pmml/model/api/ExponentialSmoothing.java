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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Level"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Trend_ExpoSmooth" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Seasonality_ExpoSmooth" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}TimeValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RMSE" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *       &lt;attribute name="transformation" default="none"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="none"/&gt;
 *             &lt;enumeration value="logarithmic"/&gt;
 *             &lt;enumeration value="squareroot"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface ExponentialSmoothing {


    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Level }
     *     
     */
    Level getLevel();

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Level }
     *     
     */
    void setLevel(Level value);

    /**
     * Gets the value of the trendExpoSmooth property.
     * 
     * @return
     *     possible object is
     *     {@link TrendExpoSmooth }
     *     
     */
    TrendExpoSmooth getTrendExpoSmooth();

    /**
     * Sets the value of the trendExpoSmooth property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrendExpoSmooth }
     *     
     */
    void setTrendExpoSmooth(TrendExpoSmooth value);

    /**
     * Gets the value of the seasonalityExpoSmooth property.
     * 
     * @return
     *     possible object is
     *     {@link SeasonalityExpoSmooth }
     *     
     */
    SeasonalityExpoSmooth getSeasonalityExpoSmooth();

    /**
     * Sets the value of the seasonalityExpoSmooth property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeasonalityExpoSmooth }
     *     
     */
    void setSeasonalityExpoSmooth(SeasonalityExpoSmooth value);

    /**
     * Gets the value of the timeValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeValue }
     * 
     * 
     */
    List<TimeValue> getTimeValue();

    /**
     * Gets the value of the rmse property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    Double getRMSE();

    /**
     * Sets the value of the rmse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    void setRMSE(Double value);

    /**
     * Gets the value of the transformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTransformation();

    /**
     * Sets the value of the transformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTransformation(String value);

}
