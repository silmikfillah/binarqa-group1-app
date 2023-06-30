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


class AcceptBuyerOffer {

	@Given("seller sudah melakukan login")
	public void seller_sudah_melakukan_login() {
		WebUI.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Akun/Tap Masuk from Akun Page'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : 'alexjual1@gmail.com'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : 'asdqwe'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Tap Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click Daftar Jual Saya")
	public void seller_click_Daftar_Jual_Saya() {
		WebUI.callTestCase(findTestCase('Pages/Akun/Tap Daftar Jual Saya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click Diminati")
	public void seller_click_Diminati() {
		WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Tap Tab Diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click first Diminati")
	public void seller_click_first_Diminati() {
		WebUI.callTestCase(findTestCase('Pages/Update Status Seller/Click First Diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click Terima")
	public void seller_Terima() {
		WebUI.callTestCase(findTestCase('Pages/Update Status Seller/Click Terima'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("seller verify Hubungi via Whatsapp button")
	public void seller_verify_Hubungi_via_Whatsapp_button() {
		WebUI.callTestCase(findTestCase('Pages/Update Status Seller/Verify Hubungi Via Whatsapp'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}