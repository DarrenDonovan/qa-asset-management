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

WebUI.click(findTestObject('All asset/Asset detail/Document/Button - Single action'))

WebUI.click(findTestObject('Report dan log/Report/Button - Option Edit'))

WebUI.setText(findTestObject('Report dan log/Report/Input - Report name'), 'Report (Edit)')

WebUI.click(findTestObject('Report dan log/Report/Dropdown - Report type'))

WebUI.click(findTestObject('Report dan log/Report/Button - Report type - Option custom report'))

WebUI.click(findTestObject('Report dan log/Report/Dropdown - Asset information'))

WebUI.click(findTestObject('Report dan log/Report/Button - Asset information - Borrow'))

WebUI.click(findTestObject('Report dan log/Report/Dropdown - Frequency'))

WebUI.click(findTestObject('Report dan log/Report/Button - Frequency - Option daily'))

WebUI.click(findTestObject('Report dan log/Report/Input - Start from'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Report dan log/Report/Text - Date calender'))

WebUI.click(findTestObject('Borrow/Edit borrow/Button - Apply'))

WebUI.setText(findTestObject('Report dan log/Report/Input - Subject'), 'Report (Edit)')

WebUI.setText(findTestObject('Report dan log/Report/Input - Recipient'), 'qtera.edit@asdf.com')

WebUI.click(findTestObject('Report dan log/Report/Checkbox - Cc'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Report dan log/Report/Input - Enter recipient - Cc'), 'qtera.edit@asdf.com')

WebUI.click(findTestObject('Report dan log/Report/Checkbox - Bcc'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Report dan log/Report/Input - Enter recipient - Bcc'), 'qtera.edit@asdf.com')

WebUI.click(findTestObject('All asset/Asset detail/Document/Button - Submit'))

WebUI.verifyElementText(findTestObject('Report dan log/Report/Toast - Success'), 'Success, schedule has been edited.')

WebUI.callTestCase(findTestCase('Report dan log - Report/Report (Positif)/View Change log'), [('expectedAction') : 'edit'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Report dan log - Report/Report (Positif)/VIew log - Activity log - User actions'), [('expectedAction') : 'edit'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Report dan log - Report/Report (Positif)/View log - User - System log'), [('expectedAction') : 'edit'], 
    FailureHandling.STOP_ON_FAILURE)

