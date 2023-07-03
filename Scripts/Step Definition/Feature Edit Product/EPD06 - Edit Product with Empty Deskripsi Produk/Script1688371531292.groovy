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

try {
	WebUI.callTestCase(findTestCase('Pages/Homepage/Verify Already Logged In'), [:], FailureHandling.STOP_ON_FAILURE)
} catch (Exception e) {
	WebUI.callTestCase(findTestCase('Step Definition/Feature Login/LGN01 - User login with valid credentials'), [('email') : 'groupsatu@gmail.com', ('password') : 'abc!12345'])
}

WebUI.callTestCase(findTestCase('Pages/Navbar/Tap Akun'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Akun/Tap Daftar Jual Saya'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Daftar Jual Saya/Tap Tab Produk'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Edit Product/Verify Product Card Exist'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Edit Product/Tap Produk'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Edit Product/Edit Nama Produk'), [('namaProduk') : 'Produkku'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Edit Product/Edit Harga Produk'), [('hargaProduk') : '50000'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Edit Product/Edit Kategori Produk'), [('kategoriProduk') : 'Elektronik'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Edit Product/Edit Deskripsi Produk'), [('deskripsiProduk') : ''], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Edit Product/Edit Lokasi Produk'), [('lokasiProduk') : 'Jogja'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Edit Product/Tap Terbitkan Button'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Pages/Edit Product/Verify Error Message - Deskripsi Produk'), [:], FailureHandling.STOP_ON_FAILURE)