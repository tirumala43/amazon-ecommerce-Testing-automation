import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//'INVOKING THE BROWSER'
WebUI.openBrowser('')

//NAVIGATE TO THE URL AMAZON WEBSITE 
WebUI.navigateToUrl('https://www.amazon.com/')

//CLICK ON SIGN IN BUTTON TO ENTER THE DETAILS OF LOGIN CREDENTIALS OF USER
WebUI.click(findTestObject('Object Repository/Amazon_login_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

//'Declare a username variable and assign the value'
userName = 'tirumala1643@gmail.com'

WebUI.setText(findTestObject('Object Repository/Amazon_login_OR/Page_Amazon Sign-In/Email'), userName)

input_Value = WebUI.getAttribute(findTestObject('Object Repository/Amazon_login_OR/Page_Amazon Sign-In/Email'), 'value')

WebUI.verifyMatch(input_Value, userName, true)

WebUI.click(findTestObject('Object Repository/Amazon_login_OR/Page_Amazon Sign-In/btn_continue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_login_OR/Page_Amazon Sign-In/txt_password'), 'zJunTcfE+7qVant9yaEiCw==')

WebUI.click(findTestObject('Object Repository/Amazon_login_OR/Page_Amazon Sign-In/btn_signIn'))

WebUI.verifyElementPresent(findTestObject('HOMEPAGE_OR_TC__002/Page_Amazon.com. Spend less. Smile more/span_Hello, Gumma'), 
    10)

