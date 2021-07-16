//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.16 at 10:37:58 AM BST 
//


package com.anstis.pmml.model.impl.v4_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.anstis.pmml.model.api.IState;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}FinalNoise"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}FinalPredictedNoise"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}FinalTheta"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}FinalNu"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "finalNoise",
    "finalPredictedNoise",
    "finalTheta",
    "finalNu"
})
@XmlRootElement(name = "ThetaRecursionState")
@JsType
@GWT3Export
public class ThetaRecursionState
    implements IState
{

    @XmlElement(name = "FinalNoise", required = true)
    protected FinalNoise finalNoise;
    @XmlElement(name = "FinalPredictedNoise", required = true)
    protected FinalPredictedNoise finalPredictedNoise;
    @XmlElement(name = "FinalTheta", required = true)
    protected FinalTheta finalTheta;
    @XmlElement(name = "FinalNu", required = true)
    protected FinalNu finalNu;

    /**
     * Gets the value of the finalNoise property.
     * 
     * @return
     *     possible object is
     *     {@link FinalNoise }
     *     
     */
    public FinalNoise getFinalNoise() {
        return finalNoise;
    }

    /**
     * Sets the value of the finalNoise property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalNoise }
     *     
     */
    public void setFinalNoise(FinalNoise value) {
        this.finalNoise = value;
    }

    /**
     * Gets the value of the finalPredictedNoise property.
     * 
     * @return
     *     possible object is
     *     {@link FinalPredictedNoise }
     *     
     */
    public FinalPredictedNoise getFinalPredictedNoise() {
        return finalPredictedNoise;
    }

    /**
     * Sets the value of the finalPredictedNoise property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalPredictedNoise }
     *     
     */
    public void setFinalPredictedNoise(FinalPredictedNoise value) {
        this.finalPredictedNoise = value;
    }

    /**
     * Gets the value of the finalTheta property.
     * 
     * @return
     *     possible object is
     *     {@link FinalTheta }
     *     
     */
    public FinalTheta getFinalTheta() {
        return finalTheta;
    }

    /**
     * Sets the value of the finalTheta property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalTheta }
     *     
     */
    public void setFinalTheta(FinalTheta value) {
        this.finalTheta = value;
    }

    /**
     * Gets the value of the finalNu property.
     * 
     * @return
     *     possible object is
     *     {@link FinalNu }
     *     
     */
    public FinalNu getFinalNu() {
        return finalNu;
    }

    /**
     * Sets the value of the finalNu property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalNu }
     *     
     */
    public void setFinalNu(FinalNu value) {
        this.finalNu = value;
    }

}
