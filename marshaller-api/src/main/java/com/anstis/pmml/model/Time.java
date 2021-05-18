//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.14 at 12:47:30 PM UTC 
//

package com.anstis.pmml.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *       &lt;attribute name="min" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="max" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="mean" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="standardDeviation" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "extension"
})
@XmlRootElement(name = "Time")
public class Time implements ISequence {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlAttribute(name = "min")
    protected Double min;
    @XmlAttribute(name = "max")
    protected Double max;
    @XmlAttribute(name = "mean")
    protected Double mean;
    @XmlAttribute(name = "standardDeviation")
    protected Double standardDeviation;

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
     */
    public List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the min property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setMin(Double value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setMax(Double value) {
        this.max = value;
    }

    /**
     * Gets the value of the mean property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getMean() {
        return mean;
    }

    /**
     * Sets the value of the mean property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setMean(Double value) {
        this.mean = value;
    }

    /**
     * Gets the value of the standardDeviation property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getStandardDeviation() {
        return standardDeviation;
    }

    /**
     * Sets the value of the standardDeviation property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setStandardDeviation(Double value) {
        this.standardDeviation = value;
    }
}
