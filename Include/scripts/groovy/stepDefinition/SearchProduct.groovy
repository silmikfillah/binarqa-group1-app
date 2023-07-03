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

public class SearchProduct {
	@When('User tap search field')
	public void tap_search_field() {
		WebUI.callTestCase(findTestCase('Pages/Homepage/Tap Search Field'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And('User input (.*) in search field')
	public void input_text_search(String searchText) {
		WebUI.callTestCase(findTestCase('Pages/Search Page/Input Text Search Field'), [('searchText') : searchText], FailureHandling.STOP_ON_FAILURE)
	}

	@Then('Verify search (.*) result appeared')
	public void search_result_appeared(String searchText) {
		WebUI.callTestCase(findTestCase('Pages/Search Page/Verify First Result'), [('expectedText') : searchText], FailureHandling.STOP_ON_FAILURE)
	}
}
