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

import com.anstis.pmml.model.api.IExpression;
import com.anstis.pmml.model.api.ITable;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}FieldColumnPair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://www.dmg.org/PMML-4_4}TableLocator"/&gt;
 *           &lt;element ref="{http://www.dmg.org/PMML-4_4}InlineTable"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="mapMissingTo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="outputColumn" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dataType" type="{http://www.dmg.org/PMML-4_4}DATATYPE" /&gt;
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
    "fieldColumnPair",
    "table"
})
@XmlRootElement(name = "MapValues")
@JsType
@GWT3Export
public class MapValues
    implements IExpression, com.anstis.pmml.model.api.MapValues
{

    @XmlElement(name = "Extension", type = Extension.class)
    protected List<com.anstis.pmml.model.api.Extension> extension;
    @XmlElement(name = "FieldColumnPair", type = FieldColumnPair.class)
    protected List<com.anstis.pmml.model.api.FieldColumnPair> fieldColumnPair;
    @XmlElementRefs({
        @XmlElementRef(name = "TableLocator", namespace = "http://www.dmg.org/PMML-4_4", type = TableLocator.class, required = false),
        @XmlElementRef(name = "InlineTable", namespace = "http://www.dmg.org/PMML-4_4", type = InlineTable.class, required = false)
    })
    protected ITable table;
    @XmlAttribute(name = "mapMissingTo")
    protected String mapMissingTo;
    @XmlAttribute(name = "defaultValue")
    protected String defaultValue;
    @XmlAttribute(name = "outputColumn", required = true)
    protected String outputColumn;
    @XmlAttribute(name = "dataType")
    protected com.anstis.pmml.model.api.DATATYPE dataType;

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
     * Gets the value of the fieldColumnPair property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldColumnPair property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldColumnPair().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldColumnPair }
     * 
     * 
     */
    public List<com.anstis.pmml.model.api.FieldColumnPair> getFieldColumnPair() {
        if (fieldColumnPair == null) {
            fieldColumnPair = new ArrayList<com.anstis.pmml.model.api.FieldColumnPair>();
        }
        return this.fieldColumnPair;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link TableLocator }
     *     {@link InlineTable }
     *     
     */
    public ITable getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableLocator }
     *     {@link InlineTable }
     *     
     */
    public void setTable(ITable value) {
        this.table = value;
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
     * Gets the value of the outputColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputColumn() {
        return outputColumn;
    }

    /**
     * Sets the value of the outputColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputColumn(String value) {
        this.outputColumn = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link DATATYPE }
     *     
     */
    public com.anstis.pmml.model.api.DATATYPE getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DATATYPE }
     *     
     */
    public void setDataType(com.anstis.pmml.model.api.DATATYPE value) {
        this.dataType = value;
    }

}
