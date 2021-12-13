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

WebUI.setText(findTestObject('Object Repository/25/Page_InnSight/input_Next_userName'), 'chirayu')

WebUI.setEncryptedText(findTestObject('Object Repository/25/Page_InnSight/input_Next_password'), '9AQYdta11mVqFES92EPRDw==')

WebUI.click(findTestObject('Object Repository/25/Page_InnSight/input_Next_loginbtn'))

WebUI.click(findTestObject('Object Repository/25/Page_INNSIGHT/div_Profile Finder_sprite collection-icon'))

WebUI.switchToWindowTitle(':: Innsight ::')

WebUI.click(findTestObject('25/Page_InnSight/i_active_flaticon-more-1'))

WebUI.click(findTestObject('25/Page_InnSight/span_Edit'))

WebUI.click(findTestObject('25/Page_InnSight/Next(1)'))

WebUI.click(findTestObject('25/Page_InnSight/Next(2)'))

WebUI.click(findTestObject('25/Page_InnSight/Next(3)'))

WebUI.click(findTestObject('25/Page_InnSight/Next(4)'))

WebUI.click(findTestObject('25/Page_InnSight/span_Update'))

WebUI.click(findTestObject('25/Page_InnSight/span_Yes'))

WebUI.closeBrowser()

