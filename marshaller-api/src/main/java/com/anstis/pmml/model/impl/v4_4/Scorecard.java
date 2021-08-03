//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.03 at 09:25:28 AM BST 
//


package com.anstis.pmml.model.impl.v4_4;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.anstis.pmml.model.api.IModel;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}MiningSchema"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Output" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelStats" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelExplanation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Targets" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}LocalTransformations" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Characteristics"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelVerification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_4}MINING-FUNCTION" /&gt;
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="initialScore" type="{http://www.dmg.org/PMML-4_4}NUMBER" default="0" /&gt;
 *       &lt;attribute name="useReasonCodes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="reasonCodeAlgorithm" default="pointsBelow"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="pointsAbove"/&gt;
 *             &lt;enumeration value="pointsBelow"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="baselineScore" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="baselineMethod" default="other"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="max"/&gt;
 *             &lt;enumeration value="min"/&gt;
 *             &lt;enumeration value="mean"/&gt;
 *             &lt;enumeration value="neutral"/&gt;
 *             &lt;enumeration value="other"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="isScorable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
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
    "miningSchema",
    "output",
    "modelStats",
    "modelExplanation",
    "targets",
    "localTransformations",
    "characteristics",
    "modelVerification"
})
@XmlRootElement(name = "Scorecard")
@JsType
@GWT3Export
public class Scorecard
    implements IModel, com.anstis.pmml.model.api.Scorecard
{

    @XmlElement(name = "Extension", type = Extension.class)
    protected List<com.anstis.pmml.model.api.Extension> extension;
    @XmlElement(name = "MiningSchema", required = true, type = MiningSchema.class)
    protected com.anstis.pmml.model.api.MiningSchema miningSchema;
    @XmlElement(name = "Output", type = Output.class)
    protected com.anstis.pmml.model.api.Output output;
    @XmlElement(name = "ModelStats", type = ModelStats.class)
    protected com.anstis.pmml.model.api.ModelStats modelStats;
    @XmlElement(name = "ModelExplanation", type = ModelExplanation.class)
    protected com.anstis.pmml.model.api.ModelExplanation modelExplanation;
    @XmlElement(name = "Targets", type = Targets.class)
    protected com.anstis.pmml.model.api.Targets targets;
    @XmlElement(name = "LocalTransformations", type = LocalTransformations.class)
    protected com.anstis.pmml.model.api.LocalTransformations localTransformations;
    @XmlElement(name = "Characteristics", required = true, type = Characteristics.class)
    protected com.anstis.pmml.model.api.Characteristics characteristics;
    @XmlElement(name = "ModelVerification", type = ModelVerification.class)
    protected com.anstis.pmml.model.api.ModelVerification modelVerification;
    @XmlAttribute(name = "modelName")
    protected String modelName;
    @XmlAttribute(name = "functionName", required = true)
    protected com.anstis.pmml.model.api.MININGFUNCTION functionName;
    @XmlAttribute(name = "algorithmName")
    protected String algorithmName;
    @XmlAttribute(name = "initialScore")
    protected Double initialScore;
    @XmlAttribute(name = "useReasonCodes")
    protected Boolean useReasonCodes;
    @XmlAttribute(name = "reasonCodeAlgorithm")
    protected String reasonCodeAlgorithm;
    @XmlAttribute(name = "baselineScore")
    protected Double baselineScore;
    @XmlAttribute(name = "baselineMethod")
    protected String baselineMethod;
    @XmlAttribute(name = "isScorable")
    protected Boolean isScorable;

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
    public List<com.anstis.pmml.model.api.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<com.anstis.pmml.model.api.Extension>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the miningSchema property.
     * 
     * @return
     *     possible object is
     *     {@link MiningSchema }
     *     
     */
    public com.anstis.pmml.model.api.MiningSchema getMiningSchema() {
        return miningSchema;
    }

    /**
     * Sets the value of the miningSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiningSchema }
     *     
     */
    public void setMiningSchema(com.anstis.pmml.model.api.MiningSchema value) {
        this.miningSchema = value;
    }

    /**
     * Gets the value of the output property.
     * 
     * @return
     *     possible object is
     *     {@link Output }
     *     
     */
    public com.anstis.pmml.model.api.Output getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     * 
     * @param value
     *     allowed object is
     *     {@link Output }
     *     
     */
    public void setOutput(com.anstis.pmml.model.api.Output value) {
        this.output = value;
    }

    /**
     * Gets the value of the modelStats property.
     * 
     * @return
     *     possible object is
     *     {@link ModelStats }
     *     
     */
    public com.anstis.pmml.model.api.ModelStats getModelStats() {
        return modelStats;
    }

    /**
     * Sets the value of the modelStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelStats }
     *     
     */
    public void setModelStats(com.anstis.pmml.model.api.ModelStats value) {
        this.modelStats = value;
    }

    /**
     * Gets the value of the modelExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link ModelExplanation }
     *     
     */
    public com.anstis.pmml.model.api.ModelExplanation getModelExplanation() {
        return modelExplanation;
    }

    /**
     * Sets the value of the modelExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelExplanation }
     *     
     */
    public void setModelExplanation(com.anstis.pmml.model.api.ModelExplanation value) {
        this.modelExplanation = value;
    }

    /**
     * Gets the value of the targets property.
     * 
     * @return
     *     possible object is
     *     {@link Targets }
     *     
     */
    public com.anstis.pmml.model.api.Targets getTargets() {
        return targets;
    }

    /**
     * Sets the value of the targets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Targets }
     *     
     */
    public void setTargets(com.anstis.pmml.model.api.Targets value) {
        this.targets = value;
    }

    /**
     * Gets the value of the localTransformations property.
     * 
     * @return
     *     possible object is
     *     {@link LocalTransformations }
     *     
     */
    public com.anstis.pmml.model.api.LocalTransformations getLocalTransformations() {
        return localTransformations;
    }

    /**
     * Sets the value of the localTransformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalTransformations }
     *     
     */
    public void setLocalTransformations(com.anstis.pmml.model.api.LocalTransformations value) {
        this.localTransformations = value;
    }

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link Characteristics }
     *     
     */
    public com.anstis.pmml.model.api.Characteristics getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Characteristics }
     *     
     */
    public void setCharacteristics(com.anstis.pmml.model.api.Characteristics value) {
        this.characteristics = value;
    }

    /**
     * Gets the value of the modelVerification property.
     * 
     * @return
     *     possible object is
     *     {@link ModelVerification }
     *     
     */
    public com.anstis.pmml.model.api.ModelVerification getModelVerification() {
        return modelVerification;
    }

    /**
     * Sets the value of the modelVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelVerification }
     *     
     */
    public void setModelVerification(com.anstis.pmml.model.api.ModelVerification value) {
        this.modelVerification = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the functionName property.
     * 
     * @return
     *     possible object is
     *     {@link MININGFUNCTION }
     *     
     */
    public com.anstis.pmml.model.api.MININGFUNCTION getFunctionName() {
        return functionName;
    }

    /**
     * Sets the value of the functionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MININGFUNCTION }
     *     
     */
    public void setFunctionName(com.anstis.pmml.model.api.MININGFUNCTION value) {
        this.functionName = value;
    }

    /**
     * Gets the value of the algorithmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithmName() {
        return algorithmName;
    }

    /**
     * Sets the value of the algorithmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithmName(String value) {
        this.algorithmName = value;
    }

    /**
     * Gets the value of the initialScore property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getInitialScore() {
        if (initialScore == null) {
            return  0.0D;
        } else {
            return initialScore;
        }
    }

    /**
     * Sets the value of the initialScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInitialScore(Double value) {
        this.initialScore = value;
    }

    /**
     * Gets the value of the useReasonCodes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUseReasonCodes() {
        if (useReasonCodes == null) {
            return true;
        } else {
            return useReasonCodes;
        }
    }

    /**
     * Sets the value of the useReasonCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseReasonCodes(Boolean value) {
        this.useReasonCodes = value;
    }

    /**
     * Gets the value of the reasonCodeAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCodeAlgorithm() {
        if (reasonCodeAlgorithm == null) {
            return "pointsBelow";
        } else {
            return reasonCodeAlgorithm;
        }
    }

    /**
     * Sets the value of the reasonCodeAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCodeAlgorithm(String value) {
        this.reasonCodeAlgorithm = value;
    }

    /**
     * Gets the value of the baselineScore property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaselineScore() {
        return baselineScore;
    }

    /**
     * Sets the value of the baselineScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaselineScore(Double value) {
        this.baselineScore = value;
    }

    /**
     * Gets the value of the baselineMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaselineMethod() {
        if (baselineMethod == null) {
            return "other";
        } else {
            return baselineMethod;
        }
    }

    /**
     * Sets the value of the baselineMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaselineMethod(String value) {
        this.baselineMethod = value;
    }

    /**
     * Gets the value of the isScorable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsScorable() {
        if (isScorable == null) {
            return true;
        } else {
            return isScorable;
        }
    }

    /**
     * Sets the value of the isScorable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsScorable(Boolean value) {
        this.isScorable = value;
    }

}
