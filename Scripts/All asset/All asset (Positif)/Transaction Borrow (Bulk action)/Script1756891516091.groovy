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

WebUI.click(findTestObject('All Menu/Button - Sub menu - All Assets'))

WebUI.click(findTestObject('All asset/Bulk action/Checkbox - Status available'))

WebUI.click(findTestObject('All asset/Register asset/Remove from list/Button - Bulk Action'))

WebUI.click(findTestObject('All asset/Bulk action/Button - Bulk action - Option Borrow'))

WebUI.click(findTestObject('Object Repository/Borrow/Button - Select User'))

WebUI.click(findTestObject('Object Repository/Borrow/List - Select user'))

WebUI.click(findTestObject('Object Repository/Borrow/Button - Select1'))

WebUI.setText(findTestObject('Borrow/Input - Duration'), '12')

WebUI.setText(findTestObject('Object Repository/Borrow/Input - Note'), 'asd')

WebUI.click(findTestObject('Object Repository/Borrow/Button - Submit'))

not_run: boolean isPopupPresent = WebUI.verifyElementPresent(findTestObject('Object Repository/Borrow/Dialog - Confirm Status Update'), 
    0, FailureHandling.OPTIONAL)

// Kalau popup muncul → klik OK
not_run: if (isPopupPresent) {
    not_run: WebUI.click(findTestObject('Object Repository/Borrow/Button - Continue'), FailureHandling.OPTIONAL)
}

WebUI.verifyElementText(findTestObject('Object Repository/Borrow/Toast - Success, borrowing request has been submitted'), 
    'Success, borrowing request has been submitted.')

