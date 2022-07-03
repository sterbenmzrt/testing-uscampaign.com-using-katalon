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

'max browser\r\n'
WebUI.navigateToUrl(GlobalVariable.base_url)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('FAQ object/click FAQ'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('FAQ object/scroll to FAQ category'), 0)

WebUI.waitForElementPresent(findTestObject('FAQ object/verify icon FAQ'), 0)

WebUI.verifyElementPresent(findTestObject('FAQ object/verify icon FAQ'), 0)

WebUI.scrollToElement(findTestObject('FAQ object/scroll to last footer'), 0)

WebUI.waitForElementPresent(findTestObject('FAQ object/verify FAQ Question'), 0)

WebUI.verifyElementPresent(findTestObject('FAQ object/verify FAQ Question'), 0)

WebUI.takeScreenshot()

WebUI.closeBrowser()

