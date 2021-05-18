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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Segment" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="multipleModelMethod" use="required" type="{http://www.dmg.org/PMML-4_4}MULTIPLE-MODEL-METHOD" /&gt;
 *       &lt;attribute name="missingPredictionTreatment" type="{http://www.dmg.org/PMML-4_4}MISSING-PREDICTION-TREATMENT" default="continue" /&gt;
 *       &lt;attribute name="missingThreshold" type="{http://www.dmg.org/PMML-4_4}PROB-NUMBER" default="1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "extension",
        "segment"
})
@XmlRootElement(name = "Segmentation")
public class Segmentation {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "Segment", required = true)
    protected List<Segment> segment;
    @XmlAttribute(name = "multipleModelMethod", required = true)
    protected MULTIPLEMODELMETHOD multipleModelMethod;
    @XmlAttribute(name = "missingPredictionTreatment")
    protected MISSINGPREDICTIONTREATMENT missingPredictionTreatment;
    @XmlAttribute(name = "missingThreshold")
    protected Double missingThreshold;

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
     * Gets the value of the segment property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Segment }
     */
    public List<Segment> getSegment() {
        if (segment == null) {
            segment = new ArrayList<Segment>();
        }
        return this.segment;
    }

    /**
     * Gets the value of the multipleModelMethod property.
     *
     * @return possible object is
     * {@link MULTIPLEMODELMETHOD }
     */
    public MULTIPLEMODELMETHOD getMultipleModelMethod() {
        return multipleModelMethod;
    }

    /**
     * Sets the value of the multipleModelMethod property.
     *
     * @param value allowed object is
     *              {@link MULTIPLEMODELMETHOD }
     */
    public void setMultipleModelMethod(MULTIPLEMODELMETHOD value) {
        this.multipleModelMethod = value;
    }

    /**
     * Gets the value of the missingPredictionTreatment property.
     *
     * @return possible object is
     * {@link MISSINGPREDICTIONTREATMENT }
     */
    public MISSINGPREDICTIONTREATMENT getMissingPredictionTreatment() {
        if (missingPredictionTreatment == null) {
            return MISSINGPREDICTIONTREATMENT.CONTINUE;
        } else {
            return missingPredictionTreatment;
        }
    }

    /**
     * Sets the value of the missingPredictionTreatment property.
     *
     * @param value allowed object is
     *              {@link MISSINGPREDICTIONTREATMENT }
     */
    public void setMissingPredictionTreatment(MISSINGPREDICTIONTREATMENT value) {
        this.missingPredictionTreatment = value;
    }

    /**
     * Gets the value of the missingThreshold property.
     *
     * @return possible object is
     * {@link Double }
     */
    public double getMissingThreshold() {
        if (missingThreshold == null) {
            return 1.0D;
        } else {
            return missingThreshold;
        }
    }

    /**
     * Sets the value of the missingThreshold property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setMissingThreshold(Double value) {
        this.missingThreshold = value;
    }
}
