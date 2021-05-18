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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}MiningSchema"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Output" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelStats" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelExplanation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Targets" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}LocalTransformations" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{http://www.dmg.org/PMML-4_4}RadialBasisKernel"/&gt;
 *             &lt;element ref="{http://www.dmg.org/PMML-4_4}ARDSquaredExponentialKernel"/&gt;
 *             &lt;element ref="{http://www.dmg.org/PMML-4_4}AbsoluteExponentialKernel"/&gt;
 *             &lt;element ref="{http://www.dmg.org/PMML-4_4}GeneralizedExponentialKernel"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}TrainingInstances"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelVerification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_4}MINING-FUNCTION" /&gt;
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="optimizer" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isScorable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
        "radialBasisKernel",
        "ardSquaredExponentialKernel",
        "absoluteExponentialKernel",
        "generalizedExponentialKernel",
        "trainingInstances",
        "modelVerification"
})
@XmlRootElement(name = "GaussianProcessModel")
public class GaussianProcessModel implements IPMML {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "MiningSchema", required = true)
    protected MiningSchema miningSchema;
    @XmlElement(name = "Output")
    protected Output output;
    @XmlElement(name = "ModelStats")
    protected ModelStats modelStats;
    @XmlElement(name = "ModelExplanation")
    protected ModelExplanation modelExplanation;
    @XmlElement(name = "Targets")
    protected Targets targets;
    @XmlElement(name = "LocalTransformations")
    protected LocalTransformations localTransformations;
    @XmlElement(name = "RadialBasisKernel")
    protected RadialBasisKernel radialBasisKernel;
    @XmlElement(name = "ARDSquaredExponentialKernel")
    protected ARDSquaredExponentialKernel ardSquaredExponentialKernel;
    @XmlElement(name = "AbsoluteExponentialKernel")
    protected AbsoluteExponentialKernel absoluteExponentialKernel;
    @XmlElement(name = "GeneralizedExponentialKernel")
    protected GeneralizedExponentialKernel generalizedExponentialKernel;
    @XmlElement(name = "TrainingInstances", required = true)
    protected TrainingInstances trainingInstances;
    @XmlElement(name = "ModelVerification")
    protected ModelVerification modelVerification;
    @XmlAttribute(name = "modelName")
    protected String modelName;
    @XmlAttribute(name = "functionName", required = true)
    protected MININGFUNCTION functionName;
    @XmlAttribute(name = "algorithmName")
    protected String algorithmName;
    @XmlAttribute(name = "optimizer")
    protected String optimizer;
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
     */
    public List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the miningSchema property.
     *
     * @return possible object is
     * {@link MiningSchema }
     */
    public MiningSchema getMiningSchema() {
        return miningSchema;
    }

    /**
     * Sets the value of the miningSchema property.
     *
     * @param value allowed object is
     *              {@link MiningSchema }
     */
    public void setMiningSchema(MiningSchema value) {
        this.miningSchema = value;
    }

    /**
     * Gets the value of the output property.
     *
     * @return possible object is
     * {@link Output }
     */
    public Output getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     *
     * @param value allowed object is
     *              {@link Output }
     */
    public void setOutput(Output value) {
        this.output = value;
    }

    /**
     * Gets the value of the modelStats property.
     *
     * @return possible object is
     * {@link ModelStats }
     */
    public ModelStats getModelStats() {
        return modelStats;
    }

    /**
     * Sets the value of the modelStats property.
     *
     * @param value allowed object is
     *              {@link ModelStats }
     */
    public void setModelStats(ModelStats value) {
        this.modelStats = value;
    }

    /**
     * Gets the value of the modelExplanation property.
     *
     * @return possible object is
     * {@link ModelExplanation }
     */
    public ModelExplanation getModelExplanation() {
        return modelExplanation;
    }

    /**
     * Sets the value of the modelExplanation property.
     *
     * @param value allowed object is
     *              {@link ModelExplanation }
     */
    public void setModelExplanation(ModelExplanation value) {
        this.modelExplanation = value;
    }

    /**
     * Gets the value of the targets property.
     *
     * @return possible object is
     * {@link Targets }
     */
    public Targets getTargets() {
        return targets;
    }

    /**
     * Sets the value of the targets property.
     *
     * @param value allowed object is
     *              {@link Targets }
     */
    public void setTargets(Targets value) {
        this.targets = value;
    }

    /**
     * Gets the value of the localTransformations property.
     *
     * @return possible object is
     * {@link LocalTransformations }
     */
    public LocalTransformations getLocalTransformations() {
        return localTransformations;
    }

    /**
     * Sets the value of the localTransformations property.
     *
     * @param value allowed object is
     *              {@link LocalTransformations }
     */
    public void setLocalTransformations(LocalTransformations value) {
        this.localTransformations = value;
    }

    /**
     * Gets the value of the radialBasisKernel property.
     *
     * @return possible object is
     * {@link RadialBasisKernel }
     */
    public RadialBasisKernel getRadialBasisKernel() {
        return radialBasisKernel;
    }

    /**
     * Sets the value of the radialBasisKernel property.
     *
     * @param value allowed object is
     *              {@link RadialBasisKernel }
     */
    public void setRadialBasisKernel(RadialBasisKernel value) {
        this.radialBasisKernel = value;
    }

    /**
     * Gets the value of the ardSquaredExponentialKernel property.
     *
     * @return possible object is
     * {@link ARDSquaredExponentialKernel }
     */
    public ARDSquaredExponentialKernel getARDSquaredExponentialKernel() {
        return ardSquaredExponentialKernel;
    }

    /**
     * Sets the value of the ardSquaredExponentialKernel property.
     *
     * @param value allowed object is
     *              {@link ARDSquaredExponentialKernel }
     */
    public void setARDSquaredExponentialKernel(ARDSquaredExponentialKernel value) {
        this.ardSquaredExponentialKernel = value;
    }

    /**
     * Gets the value of the absoluteExponentialKernel property.
     *
     * @return possible object is
     * {@link AbsoluteExponentialKernel }
     */
    public AbsoluteExponentialKernel getAbsoluteExponentialKernel() {
        return absoluteExponentialKernel;
    }

    /**
     * Sets the value of the absoluteExponentialKernel property.
     *
     * @param value allowed object is
     *              {@link AbsoluteExponentialKernel }
     */
    public void setAbsoluteExponentialKernel(AbsoluteExponentialKernel value) {
        this.absoluteExponentialKernel = value;
    }

    /**
     * Gets the value of the generalizedExponentialKernel property.
     *
     * @return possible object is
     * {@link GeneralizedExponentialKernel }
     */
    public GeneralizedExponentialKernel getGeneralizedExponentialKernel() {
        return generalizedExponentialKernel;
    }

    /**
     * Sets the value of the generalizedExponentialKernel property.
     *
     * @param value allowed object is
     *              {@link GeneralizedExponentialKernel }
     */
    public void setGeneralizedExponentialKernel(GeneralizedExponentialKernel value) {
        this.generalizedExponentialKernel = value;
    }

    /**
     * Gets the value of the trainingInstances property.
     *
     * @return possible object is
     * {@link TrainingInstances }
     */
    public TrainingInstances getTrainingInstances() {
        return trainingInstances;
    }

    /**
     * Sets the value of the trainingInstances property.
     *
     * @param value allowed object is
     *              {@link TrainingInstances }
     */
    public void setTrainingInstances(TrainingInstances value) {
        this.trainingInstances = value;
    }

    /**
     * Gets the value of the modelVerification property.
     *
     * @return possible object is
     * {@link ModelVerification }
     */
    public ModelVerification getModelVerification() {
        return modelVerification;
    }

    /**
     * Sets the value of the modelVerification property.
     *
     * @param value allowed object is
     *              {@link ModelVerification }
     */
    public void setModelVerification(ModelVerification value) {
        this.modelVerification = value;
    }

    /**
     * Gets the value of the modelName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the functionName property.
     *
     * @return possible object is
     * {@link MININGFUNCTION }
     */
    public MININGFUNCTION getFunctionName() {
        return functionName;
    }

    /**
     * Sets the value of the functionName property.
     *
     * @param value allowed object is
     *              {@link MININGFUNCTION }
     */
    public void setFunctionName(MININGFUNCTION value) {
        this.functionName = value;
    }

    /**
     * Gets the value of the algorithmName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAlgorithmName() {
        return algorithmName;
    }

    /**
     * Sets the value of the algorithmName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAlgorithmName(String value) {
        this.algorithmName = value;
    }

    /**
     * Gets the value of the optimizer property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOptimizer() {
        return optimizer;
    }

    /**
     * Sets the value of the optimizer property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOptimizer(String value) {
        this.optimizer = value;
    }

    /**
     * Gets the value of the isScorable property.
     *
     * @return possible object is
     * {@link Boolean }
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
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIsScorable(Boolean value) {
        this.isScorable = value;
    }
}
