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

WebUI.click(findTestObject('12/waste/Page_INNSIGHT/div_Profiler New_sprite setting-icon'))

WebUI.click(findTestObject('12/waste/Page_INNSIGHT/a_Alerts'))

WebUI.click(findTestObject('12/waste/Page_INNSIGHT/a_Create New Alert'))

WebUI.setText(findTestObject('12/Page_INNSIGHT/AlertsName'), 'Plane Crashed')

WebUI.setText(findTestObject('12/Page_INNSIGHT/Keywords'), 'plane , crashed ,Fights')

WebUI.setText(findTestObject('12/Page_INNSIGHT/Frequencykey'), '500')

WebUI.click(findTestObject('12/waste/Page_INNSIGHT/input_Negative_sent'))

WebUI.click(findTestObject('12/waste/Page_INNSIGHT/input_Mode of Alerts_usealertradio'))

WebUI.setText(findTestObject('12/waste/Page_INNSIGHT/input_TO_alrtemailval'), 'Testing@gmail.com')

WebUI.setText(findTestObject('12/Page_INNSIGHT/CC'), 'Test@gmail.com')

WebUI.click(findTestObject('12/waste/Page_INNSIGHT/input_BCC_usealertradio'))

WebUI.setText(findTestObject('12/waste/Page_INNSIGHT/input_Mobile Number_alrtmobval'), '9999888777')

WebUI.selectOptionByValue(findTestObject('12/waste/Page_INNSIGHT/select_000102030405060708091011121314151617_d567da'), '5', 
    true)

WebUI.selectOptionByValue(findTestObject('12/waste/Page_INNSIGHT/select_000102030405060708091011121314151617_3a1c8f'), '0', 
    true)

WebUI.selectOptionByValue(findTestObject('12/waste/Page_INNSIGHT/select_000102030405060708091011121314151617_d567da_1'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('12/waste/Page_INNSIGHT/select_000102030405060708091011121314151617_3a1c8f_1'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('12/waste/Page_INNSIGHT/select_000102030405060708091011121314151617_d567da_1_2'), 
    '16', true)

WebUI.selectOptionByValue(findTestObject('12/waste/Page_INNSIGHT/select_000102030405060708091011121314151617_3a1c8f_1_2'), 
    '19', true)

WebUI.click(findTestObject('12/waste/Page_INNSIGHT/span_SAVE'))

WebUI.click(findTestObject('12/waste/Page_INNSIGHT/button_Yes'))

