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

String buttonAktif = WebUI.getAttribute(findTestObject('All Menu/Button - Menu - Fixed Asset'), 'aria-expanded')

if (buttonAktif == 'false') {
    WebUI.click(findTestObject('All Menu/Button - Menu - Fixed Asset'))

    println(buttonAktif)
} else {
}

WebUI.click(findTestObject('All Menu/Button - Sub menu - All Assets'))

WebUI.click(findTestObject('All asset/Borrow/Button - Single action available'))

WebUI.click(findTestObject('All asset/Asset detail/Button - Single action - Option detail'))

WebUI.click(findTestObject('All asset/Asset detail/Linked asset/Button - Tab Linked Asset'))

WebUI.click(findTestObject('All asset/Asset detail/Linked asset/Button - Button Linked Asset'))

WebUI.click(findTestObject('All asset/Asset detail/Linked asset/Button - As Child'))

WebUI.click(findTestObject('All asset/Asset detail/Linked asset/List - Select asset'))

WebUI.click(findTestObject('All asset/Asset detail/Linked asset/Button - Button Select asset'))

WebUI.click(findTestObject('All asset/Asset detail/Linked asset/Button - Button Attach'))

WebUI.verifyElementText(findTestObject('All asset/Asset detail/Linked asset/Toast - Success, child asset has been added'), 'Success, parent asset has been added.')

String url = WebUI.getUrl()

WebUI.callTestCase(findTestCase('All asset/All asset (Positif)/View Change log'), [('expectedAction') : 'Attached to'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('All Menu/Button - Sidebar'))

WebUI.callTestCase(findTestCase('All asset/All asset (Positif)/VIew log - Activity log - User actions'), [('expectedAction') : 'Attached to'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('All asset/All asset (Positif)/View log - User - System log'), [('expectedAction') : 'Attached to'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(url)