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

not_run: WebUI.click(findTestObject('All Menu/Button - Sub menu - All Assets'))

WebUI.click(findTestObject('All asset/Button - Single action untuk report'))

WebUI.click(findTestObject('All asset/Button - Single action - Option report missing'))

WebUI.setText(findTestObject('Object Repository/Borrow/Report missing/Input - Note report missing'), 'asd')

WebUI.click(findTestObject('Object Repository/Borrow/Report missing/Button - Submit'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Borrow/Report missing/Dialog - Report submit missing'), 10)

WebUI.click(findTestObject('Object Repository/Borrow/Report missing/Button - Report'))

WebUI.verifyElementText(findTestObject('Object Repository/Borrow/Report missing/Toast - Success, missing asset has been reported_1'), 
    'Success, missing asset has been reported.')

