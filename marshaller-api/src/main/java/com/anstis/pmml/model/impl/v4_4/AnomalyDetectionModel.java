//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.16 at 10:37:58 AM BST 
//


package com.anstis.pmml.model.impl.v4_4;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}LocalTransformations" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelVerification" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.dmg.org/PMML-4_4}MODEL-ELEMENT"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}MeanClusterDistances" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_4}MINING-FUNCTION" /&gt;
 *       &lt;attribute name="algorithmType" use="required" type="{http://www.dmg.org/PMML-4_4}ALGORITHM-TYPE" /&gt;
 *       &lt;attribute name="sampleDataSize" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "localTransformations",
    "modelVerification",
    "model",
    "meanClusterDistances"
})
@XmlRootElement(name = "AnomalyDetectionModel")
@JsType
@GWT3Export
public class AnomalyDetectionModel
    implements com.anstis.pmml.model.api.IModel
{

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "MiningSchema", required = true)
    protected MiningSchema miningSchema;
    @XmlElement(name = "Output")
    protected Output output;
    @XmlElement(name = "LocalTransformations")
    protected LocalTransformations localTransformations;
    @XmlElement(name = "ModelVerification")
    protected ModelVerification modelVerification;
    @XmlElementRefs({
        @XmlElementRef(name = "AnomalyDetectionModel", namespace = "http://www.dmg.org/PMML-4_4", type = AnomalyDetectionModel.class, required = false),
        @XmlElementRef(name = "AssociationModel", namespace = "http://www.dmg.org/PMML-4_4", type = AssociationModel.class, required = false),
        @XmlElementRef(name = "BayesianNetworkModel", namespace = "http://www.dmg.org/PMML-4_4", type = BayesianNetworkModel.class, required = false),
        @XmlElementRef(name = "BaselineModel", namespace = "http://www.dmg.org/PMML-4_4", type = BaselineModel.class, required = false),
        @XmlElementRef(name = "ClusteringModel", namespace = "http://www.dmg.org/PMML-4_4", type = ClusteringModel.class, required = false),
        @XmlElementRef(name = "GaussianProcessModel", namespace = "http://www.dmg.org/PMML-4_4", type = GaussianProcessModel.class, required = false),
        @XmlElementRef(name = "GeneralRegressionModel", namespace = "http://www.dmg.org/PMML-4_4", type = GeneralRegressionModel.class, required = false),
        @XmlElementRef(name = "MiningModel", namespace = "http://www.dmg.org/PMML-4_4", type = MiningModel.class, required = false),
        @XmlElementRef(name = "NaiveBayesModel", namespace = "http://www.dmg.org/PMML-4_4", type = NaiveBayesModel.class, required = false),
        @XmlElementRef(name = "NearestNeighborModel", namespace = "http://www.dmg.org/PMML-4_4", type = NearestNeighborModel.class, required = false),
        @XmlElementRef(name = "NeuralNetwork", namespace = "http://www.dmg.org/PMML-4_4", type = NeuralNetwork.class, required = false),
        @XmlElementRef(name = "RegressionModel", namespace = "http://www.dmg.org/PMML-4_4", type = RegressionModel.class, required = false),
        @XmlElementRef(name = "RuleSetModel", namespace = "http://www.dmg.org/PMML-4_4", type = RuleSetModel.class, required = false),
        @XmlElementRef(name = "SequenceModel", namespace = "http://www.dmg.org/PMML-4_4", type = SequenceModel.class, required = false),
        @XmlElementRef(name = "Scorecard", namespace = "http://www.dmg.org/PMML-4_4", type = Scorecard.class, required = false),
        @XmlElementRef(name = "SupportVectorMachineModel", namespace = "http://www.dmg.org/PMML-4_4", type = SupportVectorMachineModel.class, required = false),
        @XmlElementRef(name = "TextModel", namespace = "http://www.dmg.org/PMML-4_4", type = TextModel.class, required = false),
        @XmlElementRef(name = "TimeSeriesModel", namespace = "http://www.dmg.org/PMML-4_4", type = TimeSeriesModel.class, required = false),
        @XmlElementRef(name = "TreeModel", namespace = "http://www.dmg.org/PMML-4_4", type = TreeModel.class, required = false)
    })
    protected com.anstis.pmml.model.api.IModel model;
    @XmlElement(name = "MeanClusterDistances")
    protected MeanClusterDistances meanClusterDistances;
    @XmlAttribute(name = "modelName")
    protected String modelName;
    @XmlAttribute(name = "algorithmName")
    protected String algorithmName;
    @XmlAttribute(name = "functionName", required = true)
    protected MININGFUNCTION functionName;
    @XmlAttribute(name = "algorithmType", required = true)
    protected ALGORITHMTYPE algorithmType;
    @XmlAttribute(name = "sampleDataSize")
    protected String sampleDataSize;
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
    public List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
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
    public MiningSchema getMiningSchema() {
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
    public void setMiningSchema(MiningSchema value) {
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
    public Output getOutput() {
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
    public void setOutput(Output value) {
        this.output = value;
    }

    /**
     * Gets the value of the localTransformations property.
     * 
     * @return
     *     possible object is
     *     {@link LocalTransformations }
     *     
     */
    public LocalTransformations getLocalTransformations() {
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
    public void setLocalTransformations(LocalTransformations value) {
        this.localTransformations = value;
    }

    /**
     * Gets the value of the modelVerification property.
     * 
     * @return
     *     possible object is
     *     {@link ModelVerification }
     *     
     */
    public ModelVerification getModelVerification() {
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
    public void setModelVerification(ModelVerification value) {
        this.modelVerification = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link AnomalyDetectionModel }
     *     {@link AssociationModel }
     *     {@link BayesianNetworkModel }
     *     {@link BaselineModel }
     *     {@link ClusteringModel }
     *     {@link GaussianProcessModel }
     *     {@link GeneralRegressionModel }
     *     {@link MiningModel }
     *     {@link NaiveBayesModel }
     *     {@link NearestNeighborModel }
     *     {@link NeuralNetwork }
     *     {@link RegressionModel }
     *     {@link RuleSetModel }
     *     {@link SequenceModel }
     *     {@link Scorecard }
     *     {@link SupportVectorMachineModel }
     *     {@link TextModel }
     *     {@link TimeSeriesModel }
     *     {@link TreeModel }
     *     
     */
    public com.anstis.pmml.model.api.IModel getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnomalyDetectionModel }
     *     {@link AssociationModel }
     *     {@link BayesianNetworkModel }
     *     {@link BaselineModel }
     *     {@link ClusteringModel }
     *     {@link GaussianProcessModel }
     *     {@link GeneralRegressionModel }
     *     {@link MiningModel }
     *     {@link NaiveBayesModel }
     *     {@link NearestNeighborModel }
     *     {@link NeuralNetwork }
     *     {@link RegressionModel }
     *     {@link RuleSetModel }
     *     {@link SequenceModel }
     *     {@link Scorecard }
     *     {@link SupportVectorMachineModel }
     *     {@link TextModel }
     *     {@link TimeSeriesModel }
     *     {@link TreeModel }
     *     
     */
    public void setModel(com.anstis.pmml.model.api.IModel value) {
        this.model = value;
    }

    /**
     * Gets the value of the meanClusterDistances property.
     * 
     * @return
     *     possible object is
     *     {@link MeanClusterDistances }
     *     
     */
    public MeanClusterDistances getMeanClusterDistances() {
        return meanClusterDistances;
    }

    /**
     * Sets the value of the meanClusterDistances property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeanClusterDistances }
     *     
     */
    public void setMeanClusterDistances(MeanClusterDistances value) {
        this.meanClusterDistances = value;
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
     * Gets the value of the functionName property.
     * 
     * @return
     *     possible object is
     *     {@link MININGFUNCTION }
     *     
     */
    public MININGFUNCTION getFunctionName() {
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
    public void setFunctionName(MININGFUNCTION value) {
        this.functionName = value;
    }

    /**
     * Gets the value of the algorithmType property.
     * 
     * @return
     *     possible object is
     *     {@link ALGORITHMTYPE }
     *     
     */
    public ALGORITHMTYPE getAlgorithmType() {
        return algorithmType;
    }

    /**
     * Sets the value of the algorithmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALGORITHMTYPE }
     *     
     */
    public void setAlgorithmType(ALGORITHMTYPE value) {
        this.algorithmType = value;
    }

    /**
     * Gets the value of the sampleDataSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleDataSize() {
        return sampleDataSize;
    }

    /**
     * Sets the value of the sampleDataSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleDataSize(String value) {
        this.sampleDataSize = value;
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
