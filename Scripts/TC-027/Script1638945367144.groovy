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

WebUI.click(findTestObject('Object Repository/27/Page_INNSIGHT/div_Profile Finder_sprite collection-icon'))

WebUI.switchToWindowTitle(':: Innsight ::')

WebUI.click(findTestObject('Object Repository/27/Page_Innsight/span_Media Sources'))

WebUI.click(findTestObject('Object Repository/27/Page_Innsight/button_News Source'))

WebUI.click(findTestObject('Object Repository/27/Page_Innsight/div_All'))

WebUI.click(findTestObject('Object Repository/27/Page_Innsight/span_India'))

WebUI.switchToWindowTitle(':: INNSIGHT ::')

WebUI.setText(findTestObject('27/Page_InnSight/input_Advance Filter_txtTwSrch'), 'India')

WebUI.click(findTestObject('27/Page_InnSight/a_Advance Filter  -'))

WebUI.click(findTestObject('TC_002/Page_InnSight/span_Uncheck All'))

WebUI.click(findTestObject('TC_002/Page_InnSight/a_Apply'))

