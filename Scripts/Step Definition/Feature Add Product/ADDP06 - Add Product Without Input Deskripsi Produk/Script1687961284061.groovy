import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Pages/Homepage/Verify on Homepage'), [:], FailureHandling.STOP_ON_FAILURE)

try {
	WebUI.callTestCase(findTestCase('Pages/Homepage/Verify Already Logged In'), [:], FailureHandling.STOP_ON_FAILURE)
} catch (Exception e) {
	WebUI.callTestCase(findTestCase('Step Definition/Feature Login/LGN01 - User login with valid credentials'), [('email'):'qatest@mytestmail.net', ('password'):'a1b2c3d4'])
}

WebUI.callTestCase(findTestCase('Pages/Navbar/Tap FAB Jual'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Add Product/Verify on Add Product Page'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Add Product/Input Nama Produk'), [('namaProduk') : 'Produk B'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Add Product/Input Harga Produk'), [('hargaProduk') : '200000'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Add Product/Input Kategori Produk'), [('kategoriProduk') : 'Fotografi'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Add Product/Input Lokasi Produk'), [('lokasiProduk') : 'Lokasi Produk B'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Add Product/Input Foto Produk - Camera'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Add Product/Tap Terbitkan Button'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Add Product/Verify Error Message/Verify Error Message - Deskripsi Produk'), [:], FailureHandling.STOP_ON_FAILURE)