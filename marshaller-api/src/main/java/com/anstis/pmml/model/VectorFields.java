//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.14 at 12:47:30 PM UTC 
//

package com.anstis.pmml.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import jsinterop.annotations.JsType;
import org.treblereel.gwt.xml.mapper.api.annotation.XmlUnwrappedCollection;
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
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{http://www.dmg.org/PMML-4_4}FieldRef"/&gt;
 *           &lt;element ref="{http://www.dmg.org/PMML-4_4}CategoricalPredictor"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="numberOfFields" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "extension",
        "fieldRefOrCategoricalPredictor"
})
@XmlRootElement(name = "VectorFields")
@JsType
@GWT3Export
public class VectorFields {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElementRefs({
            @XmlElementRef(name = "FieldRef", type = FieldRef.class),
            @XmlElementRef(name = "CategoricalPredictor", type = CategoricalPredictor.class)
    })
    @XmlUnwrappedCollection
    protected List<IVectorFields> fieldRefOrCategoricalPredictor;
    @XmlAttribute(name = "numberOfFields")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfFields;

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
     * Gets the value of the fieldRefOrCategoricalPredictor property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldRefOrCategoricalPredictor property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldRefOrCategoricalPredictor().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldRef }
     * {@link CategoricalPredictor }
     */
    public List<IVectorFields> getFieldRefOrCategoricalPredictor() {
        if (fieldRefOrCategoricalPredictor == null) {
            fieldRefOrCategoricalPredictor = new ArrayList<IVectorFields>();
        }
        return this.fieldRefOrCategoricalPredictor;
    }

    /**
     * Gets the value of the numberOfFields property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getNumberOfFields() {
        return numberOfFields;
    }

    /**
     * Sets the value of the numberOfFields property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setNumberOfFields(BigInteger value) {
        this.numberOfFields = value;
    }
}
