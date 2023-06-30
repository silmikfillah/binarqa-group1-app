package stepDefinition

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

import internal.GlobalVariable
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class PesananSaya {
	@And('User already logged in and have order')
	public void user_login_have_order() {
		try {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Verify Already Logged In'), [:], FailureHandling.STOP_ON_FAILURE)
			try {
				WebUI.callTestCase(findTestCase('Pages/Pesanan Saya/Verify Account Have Order'), [:], FailureHandling.STOP_ON_FAILURE)
			} catch (Exception e) {
				WebUI.callTestCase(findTestCase('Step Definition/Feature Logout/LGT01 - Logout'), [:], FailureHandling.STOP_ON_FAILURE)
				WebUI.callTestCase(findTestCase('Step Definition/Feature Login/LGN01 - User login with valid credentials'), [('email'):'peter.rg@gmail.com', ('password'):'a1b2c3d4'])
			}
		} catch (Exception e) {
			WebUI.callTestCase(findTestCase('Step Definition/Feature Login/LGN01 - User login with valid credentials'), [('email'):'peter.rg@gmail.com', ('password'):'a1b2c3d4'])
		}
	}
	
	@And('User already logged in and have no order')
	public void user_login_no_order() {
		try {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Verify Already Logged In'), [:], FailureHandling.STOP_ON_FAILURE)
			try {
				WebUI.callTestCase(findTestCase('Pages/Pesanan Saya/Verify Account Have No Order'), [:], FailureHandling.STOP_ON_FAILURE)
			} catch (Exception e) {
				WebUI.callTestCase(findTestCase('Step Definition/Feature Logout/LGT01 - Logout'), [:], FailureHandling.STOP_ON_FAILURE)
				WebUI.callTestCase(findTestCase('Step Definition/Feature Login/LGN01 - User login with valid credentials'), [('email'):'qatest@mytestmail.net', ('password'):'a1b2c3d4'])
			}
		} catch (Exception e) {
			WebUI.callTestCase(findTestCase('Step Definition/Feature Login/LGN01 - User login with valid credentials'), [('email'):'qatest@mytestmail.net', ('password'):'a1b2c3d4'])
		}
	}
	
	@And('User tap Pesanan Saya')
	public void tap_pesanan() {
		WebUI.callTestCase(findTestCase('Pages/Akun/Tap Pesanan Saya'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then('Verify card list exists')
	public void verify_card_list_exists() {
		WebUI.callTestCase(findTestCase('Pages/Pesanan Saya/Verify Pesanan Card'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then('Verify no Pesanan exists')
	public void verify_no_pesanan_exists() {
		WebUI.callTestCase(findTestCase('Pages/Pesanan Saya/Verify No Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
