package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class Register {
	@Given("I already installed the app and on the register page")
	public void i_already_installed_the_app_and_on_the_register_page() {
		//Mobile.startExistingApplication('id.binar.fp.secondhand', FailureHandling.STOP_ON_FAILURE)
		Mobile.startApplication(System.getProperty("user.dir") + "\\Apk\\app-release-second-hand-gcp.apk", true)
		Mobile.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Pages/Akun/Tap Masuk from Akun Page'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Pages/Register/Tap Daftar from login page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I input nama for register (.*) and (.*)")
	public void i_input_namareg_with(String nama, statusnama) {
		if (statusnama == "random") {
			Mobile.callTestCase(findTestCase('Pages/Register/Input Nama with custom keyword'), [('nama') : nama], FailureHandling.STOP_ON_FAILURE)
		}
		else if (statusnama == "testdata") {
			Mobile.callTestCase(findTestCase('Pages/Register/Input Nama with test data'), [('nama') : nama], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And("I input email for register (.*) and (.*)")
	public void i_input_emailreg_with(String email, statusemail) {
		if (statusemail == "random") {
			Mobile.callTestCase(findTestCase('Pages/Register/Input Email with custom keyword'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
		}
		else if (statusemail == "testdata") {
			Mobile.callTestCase(findTestCase('Pages/Register/Input Email with test data'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And("I input password for register (.*)")
	public void i_input_passwordreg_with(String password) {
		Mobile.callTestCase(findTestCase('Pages/Register/Input Password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I input nomor hp with (.*)")
	public void i_input_nomor_hp_with(String nomor_hp) {
		Mobile.callTestCase(findTestCase('Pages/Register/Input Nomor Hp'), [('nomor_hp') : nomor_hp], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I input kota with (.*)")
	public void i_input_kota_with(String kota) {
		Mobile.callTestCase(findTestCase('Pages/Register/Input Kota'), [('kota') : kota], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I input alamat with (.*)")
	public void i_input_alamat_with(String alamat) {
		Mobile.callTestCase(findTestCase('Pages/Register/Input Alamat'), [('alamat') : alamat], FailureHandling.STOP_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Pages/Register/Scroll to Text Sudah Punya Akun'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I click Register button")
	public void iclickregisterbtn() {
		Mobile.callTestCase(findTestCase('Pages/Register/Tap Button Daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I should see the next step: (.*) for register")
	public void i_should_see_the_next_step_for_register(String status) {
		Mobile.callTestCase(findTestCase('Pages/Register/Verify Register with if else'), [('status') : status], FailureHandling.STOP_ON_FAILURE)
	}
}