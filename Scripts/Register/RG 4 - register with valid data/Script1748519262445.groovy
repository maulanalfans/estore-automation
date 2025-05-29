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

Mobile.verifyElementVisible(findTestObject('Object Repository/Registrasi Screen/title screen - Registrasi'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/txtfield - Nomor Handphone'), phone_number, 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/txtfield - Alamat Email'), email, 0)

String emailStore = Mobile.getText(findTestObject('Object Repository/Registrasi Screen/txtfield - Alamat Email'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi Screen/btn - Lanjutkan'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Registrasi Screen/txt title poup - Keterangan'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Registrasi Screen/popup - konfirmasi registrasi'), 0)

String popupConfirmation = Mobile.getText(findTestObject('Object Repository/Registrasi Screen/popup - konfirmasi registrasi'), 0)

Mobile.verifyMatch(popupConfirmation, 'Apakah data yang anda masukan sudah benar? Verifikasi OTP akan dikirimkan ke nomor yang Anda daftarkan', false)

Mobile.tap(findTestObject('Object Repository/Registrasi Screen/btn popup - OK'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/title screen - Registrasi Toko'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/txtfield - Nama Toko'), store_name, 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/txtfield - Nama Owner'), owner_name, 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/txtfield - KTP'), ktp, 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/txtfield - Alamat Owner'), owner_address, 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/txtfield - Email'), email, 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/txtfield - Nomor Handphone'), phone_number, 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/txtfield - Alamat Toko'), store_address, 0)

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/dropdown - Kota Toko'), 'Malang', 0)

Mobile.delay(2)
Mobile.tapAtPosition(97, 1641) //for screen 800 x 1800 | DPI : 320

Mobile.setText(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/txtfield - Password'), password, 0)

Mobile.swipe(97, 1641, 0, 0)
Mobile.verifyElementVisible(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/btn - Daftar'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/file - Foto KTP'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/camera button'), 5)

Mobile.verifyElementNotVisible(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/file - Foto KTP'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/file - Foto Toko'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/camera button'), 5)

Mobile.verifyElementNotVisible(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/file - Foto Toko'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/btn - Daftar'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/txt - popup prompt daftar'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi Screen/1. Form Registrasi/btn - prompt OK'),0)

//screen registrasi berhasil show up
Mobile.verifyElementVisible(findTestObject('Object Repository/Registrasi Screen/2. Registrasi Berhasil Screen/title screen Registrasi Berhasil'), 0)

//validate each data input to output
String registeredEmail = Mobile.getText(findTestObject('Object Repository/Registrasi Screen/2. Registrasi Berhasil Screen/txt - registered email'), 0)
String registeredOwnerName = Mobile.getText(findTestObject('Object Repository/Registrasi Screen/2. Registrasi Berhasil Screen/txt - registered owner name'), 0)
String registeredPassword = Mobile.getText(findTestObject('Object Repository/Registrasi Screen/2. Registrasi Berhasil Screen/txt - registered password'), 0)
String registeredPhoneNumber = Mobile.getText(findTestObject('Object Repository/Registrasi Screen/2. Registrasi Berhasil Screen/txt - registered phone number'), 0)
String registeredStoreAddress = Mobile.getText(findTestObject('Object Repository/Registrasi Screen/2. Registrasi Berhasil Screen/txt - registered store address'), 0)
String registeredStoreName = Mobile.getText(findTestObject('Object Repository/Registrasi Screen/2. Registrasi Berhasil Screen/txt - registered store name'), 0)
String registeredStoreCode = Mobile.getText(findTestObject('Object Repository/Registrasi Screen/2. Registrasi Berhasil Screen/txt - registered store code'), 0)

Mobile.verifyMatch(registeredEmail, email, false)
Mobile.verifyMatch(registeredOwnerName, owner_name, false)
Mobile.verifyMatch(registeredPassword, password, false)
Mobile.verifyMatch(registeredPhoneNumber, phone_number, false)
Mobile.verifyMatch(registeredStoreAddress, store_address, false)
Mobile.verifyMatch(registeredStoreName, store_name, false)

//if tap back arrow then redirect to login screen
// if tap button <setuju> then choose <OK> will redirect to OTP screen 

Mobile.tap(findTestObject('Object Repository/Registrasi Screen/2. Registrasi Berhasil Screen/btn - setuju'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi Screen/2. Registrasi Berhasil Screen/btn - prompt OK'), 0)