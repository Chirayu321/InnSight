package utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.util.concurrent.TimeUnit;

import javax.ws.rs.WebApplicationException

import internal.GlobalVariable
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

public class main {

	@Keyword
	def user(String email,String Password){

		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('http://office.authshieldserver.com:8081/innsight/')
		WebUI.setText(findTestObject('Object Repository/TC_002/Page_InnSight/input_Next_userName'), email)
		WebUI.setEncryptedText(findTestObject('Object Repository/TC_002/Page_InnSight/input_Next_password'), Password)
		WebUI.click(findTestObject('Object Repository/TC_002/Page_InnSight/input_Next_loginbtn'))
		WebUI.waitForPageLoad(50)
	}

	@Keyword
	def synchronized void pause() {
		//wait 1.5 seconds before resuming.
		wait(1500)
	}
}

