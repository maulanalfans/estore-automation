import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.swing.JOptionPane
//import io.appium.java_client.android.AndroidDriver
//import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication(GlobalVariable.application_id, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Login Screen/title screen - Philips lighting e-store'), 10)

WebUI.callTestCase(findTestCase('Test Cases/Login/_Clear text in login screen'), null)

Mobile.setText(findTestObject('Object Repository/Login Screen/txtfield - Store Code'), GlobalVariable.store_code, 0)

Mobile.setText(findTestObject('Object Repository/Login Screen/txtfield - Password'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('Object Repository/Login Screen/btn - Masuk'), 0)

Mobile.closeApplication()

Thread.sleep(2000)

Mobile.startExistingApplication(GlobalVariable.application_id, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5)

String store_name = Mobile.getText(findTestObject('Object Repository/Dashboard/txt - Store Name'), 0, FailureHandling.OPTIONAL)

if (store_name == null || !store_name || store_name == '') {
	assert true	: 'bug closed'
}else {
	Mobile.verifyMatch(GlobalVariable.store_code,".*${store_name.toLowerCase()}*.", false)
	assert false : 'bypass successfuly'
}