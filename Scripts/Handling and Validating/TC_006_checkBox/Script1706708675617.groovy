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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.setText(findTestObject('Object Repository/DEMO_CHECKboX_TEST/Page_Amazon.com/input_field-keywords'), 'GYJXCE')

WebUI.selectOptionByValue(findTestObject('Object Repository/DEMO_CHECKboX_TEST/Page_Amazon.com. Spend less. Smile more/select_All Departments        Arts  Crafts _135c92'), 
    'search-alias=digital-music', true)

WebUI.setText(findTestObject('Object Repository/DEMO_CHECKboX_TEST/Page_Amazon.com. Spend less. Smile more/input_field-keywords'), 
    'telugu')

WebUI.click(findTestObject('Object Repository/DEMO_CHECKboX_TEST/Page_Amazon.com. Spend less. Smile more/span_songs'))
UNCHECKED=WebUI.verifyElementNotChecked(findTestObject('Object Repository/DEMO_CHECKboX_TEST/Page_Amazon.com  telugu songs/i_a-icon a-icon-checkbox'), 10)
if(UNCHECKED == true)
{

checked = WebUI.check(findTestObject('Object Repository/DEMO_CHECKboX_TEST/Page_Amazon.com  telugu songs/i_a-icon a-icon-checkbox'))

}

WebUI.delay(3)
if ( checked == true )
{
	


WebUI.uncheck(findTestObject('Object Repository/DEMO_CHECKboX_TEST/Page_Amazon.com  telugu songs/i_a-icon a-icon-checkbox'))
}
WebUI.closeBrowser()

