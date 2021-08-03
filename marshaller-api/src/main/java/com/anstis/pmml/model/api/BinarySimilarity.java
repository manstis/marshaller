//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.03 at 09:25:22 AM BST 
//


package com.anstis.pmml.model.api;

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
 *       &lt;/sequence&gt;
 *       &lt;attribute name="c00-parameter" use="required" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="c01-parameter" use="required" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="c10-parameter" use="required" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="c11-parameter" use="required" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="d00-parameter" use="required" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="d01-parameter" use="required" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="d10-parameter" use="required" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="d11-parameter" use="required" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface BinarySimilarity {


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
     * Gets the value of the c00Parameter property.
     * 
     */
    double getC00Parameter();

    /**
     * Sets the value of the c00Parameter property.
     * 
     */
    void setC00Parameter(double value);

    /**
     * Gets the value of the c01Parameter property.
     * 
     */
    double getC01Parameter();

    /**
     * Sets the value of the c01Parameter property.
     * 
     */
    void setC01Parameter(double value);

    /**
     * Gets the value of the c10Parameter property.
     * 
     */
    double getC10Parameter();

    /**
     * Sets the value of the c10Parameter property.
     * 
     */
    void setC10Parameter(double value);

    /**
     * Gets the value of the c11Parameter property.
     * 
     */
    double getC11Parameter();

    /**
     * Sets the value of the c11Parameter property.
     * 
     */
    void setC11Parameter(double value);

    /**
     * Gets the value of the d00Parameter property.
     * 
     */
    double getD00Parameter();

    /**
     * Sets the value of the d00Parameter property.
     * 
     */
    void setD00Parameter(double value);

    /**
     * Gets the value of the d01Parameter property.
     * 
     */
    double getD01Parameter();

    /**
     * Sets the value of the d01Parameter property.
     * 
     */
    void setD01Parameter(double value);

    /**
     * Gets the value of the d10Parameter property.
     * 
     */
    double getD10Parameter();

    /**
     * Sets the value of the d10Parameter property.
     * 
     */
    void setD10Parameter(double value);

    /**
     * Gets the value of the d11Parameter property.
     * 
     */
    double getD11Parameter();

    /**
     * Sets the value of the d11Parameter property.
     * 
     */
    void setD11Parameter(double value);

}
