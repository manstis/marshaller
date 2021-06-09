//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.09 at 01:19:52 PM BST 
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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_4}EXPRESSION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="function" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="mapMissingTo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="invalidValueTreatment" type="{http://www.dmg.org/PMML-4_4}INVALID-VALUE-TREATMENT-METHOD" default="returnInvalid" /&gt;
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
    "expression"
})
@XmlRootElement(name = "Apply")
@JsType
@GWT3Export
public class Apply
    implements IApply
{

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElementRefs({
        @XmlElementRef(name = "Constant", namespace = "http://www.dmg.org/PMML-4_4", type = Constant.class, required = false),
        @XmlElementRef(name = "FieldRef", namespace = "http://www.dmg.org/PMML-4_4", type = FieldRef.class, required = false),
        @XmlElementRef(name = "NormContinuous", namespace = "http://www.dmg.org/PMML-4_4", type = NormContinuous.class, required = false),
        @XmlElementRef(name = "NormDiscrete", namespace = "http://www.dmg.org/PMML-4_4", type = NormDiscrete.class, required = false),
        @XmlElementRef(name = "Discretize", namespace = "http://www.dmg.org/PMML-4_4", type = Discretize.class, required = false),
        @XmlElementRef(name = "MapValues", namespace = "http://www.dmg.org/PMML-4_4", type = MapValues.class, required = false),
        @XmlElementRef(name = "TextIndex", namespace = "http://www.dmg.org/PMML-4_4", type = TextIndex.class, required = false),
        @XmlElementRef(name = "Apply", namespace = "http://www.dmg.org/PMML-4_4", type = Apply.class, required = false),
        @XmlElementRef(name = "Aggregate", namespace = "http://www.dmg.org/PMML-4_4", type = Aggregate.class, required = false),
        @XmlElementRef(name = "Lag", namespace = "http://www.dmg.org/PMML-4_4", type = Lag.class, required = false)
    })
    protected List<IApply> expression;
    @XmlAttribute(name = "function", required = true)
    protected String function;
    @XmlAttribute(name = "mapMissingTo")
    protected String mapMissingTo;
    @XmlAttribute(name = "defaultValue")
    protected String defaultValue;
    @XmlAttribute(name = "invalidValueTreatment")
    protected INVALIDVALUETREATMENTMETHOD invalidValueTreatment;

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
     * Gets the value of the expression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Constant }
     * {@link FieldRef }
     * {@link NormContinuous }
     * {@link NormDiscrete }
     * {@link Discretize }
     * {@link MapValues }
     * {@link TextIndex }
     * {@link Apply }
     * {@link Aggregate }
     * {@link Lag }
     * 
     * 
     */
    public List<IApply> getExpression() {
        if (expression == null) {
            expression = new ArrayList<IApply>();
        }
        return this.expression;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the mapMissingTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapMissingTo() {
        return mapMissingTo;
    }

    /**
     * Sets the value of the mapMissingTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapMissingTo(String value) {
        this.mapMissingTo = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the invalidValueTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link INVALIDVALUETREATMENTMETHOD }
     *     
     */
    public INVALIDVALUETREATMENTMETHOD getInvalidValueTreatment() {
        if (invalidValueTreatment == null) {
            return INVALIDVALUETREATMENTMETHOD.RETURN_INVALID;
        } else {
            return invalidValueTreatment;
        }
    }

    /**
     * Sets the value of the invalidValueTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link INVALIDVALUETREATMENTMETHOD }
     *     
     */
    public void setInvalidValueTreatment(INVALIDVALUETREATMENTMETHOD value) {
        this.invalidValueTreatment = value;
    }

}
