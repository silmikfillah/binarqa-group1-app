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



class BidWithValidPrice {
	@Given("buyer2 sudah login")
	public void buyer2_sudah_login() {
		WebUI.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Akun/Tap Masuk from Akun Page'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : 'gunawansipembeli@jualbeli.com'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : 'a1b2c3d4'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Tap Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("buyer sudah login")
	public void buyer_sudah_login() {
		WebUI.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Akun/Tap Masuk from Akun Page'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('email') : 'alexbeli1@gmail.com'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('password') : 'asdqwe'], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/Login/Tap Button Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("buyer berada di halaman produk")
	public void buyer_berada_di_halaman_produk() {
		WebUI.callTestCase(findTestCase('Pages/Navbar/Tap Beranda'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer click search")
	public void buyer_click_search() {
		WebUI.callTestCase(findTestCase('Pages/Homepage/Tap Search Field'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer input {string}")
	public void buyer_input(String search) {
		WebUI.callTestCase(findTestCase('Pages/Search Page/Input Text Search Field'), [('searchText') : search], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer click first product")
	public void buyer_click_first_product() {
		WebUI.callTestCase(findTestCase('Pages/Buyer Bid/Click First Search'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer click Saya tertarik dan ingin nego button")
	public void buyer_click_Saya_tertarik_dan_ingin_nego_button() {
		WebUI.callTestCase(findTestCase('Pages/Buyer Bid/Click Saya Tertarik dan Ingin Nego'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer memasukan harga tawaran {string}")
	public void buyer_memasukan_harga_tawaran(String harga) {
		WebUI.callTestCase(findTestCase('Pages/Buyer Bid/Input Harga Tawar'), [('harga') : harga], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer click di tombol Kirim button")
	public void buyer_click_di_tombol_Kirim_button() {
		WebUI.callTestCase(findTestCase('Pages/Buyer Bid/Click Kirim Button'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.swipe(300, 1400, 300, 1400 + 680)
	}

	@Then("buyer menunggu respon penjual")
	public void buyer_menunggu_respon_penjual() {
		WebUI.callTestCase(findTestCase('Pages/Buyer Bid/Verify Bid Valid'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.pressBack()
		Mobile.pressBack()
		WebUI.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:])
		WebUI.callTestCase(findTestCase('Pages/Akun/Tap Logout'), [:])
	}
}