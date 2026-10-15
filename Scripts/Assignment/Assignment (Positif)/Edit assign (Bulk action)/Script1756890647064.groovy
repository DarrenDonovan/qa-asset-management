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

WebUI.click(findTestObject('Assignment/Checkbox - Status assign'))

WebUI.click(findTestObject('All asset/Register asset/Remove from list/Button - Bulk Action'))

WebUI.click(findTestObject('Object Repository/Borrow/Edit borrow/Button - Option Edit'))

WebUI.waitForPageLoad(3)

WebUI.setText(findTestObject('Object Repository/Assignment/Edit assign/Input - Note'), 
    'asdf')

WebUI.click(findTestObject('Object Repository/Assignment/Edit assign/Button - Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Assignment/Toast - Success, assignment request has been submitted'), 
    'Success, assignment request has been submitted.')

