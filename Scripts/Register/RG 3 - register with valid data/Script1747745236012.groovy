import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

Mobile.tap(findTestObject('Object Repository/Login Screen/btn - Daftar'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Registrasi Screen/title screen - Registraasi'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/txt - Nomor Handphone'), phone_number, 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/txt - Alamat Email'), email, 0)

String emailStore = Mobile.getText(findTestObject('Object Repository/Registrasi Screen/txt - Alamat Email'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi Screen/btn - Lanjutkan'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Registrasi Screen/txt title poup - Keterangan'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Registrasi Screen/popup - konfirmasi registrasi'), 0)

String popupConfirmation = Mobile.getText(findTestObject('Object Repository/Registrasi Screen/popup - konfirmasi registrasi'), 0)

Mobile.verifyMatch(popupConfirmation, 'Apakah data yang anda masukan sudah benar? Verifikasi OTP akan dikirimkan ke nomor yang Anda daftarkan', false)

Mobile.tap(findTestObject('Object Repository/Registrasi Screen/btn popup - OK'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Registrasi Screen/Form Registrasi/title screen - Registrasi Toko'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/Form Registrasi/txtfield - Nama Toko'), store_name, 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/Form Registrasi/txtfield - Nama Owner'), owner_name, 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/Form Registrasi/txtfield - KTP'), ktp, 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/Form Registrasi/txtfield - Alamat Owner'), owner_address, 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/Form Registrasi/txtfield - Email'), email, 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/Form Registrasi/txtfield - Nomor Handphone'), phone_number, 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/Form Registrasi/txtfield - Alamat Toko'), store_address, 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/Form Registrasi/dropdown - Kota Toko'), 'Malang', 0)

Mobile.delay(2)
Mobile.tapAtPosition(97, 1641) //for screen 800 x 1800 | DPI : 320

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/Form Registrasi/txtfield - Password'), password, 0)

Mobile.swipe(97, 1641, 0, 0)
Mobile.verifyElementVisible(findTestObject('Object Repository/Registrasi Screen/Form Registrasi/btn - Daftar'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi Screen/Form Registrasi/file - Foto KTP'), 10)


Mobile.verifyElementNotVisible(findTestObject('Object Repository/Registrasi Screen/Form Registrasi/file - Foto KTP'), 0)
Mobile.verifyElementNotVisible(findTestObject('Object Repository/Registrasi Screen/Form Registrasi/file - Foto Toko'), 0)
Mobile.tap(findTestObject('Object Repository/Registrasi Screen/Form Registrasi/btn - Daftar'), 10)
