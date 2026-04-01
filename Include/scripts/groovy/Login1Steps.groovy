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



class Login1Steps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want to open login page")
	def i_open_login_page() {
		WebUI.openBrowser("https://demotenant.playpro.fr/connexion")
		println "STEP-BDD-1: finished"
	}

	@And("I type address email {string}")
	void i_type_address_email(String email) {
		WebUI.setText(findTestObject('Object Repository/FO_Login/input__email'), email)
		println "STEP-BDD-2: finished"
	}

	@And("I type password {string}")
	void i_type_password(String password) {
		WebUI.setText(findTestObject('Object Repository/FO_Login/input__password'), password)
		println "STEP-BDD-3: finished"
	}

	@When("I click on LoginBtn")
	void i_click_on_LoginBtn() {
		WebUI.click(findTestObject('Object Repository/FO_Login/button_Me connecter'))
		println "STEP-BDD-4: finished"
	}

	@Then("I verify the status {string}")
	def i_verify_the_status(String status) {
		println status
		// Close the browser
		WebUI.closeBrowser()
	}
}