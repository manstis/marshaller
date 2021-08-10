goog.module('com.anstis.pmml');

const Loader = goog.require('com.anstis.pmml.Loader');

const xml = '<PMML xmlns="http://www.dmg.org/PMML-4_1" version="4.1">\n' +
        '  <Header copyright="www.dmg.org" description="Sample scorecard">\n' +
        '    <Timestamp>2010-11-10T08:17:10.8</Timestamp>\n' +
        '  </Header>\n' +
        '  <DataDictionary>\n' +
        '    <DataField name="department" dataType="string" optype="categorical"/>\n' +
        '    <DataField name="age" dataType="integer" optype="continuous"/>\n' +
        '    <DataField name="income" dataType="double" optype="continuous"/>\n' +
        '    <DataField name="overallScore" dataType="double" optype="continuous"/>\n' +
        '  </DataDictionary>\n' +
        '  <Scorecard modelName="SampleScorecard" functionName="regression" useReasonCodes="true" reasonCodeAlgorithm="pointsBelow" initialScore="0" baselineMethod="other">\n' +
        '    <MiningSchema>\n' +
        '      <MiningField name="department" usageType="active" invalidValueTreatment="asMissing"/>\n' +
        '      <MiningField name="age" usageType="active" invalidValueTreatment="asMissing"/>\n' +
        '      <MiningField name="income" usageType="active" invalidValueTreatment="asMissing"/>\n' +
        '      <MiningField name="overallScore" usageType="predicted"/>\n' +
        '    </MiningSchema>\n' +
        '    <Output>\n' +
        '      <OutputField name="Final Score" feature="predictedValue" dataType="double" optype="continuous"/>\n' +
        '      <OutputField name="Reason Code 1" rank="1" feature="reasonCode" dataType="string" optype="categorical"/>\n' +
        '      <OutputField name="Reason Code 2" rank="2" feature="reasonCode" dataType="string" optype="categorical"/>\n' +
        '      <OutputField name="Reason Code 3" rank="3" feature="reasonCode" dataType="string" optype="categorical"/>\n' +
        '    </Output>\n' +
        '    <Characteristics>\n' +
        '      <Characteristic name="departmentScore" reasonCode="RC1" baselineScore="19">\n' +
        '        <Attribute partialScore="-9">\n' +
        '          <SimplePredicate field="department" operator="isMissing"/>\n' +
        '        </Attribute>\n' +
        '        <Attribute partialScore="19">\n' +
        '          <SimplePredicate field="department" operator="equal" value="marketing"/>\n' +
        '        </Attribute>\n' +
        '        <Attribute partialScore="3">\n' +
        '          <SimplePredicate field="department" operator="equal" value="engineering"/>\n' +
        '        </Attribute>\n' +
        '        <Attribute partialScore="6">\n' +
        '          <SimplePredicate field="department" operator="equal" value="business"/>\n' +
        '        </Attribute>\n' +
        '      </Characteristic>\n' +
        '      <Characteristic name="ageScore" reasonCode="RC2" baselineScore="18">\n' +
        '        <Attribute partialScore="-1">\n' +
        '          <SimplePredicate field="age" operator="isMissing"/>\n' +
        '        </Attribute>\n' +
        '        <Attribute partialScore="-3">\n' +
        '          <SimplePredicate field="age" operator="lessOrEqual" value="18"/>\n' +
        '        </Attribute>\n' +
        '        <Attribute partialScore="0">\n' +
        '          <CompoundPredicate booleanOperator="and">\n' +
        '            <SimplePredicate field="age" operator="greaterThan" value="18"/>\n' +
        '            <SimplePredicate field="age" operator="lessOrEqual" value="29"/>\n' +
        '          </CompoundPredicate>\n' +
        '        </Attribute>\n' +
        '        <Attribute partialScore="12">\n' +
        '          <CompoundPredicate booleanOperator="and">\n' +
        '            <SimplePredicate field="age" operator="greaterThan" value="29"/>\n' +
        '            <SimplePredicate field="age" operator="lessOrEqual" value="39"/>\n' +
        '          </CompoundPredicate>\n' +
        '        </Attribute>\n' +
        '        <Attribute partialScore="18">\n' +
        '          <SimplePredicate field="age" operator="greaterThan" value="39"/>\n' +
        '        </Attribute>\n' +
        '      </Characteristic>\n' +
        '      <Characteristic name="incomeScore" reasonCode="RC3" baselineScore="10">\n' +
        '        <Attribute partialScore="5">\n' +
        '          <SimplePredicate field="income" operator="isMissing"/>\n' +
        '        </Attribute>\n' +
        '        <Attribute partialScore="26">\n' +
        '          <SimplePredicate field="income" operator="lessOrEqual" value="1000"/>\n' +
        '        </Attribute>\n' +
        '        <Attribute partialScore="5">\n' +
        '          <CompoundPredicate booleanOperator="and">\n' +
        '            <SimplePredicate field="income" operator="greaterThan" value="1000"/>\n' +
        '            <SimplePredicate field="income" operator="lessOrEqual" value="2500"/>\n' +
        '          </CompoundPredicate>\n' +
        '        </Attribute>\n' +
        '        <Attribute partialScore="-3">\n' +
        '          <SimplePredicate field="income" operator="greaterThan" value="2500"/>\n' +
        '        </Attribute>\n' +
        '      </Characteristic>\n' +
        '    </Characteristics>\n' +
        '  </Scorecard>\n' +
        '</PMML>\n';

const pmml = Loader.load(xml);
console.log(pmml);
const result = Loader.save(pmml);
console.log(result);