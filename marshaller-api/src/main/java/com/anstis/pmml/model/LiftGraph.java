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
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}XCoordinates"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}YCoordinates"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}BoundaryValues" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}BoundaryValueMeans" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "extension",
        "xCoordinates",
        "yCoordinates",
        "boundaryValues",
        "boundaryValueMeans"
})
@XmlRootElement(name = "LiftGraph")
@JsType
@GWT3Export
public class LiftGraph {

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElement(name = "XCoordinates", required = true)
    protected XCoordinates xCoordinates;
    @XmlElement(name = "YCoordinates", required = true)
    protected YCoordinates yCoordinates;
    @XmlElement(name = "BoundaryValues")
    protected BoundaryValues boundaryValues;
    @XmlElement(name = "BoundaryValueMeans")
    protected BoundaryValueMeans boundaryValueMeans;

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
     * Gets the value of the xCoordinates property.
     *
     * @return possible object is
     * {@link XCoordinates }
     */
    public XCoordinates getXCoordinates() {
        return xCoordinates;
    }

    /**
     * Sets the value of the xCoordinates property.
     *
     * @param value allowed object is
     *              {@link XCoordinates }
     */
    public void setXCoordinates(XCoordinates value) {
        this.xCoordinates = value;
    }

    /**
     * Gets the value of the yCoordinates property.
     *
     * @return possible object is
     * {@link YCoordinates }
     */
    public YCoordinates getYCoordinates() {
        return yCoordinates;
    }

    /**
     * Sets the value of the yCoordinates property.
     *
     * @param value allowed object is
     *              {@link YCoordinates }
     */
    public void setYCoordinates(YCoordinates value) {
        this.yCoordinates = value;
    }

    /**
     * Gets the value of the boundaryValues property.
     *
     * @return possible object is
     * {@link BoundaryValues }
     */
    public BoundaryValues getBoundaryValues() {
        return boundaryValues;
    }

    /**
     * Sets the value of the boundaryValues property.
     *
     * @param value allowed object is
     *              {@link BoundaryValues }
     */
    public void setBoundaryValues(BoundaryValues value) {
        this.boundaryValues = value;
    }

    /**
     * Gets the value of the boundaryValueMeans property.
     *
     * @return possible object is
     * {@link BoundaryValueMeans }
     */
    public BoundaryValueMeans getBoundaryValueMeans() {
        return boundaryValueMeans;
    }

    /**
     * Sets the value of the boundaryValueMeans property.
     *
     * @param value allowed object is
     *              {@link BoundaryValueMeans }
     */
    public void setBoundaryValueMeans(BoundaryValueMeans value) {
        this.boundaryValueMeans = value;
    }
}
