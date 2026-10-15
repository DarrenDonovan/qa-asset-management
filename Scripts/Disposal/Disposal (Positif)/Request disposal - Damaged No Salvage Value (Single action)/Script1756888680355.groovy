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

boolean isNoValue = WebUI.verifyElementPresent(findTestObject('Disposal/Create disposal/Button - Single action no salvage value'), 
    5, FailureHandling.OPTIONAL)

boolean isDamaged = WebUI.verifyElementPresent(findTestObject('Disposal/Create disposal/Button - Single action damaged'), 
    5, FailureHandling.OPTIONAL)

if (isNoValue && isDamaged) {
    WebUI.click(findTestObject('Disposal/Create disposal/Button - Single action no salvage value'))
} else if (isNoValue) {
    WebUI.click(findTestObject('Disposal/Create disposal/Button - Single action no salvage value'))
} else if (isDamaged) {
    WebUI.click(findTestObject('Disposal/Create disposal/Button - Single action damaged'))
}

WebUI.click(findTestObject('Disposal/Create disposal/Button - Option Request Disposal'))

WebUI.click(findTestObject('Disposal/Create disposal/Button - Select disposal method'))

WebUI.click(findTestObject('Disposal/Create disposal/Button - Option Donate'))

WebUI.setText(findTestObject('Disposal/Create disposal/Input - Organization company name'), 'Qtera')

WebUI.setText(findTestObject('Disposal/Create disposal/Input - Aditional note'), 'asd')

WebUI.click(findTestObject('Disposal/Create disposal/Button - Select Group'))

WebUI.click(findTestObject('Disposal/Create disposal/List - Select group'))

WebUI.click(findTestObject('Disposal/Create disposal/Button - Select'))

WebUI.click(findTestObject('Disposal/Create disposal/Button - Submit'))

WebUI.verifyElementText(findTestObject('Disposal/Create disposal/Toast - Success, disposal request has been submitted'), 
    'Success, disposal request has been submitted.')

