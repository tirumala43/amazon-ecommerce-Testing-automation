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

WebUI.callTestCase(findTestCase('Amazon_Modules/TC_013_Language_selection'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Amazon_Modules_OR/Language_selection_OR/Currency_settings_OR/Page_Amazon.com en espanol. Gasta menos. Sonre ms/div_ES'))

WebUI.navigateToUrl('https://www.amazon.com/-/es/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2F%3Flanguage%3Des_US&ref_=topnav_lang_ais')

WebUI.click(findTestObject('Object Repository/Amazon_Modules_OR/Language_selection_OR/Currency_settings_OR/Page_Cambiar configuracin de idioma y moneda/i_a-icon a-icon-radio'))

WebUI.click(findTestObject('Object Repository/Amazon_Modules_OR/Language_selection_OR/Currency_settings_OR/Page_Cambiar configuracin de idioma y moneda/span_- USD - US Dollar (Default)'))

WebUI.click(findTestObject('Object Repository/Amazon_Modules_OR/Language_selection_OR/Currency_settings_OR/Page_Cambiar configuracin de idioma y moneda/a_- EUR - Euro'))

WebUI.verifyElementText(findTestObject('Object Repository/Amazon_Modules_OR/Language_selection_OR/Currency_settings_OR/Page_Cambiar configuracin de idioma y moneda/span_- EUR - Euro'), 
    '€ - EUR - Euro')

WebUI.click(findTestObject('Object Repository/Amazon_Modules_OR/Language_selection_OR/Currency_settings_OR/Page_Cambiar configuracin de idioma y moneda/span_'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon_Modules_OR/Language_selection_OR/Currency_settings_OR/Page_Cambiar configuracin de idioma y moneda/span_- EUR - Euro'), 
    30)

WebUI.click(findTestObject('Object Repository/Amazon_Modules_OR/Language_selection_OR/Currency_settings_OR/Page_Cambiar configuracin de idioma y moneda/input_a-button-input'))

WebUI.navigateToUrl('https://www.amazon.com/?language=en_US&currency=EUR')

WebUI.click(findTestObject('Object Repository/Amazon_Modules_OR/Language_selection_OR/Currency_settings_OR/Page_Amazon.com. Spend less. Smile more/img__fluid-fat-image-link-v2_style_fluidLan_075a06'))

WebUI.click(findTestObject('Object Repository/Amazon_Modules_OR/Language_selection_OR/Currency_settings_OR/Page_Amazon.com  6 Door Locker Office Stora_0905e7/div_product-title-word-break         word-b_a03dac'))

WebUI.verifyElementText(findTestObject('Object Repository/Amazon_Modules_OR/Language_selection_OR/Currency_settings_OR/Page_Amazon.com  6 Door Locker Office Stora_0905e7/span_EUR213.08'), 
    'EUR213.08')

WebUI.closeBrowser()

