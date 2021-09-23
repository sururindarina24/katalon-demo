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

WebUI.navigateToUrl('https://ponnybeaute.co.id/')

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/span_'))

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/a_LOGIN'))

WebUI.setText(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/input_Harap email anda_email_login'), 
    'sururindarina378@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/button_LANJUTKAN DENGAN EMAIL'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/input_Email_password'), 
    '6lPpqkjcgrUMRmk8XUBwIQ==')

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/button_MASUK'))

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/a_LOGIN'))

WebUI.setText(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/input_Harap email anda_email_login'), 
    'testingemail6@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/button_LANJUTKAN DENGAN EMAIL'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/input_Email_password'), 
    '6lPpqkjcgrUMRmk8XUBwIQ==')

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/button_MASUK'))

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/span_'))

WebUI.setText(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/Page_Ponny Beaute Indonesia - Oh Happy Skin/input_KELUAR_q'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/Page_Ponny Beaute Indonesia - Oh Happy Skin/button_KELUAR_btn btn-danger search-btn'))

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/Page_Ponny Beaute Indonesia - Oh Happy Skin/div_ADD TO BAG'))

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/Page_Ponny Beaute Indonesia - Oh Happy Skin/a_Proceed to Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/Page_Ponny Beaute Indonesia - Oh Happy Skin/div_Delivery                               _cd9b8e'))

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/Page_Ponny Beaute Indonesia - Oh Happy Skin/div_Dapatkan 2 sampel gratis               _d6ca0c'))

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/Page_Ponny Beaute Indonesia - Oh Happy Skin/i_Ganti                                    _7c43d4'))

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/Page_Ponny Beaute Indonesia - Oh Happy Skin/a_BELI                SEKARANG'))

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/Page_Ponny Beaute Indonesia - Oh Happy Skin/div_testing testing                        _69e49e'))

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/Page_Ponny Beaute Indonesia - Oh Happy Skin/span_Rp9.000_checkmark'))

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/Page_Ponny Beaute Indonesia - Oh Happy Skin/input_Rp3.415.000_submit'))

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/Page_Ponny Beaute Indonesia - Oh Happy Skin/span_METODE PEMBAYARAN_checkmark'))

WebUI.click(findTestObject('Object Repository/Page_Ponny Beaute Indonesia - Oh Happy Skin/Page_Ponny Beaute Indonesia - Oh Happy Skin/button_BAYAR SEKARANG'))

