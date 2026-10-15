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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Object Repository/Login session object/Input - Email'), GlobalVariable.email)

WebUI.setText(findTestObject('Object Repository/Login session object/Input - Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login session object/Button - Login'))

not_run: boolean isPopupPresent = WebUI.verifyElementPresent(findTestObject('Login session object/Page_TAG SAMURAI/Popup duplicate login'), 
    20, FailureHandling.OPTIONAL)

not_run: if (isPopupPresent) {
    not_run: WebUI.click(findTestObject('Login session object/Page_TAG SAMURAI/button_Confirm_duplicate login'), FailureHandling.STOP_ON_FAILURE)
} else {
}

WebUI.waitForPageLoad(30)

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('All Menu/Button - Module - Fixed Asset'), 30)

WebUI.click(findTestObject('All Menu/Button - Module - Fixed Asset'))

WebUI.waitForPageLoad(20)

WebUI.verifyElementVisible(findTestObject('All Menu/Button - Menu - Fixed Asset'))

