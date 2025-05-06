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

WebUI.openBrowser("")

WebUI.navigateToUrl("https://www.amazon.com/")

//select the option by index
WebUI.selectOptionByIndex(findTestObject('Object Repository/Handling_validating/dropDown_button/Page_Amazon.com. Spend less. Smile more/select_All Departments'),'5')

WebUI.delay(5)

WebUI.verifyOptionSelectedByIndex(findTestObject('Object Repository/Handling_validating/dropDown_button/Page_Amazon.com. Spend less. Smile more/select_All Departments'),'5', 60)

//select the option by label 
WebUI.selectOptionByLabel( findTestObject('Object Repository/Handling_validating/dropDown_button/Page_Amazon.com. Spend less. Smile more/select_All Departments'),'Books',false)

WebUI.delay(5)

WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Handling_validating/dropDown_button/Page_Amazon.com. Spend less. Smile more/select_All Departments'), 'Books', false, 60)

// select the option by value in the category
String value = "search-alias=stripbooks-intl-ship"

WebUI.selectOptionByValue(findTestObject('Object Repository/Handling_validating/dropDown_button/Page_Amazon.com. Spend less. Smile more/select_All Departments'), value , false)

WebUI.verifyOptionSelectedByValue(findTestObject('Object Repository/Handling_validating/dropDown_button/Page_Amazon.com. Spend less. Smile more/select_All Departments'), value, false, 0)

WebUI.closeBrowser()