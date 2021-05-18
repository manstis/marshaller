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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Lambda" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="gamma" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" default="1" /&gt;
 *       &lt;attribute name="noiseVariance" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" default="1" /&gt;
 *       &lt;attribute name="degree" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" default="1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "extension",
        "lambda"
})
@XmlRootElement(name = "GeneralizedExponentialKernel")
public class GeneralizedExponentialKernel {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "Lambda")
    protected List<Lambda> lambda;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "gamma")
    protected Double gamma;
    @XmlAttribute(name = "noiseVariance")
    protected Double noiseVariance;
    @XmlAttribute(name = "degree")
    protected Double degree;

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
     * Gets the value of the lambda property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lambda property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLambda().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lambda }
     */
    public List<Lambda> getLambda() {
        if (lambda == null) {
            lambda = new ArrayList<Lambda>();
        }
        return this.lambda;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the gamma property.
     *
     * @return possible object is
     * {@link Double }
     */
    public double getGamma() {
        if (gamma == null) {
            return 1.0D;
        } else {
            return gamma;
        }
    }

    /**
     * Sets the value of the gamma property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setGamma(Double value) {
        this.gamma = value;
    }

    /**
     * Gets the value of the noiseVariance property.
     *
     * @return possible object is
     * {@link Double }
     */
    public double getNoiseVariance() {
        if (noiseVariance == null) {
            return 1.0D;
        } else {
            return noiseVariance;
        }
    }

    /**
     * Sets the value of the noiseVariance property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setNoiseVariance(Double value) {
        this.noiseVariance = value;
    }

    /**
     * Gets the value of the degree property.
     *
     * @return possible object is
     * {@link Double }
     */
    public double getDegree() {
        if (degree == null) {
            return 1.0D;
        } else {
            return degree;
        }
    }

    /**
     * Sets the value of the degree property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setDegree(Double value) {
        this.degree = value;
    }
}
