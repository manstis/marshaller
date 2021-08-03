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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}TimeAnchor" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}TimeValue" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="usage" type="{http://www.dmg.org/PMML-4_4}TIMESERIES-USAGE" default="original" /&gt;
 *       &lt;attribute name="startTime" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *       &lt;attribute name="endTime" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *       &lt;attribute name="interpolationMethod" type="{http://www.dmg.org/PMML-4_4}INTERPOLATION-METHOD" default="none" /&gt;
 *       &lt;attribute name="field" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface TimeSeries {


    /**
     * Gets the value of the timeAnchor property.
     * 
     * @return
     *     possible object is
     *     {@link TimeAnchor }
     *     
     */
    TimeAnchor getTimeAnchor();

    /**
     * Sets the value of the timeAnchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeAnchor }
     *     
     */
    void setTimeAnchor(TimeAnchor value);

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
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link TIMESERIESUSAGE }
     *     
     */
    TIMESERIESUSAGE getUsage();

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIMESERIESUSAGE }
     *     
     */
    void setUsage(TIMESERIESUSAGE value);

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    Double getStartTime();

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    void setStartTime(Double value);

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    Double getEndTime();

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    void setEndTime(Double value);

    /**
     * Gets the value of the interpolationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link INTERPOLATIONMETHOD }
     *     
     */
    INTERPOLATIONMETHOD getInterpolationMethod();

    /**
     * Sets the value of the interpolationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link INTERPOLATIONMETHOD }
     *     
     */
    void setInterpolationMethod(INTERPOLATIONMETHOD value);

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

}
