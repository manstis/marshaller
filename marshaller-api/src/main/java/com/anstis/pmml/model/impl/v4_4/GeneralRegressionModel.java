//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.03 at 09:25:28 AM BST 
//


package com.anstis.pmml.model.impl.v4_4;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ParameterList"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}FactorList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}CovariateList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}PPMatrix"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}PCovMatrix" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ParamMatrix"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}EventValues" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}BaseCumHazardTables" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelVerification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="targetVariableName" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *       &lt;attribute name="modelType" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="regression"/&gt;
 *             &lt;enumeration value="generalLinear"/&gt;
 *             &lt;enumeration value="multinomialLogistic"/&gt;
 *             &lt;enumeration value="ordinalMultinomial"/&gt;
 *             &lt;enumeration value="generalizedLinear"/&gt;
 *             &lt;enumeration value="CoxRegression"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_4}MINING-FUNCTION" /&gt;
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="targetReferenceCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="cumulativeLink" type="{http://www.dmg.org/PMML-4_4}CUMULATIVE-LINK-FUNCTION" /&gt;
 *       &lt;attribute name="linkFunction" type="{http://www.dmg.org/PMML-4_4}LINK-FUNCTION" /&gt;
 *       &lt;attribute name="linkParameter" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *       &lt;attribute name="trialsVariable" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *       &lt;attribute name="trialsValue" type="{http://www.dmg.org/PMML-4_4}INT-NUMBER" /&gt;
 *       &lt;attribute name="distribution"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="binomial"/&gt;
 *             &lt;enumeration value="gamma"/&gt;
 *             &lt;enumeration value="igauss"/&gt;
 *             &lt;enumeration value="negbin"/&gt;
 *             &lt;enumeration value="normal"/&gt;
 *             &lt;enumeration value="poisson"/&gt;
 *             &lt;enumeration value="tweedie"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="distParameter" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *       &lt;attribute name="offsetVariable" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *       &lt;attribute name="offsetValue" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *       &lt;attribute name="modelDF" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *       &lt;attribute name="endTimeVariable" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *       &lt;attribute name="startTimeVariable" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *       &lt;attribute name="subjectIDVariable" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *       &lt;attribute name="statusVariable" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *       &lt;attribute name="baselineStrataVariable" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
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
    "parameterList",
    "factorList",
    "covariateList",
    "ppMatrix",
    "pCovMatrix",
    "paramMatrix",
    "eventValues",
    "baseCumHazardTables",
    "modelVerification"
})
@XmlRootElement(name = "GeneralRegressionModel")
@JsType
@GWT3Export
public class GeneralRegressionModel
    implements IModel
{

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
    @XmlElement(name = "ParameterList", required = true)
    protected ParameterList parameterList;
    @XmlElement(name = "FactorList")
    protected FactorList factorList;
    @XmlElement(name = "CovariateList")
    protected CovariateList covariateList;
    @XmlElement(name = "PPMatrix", required = true)
    protected PPMatrix ppMatrix;
    @XmlElement(name = "PCovMatrix")
    protected PCovMatrix pCovMatrix;
    @XmlElement(name = "ParamMatrix", required = true)
    protected ParamMatrix paramMatrix;
    @XmlElement(name = "EventValues")
    protected EventValues eventValues;
    @XmlElement(name = "BaseCumHazardTables")
    protected BaseCumHazardTables baseCumHazardTables;
    @XmlElement(name = "ModelVerification")
    protected ModelVerification modelVerification;
    @XmlAttribute(name = "targetVariableName")
    protected String targetVariableName;
    @XmlAttribute(name = "modelType", required = true)
    protected String modelType;
    @XmlAttribute(name = "modelName")
    protected String modelName;
    @XmlAttribute(name = "functionName", required = true)
    protected MININGFUNCTION functionName;
    @XmlAttribute(name = "algorithmName")
    protected String algorithmName;
    @XmlAttribute(name = "targetReferenceCategory")
    protected String targetReferenceCategory;
    @XmlAttribute(name = "cumulativeLink")
    protected CUMULATIVELINKFUNCTION cumulativeLink;
    @XmlAttribute(name = "linkFunction")
    protected LINKFUNCTION linkFunction;
    @XmlAttribute(name = "linkParameter")
    protected Double linkParameter;
    @XmlAttribute(name = "trialsVariable")
    protected String trialsVariable;
    @XmlAttribute(name = "trialsValue")
    protected BigInteger trialsValue;
    @XmlAttribute(name = "distribution")
    protected String distribution;
    @XmlAttribute(name = "distParameter")
    protected Double distParameter;
    @XmlAttribute(name = "offsetVariable")
    protected String offsetVariable;
    @XmlAttribute(name = "offsetValue")
    protected Double offsetValue;
    @XmlAttribute(name = "modelDF")
    protected Double modelDF;
    @XmlAttribute(name = "endTimeVariable")
    protected String endTimeVariable;
    @XmlAttribute(name = "startTimeVariable")
    protected String startTimeVariable;
    @XmlAttribute(name = "subjectIDVariable")
    protected String subjectIDVariable;
    @XmlAttribute(name = "statusVariable")
    protected String statusVariable;
    @XmlAttribute(name = "baselineStrataVariable")
    protected String baselineStrataVariable;
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
     * Gets the value of the modelStats property.
     * 
     * @return
     *     possible object is
     *     {@link ModelStats }
     *     
     */
    public ModelStats getModelStats() {
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
    public void setModelStats(ModelStats value) {
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
    public ModelExplanation getModelExplanation() {
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
    public void setModelExplanation(ModelExplanation value) {
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
    public Targets getTargets() {
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
    public void setTargets(Targets value) {
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
     * Gets the value of the parameterList property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterList }
     *     
     */
    public ParameterList getParameterList() {
        return parameterList;
    }

    /**
     * Sets the value of the parameterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterList }
     *     
     */
    public void setParameterList(ParameterList value) {
        this.parameterList = value;
    }

    /**
     * Gets the value of the factorList property.
     * 
     * @return
     *     possible object is
     *     {@link FactorList }
     *     
     */
    public FactorList getFactorList() {
        return factorList;
    }

    /**
     * Sets the value of the factorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactorList }
     *     
     */
    public void setFactorList(FactorList value) {
        this.factorList = value;
    }

    /**
     * Gets the value of the covariateList property.
     * 
     * @return
     *     possible object is
     *     {@link CovariateList }
     *     
     */
    public CovariateList getCovariateList() {
        return covariateList;
    }

    /**
     * Sets the value of the covariateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CovariateList }
     *     
     */
    public void setCovariateList(CovariateList value) {
        this.covariateList = value;
    }

    /**
     * Gets the value of the ppMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link PPMatrix }
     *     
     */
    public PPMatrix getPPMatrix() {
        return ppMatrix;
    }

    /**
     * Sets the value of the ppMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PPMatrix }
     *     
     */
    public void setPPMatrix(PPMatrix value) {
        this.ppMatrix = value;
    }

    /**
     * Gets the value of the pCovMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link PCovMatrix }
     *     
     */
    public PCovMatrix getPCovMatrix() {
        return pCovMatrix;
    }

    /**
     * Sets the value of the pCovMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCovMatrix }
     *     
     */
    public void setPCovMatrix(PCovMatrix value) {
        this.pCovMatrix = value;
    }

    /**
     * Gets the value of the paramMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link ParamMatrix }
     *     
     */
    public ParamMatrix getParamMatrix() {
        return paramMatrix;
    }

    /**
     * Sets the value of the paramMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamMatrix }
     *     
     */
    public void setParamMatrix(ParamMatrix value) {
        this.paramMatrix = value;
    }

    /**
     * Gets the value of the eventValues property.
     * 
     * @return
     *     possible object is
     *     {@link EventValues }
     *     
     */
    public EventValues getEventValues() {
        return eventValues;
    }

    /**
     * Sets the value of the eventValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventValues }
     *     
     */
    public void setEventValues(EventValues value) {
        this.eventValues = value;
    }

    /**
     * Gets the value of the baseCumHazardTables property.
     * 
     * @return
     *     possible object is
     *     {@link BaseCumHazardTables }
     *     
     */
    public BaseCumHazardTables getBaseCumHazardTables() {
        return baseCumHazardTables;
    }

    /**
     * Sets the value of the baseCumHazardTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseCumHazardTables }
     *     
     */
    public void setBaseCumHazardTables(BaseCumHazardTables value) {
        this.baseCumHazardTables = value;
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
     * Gets the value of the targetVariableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetVariableName() {
        return targetVariableName;
    }

    /**
     * Sets the value of the targetVariableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetVariableName(String value) {
        this.targetVariableName = value;
    }

    /**
     * Gets the value of the modelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * Sets the value of the modelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelType(String value) {
        this.modelType = value;
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
     * Gets the value of the targetReferenceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetReferenceCategory() {
        return targetReferenceCategory;
    }

    /**
     * Sets the value of the targetReferenceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetReferenceCategory(String value) {
        this.targetReferenceCategory = value;
    }

    /**
     * Gets the value of the cumulativeLink property.
     * 
     * @return
     *     possible object is
     *     {@link CUMULATIVELINKFUNCTION }
     *     
     */
    public CUMULATIVELINKFUNCTION getCumulativeLink() {
        return cumulativeLink;
    }

    /**
     * Sets the value of the cumulativeLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUMULATIVELINKFUNCTION }
     *     
     */
    public void setCumulativeLink(CUMULATIVELINKFUNCTION value) {
        this.cumulativeLink = value;
    }

    /**
     * Gets the value of the linkFunction property.
     * 
     * @return
     *     possible object is
     *     {@link LINKFUNCTION }
     *     
     */
    public LINKFUNCTION getLinkFunction() {
        return linkFunction;
    }

    /**
     * Sets the value of the linkFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link LINKFUNCTION }
     *     
     */
    public void setLinkFunction(LINKFUNCTION value) {
        this.linkFunction = value;
    }

    /**
     * Gets the value of the linkParameter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLinkParameter() {
        return linkParameter;
    }

    /**
     * Sets the value of the linkParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLinkParameter(Double value) {
        this.linkParameter = value;
    }

    /**
     * Gets the value of the trialsVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrialsVariable() {
        return trialsVariable;
    }

    /**
     * Sets the value of the trialsVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrialsVariable(String value) {
        this.trialsVariable = value;
    }

    /**
     * Gets the value of the trialsValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrialsValue() {
        return trialsValue;
    }

    /**
     * Sets the value of the trialsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrialsValue(BigInteger value) {
        this.trialsValue = value;
    }

    /**
     * Gets the value of the distribution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribution() {
        return distribution;
    }

    /**
     * Sets the value of the distribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribution(String value) {
        this.distribution = value;
    }

    /**
     * Gets the value of the distParameter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistParameter() {
        return distParameter;
    }

    /**
     * Sets the value of the distParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistParameter(Double value) {
        this.distParameter = value;
    }

    /**
     * Gets the value of the offsetVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetVariable() {
        return offsetVariable;
    }

    /**
     * Sets the value of the offsetVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetVariable(String value) {
        this.offsetVariable = value;
    }

    /**
     * Gets the value of the offsetValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOffsetValue() {
        return offsetValue;
    }

    /**
     * Sets the value of the offsetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOffsetValue(Double value) {
        this.offsetValue = value;
    }

    /**
     * Gets the value of the modelDF property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getModelDF() {
        return modelDF;
    }

    /**
     * Sets the value of the modelDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setModelDF(Double value) {
        this.modelDF = value;
    }

    /**
     * Gets the value of the endTimeVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTimeVariable() {
        return endTimeVariable;
    }

    /**
     * Sets the value of the endTimeVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTimeVariable(String value) {
        this.endTimeVariable = value;
    }

    /**
     * Gets the value of the startTimeVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTimeVariable() {
        return startTimeVariable;
    }

    /**
     * Sets the value of the startTimeVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeVariable(String value) {
        this.startTimeVariable = value;
    }

    /**
     * Gets the value of the subjectIDVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectIDVariable() {
        return subjectIDVariable;
    }

    /**
     * Sets the value of the subjectIDVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectIDVariable(String value) {
        this.subjectIDVariable = value;
    }

    /**
     * Gets the value of the statusVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusVariable() {
        return statusVariable;
    }

    /**
     * Sets the value of the statusVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusVariable(String value) {
        this.statusVariable = value;
    }

    /**
     * Gets the value of the baselineStrataVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaselineStrataVariable() {
        return baselineStrataVariable;
    }

    /**
     * Sets the value of the baselineStrataVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaselineStrataVariable(String value) {
        this.baselineStrataVariable = value;
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
