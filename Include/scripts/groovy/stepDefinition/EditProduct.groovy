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

public class EditProduct {
	@Given("User login as seller")
	public void user_login_as_seller() {
		Mobile.callTestCase(findTestCase('Test Cases/Step Definition/Feature Login/LGN01 - User login with valid credentials'), null)
	}

	@When("User tab akun")
	public void user_tab_akun() {
		WebUI.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tab Daftar Product")
	public void user_tab_daftar_product() {
		WebUI.callTestCase(findTestCase('Pages/Akun/Tap Daftar Jual Saya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap product")
	public void user_tap_product() {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Tap Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input product name")
	public void user_input_product_name() {
		Mobile.setText(findTestObject('Object Repository/Add Product/android.widget.EditText - Nama Produk'), 'magicom', 0)
	}

	@When("User input product price")
	public void user_input_product_price() {
		Mobile.setText(findTestObject('Object Repository/Add Product/android.widget.EditText - Harga Produk'), '1000000', 0)
	}

	@When("User choose category")
	public void user_choose_category() {
		Mobile.tap(findTestObject('Object Repository/Add Product/android.widget.Spinner - Pilih Kategori'), 0)
		Mobile.tap(findTestObject('Object Repository/Add Product/Pilih Kategori Pertama'), 0)
	}

	@When("User input location")
	public void user_input_location() {
		Mobile.setText(findTestObject('Object Repository/Add Product/android.widget.EditText - Lokasi Produk'), 'Serang', 0)
	}

	@When("User input product description")
	public void user_input_product_description() {
		Mobile.setText(findTestObject('Object Repository/Add Product/android.widget.EditText - Deskripsi Produk'), 'mesin cuci mini', 0)
	}

	@When("User upload product image")
	public void user_upload_product_image() {
		Mobile.tap(findTestObject('Object Repository/Add Product/android.widget.Button - Kamera'), 0)
		Mobile.tap(findTestObject('Add product/btn_galeri'), 0)
		Mobile.tap(findTestObject('Add product/image_washingmachine'), 0)
	}

	@When("Click publish button")
	public void click_publish_button() {
		Mobile.tap(findTestObject('Add product/btn_terbitkan'), 0)
	}

	@Then("User will be redirected to daftar jual saya page")
	public void user_will_be_redirected_to_daftar_jual_saya_page() {
		Mobile.delay(2)
		Mobile.verifyElementVisible(findTestObject('Add product/daftarjualsaya_page'), 0)
	}
}