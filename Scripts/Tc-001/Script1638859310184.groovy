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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://office.authshieldserver.com:8081/innsight/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_InnSight/input_Next_userName (1)'), 'chirayu')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_InnSight/input_Next_password (1)'), '9AQYdta11mVqFES92EPRDw==')

WebUI.click(findTestObject('Object Repository/Page_InnSight/input_Next_loginbtn (1)'))

WebUI.click(findTestObject('Object Repository/Page_INNSIGHT/div_Profile Finder_sprite collection-icon (1)'))

WebUI.switchToWindowTitle(':: Innsight ::')

WebUI.click(findTestObject('Object Repository/Page_Innsight/a_Add New Collection (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Innsight/input_Add collection_colloction_name (1)'), 'TEST001')

WebUI.click(findTestObject('Object Repository/Page_Innsight/span_Next (1)'))

WebUI.click(findTestObject('Page_InnSight/Track_event'))

WebUI.click(findTestObject('Page_InnSight/Trackevent-NEXT'))

WebUI.setText(findTestObject('Object Repository/Page_Innsight/input_Track Event_mat-chip-list-input-0 (1)'), 'india ')

WebUI.sendKeys(findTestObject('Object Repository/Page_Innsight/input_Track Event_mat-chip-list-input-0 (1)'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Innsight/input_Track Event_mat-chip-list-input-0 (1)'), 'kashmir')

WebUI.sendKeys(findTestObject('Object Repository/Page_Innsight/input_Track Event_mat-chip-list-input-0 (1)'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('slide/Page_Innsight/div_Check or Uncheck All_mat-slide-toggle-bar'))

WebUI.click(findTestObject('slide/Page_Innsight/div_Facebook_mat-slide-toggle-bar'))

WebUI.click(findTestObject('slide/Page_Innsight/div_Twitter_mat-slide-toggle-bar'))

WebUI.click(findTestObject('Page_InnSight/check-all-NEXT'))

WebUI.click(findTestObject('Page_InnSight/Collection-settings-NEXT'))

WebUI.click(findTestObject('Object Repository/Page_Innsight/span_Submit (1)'))

WebUI.click(findTestObject('Object Repository/Page_Innsight/span_Yes (1)'))

WebUI.switchToWindowTitle(':: INNSIGHT ::')

WebUI.setText(findTestObject('Object Repository/Page_INNSIGHT/input_Advance Filter_txtTwSrch (1)'), 'india AND kashmir')

WebUI.click(findTestObject('Object Repository/Page_INNSIGHT/span_Advance Filter_searchTweet (1)'))

WebUI.click(findTestObject('Page_InnSight/a_Dashboard'))

WebUI.scrollToElement(findTestObject('Page_InnSight/span_Author Location'), 10)

