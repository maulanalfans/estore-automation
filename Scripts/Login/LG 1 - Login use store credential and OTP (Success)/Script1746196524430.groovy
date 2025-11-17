import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
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
import javax.swing.JOptionPane as JOptionPane
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Mobile.startExistingApplication(GlobalVariable.application_id, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Login Screen/title screen - Philips lighting e-store'), 10)

WebUI.callTestCase(findTestCase('Test Cases/Login/_Clear text in login screen'), null)

Mobile.setText(findTestObject('Object Repository/Login Screen/txtfield - Store Code'), GlobalVariable.store_code, 0)

Mobile.setText(findTestObject('Object Repository/Login Screen/txtfield - Password'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('Object Repository/Login Screen/btn - Masuk'), 0)

boolean popupOTPKadaluarsa = Mobile.verifyElementVisible(findTestObject("Object Repository/OTP Login Screen/txt - popup Terdapat OTP yang belum kadaluarsa"), 0)
if(popupOTPKadaluarsa) {
	Mobile.tap(findTestObject("Object Repository/OTP Login Screen/btn - OTP popup login kembali OK"), 0)
}

Mobile.verifyElementExist(findTestObject('Object Repository/OTP Login Screen/title screen - OTP Login'), 0)

String otp = JOptionPane.showInputDialog('Masukkan OTP yang diterima:')

if ((otp == null) || otp.trim().isEmpty()) {
    KeywordUtil.markFailed('OTP tidak diisi oleh tester.')

    assert false
} else {
    Mobile.setText(findTestObject('Object Repository/OTP Login Screen/txtfield - OTP'), otp, 10)
}

Mobile.delay(5)

String store_name = Mobile.getText(findTestObject('Object Repository/Dashboard/txt - Store Name'), 0)

if (store_name.toLowerCase().contains(GlobalVariable.store_code)) {
    WebUI.callTestCase(findTestCase('Test Cases/Login/_Logout from dashboard'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    assert false
}
