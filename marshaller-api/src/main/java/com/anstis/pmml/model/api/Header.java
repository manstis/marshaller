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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Application" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Annotation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Timestamp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="copyright" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="modelVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface Header {


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
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link Application }
     *     
     */
    Application getApplication();

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link Application }
     *     
     */
    void setApplication(Application value);

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * 
     * 
     */
    List<Annotation> getAnnotation();

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    Timestamp getTimestamp();

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    void setTimestamp(Timestamp value);

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCopyright();

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCopyright(String value);

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDescription();

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDescription(String value);

    /**
     * Gets the value of the modelVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getModelVersion();

    /**
     * Sets the value of the modelVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setModelVersion(String value);

}
