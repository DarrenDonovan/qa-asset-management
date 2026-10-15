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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class LogsCheck {

	//Setting > Group > View Log
	@Keyword
	def checkGroupViewLog(String action) {
		WebUI.click(findTestObject('Object Repository/Setting - Group/Button - View Log'))

		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Setting - Group/Log Action - Setting _ Group _ View Log')), action, false)

		WebUI.click(findTestObject('Object Repository/Setting - Group/Button - Close Log'))
	}

	//Setting > Category > View Log
	@Keyword
	def checkCategoryViewLog(String action) {
		WebUI.click(findTestObject('Object Repository/Setting - Category/Button - View Log'))

		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Setting - Category/Log Action - Setting _ Category _ View Log')), action, false)

		WebUI.click(findTestObject('Object Repository/Setting - Category/Button - Close Log'))
	}

	//Setting > Role > Transaction Role > Changelog
	@Keyword
	def allRoleViewLog(String action) {
		WebUI.click(findTestObject('Object Repository/Setting - Role/Button - Changelog'))

		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Setting - Role/Log Action - Setting _ Role _ Transaction Role _ Changelog')), action, false)

		WebUI.click(findTestObject('Object Repository/Setting - Role/Button - Close'))
	}

	//User > My Profile > System Log
	@Keyword
	def checkLogProfile(String action) {
		WebUI.click(findTestObject('Object Repository/Setting - Group/Button - Profile'))

		WebUI.click(findTestObject('Object Repository/Setting - Group/Action Menu - My Profile'))

		WebUI.click(findTestObject('Object Repository/User/Submenu - Profile_System Log'))

		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Setting - Group/Log Action - Profile _ System Log')), action, false)

		WebUI.click(findTestObject('Object Repository/All Menu/Icon - Tag Samurai'))
	}

	//Setting > User Default > Detail > System Log
	@Keyword
	def checkLogUserDefaultDetail(String action) {
		WebUI.click(findTestObject('Object Repository/All Menu/Module - Setting'))

		WebUI.click(findTestObject('Object Repository/All Menu/Sub Module - User'))

		WebUI.click(findTestObject('Object Repository/Setting - Group/Single Action Button - Default User'))

		WebUI.click(findTestObject('Object Repository/Setting - Group/Action Menu - User Detail'))

		WebUI.click(findTestObject('Object Repository/User/Submenu - Profile_System Log'))

		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Setting - Group/Log Action - Profile _ System Log')), action, false)

		WebUI.click(findTestObject('Object Repository/All Menu/Icon - Tag Samurai'))
	}

	//Report & Log > Activity Log > User Actions
	@Keyword
	def checkLogReportandLog(String action) {
		WebUI.click(findTestObject('Object Repository/All Menu/Module - Report and Log'))

		WebUI.click(findTestObject('Object Repository/All Menu/Sub Module - Activity Log'))

		WebUI.click(findTestObject('Object Repository/User/Submenu - Activity Log_User Actions'))

		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Setting - Group/Log Action - Report and Log _ Activity Log _ User Actions')), action, false)
	}

	//Setting > User Darren > Detail > Global, Group & Transaction Role
	@Keyword
	def checkLogUserDarrenDetail(String action) {
		WebUI.click(findTestObject('Object Repository/All Menu/Module - Setting'))
		WebUI.click(findTestObject('Object Repository/All Menu/Sub Module - User'))
		WebUI.click(findTestObject('Object Repository/Setting - Role/Single Action Button - User (Darren)'))
		WebUI.click(findTestObject('Object Repository/Setting - Role/Action Menu - Detail'))

		//Global Role
		WebUI.click(findTestObject('Object Repository/Setting - Role/Button - Changelog'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Setting - Role/Log Action - Profile _ Role _ Changelog')), action, false)
		WebUI.click(findTestObject('Object Repository/Setting - Role/Button - Close'))

		//Group Role
		WebUI.click(findTestObject('Object Repository/User/Menu Item - Group Role'))
		WebUI.click(findTestObject('Object Repository/Setting - Role/Button - Changelog'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Setting - Role/Log Action - Profile _ Role _ Changelog')), action, false)
		WebUI.click(findTestObject('Object Repository/Setting - Role/Button - Close'))

		//Transaction Role
		WebUI.click(findTestObject('Object Repository/User/Menu Item - Transaction Role'))
		WebUI.click(findTestObject('Object Repository/Setting - Role/Button - Changelog'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Setting - Role/Log Action - Profile _ Role _ Changelog')), action, false)
		WebUI.click(findTestObject('Object Repository/Setting - Role/Button - Close'))
		WebUI.click(findTestObject('Object Repository/All Menu/Icon - Tag Samurai'))
	}
}
