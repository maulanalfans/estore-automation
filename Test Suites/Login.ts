<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Login</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>15</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>1a32678a-a9ed-4f43-b7e1-679bde3bb560</testSuiteGuid>
   <testCaseLink>
      <guid>063c26f7-0d5b-44a0-9c59-dd3bf3cd9240</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/Login/LG 2 - Login nomor handphone and OTP (Success)</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>19c32418-6eb4-4874-927a-93bdcc50ee77</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/Login/LG 1 - Login use store credential and OTP (Success)</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>97f04281-342e-497b-a50b-ef19396977eb</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/Login/LG 5 - Login wrong password</testCaseId>
      <testDataLink>
         <combinationType>MANY</combinationType>
         <id>57457100-3b6c-4a83-b91f-cfafba92d48c</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Login Data/Login Data Auth</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>57457100-3b6c-4a83-b91f-cfafba92d48c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>store_code</value>
         <variableId>87099356-45e7-4cde-a14b-603a31c66244</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>57457100-3b6c-4a83-b91f-cfafba92d48c</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>0c59d8d2-7931-4144-a20c-2c10b9e4303b</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>3e4cd16a-b341-4cb6-ae63-e0d04d082912</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/Login/LG 3 - Login with blank form</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>64613e37-202e-4603-8647-012ec561643b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/LG 4 - Login blank phone number</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>c3f89cc5-25c4-44ef-9ee9-364c32e2689c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/Login/LG. 8 - Resend OTP</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>53a43d37-485c-4707-8603-9423532e790e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/LG 7 - checking OTP invalid</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>20a31c78-5476-4390-9f9b-60c5a5346fad</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>1fba3cfb-2d13-4a17-802a-c1627602b441</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/LG 6 - checking OTP blank</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>266e715d-119a-497d-9baa-ea68c082f15b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/Login/BUG 1 - bypass login from OTP screen</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
