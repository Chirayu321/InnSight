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

CustomKeywords.'utilities.main.user'('chirayu', '9AQYdta11mVqFES92EPRDw==')

WebUI.setText(findTestObject('Object Repository/TC_002/Page_INNSIGHT/input_Advance Filter_txtTwSrch'), 'moid')

WebUI.click(findTestObject('Page_InnSight/Fuzzy Search'))

WebUI.acceptAlert()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://office.authshieldserver.com:8081/innsight/')

WebUI.setText(findTestObject('Object Repository/22/Page_InnSight/input_Next_userName'), 'chirayu')

WebUI.setEncryptedText(findTestObject('Object Repository/22/Page_InnSight/input_Next_password'), '9AQYdta11mVqFES92EPRDw==')

WebUI.click(findTestObject('Object Repository/22/Page_InnSight/input_Next_loginbtn'))

WebUI.click(findTestObject('Object Repository/22/Page_INNSIGHT/div_Profile Finder_sprite collection-icon'))

WebUI.switchToWindowTitle(':: Innsight ::')

WebUI.click(findTestObject('Object Repository/22/Page_Innsight/span_Manage Proxy'))

WebUI.click(findTestObject('Object Repository/22/Page_Innsight/button_Add Proxy'))

WebUI.setText(findTestObject('Object Repository/22/Page_Innsight/input_Add Proxy_mat-input-1'), '122.12.18.10')

WebUI.setText(findTestObject('Object Repository/22/Page_Innsight/input_Proxy IP_mat-input-2'), '3')

WebUI.setText(findTestObject('Object Repository/22/Page_Innsight/input_Port_mat-input-3'), 'Testing')

WebUI.setEncryptedText(findTestObject('Object Repository/22/Page_Innsight/input_User Name_mat-input-4'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/22/Page_Innsight/span_Save'))

WebUI.click(findTestObject('Object Repository/22/Page_Innsight/button_Yes'))

WebUI.click(findTestObject('Object Repository/22/Page_Innsight/span_No'))

WebUI.click(findTestObject('Object Repository/22/Page_Innsight/span_Manage Avatar'))

WebUI.click(findTestObject('Object Repository/22/Page_Innsight/button_Avatar List'))

WebUI.click(findTestObject('Object Repository/22/Page_Innsight/i_active_flaticon-edit'))

WebUI.click(findTestObject('Object Repository/22/Page_Innsight/div_192.168.2142025'))

WebUI.click(findTestObject('Object Repository/22/Page_Innsight/span_122.12.18.103'))

WebUI.setText(findTestObject('Object Repository/22/Page_Innsight/input_Proxy_mat-input-13'), 'New Testing Proxy added')

WebUI.click(findTestObject('Object Repository/22/Page_Innsight/span_Update'))

WebUI.click(findTestObject('Object Repository/22/Page_Innsight/span_Yes'))

WebUI.closeBrowser()

