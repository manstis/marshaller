//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.16 at 10:37:52 AM BST 
//


package com.anstis.pmml.model.api;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelStats" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelExplanation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Targets" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}LocalTransformations" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}TextDictionary"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}TextCorpus"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}DocumentTermMatrix"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}TextModelNormalization" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}TextModelSimiliarity" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelVerification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_4}MINING-FUNCTION" /&gt;
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="numberOfTerms" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="numberOfDocuments" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="isScorable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface TextModel {


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
     * Gets the value of the modelStats property.
     * 
     * @return
     *     possible object is
     *     {@link ModelStats }
     *     
     */
    ModelStats getModelStats();

    /**
     * Sets the value of the modelStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelStats }
     *     
     */
    void setModelStats(ModelStats value);

    /**
     * Gets the value of the modelExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link ModelExplanation }
     *     
     */
    ModelExplanation getModelExplanation();

    /**
     * Sets the value of the modelExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelExplanation }
     *     
     */
    void setModelExplanation(ModelExplanation value);

    /**
     * Gets the value of the targets property.
     * 
     * @return
     *     possible object is
     *     {@link Targets }
     *     
     */
    Targets getTargets();

    /**
     * Sets the value of the targets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Targets }
     *     
     */
    void setTargets(Targets value);

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
     * Gets the value of the textDictionary property.
     * 
     * @return
     *     possible object is
     *     {@link TextDictionary }
     *     
     */
    TextDictionary getTextDictionary();

    /**
     * Sets the value of the textDictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextDictionary }
     *     
     */
    void setTextDictionary(TextDictionary value);

    /**
     * Gets the value of the textCorpus property.
     * 
     * @return
     *     possible object is
     *     {@link TextCorpus }
     *     
     */
    TextCorpus getTextCorpus();

    /**
     * Sets the value of the textCorpus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextCorpus }
     *     
     */
    void setTextCorpus(TextCorpus value);

    /**
     * Gets the value of the documentTermMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTermMatrix }
     *     
     */
    DocumentTermMatrix getDocumentTermMatrix();

    /**
     * Sets the value of the documentTermMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTermMatrix }
     *     
     */
    void setDocumentTermMatrix(DocumentTermMatrix value);

    /**
     * Gets the value of the textModelNormalization property.
     * 
     * @return
     *     possible object is
     *     {@link TextModelNormalization }
     *     
     */
    TextModelNormalization getTextModelNormalization();

    /**
     * Sets the value of the textModelNormalization property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextModelNormalization }
     *     
     */
    void setTextModelNormalization(TextModelNormalization value);

    /**
     * Gets the value of the textModelSimiliarity property.
     * 
     * @return
     *     possible object is
     *     {@link TextModelSimiliarity }
     *     
     */
    TextModelSimiliarity getTextModelSimiliarity();

    /**
     * Sets the value of the textModelSimiliarity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextModelSimiliarity }
     *     
     */
    void setTextModelSimiliarity(TextModelSimiliarity value);

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
     * Gets the value of the numberOfTerms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    BigInteger getNumberOfTerms();

    /**
     * Sets the value of the numberOfTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    void setNumberOfTerms(BigInteger value);

    /**
     * Gets the value of the numberOfDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    BigInteger getNumberOfDocuments();

    /**
     * Sets the value of the numberOfDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    void setNumberOfDocuments(BigInteger value);

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
