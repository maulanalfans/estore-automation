import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import javax.swing.JOptionPane
import com.kms.katalon.core.util.KeywordUtil
import estore.helper.ToastVerifier
Mobile.startExistingApplication(GlobalVariable.application_id, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Login/_Clear text in login screen'), null)

Mobile.waitForElementPresent(findTestObject('Object Repository/Login Screen/title screen - Philips lighting e-store'), 5)

Mobile.setText(findTestObject('Object Repository/Login Screen/txtfield - Nomor Handphone'), GlobalVariable.store_phone_number, 0)

Mobile.tap(findTestObject('Object Repository/Login Screen/btn - Masuk Dengan Nomor Handphone'), 0)

boolean popupOTPKadaluarsa = Mobile.verifyElementVisible(findTestObject("Object Repository/OTP Login Screen/txt - popup Terdapat OTP yang belum kadaluarsa"), 0)
if(popupOTPKadaluarsa) {
	Mobile.tap(findTestObject("Object Repository/OTP Login Screen/btn - OTP popup login kembali OK"), 0)
}

Mobile.verifyElementVisible(findTestObject('Object Repository/OTP Login Screen/title screen - OTP Login'), 0)

Mobile.setText(findTestObject('Object Repository/OTP Login Screen/txtfield - OTP'), OTP, 0)

def toast = new ToastVerifier()
def isToastExist = toast.verifyToast("Kode OTP Tidak Ditemukan","OTP_Invalid")

if(isToastExist == 0) {
	assert true : "Toast visible and correct"
	Mobile.callTestCase(findTestCase('Login/_Logout from OTP screen'), [:])
}else {
	assert false : "Toast tidak muncul atau expected text tidak sama"
	Mobile.callTestCase(findTestCase('Login/_Logout from OTP screen'), [:])
}