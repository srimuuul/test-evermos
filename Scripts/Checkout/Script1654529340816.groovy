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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://evermos.com/home/')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Evermos Reseller online dan aplikasi D_3b84c7/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Masuk  Login Sebagai Reseller Evermos/input_Nomor Telepon_inputText__input'), 
    '6281223334444')

WebUI.setEncryptedText(findTestObject('Object Repository/Checkout/Page_Masuk  Login Sebagai Reseller Evermos/input_Kata Sandi_inputText__input'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Masuk  Login Sebagai Reseller Evermos/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Evermos - Katalog/span'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Evermos/a_Lanjut ke Checkout'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Evermos/button_LAIN KALI'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Evermos/a_Lihat Promo Tersedia'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Voucher Saya/div_Potongan Ongkir'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Voucher Saya/div_Potongan Ongkir'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Voucher Saya/a_Gunakan'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Voucher Saya/button_OK'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Evermos/input_Lihat Promo Tersedia_donationOffering'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Evermos/button_Rp10.000'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Evermos/a_Proses Sekarang'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Evermos/button_Bayar'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Evermos/button_OK'))

WebUI.closeBrowser()

