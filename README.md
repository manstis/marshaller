# marshaller
PoC with treblereel's annotation processor

# PoC stuff to remember
The follow steps should be completed if building marshalling from the XSD.

(1) Install `xjc` (or use Maven plugin, this approach uses CLI):

`sudo apt install jaxb`

(2) Edit `pmml-4-4.xsd`

```
xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
           xmlns:jxb="http://java.sun.com/xml/ns/jaxb"                 <-- Add jxb namespace
           xmlns="http://www.dmg.org/PMML-4_4"
           jxb:version="2.1"
           elementFormDefault="unqualified"
           targetNamespace="http://www.dmg.org/PMML-4_4">              <-- Define jaxb version
         
<xs:element name="OutputField">
  <xs:complexType>
    <xs:sequence>
      <xs:element ref="Extension" minOccurs="0" maxOccurs="unbounded"/>
      <xs:sequence minOccurs="0" maxOccurs="1">
        <xs:element ref="Decisions" minOccurs="0" maxOccurs="1"/>
        <xs:group ref="EXPRESSION" minOccurs="1" maxOccurs="1"/>
        <xs:element ref="Value" minOccurs="0" maxOccurs="unbounded">   <-- For the Value element we need to map to a different property name
          <xs:annotation>
            <xs:appinfo>
              <jxb:property name="valueAttribute"/>
            </xs:appinfo>
          </xs:annotation>
        </xs:element>                                                  <-- New closing tag
      </xs:sequence>
    </xs:sequence>
```

Remove duplicate `Extension` declaration from `Scorecard` and `TimeSeriesModel` 

(3) Generate Java classes

`xjc -p com.anstis.pmml.model ../resources/pmml-4-4.xsd` 

(4) Add `jaxb-api` as project dependency
```
<dependency>
  <groupId>javax.xml.bind</groupId>
  <artifactId>jaxb-api</artifactId>
  <version>2.2.1</version>
</dependency>
```
(5) Delete `ObjectFactory` (not needed)

(6) Remove use of `Object` in some collections.
- The XSD does not have super-types for different elements that can exist in a collection.
- For example, `PMML.anomalyDetectionModelOrAssociationModelOrBayesianNetworkModel` is a collection of the models in the file. However none of the permissible models implement an interface or extend a super-class. Consequentially the generated `PMML` class has a `List<Object>` for models. 
- To eliminate use of `Object` create a marker interface e.g. `IPMML` and change `PMML.anomalyDetectionModelOrAssociationModelOrBayesianNetworkModel` to be `List<IPMML>`. Then have each model class implement the interface.

(7) Make the following changes to the collection properties that you had to fix with the foregoing:-
- Mark each property with `@XmlUnwrappedCollection`.
- Change use of `@XmlElements` to `@XmlElementRefs`.

Job done. Go have a beer.