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
			Mobile.startApplication(System.getProperty("user.dir") + "\\Apk\\app-release-second-hand-gcp.apk", false)
			WebUI.callTestCase(findTestCase('Pages/Homepage/Verify Already Logged In'), [:], FailureHandling.STOP_ON_FAILURE)
		} catch (Exception e) {
			WebUI.callTestCase(findTestCase('Step Definition/Feature Login/LGN01 - User login with valid credentials'), [('email') : 'groupsatu@gmail.com', ('password') : 'abc!12345'])
		}
	}

	@And("User tab akun")
	public void user_tab_akun() {
		Mobile.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User tab Daftar Jual")
	public void user_tab_daftar_jual() {
		Mobile.callTestCase(findTestCase('Pages/Akun/Tap Daftar Jual Saya'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap product")
	public void user_tap_product() {
		WebUI.callTestCase(findTestCase('Pages/Edit Product/Tap Produk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User edit Nama Produk with (.*)")
	public void user_input_product_name(String nama_produk) {
		if(nama_produk == 'empty') {
			Mobile.callTestCase(findTestCase('Pages/Edit Product/Edit Nama Produk'), [('namaProduk') : ''], FailureHandling.STOP_ON_FAILURE)
		}else {
			Mobile.callTestCase(findTestCase('Pages/Edit Product/Edit Nama Produk'), [('namaProduk') : nama_produk], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@When("User edit Harga Produk with (.*)")
	public void user_input_product_price(String harga) {
		if(harga == 'empty') {
			Mobile.callTestCase(findTestCase('Pages/Edit Product/Edit Harga Produk'), [('hargaProduk') : ''], FailureHandling.STOP_ON_FAILURE)
		}else {
			Mobile.callTestCase(findTestCase('Pages/Edit Product/Edit Harga Produk'), [('hargaProduk') : harga], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@When("User edit Kategori with (.*)")
	public void user_input_category(String kategori) {
		if(kategori == 'empty') {
			Mobile.callTestCase(findTestCase('Pages/Edit Product/Edit Kategori Produk'), [('kategoriProduk') : ''], FailureHandling.STOP_ON_FAILURE)
		}else {
			Mobile.callTestCase(findTestCase('Pages/Edit Product/Edit Kategori Produk'), [('kategoriProduk') : kategori], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@When("User edit Lokasi with (.*)")
	public void user_input_location(String lokasi) {
		if(lokasi == 'empty') {
			Mobile.callTestCase(findTestCase('Pages/Edit Product/Edit Lokasi Produk'), [('lokasiProduk') : ''], FailureHandling.STOP_ON_FAILURE)
		}else {
			Mobile.callTestCase(findTestCase('Pages/Edit Product/Edit Lokasi Produk'), [('lokasiProduk') : lokasi], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@When("User edit Deskripsi with (.*)")
	public void user_input_product_description(String deskripsi) {
		if(deskripsi == 'empty') {
			Mobile.callTestCase(findTestCase('Pages/Edit Product/Edit Deskripsi Produk'), [('deskripsiProduk') : ''], FailureHandling.STOP_ON_FAILURE)
		}else {
			Mobile.callTestCase(findTestCase('Pages/Edit Product/Edit Deskripsi Produk'), [('deskripsiProduk') : deskripsi], FailureHandling.STOP_ON_FAILURE)
		}
	}


	@When("Click publish button")
	public void click_publish_button() {
		Mobile.callTestCase(findTestCase('Pages/Edit Product/Tap Terbitkan Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User will see (.*) message")
	public void user_will_see_message(String status) {
		if(status == 'success') {
			WebUI.callTestCase(findTestCase('Pages/Edit Product/Verify Success Message'), [:], FailureHandling.STOP_ON_FAILURE)
		}
		else if(status == 'error nama'){
			Mobile.callTestCase(findTestCase('Pages/Edit Product/Verify Error Message - Nama Produk'), [:], FailureHandling.STOP_ON_FAILURE)
			Mobile.pressBack()
		}
		else if(status == 'error harga'){
			Mobile.callTestCase(findTestCase('Pages/Edit Product/Verify Error Message - Harga Produk'), [:], FailureHandling.STOP_ON_FAILURE)
			Mobile.pressBack()
		}
		else if(status == 'error kategori'){
			Mobile.callTestCase(findTestCase('Pages/Edit Product/Verify Error Message - Kategori Produk'), [:], FailureHandling.STOP_ON_FAILURE)
			Mobile.pressBack()
		}
		else if(status == 'error lokasi'){
			Mobile.callTestCase(findTestCase('Pages/Edit Product/Verify Error Message - Lokasi Produk'), [:], FailureHandling.STOP_ON_FAILURE)
			Mobile.pressBack()
		}
		else if(status == 'error deskripsi'){
			Mobile.callTestCase(findTestCase('Pages/Edit Product/Verify Error Message - Deskripsi Produk'), [:], FailureHandling.STOP_ON_FAILURE)
			//Mobile.pressBack()
		}
		Mobile.pressBack()
	}
}