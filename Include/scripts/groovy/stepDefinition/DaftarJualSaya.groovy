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

public class DaftarJualSaya {
	@When('User tap Akun navbar')
	public void tap_akun_navbar() {
		WebUI.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And('User tap Daftar Jual Saya')
	public void tap_djs() {
		WebUI.callTestCase(findTestCase('Pages/Akun/Tap Daftar Jual Saya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('Verify product card exists')
	public void verify_product_card_exists() {
		WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Verify Product Card Exist'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('Verify no product exists')
	public void verify_no_product_exists() {
		WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Verify No Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And('User tap Diminati tab')
	public void tap_diminati() {
		WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Tap Tab Diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And('User tap Terjual tab')
	public void tap_terjual() {
		WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Tap Tab Terjual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('Verify product diminati exists')
	public void verify_diminati_exists() {
		WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Verify Product Diminati Exists'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And('User already logged in and have product')
	public void user_login_have_product() {
		Mobile.startApplication(System.getProperty("user.dir") + "\\Apk\\app-release-second-hand-gcp.apk", false)
		try {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Verify Already Logged In'), [:], FailureHandling.STOP_ON_FAILURE)
			try {
				WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Verify Account Have Product'), [:], FailureHandling.STOP_ON_FAILURE)
			} catch (Exception e) {
				WebUI.callTestCase(findTestCase('Step Definition/Feature Logout/LGT01 - Logout'), [:], FailureHandling.STOP_ON_FAILURE)
				Mobile.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)
				Mobile.callTestCase(findTestCase('Pages/Akun/Tap Masuk from Akun Page'), [:], FailureHandling.STOP_ON_FAILURE)
				Mobile.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : 'garasimobil@mytestmail.net'], FailureHandling.STOP_ON_FAILURE)
				Mobile.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : 'a1b2c3d4'], FailureHandling.STOP_ON_FAILURE)
				Mobile.callTestCase(findTestCase('Pages/Login/Tap Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
			}
		} catch (Exception e) {
			Mobile.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)
			Mobile.callTestCase(findTestCase('Pages/Akun/Tap Masuk from Akun Page'), [:], FailureHandling.STOP_ON_FAILURE)
			Mobile.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : 'garasimobil@mytestmail.net'], FailureHandling.STOP_ON_FAILURE)
			Mobile.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : 'a1b2c3d4'], FailureHandling.STOP_ON_FAILURE)
			Mobile.callTestCase(findTestCase('Pages/Login/Tap Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And('User already logged in and have no product')
	public void user_login_no_product() {
		Mobile.startApplication(System.getProperty("user.dir") + "\\Apk\\app-release-second-hand-gcp.apk", false)
		try {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Verify Already Logged In'), [:], FailureHandling.STOP_ON_FAILURE)
			try {
				WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Verify Account No Product'), [:], FailureHandling.STOP_ON_FAILURE)
			} catch (Exception e) {
				WebUI.callTestCase(findTestCase('Step Definition/Feature Logout/LGT01 - Logout'), [:], FailureHandling.STOP_ON_FAILURE)
				Mobile.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)
				Mobile.callTestCase(findTestCase('Pages/Akun/Tap Masuk from Akun Page'), [:], FailureHandling.STOP_ON_FAILURE)
				Mobile.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : 'qatest@mytestmail.net'], FailureHandling.STOP_ON_FAILURE)
				Mobile.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : 'a1b2c3d4'], FailureHandling.STOP_ON_FAILURE)
				Mobile.callTestCase(findTestCase('Pages/Login/Tap Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
			}
		} catch (Exception e) {
			Mobile.callTestCase(findTestCase('Pages/Akun/Tap Masuk from Akun Page'), [:], FailureHandling.STOP_ON_FAILURE)
			Mobile.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : 'qatest@mytestmail.net'], FailureHandling.STOP_ON_FAILURE)
			Mobile.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : 'a1b2c3d4'], FailureHandling.STOP_ON_FAILURE)
			Mobile.callTestCase(findTestCase('Pages/Login/Tap Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
		}
	}
}
