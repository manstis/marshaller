//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.01 at 10:52:05 AM BST 
//


package com.anstis.pmml.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import jsinterop.annotations.JsType;
import org.treblereel.gwt.xml.mapper.api.annotation.XmlUnwrappedCollection;
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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_4}PREDICATE"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ScoreDistribution" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="score" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="recordCount" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="nbCorrect" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="confidence" type="{http://www.dmg.org/PMML-4_4}NUMBER" default="1" /&gt;
 *       &lt;attribute name="weight" type="{http://www.dmg.org/PMML-4_4}NUMBER" default="1" /&gt;
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
    "predicate",
    "scoreDistribution"
})
@XmlRootElement(name = "SimpleRule")
@JsType
@GWT3Export
public class SimpleRule
    implements ICompoundRule, IRuleSet
{

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElementRefs({
        @XmlElementRef(name = "SimplePredicate", namespace = "http://www.dmg.org/PMML-4_4", type = SimplePredicate.class, required = false),
        @XmlElementRef(name = "CompoundPredicate", namespace = "http://www.dmg.org/PMML-4_4", type = CompoundPredicate.class, required = false),
        @XmlElementRef(name = "SimpleSetPredicate", namespace = "http://www.dmg.org/PMML-4_4", type = SimpleSetPredicate.class, required = false),
        @XmlElementRef(name = "True", namespace = "http://www.dmg.org/PMML-4_4", type = True.class, required = false),
        @XmlElementRef(name = "False", namespace = "http://www.dmg.org/PMML-4_4", type = False.class, required = false)
    })
    @XmlUnwrappedCollection
    protected ICompoundPredicate predicate;
    @XmlElement(name = "ScoreDistribution")
    protected List<ScoreDistribution> scoreDistribution;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "score", required = true)
    protected String score;
    @XmlAttribute(name = "recordCount")
    protected Double recordCount;
    @XmlAttribute(name = "nbCorrect")
    protected Double nbCorrect;
    @XmlAttribute(name = "confidence")
    protected Double confidence;
    @XmlAttribute(name = "weight")
    protected Double weight;

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
    public List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the predicate property.
     * 
     * @return
     *     possible object is
     *     {@link SimplePredicate }
     *     {@link CompoundPredicate }
     *     {@link SimpleSetPredicate }
     *     {@link True }
     *     {@link False }
     *     
     */
    public ICompoundPredicate getPredicate() {
        return predicate;
    }

    /**
     * Sets the value of the predicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePredicate }
     *     {@link CompoundPredicate }
     *     {@link SimpleSetPredicate }
     *     {@link True }
     *     {@link False }
     *     
     */
    public void setPredicate(ICompoundPredicate value) {
        this.predicate = value;
    }

    /**
     * Gets the value of the scoreDistribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreDistribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreDistribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreDistribution }
     * 
     * 
     */
    public List<ScoreDistribution> getScoreDistribution() {
        if (scoreDistribution == null) {
            scoreDistribution = new ArrayList<ScoreDistribution>();
        }
        return this.scoreDistribution;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScore(String value) {
        this.score = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecordCount(Double value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the nbCorrect property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNbCorrect() {
        return nbCorrect;
    }

    /**
     * Sets the value of the nbCorrect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNbCorrect(Double value) {
        this.nbCorrect = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getConfidence() {
        if (confidence == null) {
            return  1.0D;
        } else {
            return confidence;
        }
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConfidence(Double value) {
        this.confidence = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getWeight() {
        if (weight == null) {
            return  1.0D;
        } else {
            return weight;
        }
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

}
