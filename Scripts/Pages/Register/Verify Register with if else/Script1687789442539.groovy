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

if (status == 'success') {
    WebUI.callTestCase(findTestCase('Pages/Register/Verify Register Valid'), [:], FailureHandling.STOP_ON_FAILURE)
} else if (status == 'invalid') {
    WebUI.callTestCase(findTestCase('Pages/Register/Read Error Message/Read Error Msg Invalid Email'), [('expected') : ''], 
        FailureHandling.STOP_ON_FAILURE)
} else if (status == 'registered') {
    WebUI.callTestCase(findTestCase('Pages/Register/Read Error Message/Read Error Msg Registered Email'), [('expected') : ''], 
        FailureHandling.STOP_ON_FAILURE)
} else if (status == 'empty email') {
    WebUI.callTestCase(findTestCase('Pages/Register/Read Error Message/Read Error Msg Empty Email'), [('expected') : ''], 
        FailureHandling.STOP_ON_FAILURE)
} else if (status == 'empty password') {
    WebUI.callTestCase(findTestCase('Pages/Register/Read Error Message/Read Error Msg Empty Password'), [('expected') : ''], 
        FailureHandling.STOP_ON_FAILURE)
} else if (status == 'invalid pass') {
    WebUI.callTestCase(findTestCase('Pages/Register/Read Error Message/Read Error Msg Password less than 6 chars'), [('expected') : ''], 
        FailureHandling.STOP_ON_FAILURE)
} else if (status == 'empty nama') {
    WebUI.callTestCase(findTestCase('Pages/Register/Read Error Message/Read Error Msg Empty Nama'), [('expected') : ''], 
        FailureHandling.STOP_ON_FAILURE)
} else if (status == 'empty hp') {
    WebUI.callTestCase(findTestCase('Pages/Register/Read Error Message/Read Error Msg Empty Nomor Hp'), [('expected') : ''], 
        FailureHandling.STOP_ON_FAILURE)
} else if (status == 'empty kota') {
    WebUI.callTestCase(findTestCase('Pages/Register/Read Error Message/Read Error Msg Empty Kota'), [('expected') : ''], 
        FailureHandling.STOP_ON_FAILURE)
} else if (status == 'empty alamat') {
    WebUI.callTestCase(findTestCase('Pages/Register/Read Error Message/Read Error Msg Empty Alamat'), [('expected') : ''], 
        FailureHandling.STOP_ON_FAILURE)
}

