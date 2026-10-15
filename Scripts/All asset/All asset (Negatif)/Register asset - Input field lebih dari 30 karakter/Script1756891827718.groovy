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

not_run: WebUI.click(findTestObject('All asset/Register asset/Button - Register'))

not_run: WebUI.click(findTestObject('All asset/Register asset/Button - Select Group'))

not_run: WebUI.click(findTestObject('All asset/Register asset/List - Group'))

not_run: WebUI.click(findTestObject('All asset/Register asset/Button - Select'))

not_run: WebUI.click(findTestObject('All asset/Register asset/Button - Select Category'))

not_run: WebUI.click(findTestObject('All asset/Register asset/List - Category'))

not_run: WebUI.click(findTestObject('All asset/Register asset/Button - Select'))

WebUI.setText(findTestObject('All asset/Register asset/Input - Asset name'), 'AAAAaaaaaBBBBbbbbCCCCccccDDDDDDDdddddd')

String actualValue = WebUI.getAttribute(findTestObject('All asset/Register asset/Input - Asset name'), 'value')

WebUI.verifyLessThanOrEqual(actualValue.length(), 30)

WebUI.setText(findTestObject('All asset/Register asset/Input - Brand'), 'AAAAaaaaaBBBBbbbbCCCCccccDDDDDDDdddddd')

String actualValue1 = WebUI.getAttribute(findTestObject('All asset/Register asset/Input - Brand'), 'value')

WebUI.verifyLessThanOrEqual(actualValue1.length(), 30)

WebUI.setText(findTestObject('All asset/Register asset/Input - Model'), 'AAAAaaaaaBBBBbbbbCCCCccccDDDDDDDdddddd')

String actualValue2 = WebUI.getAttribute(findTestObject('All asset/Register asset/Input - Model'), 'value')

WebUI.verifyLessThanOrEqual(actualValue2.length(), 30)

WebUI.setText(findTestObject('All asset/Register asset/Input - Measurement'), 'AAAAaaaaaBBBBbbbbCCCCccccDDDDDDDdddddd')

String actualValue3 = WebUI.getAttribute(findTestObject('All asset/Register asset/Input - Measurement'), 'value')

WebUI.verifyLessThanOrEqual(actualValue3.length(), 30)

