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

WebUI.click(findTestObject('Borrow/Checkbox'))

WebUI.click(findTestObject('All asset/Register asset/Remove from list/Button - Bulk Action'))

WebUI.click(findTestObject('Assignment/Unassign/Button - Option - Unassign'))

WebUI.click(findTestObject('Object Repository/Assignment/Report missing/Button - Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Assignment/Toast - Success, assignment request has been submitted'), 
    'Success, asset has been unassigned.')

WebUI.callTestCase(findTestCase('Assignment/Assignment (Positif)/History - Buka assignment log (Single action)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Assignment/Assignment (Positif)/View log - Detail asset'), [('expectedAction') : 'Unassign'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Assignment/Assignment (Positif)/View log - User - Transaction Admin Log'), [('expectedAction') : 'Unassign'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Notifikasi'), [('expectedStatus') : 'Unassigned'], FailureHandling.STOP_ON_FAILURE)

