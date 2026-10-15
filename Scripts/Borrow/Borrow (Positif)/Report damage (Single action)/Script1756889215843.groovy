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

not_run: WebUI.click(findTestObject('All Menu/Button - Sidebar'))

String buttonAktif = WebUI.getAttribute(findTestObject('All Menu/Button - Menu - Fixed Asset'), 'aria-expanded')

if (buttonAktif == 'false') {
    WebUI.click(findTestObject('All Menu/Button - Menu - Fixed Asset'))
} else {
}

WebUI.click(findTestObject('Object Repository/All Menu/Button - Sub menu - Borrow'))

boolean isBorrowed = WebUI.verifyElementPresent(findTestObject('Borrow/Edit borrow/Text - Status Borrowed'), 5)

if (isBorrowed) {
    WebUI.click(findTestObject('Borrow/Edit borrow/Button - Single action'))
}

WebUI.click(findTestObject('Object Repository/Borrow/Report damage/Button - Option - Report damage'))

WebUI.uploadFile(findTestObject('Object Repository/Borrow/Report damage/Button - Upload photo'), 'D:\\Katalon QA - Tag Samurai\\katalon-test-tutor\\Photo\\contoh photo damage.jpeg')

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Object Repository/Borrow/Report damage/Button - Apply'), 10)

WebUI.click(findTestObject('Object Repository/Borrow/Report damage/Button - Apply'))

WebUI.setText(findTestObject('Object Repository/Borrow/Report damage/Input - Note reported damage'), 'asdf')

WebUI.click(findTestObject('Object Repository/Borrow/Report damage/Button - Submit'))

WebUI.click(findTestObject('Object Repository/Borrow/Report damage/Button - Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/Assignment/Toast - Success, assignment request has been submitted'), 
    'Success, damaged asset report has been submitted.')

WebUI.click(findTestObject('All asset/Asset detail/Document/Button - Single action'))

WebUI.click(findTestObject('Damage/Button - Option Damaged Log'))

WebUI.callTestCase(findTestCase('Borrow/Borrow (Positif)/View log - Detail asset'), [('expectedAction') : 'Reported Damaged'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Borrow/Borrow (Positif)/View log - User - Transaction Admin Log'), [('expectedAction') : 'Damage'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Borrow/Borrow (Positif)/View my asset - Status'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Notifikasi'), [('expectedStatus') : 'Reported Damaged'], FailureHandling.STOP_ON_FAILURE)

