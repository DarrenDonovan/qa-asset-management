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

WebUI.click(findTestObject('All Menu/Button - Sub menu - Transfer'))

WebUI.click(findTestObject('Transfer/Button - Transfer'))

WebUI.click(findTestObject('Transfer/Button - Asset'))

WebUI.waitForElementVisible(findTestObject('Transfer/Dialog - Select asset'), 0)

WebUI.click(findTestObject('Transfer/List - Select asset'))

WebUI.click(findTestObject('Transfer/Button - Select'))

WebUI.click(findTestObject('Transfer/Button - Select Group'))

WebUI.click(findTestObject('Transfer/List - Select destination group'))

WebUI.click(findTestObject('Transfer/Button - Select Group Dialog'))

WebUI.setText(findTestObject('Transfer/Input - Note'), 'asd')

WebUI.click(findTestObject('Transfer/Button - Submit'))

WebUI.verifyElementText(findTestObject('Transfer/Toast - Success'), 'Success, transfer log has been submitted.')

WebUI.callTestCase(findTestCase('Transfer/Transfer (Positif)/Buka transfer log (Single action)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Transfer/Transfer (Positif)/View log - Detail asset'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Transfer/Transfer (Positif)/View log - User - Transaction Admin Log'), [('expectedAction') : 'Create'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Notifikasi'), [('expectedStatus') : 'Transfer Completed'], FailureHandling.STOP_ON_FAILURE)

