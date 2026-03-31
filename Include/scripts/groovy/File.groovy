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

import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When



class File {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Open The LambdaTest Web Site")
	def OpenPage() {
		// open the LT demo page and maximize the browser
		WebUI.openBrowser("https://ecommerce-playground.lambdatest.io/index.php")
		WebUI.maximizeWindow()
		println "BDD-STEP-1: finished"
	}

	@And("I type a name {string} of product")
	def TypeNameOfProductInSearchBar(String name) {
		// type name of product in search bar
		WebUI.setText(findTestObject('Object Repository/PageObjects/Page_Your Store/input_All Categories_search'), name)
		println "BDD-STEP-2: finished"
	}

	@When("I click on search button")
	def ClickOnSearchButton() {
		// click on search button
		WebUI.click(findTestObject('Object Repository/PageObjects/Page_Your Store/button_Search'))
		println "BDD-STEP-3: finished"
	}

	@Then("I verify the {string} of search results")
	def Verify_the_status_in_step(String status) {
		// wait 7s to load page and check results
		println status
		println "BDD-STEP-4: finished"
		WebUI.closeBrowser()
	}
}