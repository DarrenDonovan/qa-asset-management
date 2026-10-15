import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.constants.WebUICommonScriptConstants
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys

import internal.GlobalVariable

public class Common_Utils {

	@Keyword
	def openBrowser(String url) {
		WebUI.openBrowser(url)
		WebUI.maximizeWindow()
		WebUI.waitForPageLoad(10);
	}

	@Keyword
	def login(String email, String password) {
		WebUI.setText(findTestObject('Object Repository/login session object/Input - Email'), email)

		WebUI.setText(findTestObject('Object Repository/login session object/Input - Password'), password)

		WebUI.delay(5)

		WebUI.click(findTestObject('Object Repository/login session object/Button - Login'))

		WebUI.waitForPageLoad(10);

		WebUI.click(findTestObject('Object Repository/login session object/Portal - Fixed Asset'))
	}

	@Keyword
	def loginOtherUser(String email, String password) {
		WebUI.click(findTestObject('Object Repository/Setting - Role/Button - Profile'))

		WebUI.click(findTestObject('Object Repository/Setting - Role/Action Menu - Logout'))

		WebUI.clearText(findTestObject('Object Repository/login session object/Input - Email'))
		WebUI.clearText(findTestObject('Object Repository/login session object/Input - Password'))

		WebUI.setText(findTestObject('Object Repository/login session object/Input - Email'), email)

		WebUI.setText(findTestObject('Object Repository/login session object/Input - Password'), password)

		WebUI.delay(5)

		WebUI.click(findTestObject('Object Repository/login session object/Button - Login'))

		WebUI.click(findTestObject('Object Repository/login session object/Button - Confirm Duplicate User Login'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.waitForPageLoad(10);

		WebUI.click(findTestObject('Object Repository/login session object/Portal - Fixed Asset'))
	}

	@Keyword
	def navigateToGroup() {
		WebUI.refresh()

		WebUI.waitForPageLoad(10)

		WebUI.click(findTestObject('Object Repository/All Menu/Module - Setting'))

		WebUI.click(findTestObject('Object Repository/All Menu/Sub Module - Group'))
	}

	@Keyword
	def navigateToCategory() {
		WebUI.refresh()

		WebUI.waitForPageLoad(10)

		WebUI.click(findTestObject('Object Repository/All Menu/Module - Setting'))

		WebUI.click(findTestObject('Object Repository/All Menu/Sub Module - Category'))
	}

	@Keyword
	def navigateToRole() {
		WebUI.refresh()

		WebUI.waitForPageLoad(10)

		WebUI.click(findTestObject('Object Repository/All Menu/Module - Setting'))

		WebUI.click(findTestObject('Object Repository/All Menu/Sub Module - Role'))
	}

	@Keyword
	def navigateToUser() {
		WebUI.refresh()

		WebUI.waitForPageLoad(10)

		WebUI.click(findTestObject('Object Repository/All Menu/Module - Setting'))

		WebUI.click(findTestObject('Object Repository/All Menu/Sub Module - User'))
	}

	@Keyword
	def navigateToAllAsset() {
		WebUI.refresh()

		WebUI.waitForPageLoad(10)

		WebUI.click(findTestObject('Object Repository/All Menu/Button - Menu - Fixed Asset'))

		WebUI.click(findTestObject('Object Repository/All Menu/Button - Sub menu - All Assets'))
	}

	@Keyword
	def deleteField(TestObject object) {
		WebUI.sendKeys(object, Keys.chord(Keys.CONTROL, 'a'))

		WebUI.sendKeys(object, Keys.chord(Keys.DELETE))
	}
}
