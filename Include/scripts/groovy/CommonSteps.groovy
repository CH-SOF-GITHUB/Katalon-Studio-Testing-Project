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



class CommonSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open login page web")
	def i_open_login_page_web() {
		try {
			WebUI.openBrowser("https://demotenant.playpro.fr/connexion")
			WebUI.maximizeWindow()
			TestObject BtnCookieAccept = findTestObject('Object Repository/Cookies/button_Accepter')
			WebUI.waitForElementVisible(BtnCookieAccept, 25)
			WebUI.waitForElementClickable(BtnCookieAccept, 25)
			WebUI.click(BtnCookieAccept)
			println "STEP-BDD-1: finished"
		} catch(NoSuchElementException e) {
			e.fillInStackTrace()
			throw e
		}
	}

	@And("I type email value {string}")
	void i_type_address_email_value(String email) {
		try {
			TestObject EmailField = findTestObject('Object Repository/FO_Login/input__email')
			WebUI.waitForElementVisible(EmailField, 25)
			WebUI.setText(EmailField, email)
			println "STEP-BDD-2: finished"
		} catch(NoSuchElementException e) {
			e.fillInStackTrace()
			throw e
		}
	}

	@And("I type pwd value {string}")
	void i_type_password_value(String password) {
		try {
			TestObject PwdField = findTestObject('Object Repository/FO_Login/input__password')
			WebUI.waitForElementVisible(PwdField, 25)
			WebUI.setText(PwdField, password)
			println "STEP-BDD-3: finished"
		} catch(NoSuchElementException e) {
			e.fillInStackTrace()
			throw e
		}
	}

	@When("I click on Login Button")
	void i_click_on_LoginButton() {
		try {
			TestObject LoginBtn = findTestObject('Object Repository/FO_Login/button_Me connecter')
			WebUI.waitForElementVisible(LoginBtn, 25)
			WebUI.waitForElementClickable(LoginBtn, 25)
			WebUI.click(LoginBtn)
			WebUI.waitForPageLoad(15)
			println "STEP-BDD-4: finished"
		} catch(NoSuchElementException e) {
			e.fillInStackTrace()
			throw e
		}
	}

	@Given("I click on Offre menu in navbar")
	void i_click_on_offre_menu_in_navbar() {
		try {
			TestObject OffreMenu = findTestObject('Object Repository/Reservation/Page_DEMO TENANT/button_headlessui-menu-button-_r0')
			WebUI.waitForElementVisible(OffreMenu, 25)
			WebUI.waitForElementClickable(OffreMenu, 25)
			WebUI.click(OffreMenu)
			println "Offre Menu is clicked !"
		} catch(Exception e) {
			e.fillInStackTrace()
			throw e
		}
	}
}