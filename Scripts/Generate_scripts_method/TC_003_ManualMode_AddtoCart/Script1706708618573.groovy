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

WebUI.navigateToUrl('www.amazon.com')

WebUI.setText(findTestObject('Handling_validating/CheckBox_validation_OR/Page_Amazon.com. Spend less. Smile more/Search_field'), 
    'gaming headset')

WebUI.click(findTestObject('Handling_validating/CheckBox_validation_OR/Page_Amazon.com. Spend less. Smile more/isearch_btn'))

WebUI.verifyElementClickable(findTestObject('Additem_To_cart_OR/Page_Amazon.com  gaming headsets/image_headset'))

WebUI.click(findTestObject('Additem_To_cart_OR/Page_Amazon.com  gaming headsets/image_headset'))

WebUI.verifyElementVisible(findTestObject('Additem_To_cart_OR/Page_Amazon.com Turtle Beach Ear Force Recon 50 Gaming Headset for PlayStation 4, Xbox One,  PCMac  Video Games/img_Black  Green_imgSwatch'))

WebUI.uncheck(findTestObject('Additem_To_cart_OR/iGames/a-icon-checkbox'))

WebUI.uncheck(findTestObject('Additem_To_cart_OR/iGames/iicon-checkbox'))

WebUI.click(findTestObject('Additem_To_cart_OR/iGames/input_Added to Cart_submit.addToCart'))

WebUI.verifyElementText(findTestObject('Additem_To_cart_OR/Page_Amazon.com Shopping Cart/span_Added to Cart'), 'Added to Cart')

WebUI.click(findTestObject('Additem_To_cart_OR/Page_Amazon.com Shopping Cart/a_Go to Cart'))

WebUI.verifyElementText(findTestObject('Additem_To_cart_OR/Page_Amazon.com Shopping Cart/span_1'), '1')

WebUI.click(findTestObject('Additem_To_cart_OR/Page_Amazon.com Shopping Cart/txt_link_delete'))

WebUI.verifyElementPresent(findTestObject('Additem_To_cart_OR/Page_Amazon.com Shopping Cart/h1_Your Amazon Cart is empty'), 
    10)

WebUI.closeBrowser()

