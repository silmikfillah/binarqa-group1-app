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



class Login {
	@Given("I already register an account and on the login page")
	public void i_already_register_an_account_and_on_the_login_page() {
		Mobile.startApplication('Apk/app-release-second-hand-gcp.apk', true)
		Mobile.callTestCase(findTestCase('Pages/Navbar/Click Akun'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Pages/Login/Tap Masuk from Akun Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}


	@When("I input email with (.*)")
	public void i_input_email(String email) {
		Mobile.callTestCase(findTestCase('Pages/Login/Verify Content Login Page'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I input password with (.*)")
	public void i_input_password(String password) {
		Mobile.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I tap Masuk button")
	public void i_tap_Masuk_button() {
		Mobile.callTestCase(findTestCase('Pages/Login/Tap Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I should see the next step (.*)")
	public void i_should_see_the_next_step(String status) {
		if (status == 'success') {
			Mobile.callTestCase(findTestCase('Pages/Login/Verify Login Valid'), [('status'):status], FailureHandling.STOP_ON_FAILURE)
		}
		else if (status == 'incorrect') {
			Mobile.callTestCase(findTestCase('Pages/Login/Verify Email or Password Incorrect'), [('status'):status], FailureHandling.STOP_ON_FAILURE)
		}
		else if (status == 'invalid') {
			Mobile.callTestCase(findTestCase('Pages/Login/Verify Invalid Email'), [('status'):status], FailureHandling.STOP_ON_FAILURE)
		}
		else if (status == 'empty email') {
			Mobile.callTestCase(findTestCase('Pages/Login/Verify Invalid Empty Email'), [('status'):status], FailureHandling.STOP_ON_FAILURE)
		}
		Mobile.closeApplication()
	}
}