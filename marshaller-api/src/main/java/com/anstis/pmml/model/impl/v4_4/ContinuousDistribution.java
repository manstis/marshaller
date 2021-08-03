//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.03 at 09:25:28 AM BST 
//


package com.anstis.pmml.model.impl.v4_4;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.anstis.pmml.model.api.IContinuousDistribution;
import com.anstis.pmml.model.api.IContinuousNode;
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
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.dmg.org/PMML-4_4}TriangularDistributionForBN"/&gt;
 *           &lt;element ref="{http://www.dmg.org/PMML-4_4}NormalDistributionForBN"/&gt;
 *           &lt;element ref="{http://www.dmg.org/PMML-4_4}LognormalDistributionForBN"/&gt;
 *           &lt;element ref="{http://www.dmg.org/PMML-4_4}UniformDistributionForBN"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
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
    "triangularDistributionForBNOrNormalDistributionForBNOrLognormalDistributionForBN"
})
@XmlRootElement(name = "ContinuousDistribution")
@JsType
@GWT3Export
public class ContinuousDistribution
    implements IContinuousNode
{

    @XmlElement(name = "Extension")
    protected List<Extension> extension;
    @XmlElementRefs({
        @XmlElementRef(name = "TriangularDistributionForBN", namespace = "http://www.dmg.org/PMML-4_4", type = TriangularDistributionForBN.class, required = false),
        @XmlElementRef(name = "NormalDistributionForBN", namespace = "http://www.dmg.org/PMML-4_4", type = NormalDistributionForBN.class, required = false),
        @XmlElementRef(name = "LognormalDistributionForBN", namespace = "http://www.dmg.org/PMML-4_4", type = LognormalDistributionForBN.class, required = false),
        @XmlElementRef(name = "UniformDistributionForBN", namespace = "http://www.dmg.org/PMML-4_4", type = UniformDistributionForBN.class, required = false)
    })
    protected IContinuousDistribution triangularDistributionForBNOrNormalDistributionForBNOrLognormalDistributionForBN;

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
     * Gets the value of the triangularDistributionForBNOrNormalDistributionForBNOrLognormalDistributionForBN property.
     * 
     * @return
     *     possible object is
     *     {@link TriangularDistributionForBN }
     *     {@link NormalDistributionForBN }
     *     {@link LognormalDistributionForBN }
     *     {@link UniformDistributionForBN }
     *     
     */
    public IContinuousDistribution getTriangularDistributionForBNOrNormalDistributionForBNOrLognormalDistributionForBN() {
        return triangularDistributionForBNOrNormalDistributionForBNOrLognormalDistributionForBN;
    }

    /**
     * Sets the value of the triangularDistributionForBNOrNormalDistributionForBNOrLognormalDistributionForBN property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriangularDistributionForBN }
     *     {@link NormalDistributionForBN }
     *     {@link LognormalDistributionForBN }
     *     {@link UniformDistributionForBN }
     *     
     */
    public void setTriangularDistributionForBNOrNormalDistributionForBNOrLognormalDistributionForBN(IContinuousDistribution value) {
        this.triangularDistributionForBNOrNormalDistributionForBNOrLognormalDistributionForBN = value;
    }

}
