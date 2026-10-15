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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.click(findTestObject('All Menu/Sub Module - User'))

WebUI.click(findTestObject('Setting - Role/Single Action Button - User (Darren)'))

WebUI.click(findTestObject('Setting - Role/Action Menu - Detail'))

List<WebElement> toggles = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Setting - Role/Switch Button - Detail Role'), 
    10)

for (i = 0; i < toggles.size(); i++) {
    toggles.get(i).click()
}

WebUI.click(findTestObject('Object Repository/User/Menu Item - Group Role'))

for (i = 0; i < toggles.size(); i++) {
    toggles.get(i).click()
}

//Belum tau caranya
WebUI.click(findTestObject('Object Repository/User/Menu Item - Transaction Role'))

WebUI.comment('assign transaction role')

