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

WebUI.setText(findTestObject('Object Repository/TC_002/Page_INNSIGHT/input_Advance Filter_txtTwSrch'), 'india AND kashmir')

WebUI.click(findTestObject('Object Repository/TC_002/Page_INNSIGHT/a_Advance Filter  -'))

WebUI.click(findTestObject('Object Repository/TC_002/Page_INNSIGHT/span_Uncheck All'))

WebUI.click(findTestObject('Object Repository/TC_002/Page_INNSIGHT/span_Instagram_checkmark'))

WebUI.click(findTestObject('Object Repository/TC_002/Page_INNSIGHT/span_Facebook_checkmark'))

WebUI.click(findTestObject('Object Repository/TC_002/Page_INNSIGHT/a_Apply'))

WebUI.click(findTestObject('Page_InnSight/a_Dashboard'))

WebUI.click(findTestObject('scrolling/Page_INNSIGHT/span_Top Hashtags'))

WebUI.click(findTestObject('scrolling/Page_INNSIGHT/span_Top Languages'))

WebUI.click(findTestObject('scrolling/Page_INNSIGHT/span_Users Who Tweeted Most'))

WebUI.click(findTestObject('scrolling/Page_INNSIGHT/span_Most Active Users'))

WebUI.scrollToElement(findTestObject('Page_InnSight/span_Social Statistics'), 20)

WebUI.closeBrowser()

