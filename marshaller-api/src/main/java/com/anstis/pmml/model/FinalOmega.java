//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.14 at 12:47:30 PM UTC 
//

package com.anstis.pmml.model;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Matrix"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "matrix"
})
@XmlRootElement(name = "FinalOmega")
@JsType
@GWT3Export
public class FinalOmega {

    @XmlElement(name = "Matrix", required = true)
    protected Matrix matrix;

    /**
     * Gets the value of the matrix property.
     *
     * @return possible object is
     * {@link Matrix }
     */
    public Matrix getMatrix() {
        return matrix;
    }

    /**
     * Sets the value of the matrix property.
     *
     * @param value allowed object is
     *              {@link Matrix }
     */
    public void setMatrix(Matrix value) {
        this.matrix = value;
    }
}
