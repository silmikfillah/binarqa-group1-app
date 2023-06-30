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
import cucumber.api.java.en.When
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import internal.GlobalVariable

public class DeleteProduct {
	@Given("User login as seller")
	public void user_login_as_seller() {
		Mobile.callTestCase(findTestCase('Test Cases/Step Definition/Feature Login/LGN01 - User login with valid credentials'), null)
	}

	@When("User tab akun")
	public void user_tab_akun() {
		Mobile.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tab Daftar Product")
	public void user_tab_daftar_product() {
		Mobile.callTestCase(findTestCase('Pages/Akun/Tap Daftar Jual Saya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap product")
	public void user_tap_product() {
		Mobile.callTestCase(findTestCase('Pages/Edit Product/Tap Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap button trash")
	public void user_tap_button_trash() {
		Mobile.callTestCase(findTestCase('Pages/Delete Product/Tap button Trash'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User will be redirected to daftar jual saya page")
	public void user_will_be_redirected_to_daftar_jual_saya_page() {
		Mobile.delay(2)
		Mobile.callTestCase(findTestCase('Pages/Edit Product/Verify Success Message'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}