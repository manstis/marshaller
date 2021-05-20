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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Comparisons" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="field" use="required" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *       &lt;attribute name="isCenterField" default="true"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="true"/&gt;
 *             &lt;enumeration value="false"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="fieldWeight" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" default="1" /&gt;
 *       &lt;attribute name="similarityScale" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *       &lt;attribute name="compareFunction" type="{http://www.dmg.org/PMML-4_4}COMPARE-FUNCTION" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "extension",
        "comparisons"
})
@XmlRootElement(name = "ClusteringField")
@JsType
@GWT3Export
public class ClusteringField {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "Comparisons")
    protected Comparisons comparisons;
    @XmlAttribute(name = "field", required = true)
    protected String field;
    @XmlAttribute(name = "isCenterField")
    protected String isCenterField;
    @XmlAttribute(name = "fieldWeight")
    protected Double fieldWeight;
    @XmlAttribute(name = "similarityScale")
    protected Double similarityScale;
    @XmlAttribute(name = "compareFunction")
    protected COMPAREFUNCTION compareFunction;

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
     * Gets the value of the comparisons property.
     *
     * @return possible object is
     * {@link Comparisons }
     */
    public Comparisons getComparisons() {
        return comparisons;
    }

    /**
     * Sets the value of the comparisons property.
     *
     * @param value allowed object is
     *              {@link Comparisons }
     */
    public void setComparisons(Comparisons value) {
        this.comparisons = value;
    }

    /**
     * Gets the value of the field property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the isCenterField property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIsCenterField() {
        if (isCenterField == null) {
            return "true";
        } else {
            return isCenterField;
        }
    }

    /**
     * Sets the value of the isCenterField property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIsCenterField(String value) {
        this.isCenterField = value;
    }

    /**
     * Gets the value of the fieldWeight property.
     *
     * @return possible object is
     * {@link Double }
     */
    public double getFieldWeight() {
        if (fieldWeight == null) {
            return 1.0D;
        } else {
            return fieldWeight;
        }
    }

    /**
     * Sets the value of the fieldWeight property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setFieldWeight(Double value) {
        this.fieldWeight = value;
    }

    /**
     * Gets the value of the similarityScale property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getSimilarityScale() {
        return similarityScale;
    }

    /**
     * Sets the value of the similarityScale property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setSimilarityScale(Double value) {
        this.similarityScale = value;
    }

    /**
     * Gets the value of the compareFunction property.
     *
     * @return possible object is
     * {@link COMPAREFUNCTION }
     */
    public COMPAREFUNCTION getCompareFunction() {
        return compareFunction;
    }

    /**
     * Sets the value of the compareFunction property.
     *
     * @param value allowed object is
     *              {@link COMPAREFUNCTION }
     */
    public void setCompareFunction(COMPAREFUNCTION value) {
        this.compareFunction = value;
    }
}
