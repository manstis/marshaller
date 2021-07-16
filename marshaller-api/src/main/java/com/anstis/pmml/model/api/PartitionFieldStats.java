//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.16 at 10:37:52 AM BST 
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Counts" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}NumericInfo" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.dmg.org/PMML-4_4}FrequenciesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="field" use="required" type="{http://www.dmg.org/PMML-4_4}FIELD-NAME" /&gt;
 *       &lt;attribute name="weighted" default="0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="0"/&gt;
 *             &lt;enumeration value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface PartitionFieldStats {


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
     * Gets the value of the counts property.
     * 
     * @return
     *     possible object is
     *     {@link Counts }
     *     
     */
    Counts getCounts();

    /**
     * Sets the value of the counts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Counts }
     *     
     */
    void setCounts(Counts value);

    /**
     * Gets the value of the numericInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NumericInfo }
     *     
     */
    NumericInfo getNumericInfo();

    /**
     * Sets the value of the numericInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericInfo }
     *     
     */
    void setNumericInfo(NumericInfo value);

    /**
     * Gets the value of the frequenciesType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequenciesType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequenciesType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NUMARRAY }
     *
     *
     */
    List<NUMARRAY> getFrequenciesType();

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getField();

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setField(String value);

    /**
     * Gets the value of the weighted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getWeighted();

    /**
     * Sets the value of the weighted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setWeighted(String value);

}
