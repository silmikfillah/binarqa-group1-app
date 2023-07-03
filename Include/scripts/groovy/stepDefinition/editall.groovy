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



class editall {
	@Given("User login")
	public void user_login() {
		Mobile.startApplication(System.getProperty("user.dir") + "\\Apk\\app-release-second-hand-gcp.apk", false)
		WebUI.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/Edit Profile/Button-masuk'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/Edit Profile/Input_email'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/Edit Profile/Input_password'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/Edit Profile/Button-masuk2'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap akun")
	public void user_tap_akun() {
		WebUI.callTestCase(findTestCase('Pages/Edit Profile/Click_gambar_edit'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input nama")
	public void user_input_nama() {
		WebUI.callTestCase(findTestCase('Pages/Edit Profile/edit profile deksa/tap nama'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/Edit Profile/Button simpan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input nomor handphone")
	public void user_input_nomor_handphone() {
		WebUI.callTestCase(findTestCase('Pages/Edit Profile/edit profile deksa/tap nomor'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/Edit Profile/Button simpan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input kota")
	public void user_input_kota() {
		WebUI.callTestCase(findTestCase('Pages/Edit Profile/edit profile deksa/tap kota'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/Edit Profile/Button simpan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input alamat")
	public void user_input_alamat() {
		WebUI.callTestCase(findTestCase('Pages/Edit Profile/edit profile deksa/tap alamat'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/Edit Profile/Button simpan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User verify success")
	public void user_verify_success() {
		WebUI.callTestCase(findTestCase('Pages/Edit Profile/edit profile deksa/verify'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.pressBack()
		WebUI.callTestCase(findTestCase('Pages/Akun/Tap Logout'), [:])
	}
}