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

not_run: WebUI.click(findTestObject('All asset/Edit asset/Button - single action'))

not_run: WebUI.click(findTestObject('All asset/Asset detail/Button - Single action - Option detail'))

WebUI.click(findTestObject('All asset/Asset detail/Button - Tab Purchase'))

WebUI.click(findTestObject('All asset/Asset detail/Purchase asset detail/Button - Purchase date'))

WebUI.click(findTestObject('All asset/Asset detail/Purchase asset detail/Input - Purchase Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('All asset/Asset detail/Purchase asset detail/Date - Kalender'), 0)

WebUI.click(findTestObject('All asset/Asset detail/Purchase asset detail/Button - Pilih tanggal'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('All asset/Asset detail/Purchase asset detail/Button - Save'))

WebUI.waitForPageLoad(10)

WebUI.getText(findTestObject('All asset/Asset detail/Purchase asset detail/Ttext - Purchase date'))

WebUI.click(findTestObject('All asset/Asset detail/Purchase asset detail/Button - Purchase cost'))

WebUI.setText(findTestObject('All asset/Asset detail/Purchase asset detail/Input - Purchase'), '99000')

WebUI.click(findTestObject('All asset/Asset detail/Purchase asset detail/Button - Save'))

WebUI.getText(findTestObject('All asset/Asset detail/Purchase asset detail/Text - Purchase cost'))

