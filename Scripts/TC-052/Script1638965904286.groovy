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

WebUI.setText(findTestObject('Object Repository/TC_002/Page_INNSIGHT/input_Advance Filter_txtTwSrch'), 'India')

WebUI.click(findTestObject('27/Page_InnSight/span_Advance Filter_searchTweet'))

CustomKeywords.'utilities.main.pause'()

WebUI.click(findTestObject('Page_InnSight/a_Dashboard'))

WebUI.click(findTestObject('scrolling/Page_INNSIGHT/Gender-Distribution'))

WebUI.click(findTestObject('scrolling/Page_INNSIGHT/Page_INNSIGHT/Hourly-Activity-Count'))

CustomKeywords.'utilities.main.pause'()

WebUI.closeBrowser()

