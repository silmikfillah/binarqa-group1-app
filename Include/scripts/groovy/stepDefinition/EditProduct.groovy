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
import cucumber.api.java.en.And
import internal.GlobalVariable

public class EditProduct {
	@Given("User login as seller")
	public void user_login_as_seller() {
		try {
			WebUI.callTestCase(findTestCase('Pages/Homepage/Verify Already Logged In'), [:], FailureHandling.STOP_ON_FAILURE)
		} catch (Exception e) {
			WebUI.callTestCase(findTestCase('Step Definition/Feature Login/LGN01 - User login with valid credentials'), [('email') : 'groupsatu@gmail.com', ('password') : 'abc!12345'])
		}
	}

	@And("User tab akun")
	public void user_tab_akun() {
		Mobile.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User tab Daftar Product")
	public void user_tab_daftar_product() {
		Mobile.callTestCase(findTestCase('Pages/Akun/Tap Daftar Jual Saya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap product")
	public void user_tap_product() {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Tap Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input product name")
	public void user_input_product_name() {
		Mobile.callTestCase(findTestCase('Pages/Edit Product/Edit Nama Produk'), [('namaProduk') : 'Baju'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input product price")
	public void user_input_product_price() {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Edit Harga Produk'), [('hargaProduk') : '100000'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User choose category")
	public void user_choose_category() {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Edit Kategori Produk'), [('kategoriProduk') : 'Elektronik'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input location")
	public void user_input_location() {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Edit Lokasi Produk'), [('lokasiProduk') : 'Serang'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input product description")
	public void user_input_product_description() {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Edit Deskripsi Produk'), [('deskripsiProduk') : 'Baju Bagus Banget'], FailureHandling.STOP_ON_FAILURE)
	}


	@When("Click publish button")
	public void click_publish_button() {
		Mobile.callTestCase(findTestCase('Pages/Edit Product/Tap Terbitkan Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User will see success message")
	public void user_will_see_success_message() {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Verify Success Message'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}