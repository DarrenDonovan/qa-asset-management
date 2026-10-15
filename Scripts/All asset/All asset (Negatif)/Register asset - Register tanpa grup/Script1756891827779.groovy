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

	println(buttonAktif)
} else {
}

WebUI.click(findTestObject('All Menu/Button - Sub menu - All Assets'))

WebUI.click(findTestObject('All asset/Register asset/Button - Register'))

WebUI.click(findTestObject('All asset/Register asset/Button - Select Category'))

WebUI.click(findTestObject('All asset/Register asset/List - Category'))

WebUI.click(findTestObject('All asset/Register asset/Button - Select'))

WebUI.setText(findTestObject('All asset/Register asset/Input - Asset name'), 'asd')

WebUI.setText(findTestObject('All asset/Register asset/Input - Brand'), 'asd')

WebUI.setText(findTestObject('All asset/Register asset/Input - Model'), 'asd')

WebUI.setText(findTestObject('All asset/Register asset/Input - Measurement'), 'asd')

WebUI.setText(findTestObject('All asset/Register asset/Input - Useful life'), '123')

WebUI.click(findTestObject('All asset/Register asset/Button - Register'))

WebUI.verifyElementVisible(findTestObject('All asset/Register asset/Alert - You must pick a group'), FailureHandling.STOP_ON_FAILURE)

