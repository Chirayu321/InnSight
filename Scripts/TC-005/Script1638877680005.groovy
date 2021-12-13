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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://office.authshieldserver.com:8081/innsight/')

WebUI.setText(findTestObject('Object Repository/TC_002/Page_InnSight/input_Next_userName'), 'Chirayu')

WebUI.setEncryptedText(findTestObject('Object Repository/TC_002/Page_InnSight/input_Next_password'), '9AQYdta11mVqFES92EPRDw==')

WebUI.click(findTestObject('Object Repository/TC_002/Page_InnSight/input_Next_loginbtn'))

WebUI.setText(findTestObject('Object Repository/TC_002/Page_INNSIGHT/input_Advance Filter_txtTwSrch'), 'India')

WebUI.click(findTestObject('Object Repository/TC_002/Page_INNSIGHT/a_Advance Filter  -'))

WebUI.click(findTestObject('TC005/Page_INNSIGHT/Uncheck all'))

WebUI.click(findTestObject('Object Repository/TC_002/Page_INNSIGHT/span_Uncheck All'))

WebUI.click(findTestObject('TC005/Page_INNSIGHT/span_Google_checkmark'))

WebUI.click(findTestObject('TC005/Page_INNSIGHT/span_Bing_checkmark'))

WebUI.click(findTestObject('TC005/Page_INNSIGHT/span_Baidu_checkmark'))

WebUI.click(findTestObject('TC005/Page_INNSIGHT/span_DuckDuckGo_checkmark'))

WebUI.click(findTestObject('Object Repository/TC_002/Page_INNSIGHT/a_Apply'))

WebUI.click(findTestObject('Page_InnSight/a_Dashboard'))

'The system should display the articles from the selected\r\nsources as per the queried keywords'
WebUI.mouseOver(findTestObject('Page_InnSight/span_Source-Based Document Count'))

