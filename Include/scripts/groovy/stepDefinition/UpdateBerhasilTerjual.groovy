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



class UpdateBerhasilTerjual {
	@When("seller click Back")
	public void seller_click_Back() {
		WebUI.callTestCase(findTestCase('Pages/Update Status Seller/Click Back'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click Status")
	public void seller_click_Status() {
		WebUI.callTestCase(findTestCase('Pages/Update Status Seller/Click Status'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click Berhasil Terjual radio button")
	public void seller_click_Berhasil_Terjual_radio_button() {
		WebUI.callTestCase(findTestCase('Pages/Update Status Seller/Click Berhasil Terjual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("seller click Simpan")
	public void seller_click_Simpan() {
		WebUI.callTestCase(findTestCase('Pages/Update Status Seller/Click Simpan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("seller verify Berhasil terjual")
	public void seller_verify_Berhasil_terjual() {
		WebUI.callTestCase(findTestCase('Pages/Update Status Seller/Verify Berhasil Terjual'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.pressBack()
		Mobile.pressBack()
		WebUI.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:])
		WebUI.callTestCase(findTestCase('Pages/Akun/Tap Logout'), [:])
	}
}