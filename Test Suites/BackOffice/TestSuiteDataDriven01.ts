<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>Test suite of data driven login bo</description>
   <name>TestSuiteDataDriven01</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>1</numberOfRerun>
   <pageLoadTimeout>3</pageLoadTimeout>
   <pageLoadTimeoutDefault>false</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>2e18dcff-b6c9-4d4f-aee2-9cb3b3ef453a</testSuiteGuid>
   <testCaseLink>
      <guid>60232e0b-eaf5-4f17-b139-104a5db5ef7d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/BackOffice/Login/DataDriven_TC01_Login</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>0697bbe0-da0b-428b-8b28-877e75f60fae</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/LoginBO/BOTestData01</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>0697bbe0-da0b-428b-8b28-877e75f60fae</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>032dd090-0b9f-44b3-921a-f989acdc9785</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>0697bbe0-da0b-428b-8b28-877e75f60fae</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>ef76b311-d8f2-4100-8463-e1ce385d22dd</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
