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

WebUI.click(findTestObject('All asset/Button - Single action untuk report'))

WebUI.click(findTestObject('All asset/Button - Single action - Option report damage'))

WebUI.uploadFile(findTestObject('Object Repository/Borrow/Report damage/Button - Upload photo'), 'D:\\Katalon QA - Tag Samurai\\katalon-test-tutor\\Photo\\contoh photo damage.jpeg')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Borrow/Report damage/Button - Apply'))

WebUI.setText(findTestObject('Object Repository/Borrow/Report damage/Input - Note reported damage'), 'asdf')

WebUI.click(findTestObject('Object Repository/Borrow/Report damage/Button - Submit'))

WebUI.click(findTestObject('Object Repository/Borrow/Report damage/Button - Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/Borrow/Report damage/Toast - Success, damaged asset report has been _80899e_1'), 
    'Success, damaged asset report has been submitted.')

