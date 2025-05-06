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

WebUI.callTestCase(findTestCase('AmazonLogin_Page/TC_001_Amazon_login'), [('USERNAME') : '', ('PASSWORD') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://www.amazon.com/?ref_=nav_ya_signin')

WebUI.verifyElementClickable(findTestObject('Object Repository/HOMEPAGE_OR_TC__002/Page_Amazon.com. Spend less. Smile more/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/HOMEPAGE_OR_TC__002/Page_Amazon.com. Spend less. Smile more/img_1'))

WebUI.rightClick(findTestObject('Object Repository/HOMEPAGE_OR_TC__002/Page_Amazon.com. Spend less. Smile more/img__fluid-fat-image-link-v2_style_fluidLan_075a06'))

WebUI.verifyElementClickable(findTestObject('Object Repository/HOMEPAGE_OR_TC__002/Page_Amazon.com. Spend less. Smile more/div__fluid-fat-image-link-v2_style_fluidFat_38a470'))

WebUI.verifyElementClickable(findTestObject('Object Repository/HOMEPAGE_OR_TC__002/Page_Amazon.com. Spend less. Smile more/span_Back to top'))

WebUI.verifyElementClickable(findTestObject('Object Repository/HOMEPAGE_OR_TC__002/Page_Amazon.com. Spend less. Smile more/div_New year, new suppliesShop office produ_211710'))

