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
public interface AnomalyDetectionModel {


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
    List<Extension> getExtension();

    /**
     * Gets the value of the miningSchema property.
     * 
     * @return
     *     possible object is
     *     {@link MiningSchema }
     *     
     */
    MiningSchema getMiningSchema();

    /**
     * Sets the value of the miningSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiningSchema }
     *     
     */
    void setMiningSchema(MiningSchema value);

    /**
     * Gets the value of the output property.
     * 
     * @return
     *     possible object is
     *     {@link Output }
     *     
     */
    Output getOutput();

    /**
     * Sets the value of the output property.
     * 
     * @param value
     *     allowed object is
     *     {@link Output }
     *     
     */
    void setOutput(Output value);

    /**
     * Gets the value of the localTransformations property.
     * 
     * @return
     *     possible object is
     *     {@link LocalTransformations }
     *     
     */
    LocalTransformations getLocalTransformations();

    /**
     * Sets the value of the localTransformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalTransformations }
     *     
     */
    void setLocalTransformations(LocalTransformations value);

    /**
     * Gets the value of the modelVerification property.
     * 
     * @return
     *     possible object is
     *     {@link ModelVerification }
     *     
     */
    ModelVerification getModelVerification();

    /**
     * Sets the value of the modelVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelVerification }
     *     
     */
    void setModelVerification(ModelVerification value);

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
    IModel getModel();

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
    void setModel(IModel value);

    /**
     * Gets the value of the meanClusterDistances property.
     * 
     * @return
     *     possible object is
     *     {@link MeanClusterDistances }
     *     
     */
    MeanClusterDistances getMeanClusterDistances();

    /**
     * Sets the value of the meanClusterDistances property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeanClusterDistances }
     *     
     */
    void setMeanClusterDistances(MeanClusterDistances value);

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getModelName();

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setModelName(String value);

    /**
     * Gets the value of the algorithmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getAlgorithmName();

    /**
     * Sets the value of the algorithmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAlgorithmName(String value);

    /**
     * Gets the value of the functionName property.
     * 
     * @return
     *     possible object is
     *     {@link MININGFUNCTION }
     *     
     */
    MININGFUNCTION getFunctionName();

    /**
     * Sets the value of the functionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MININGFUNCTION }
     *     
     */
    void setFunctionName(MININGFUNCTION value);

    /**
     * Gets the value of the algorithmType property.
     * 
     * @return
     *     possible object is
     *     {@link ALGORITHMTYPE }
     *     
     */
    ALGORITHMTYPE getAlgorithmType();

    /**
     * Sets the value of the algorithmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALGORITHMTYPE }
     *     
     */
    void setAlgorithmType(ALGORITHMTYPE value);

    /**
     * Gets the value of the sampleDataSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSampleDataSize();

    /**
     * Sets the value of the sampleDataSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSampleDataSize(String value);

    /**
     * Gets the value of the isScorable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    boolean isIsScorable();

    /**
     * Sets the value of the isScorable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setIsScorable(Boolean value);

}
