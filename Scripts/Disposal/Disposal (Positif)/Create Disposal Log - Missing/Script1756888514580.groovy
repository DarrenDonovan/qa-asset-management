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

not_run: WebUI.click(findTestObject('All Menu/Button - Sub menu - Disposal'))

WebUI.click(findTestObject('Disposal/Create disposal/Button - Disposal'))

WebUI.waitForElementVisible(findTestObject('Disposal/Create disposal/Dialog - Last condition'), 10)

WebUI.click(findTestObject('Disposal/Create disposal/Button - Dropdown last condition'))

WebUI.click(findTestObject('Disposal/Create disposal/Button - Option missing'))

WebUI.click(findTestObject('Disposal/Create disposal/Button - Apply'))

WebUI.setText(findTestObject('Disposal/Create disposal/Input - Aditional note'), 'asd')

WebUI.click(findTestObject('Disposal/Create disposal/Button - Asset'))

WebUI.click(findTestObject('Disposal/Create disposal/List - Select asset'))

WebUI.click(findTestObject('Disposal/Create disposal/Button - Select'))

WebUI.click(findTestObject('Disposal/Create disposal/Button - Submit'))

WebUI.verifyElementText(findTestObject('Disposal/Create disposal/Toast - Success, disposal request has been submitted'), 'Success, disposal request has been submitted.')

