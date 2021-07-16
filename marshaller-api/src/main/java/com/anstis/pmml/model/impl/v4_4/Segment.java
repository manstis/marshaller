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

import com.anstis.pmml.model.api.IModel;
import com.anstis.pmml.model.api.IPredicate;
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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_4}PREDICATE"/&gt;
 *         &lt;group ref="{http://www.dmg.org/PMML-4_4}MODEL-ELEMENT"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}VariableWeight" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "model",
    "variableWeight"
})
@XmlRootElement(name = "Segment")
@JsType
@GWT3Export
public class Segment {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElementRefs({
        @XmlElementRef(name = "SimplePredicate", namespace = "http://www.dmg.org/PMML-4_4", type = SimplePredicate.class, required = false),
        @XmlElementRef(name = "CompoundPredicate", namespace = "http://www.dmg.org/PMML-4_4", type = CompoundPredicate.class, required = false),
        @XmlElementRef(name = "SimpleSetPredicate", namespace = "http://www.dmg.org/PMML-4_4", type = SimpleSetPredicate.class, required = false),
        @XmlElementRef(name = "True", namespace = "http://www.dmg.org/PMML-4_4", type = True.class, required = false),
        @XmlElementRef(name = "False", namespace = "http://www.dmg.org/PMML-4_4", type = False.class, required = false)
    })
    protected IPredicate predicate;
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
    protected IModel model;
    @XmlElement(name = "VariableWeight")
    protected VariableWeight variableWeight;
    @XmlAttribute(name = "id")
    protected String id;
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
    public IPredicate getPredicate() {
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
    public void setPredicate(IPredicate value) {
        this.predicate = value;
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
    public IModel getModel() {
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
    public void setModel(IModel value) {
        this.model = value;
    }

    /**
     * Gets the value of the variableWeight property.
     * 
     * @return
     *     possible object is
     *     {@link VariableWeight }
     *     
     */
    public VariableWeight getVariableWeight() {
        return variableWeight;
    }

    /**
     * Sets the value of the variableWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableWeight }
     *     
     */
    public void setVariableWeight(VariableWeight value) {
        this.variableWeight = value;
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
