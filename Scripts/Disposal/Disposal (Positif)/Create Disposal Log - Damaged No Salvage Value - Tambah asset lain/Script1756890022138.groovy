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

int rowBefore = WebUI.findWebElements(findTestObject('Object Repository/All asset/Register asset/Tabel - Row register asset'), 
    10).size()

println('Jumlah baris sebelum aksi: ' + rowBefore)

List<String> assetIdsInTable = WebUI.findWebElements(findTestObject('Object Repository/Missing/Text - Kolom asset id pada tabel'), 
    10).collect({ 
        it.getText()
    })

WebUI.comment('Asset yang sudah ada di tabel: ' + assetIdsInTable)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Borrow/Button - Asset'))

WebUI.verifyElementVisible(findTestObject('Transfer/Dialog - Select asset'))

WebUI.click(findTestObject('Missing/Button - Dropdown showing'))

WebUI.click(findTestObject('Missing/Button - Option showing 100'))

List<String> assetIdsInPopup = WebUI.findWebElements(findTestObject('Object Repository/Missing/Text - Kolom asset id pada tabel dialog'), 
    10).collect({ 
        it.getText()
    })

WebUI.comment('Asset yang sudah ada di pop up: ' + assetIdsInPopup)

WebUI.waitForPageLoad(5, FailureHandling.OPTIONAL)

boolean noDuplicate = Collections.disjoint(assetIdsInTable, assetIdsInPopup)

WebUI.verifyMatch(noDuplicate.toString(), 'true', false, FailureHandling.OPTIONAL)

if (noDuplicate) {
    WebUI.comment('Tidak ada asset duplikat')
} else {
    WebUI.comment('Ada duplikat Asset di tabel')
}

WebUI.click(findTestObject('Borrow/List - Select asset'))

WebUI.click(findTestObject('Object Repository/Borrow/Button - Select'))

WebUI.delay(2)

int rowAfter = WebUI.findWebElements(findTestObject('Object Repository/All asset/Register asset/Tabel - Row register asset'), 
    10).size()

println('Jumlah baris setelah aksi: ' + rowAfter)

WebUI.verifyEqual(rowAfter, rowBefore + 1)

