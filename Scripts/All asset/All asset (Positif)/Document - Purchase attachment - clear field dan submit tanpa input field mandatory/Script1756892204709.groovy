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

WebUI.click(findTestObject('All asset/Asset detail/Document/Button - Tab Document'))

WebUI.click(findTestObject('All asset/Asset detail/Document/Button - Purchase attachment'))

WebUI.click(findTestObject('All asset/Asset detail/Document/Button - Attachment'))

WebUI.setText(findTestObject('All asset/Asset detail/Document/Input - Document name'), 'Document name')

WebUI.uploadFile(findTestObject('All asset/Asset detail/Document/Input - File'), 'D:\\Katalon QA - Tag Samurai\\katalon-test-tutor\\Photo\\Borrow-Transaction.xlsx')

WebUI.click(findTestObject('All asset/Asset detail/Document/Button - Clear Field'))

WebUI.click(findTestObject('All asset/Asset detail/Document/Button - Submit'))

WebUI.verifyTextPresent('Document Name must not be empty', false)

WebUI.verifyTextPresent('File must not be empty', false)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

