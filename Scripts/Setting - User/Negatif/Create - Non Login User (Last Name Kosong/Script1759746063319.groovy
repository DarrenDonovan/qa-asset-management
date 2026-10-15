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

WebUI.click(findTestObject('Setting - User/Button - Add User'))

WebUI.setText(findTestObject('Setting - User/Input Textbox - First Name'), 'Darren')

WebUI.click(findTestObject('Setting - User/Input Dropdown - Division'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting - User/Input Dropdown Item - Default Division'))

WebUI.setText(findTestObject('Setting - User/Input Textbox - Phone Number'), '81872381213')

WebUI.click(findTestObject('Setting - User/Button - Submit'))

WebUI.verifyElementVisible(findTestObject('Setting - User/Validator Message - Last Name Must Not be Empty'))

WebUI.click(findTestObject('Setting - User/Button - Close'))

