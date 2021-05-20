//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.14 at 12:47:30 PM UTC 
//

package com.anstis.pmml.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import jsinterop.annotations.JsType;
import org.treblereel.j2cl.processors.annotations.GWT3Export;

/**
 * <p>Java class for TIMESERIES-ALGORITHM.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TIMESERIES-ALGORITHM"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ARIMA"/&gt;
 *     &lt;enumeration value="ExponentialSmoothing"/&gt;
 *     &lt;enumeration value="SeasonalTrendDecomposition"/&gt;
 *     &lt;enumeration value="SpectralAnalysis"/&gt;
 *     &lt;enumeration value="StateSpaceModel"/&gt;
 *     &lt;enumeration value="GARCH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "TIMESERIES-ALGORITHM")
@XmlEnum
@JsType
@GWT3Export
public enum TIMESERIESALGORITHM {

    ARIMA("ARIMA"),
    @XmlEnumValue("ExponentialSmoothing")
    EXPONENTIAL_SMOOTHING("ExponentialSmoothing"),
    @XmlEnumValue("SeasonalTrendDecomposition")
    SEASONAL_TREND_DECOMPOSITION("SeasonalTrendDecomposition"),
    @XmlEnumValue("SpectralAnalysis")
    SPECTRAL_ANALYSIS("SpectralAnalysis"),
    @XmlEnumValue("StateSpaceModel")
    STATE_SPACE_MODEL("StateSpaceModel"),
    GARCH("GARCH");
    private final String value;

    TIMESERIESALGORITHM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TIMESERIESALGORITHM fromValue(String v) {
        for (TIMESERIESALGORITHM c : TIMESERIESALGORITHM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
