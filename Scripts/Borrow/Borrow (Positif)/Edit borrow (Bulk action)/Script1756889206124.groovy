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

WebUI.click(findTestObject('Object Repository/All Menu/Button - Sub menu - Borrow'))

WebUI.click(findTestObject('Borrow/Checkbox - Status borrowed'))

WebUI.click(findTestObject('All asset/Register asset/Remove from list/Button - Bulk Action'))

WebUI.click(findTestObject('Object Repository/Borrow/Edit borrow/Button - Option Edit'))

WebUI.waitForPageLoad(3)

not_run: WebUI.click(findTestObject('Object Repository/Borrow/Edit borrow/Button - Select User'))

not_run: WebUI.click(findTestObject('Borrow/List - Select user'))

not_run: WebUI.click(findTestObject('Borrow/Edit borrow/Button - Select'))

WebUI.setText(findTestObject('Object Repository/Borrow/Edit borrow/Input - Duration'), '15')

WebUI.setText(findTestObject('Object Repository/Borrow/Edit borrow/Input - Note'), 'qwerty')

WebUI.click(findTestObject('Borrow/Edit borrow/Button - Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Borrow/Toast - Success, borrowing request has been submitted'), 
    'Success, borrowing request has been submitted.')

