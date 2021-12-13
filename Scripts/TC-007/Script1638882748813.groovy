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

WebUI.setText(findTestObject('Object Repository/7/Page_InnSight/input_Next_userName'), 'chirayu')

WebUI.setEncryptedText(findTestObject('Object Repository/TC_002/Page_InnSight/input_Next_password'), '9AQYdta11mVqFES92EPRDw==')

WebUI.click(findTestObject('Object Repository/TC_002/Page_InnSight/input_Next_loginbtn'))

WebUI.click(findTestObject('Object Repository/7/Page_INNSIGHT/div_Profile Finder_sprite collection-icon'))

WebUI.switchToWindowTitle(':: Innsight ::')

WebUI.click(findTestObject('Object Repository/7/Page_Innsight/span_Manage Avatar'))

WebUI.click(findTestObject('Object Repository/7/Page_Innsight/button_Add Avatar'))

WebUI.setText(findTestObject('Object Repository/7/Page_Innsight/input_Add Avatar_mat-input-1'), 'Testing')

WebUI.setText(findTestObject('Object Repository/7/Page_Innsight/input_First Name_mat-input-2'), 'Test')

WebUI.setText(findTestObject('Object Repository/7/Page_Innsight/input_Last Name_mat-input-3'), 'Revolutinist')

'Password is:123456\r\n'
WebUI.setEncryptedText(findTestObject('Object Repository/7/Page_Innsight/input_User Name_mat-input-4'), 'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/7/Page_Innsight/input_Female_mat-input-5'), 'Testing@gmail.com')

WebUI.setText(findTestObject('Object Repository/7/Page_Innsight/input_Email ID_mat-input-6'), '9999888777')

WebUI.click(findTestObject('Object Repository/7/Page_Innsight/span_Phone Number_mat-select-placeholder ma_0e0594'))

WebUI.click(findTestObject('Object Repository/7/Page_Innsight/span_Facebook'))

WebUI.click(findTestObject('Object Repository/7/Page_Innsight/span_Source_mat-select-placeholder mat-sele_d47bc5'))

WebUI.click(findTestObject('Object Repository/7/Page_Innsight/span_Genral'))

WebUI.click(findTestObject('Object Repository/7/Page_Innsight/span_Category_mat-select-placeholder mat-se_93b29b'))

WebUI.click(findTestObject('Object Repository/7/Page_Innsight/span_192.168.2142025'))

WebUI.setText(findTestObject('Object Repository/7/Page_Innsight/input_Proxy_mat-input-7'), 'This is for Automation Testing purpose only.')

WebUI.click(findTestObject('Object Repository/7/Page_Innsight/span_Save'))

WebUI.click(findTestObject('Object Repository/7/Page_Innsight/span_Yes'))

WebUI.click(findTestObject('Object Repository/7/Page_Innsight/span_No'))

