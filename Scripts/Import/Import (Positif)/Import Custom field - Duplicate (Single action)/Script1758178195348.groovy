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

String totalDatabefore = WebUI.getText(findTestObject('Import/Text - Total data'))

String lastNumberbeforestr = totalDatabefore.split(' ')[(totalDatabefore.split(' ').length - 1)]

int lastNumberbefore = Integer.parseInt(lastNumberbeforestr)

WebUI.click(findTestObject('All asset/Asset detail/Document/Button - Single action'))

WebUI.click(findTestObject('Import/Button - Single action - Option duplicate'))

WebUI.click(findTestObject('Import/Button - Save'))

not_run: WebUI.click(findTestObject('All asset/Register asset/Button - Cancel'))

not_run: WebUI.click(findTestObject('Import/Button - Discard'))

String totalDataafter = WebUI.getText(findTestObject('Import/Text - Total data'))

String lastNumberafterstr = totalDataafter.split(' ')[(totalDataafter.split(' ').length - 1)]

int lastNumberafter = Integer.parseInt(lastNumberafterstr)

WebUI.verifyEqual(lastNumberafter, lastNumberbefore + 1)

