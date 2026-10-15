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

WebUI.click(findTestObject('File manager/Checkbox - file manager'))

WebUI.click(findTestObject('All asset/Register asset/Remove from list/Button - Bulk Action'))

WebUI.click(findTestObject('All asset/Bulk action/Button - Bulk action - Option Edit Useful Life'))

WebUI.click(findTestObject('All asset/Bulk action/Dialog - Edit useful life'))

WebUI.setText(findTestObject('All asset/Bulk action/Input - Useful life'), '1')

WebUI.click(findTestObject('All asset/Bulk action/Button - Clear Field'))

WebUI.click(findTestObject('All asset/Bulk action/Button - Save'))

WebUI.verifyTextPresent('Useful Life must not be empty', false)

WebUI.setText(findTestObject('All asset/Bulk action/Input - Useful life'), '15b@asd')

String valueuseful = WebUI.getAttribute(findTestObject('All asset/Bulk action/Input - Useful life'), 'aria-valuenow')

WebUI.verifyLessThanOrEqual(valueuseful.length(), 3)

boolean isOnlyDigits = valueuseful.matches('^\\d+$')

WebUI.verifyEqual(isOnlyDigits, true)

WebUI.click(findTestObject('All asset/Bulk action/Button - Save'))

WebUI.verifyElementText(findTestObject('All asset/Bulk action/Toast - Success, useful life has been edited'), 'Success, useful life has been edited.')

WebUI.callTestCase(findTestCase('All asset/All asset (Positif)/View Change log'), [('expectedAction') : 'edit'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All asset/All asset (Positif)/View log - Detail asset'), [('expectedAction') : 'edit'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All asset/All asset (Positif)/VIew log - Activity log - User actions'), [('expectedAction') : 'edit'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All asset/All asset (Positif)/View log - User - System log'), [('expectedAction') : 'edit'], FailureHandling.STOP_ON_FAILURE)

