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

String buttonAktif = WebUI.getAttribute(findTestObject('All Menu/Button - Menu - Fixed Asset'), 'aria-expanded')

if (buttonAktif == 'false') {
	WebUI.click(findTestObject('All Menu/Button - Menu - Fixed Asset'))
} else {
}

WebUI.click(findTestObject('All Menu/Button - Sub menu - Assignment'))

WebUI.waitForPageLoad(10)

boolean isAssign = WebUI.verifyElementPresent(findTestObject('Assignment/Edit assign/Text - Status Assigned'), 5)

if (isAssign) {
	WebUI.click(findTestObject('Object Repository/Assignment/Edit assign/Button - Action edit assign'))
}

WebUI.click(findTestObject('Object Repository/Assignment/Edit assign/Button - Option - Edit'))

WebUI.setText(findTestObject('Object Repository/Borrow/Edit borrow/Input - Note'), 'asdasdsasdwssddwwdasceerilnlmfignoiroskdnis')

String actualNote = WebUI.getAttribute(findTestObject('Object Repository/Borrow/Edit borrow/Input - Note'), 'value')

WebUI.verifyEqual(actualNote.length(), 30)

