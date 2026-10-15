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

WebUI.click(findTestObject('All Menu/Button - Sidebar'))

String buttonAktif = WebUI.getAttribute(findTestObject('All Menu/Button - Menu - Fixed Asset'), 'aria-expanded')

if (buttonAktif == 'false') {
    WebUI.click(findTestObject('All Menu/Button - Menu - Fixed Asset'))
} else {
}

WebUI.click(findTestObject('All Menu/Button - Sub menu - Assignment'))

WebUI.waitForPageLoad(10)

boolean isMissing = WebUI.verifyElementPresent(findTestObject('Borrow/Cancel report/Text - Reported Missing'), 5)

boolean isDamaged = WebUI.verifyElementPresent(findTestObject('Borrow/Cancel report/Text - Reported Damaged'), 5)

if (isMissing && isDamaged) {
    WebUI.click(findTestObject('Borrow/Cancel report/Button - Action damage'))
} else if (isMissing) {
    WebUI.click(findTestObject('Borrow/Cancel report/Button - Action missing'))
} else if (isDamaged) {
    WebUI.click(findTestObject('Borrow/Cancel report/Button - Action damage'))
}

WebUI.click(findTestObject('Object Repository/Borrow/Cancel report/Button - Option Cancel Report'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Borrow/Cancel report/Dialog - Cancel report'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Borrow/Cancel report/Button - Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/Borrow/Cancel report/Toast - Success, report has been canceled_1'), 
    'Success, report has been canceled.')

WebUI.delay(2)

