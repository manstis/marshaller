//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.14 at 12:47:30 PM UTC 
//

package com.anstis.pmml.model;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.dmg.org/PMML-4_4}KalmanState"/&gt;
 *           &lt;element ref="{http://www.dmg.org/PMML-4_4}ThetaRecursionState"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="method" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="kalman"/&gt;
 *             &lt;enumeration value="thetaRecursion"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="periodDeficit" type="{http://www.dmg.org/PMML-4_4}INT-NUMBER" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "kalmanState",
        "thetaRecursionState"
})
@XmlRootElement(name = "MaximumLikelihoodStat")
@JsType
@GWT3Export
public class MaximumLikelihoodStat {

    @XmlElement(name = "KalmanState")
    protected KalmanState kalmanState;
    @XmlElement(name = "ThetaRecursionState")
    protected ThetaRecursionState thetaRecursionState;
    @XmlAttribute(name = "method", required = true)
    protected String method;
    @XmlAttribute(name = "periodDeficit")
    protected BigInteger periodDeficit;

    /**
     * Gets the value of the kalmanState property.
     *
     * @return possible object is
     * {@link KalmanState }
     */
    public KalmanState getKalmanState() {
        return kalmanState;
    }

    /**
     * Sets the value of the kalmanState property.
     *
     * @param value allowed object is
     *              {@link KalmanState }
     */
    public void setKalmanState(KalmanState value) {
        this.kalmanState = value;
    }

    /**
     * Gets the value of the thetaRecursionState property.
     *
     * @return possible object is
     * {@link ThetaRecursionState }
     */
    public ThetaRecursionState getThetaRecursionState() {
        return thetaRecursionState;
    }

    /**
     * Sets the value of the thetaRecursionState property.
     *
     * @param value allowed object is
     *              {@link ThetaRecursionState }
     */
    public void setThetaRecursionState(ThetaRecursionState value) {
        this.thetaRecursionState = value;
    }

    /**
     * Gets the value of the method property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the periodDeficit property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPeriodDeficit() {
        if (periodDeficit == null) {
            return new BigInteger("0");
        } else {
            return periodDeficit;
        }
    }

    /**
     * Sets the value of the periodDeficit property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPeriodDeficit(BigInteger value) {
        this.periodDeficit = value;
    }
}
