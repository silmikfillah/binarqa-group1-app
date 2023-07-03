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

public class AddProduct {
	@Given('User on homepage')
	public void user_on_homepage() {
		Mobile.startApplication(System.getProperty("user.dir") + "\\Apk\\app-release-second-hand-gcp.apk", false)
		Mobile.callTestCase(findTestCase('Pages/Homepage/Verify on Homepage'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And('User already logged in')
	public void user_already_loggedin() {
		try {
			Mobile.callTestCase(findTestCase('Pages/Homepage/Verify Already Logged In'), [:], FailureHandling.STOP_ON_FAILURE)
		} catch (Exception e) {
			Mobile.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)
			Mobile.callTestCase(findTestCase('Pages/Akun/Tap Masuk from Akun Page'), [:], FailureHandling.STOP_ON_FAILURE)
			Mobile.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : 'peter.rg@gmail.com'], FailureHandling.STOP_ON_FAILURE)
			Mobile.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : 'a1b2c3d4'], FailureHandling.STOP_ON_FAILURE)
			Mobile.callTestCase(findTestCase('Pages/Login/Tap Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@When('User tap FAB Jual')
	public void tap_fab_jual() {
		Mobile.callTestCase(findTestCase('Pages/Navbar/Tap FAB Jual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And('User fill Nama Produk with (.*)')
	public void fill_nama_produk(String namaProduk) {
		if(namaProduk != 'empty') {
			Mobile.callTestCase(findTestCase('Pages/Add Product/Input Nama Produk'), [('namaProduk') : namaProduk], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And('User fill Harga Produk with (.*)')
	public void fill_harga_produk(String hargaProduk) {
		if(hargaProduk != 'empty') {
			Mobile.callTestCase(findTestCase('Pages/Add Product/Input Harga Produk'), [('hargaProduk') : hargaProduk], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And('User fill Kategori with (.*)')
	public void fill_kategori_produk(String kategoriProduk) {
		if(kategoriProduk != 'empty') {
			Mobile.callTestCase(findTestCase('Pages/Add Product/Input Kategori Produk'), [('kategoriProduk') : kategoriProduk], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And('User fill Lokasi with (.*)')
	public void fill_lokasi_produk(String lokasiProduk) {
		if(lokasiProduk != 'empty') {
			Mobile.callTestCase(findTestCase('Pages/Add Product/Input Lokasi Produk'), [('lokasiProduk') : lokasiProduk], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And('User fill Deskripsi with (.*)')
	public void fill_deskripsi_produk(String deskripsiProduk) {
		if(deskripsiProduk != 'empty') {
			Mobile.callTestCase(findTestCase('Pages/Add Product/Input Deskripsi Produk'), [('deskripsiProduk') : deskripsiProduk], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And('User fill Foto Produk with (.*)')
	public void fill_foto_produk(String fotoProduk) {
		if(fotoProduk != 'empty') {
			Mobile.callTestCase(findTestCase('Pages/Add Product/Input Foto Produk - Camera'), [:], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And('User tap Terbitkan button')
	public void tap_terbitkan_button() {
		Mobile.callTestCase(findTestCase('Pages/Add Product/Tap Terbitkan Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('Verify success message')
	public void verify_success_message() {
		Mobile.callTestCase(findTestCase('Pages/Add Product/Verify Success Message'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('Verify Error (.*) message appeared')
	public void verify_error_message(String error) {
		if(error == 'namaEmpty') {
			Mobile.callTestCase(findTestCase('Pages/Add Product/Verify Error Message/Verify Error Message - Nama Produk'), [:], FailureHandling.STOP_ON_FAILURE)
		}else if(error == 'hargaEmpty') {
			Mobile.callTestCase(findTestCase('Pages/Add Product/Verify Error Message/Verify Error Message - Harga Produk'), [:], FailureHandling.STOP_ON_FAILURE)
		}else if(error == 'kategoriEmpty') {
			Mobile.callTestCase(findTestCase('Pages/Add Product/Verify Error Message/Verify Error Message - Kategori Produk'), [:], FailureHandling.STOP_ON_FAILURE)
		}else if(error == 'lokasiEmpty') {
			Mobile.callTestCase(findTestCase('Pages/Add Product/Verify Error Message/Verify Error Message - Lokasi Produk'), [:], FailureHandling.STOP_ON_FAILURE)
		}else if(error == 'deskripsiEmpty') {
			Mobile.callTestCase(findTestCase('Pages/Add Product/Verify Error Message/Verify Error Message - Deskripsi Produk'), [:], FailureHandling.STOP_ON_FAILURE)
		}else if(error == 'fotoEmpty') {
			Mobile.callTestCase(findTestCase('Pages/Add Product/Verify Error Message/Verify Error Message - Foto Produk'), [:], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And('User not logged in')
	public void user_not_logged_in() {
		try {
			Mobile.callTestCase(findTestCase('Pages/Homepage/Verify Not Logged In'), [:], FailureHandling.STOP_ON_FAILURE)
		} catch (Exception e) {
			Mobile.callTestCase(findTestCase('Step Definition/Feature Logout/LGT01 - Logout'), [:], FailureHandling.STOP_ON_FAILURE)
		}
	}

	@Then('Verify User prompted to login')
	public void verify_user_prompted_login(){
		Mobile.callTestCase(findTestCase('Pages/Add Product/Verify Not Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
