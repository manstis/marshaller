//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.16 at 10:37:52 AM BST 
//


package com.anstis.pmml.model.api;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="alpha" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *       &lt;attribute name="smoothedValue" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface Level {


    /**
     * Gets the value of the alpha property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    Double getAlpha();

    /**
     * Sets the value of the alpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    void setAlpha(Double value);

    /**
     * Gets the value of the smoothedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    Double getSmoothedValue();

    /**
     * Sets the value of the smoothedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    void setSmoothedValue(Double value);

}
