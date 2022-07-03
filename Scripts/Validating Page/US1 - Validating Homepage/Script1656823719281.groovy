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

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Us Web Object/scroll to be the change'), 0)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Us Web Object/for scroll to app features'), 0)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Us Web Object/for scroll to ready join challenge'), 0)

WebUI.waitForElementPresent(findTestObject('Us Web Object/verify challenge education'), 2)

WebUI.verifyElementPresent(findTestObject('Us Web Object/verify challenge education'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Us Web Object/click challenge environment'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Us Web Object/verify challenge environment'), 2)

WebUI.verifyElementPresent(findTestObject('Us Web Object/verify challenge environment'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Us Web Object/click challenge equality'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Us Web Object/verify challenge equality'), 2)

WebUI.verifyElementPresent(findTestObject('Us Web Object/verify challenge equality'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Us Web Object/click challenge health'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Us Web Object/verify challenge health'), 2)

WebUI.verifyElementPresent(findTestObject('Us Web Object/verify challenge health'), 0)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Us Web Object/scroll to what they say'), 0)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Us Web Object/scroll to lets collaborate'), 0)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Us Web Object/scroll to be the first'), 0)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Us Web Object/scroll to download campaign'), 0)

WebUI.takeScreenshot()

WebUI.closeBrowser()

