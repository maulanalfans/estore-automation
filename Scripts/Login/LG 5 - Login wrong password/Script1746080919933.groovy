import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword as Keyword
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

Mobile.waitForElementPresent(findTestObject('Object Repository/Login Screen/title screen - Philips lighting e-store'), 5)

WebUI.callTestCase(findTestCase('Test Cases/Login/_Clear text in login screen'), null)

Mobile.setText(findTestObject('Object Repository/Login Screen/txtfield - Store Code'), store_code, 0)

Mobile.setText(findTestObject('Object Repository/Login Screen/txtfield - Password'), password + '1234', 0)

Mobile.tap(findTestObject('Object Repository/Login Screen/btn - Masuk'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Login Screen/snackbar alert'), 5)

String alert_invalid = Mobile.getText(findTestObject('Object Repository/Login Screen/snackbar alert'), 0)

Mobile.verifyMatch(alert_invalid, 'Invalid credentials supplied.', false)

Mobile.waitForElementPresent(findTestObject('Object Repository/Login Screen/title screen - Philips lighting e-store'), 5)