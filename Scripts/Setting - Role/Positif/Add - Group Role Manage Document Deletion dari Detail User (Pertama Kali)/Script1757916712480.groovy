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

WebUI.click(findTestObject('All Menu/Sub Module - User'))

WebUI.click(findTestObject('Setting - User/Single Action Button - User', [('name') : 'user3']), [('name') : 'Import Data'])

WebUI.click(findTestObject('Setting - Role - Enterprise New/Action Menu - Detail'))

WebUI.click(findTestObject('User/Menu Item - Group Role'))

WebUI.click(findTestObject('Setting - Role - Enterprise New/Switch Button - Manage Document Deletion'))

WebUI.click(findTestObject('Setting - Role - Enterprise New/Button - Assign Group'))

WebUI.click(findTestObject('Setting - Role - Enterprise New/Checkbox - Assign Group (Group Role)', [('groupName') : 'Default']))

WebUI.click(findTestObject('Setting - Role - Enterprise New/Button - Select'))

WebUI.click(findTestObject('Setting - Role - Enterprise New/Button - Save'))

if (WebUI.verifyElementText(findTestObject('Setting - Role - Enterprise New/Toast - Success'), 'Success, group role has been assigned.')) {
    GlobalVariable.Log_Status = 'Add'
}

