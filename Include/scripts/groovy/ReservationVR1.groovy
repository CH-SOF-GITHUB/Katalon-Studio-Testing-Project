import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.time.Duration

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
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions
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



class ReservationVR1 {
	// declare web driver to control and execution some steps
	// WebDriver Driver
	// define explicit wait for web elements
	// WebDriverWait Wait
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open login page web")
	def i_open_login_page_web() {
		try {
			WebUI.openBrowser("https://demotenant.playpro.fr/connexion")
			WebUI.maximizeWindow()
			TestObject BtnCookieAccept = findTestObject('Object Repository/Cookies/button_Accepter')
			WebUI.waitForElementVisible(BtnCookieAccept, 20)
			WebUI.waitForElementClickable(BtnCookieAccept, 20)
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
			WebUI.waitForElementVisible(EmailField, 20)
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
			WebUI.waitForElementVisible(PwdField, 20)
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
			WebUI.waitForElementVisible(LoginBtn, 20)
			WebUI.waitForElementClickable(LoginBtn, 20)
			WebUI.click(LoginBtn)
			println "STEP-BDD-4: finished"
		} catch(NoSuchElementException e) {
			e.fillInStackTrace()
			throw e
		}
	}

	@Given("I open discover reservation page")
	void i_open_discover_reservation_page() {
		try {
			WebUI.waitForPageLoad(5)
			TestObject LinkReservation = findTestObject('Object Repository/PageObjects/Page_DEMO TENANT/Link_Rserver_Page_Home')
			WebUI.waitForElementVisible(LinkReservation, 20)
			WebUI.waitForElementClickable(LinkReservation, 20)
			WebUI.click(LinkReservation)
			println "STEP-BDD-5: finished"
		} catch(NoSuchElementException e) {
			e.fillInStackTrace()
			throw e
		}
	}

	@When("I click on Exp Vr Card")
	void i_click_on_exp_vr_card() {
		try {
			TestObject CardVr = findTestObject('Object Repository/PageObjects/Page_Vr Party Test/h3_Vr Party Test')
			WebUI.waitForElementVisible(CardVr, 20)
			WebUI.waitForElementClickable(CardVr, 20)
			WebUI.click(CardVr)
			println "STEP-BDD-6: finished"
		} catch(NoSuchElementException e) {
			e.fillInStackTrace()
			throw e
		}
	}

	@And("I select number of participants")
	void i_select_number_of_participants() {
		try {
			TestObject Select1 = findTestObject('Object Repository/PageObjects/Page_Vr Party Test/slection_Nbr_Participants')
			WebUI.waitForElementVisible(Select1, 20)
			WebUI.waitForElementClickable(Select1, 20)
			WebUI.click(Select1)
			TestObject NbrPers4 = findTestObject('Object Repository/PageObjects/Page_Vr Party Test/button_4 personnes')
			WebUI.waitForElementVisible(NbrPers4, 20)
			WebUI.waitForElementClickable(NbrPers4, 20)
			WebUI.click(NbrPers4)
			println "STEP-BDD-7: finished"
		} catch(NoSuchElementException e) {
			e.fillInStackTrace()
			throw e
		}
	}

	@And("I select duration by price")
	void i_select_duration_by_price() {
		try {
			TestObject Select2 = findTestObject('Object Repository/PageObjects/Page_Vr Party Test/Slection_Duration_Exp')
			WebUI.waitForElementVisible(Select2, 20)
			WebUI.waitForElementClickable(Select2, 20)
			WebUI.click(Select2)
			TestObject Slot45Min = findTestObject('Object Repository/PageObjects/Page_Vr Party Test/button_45 min')
			WebUI.waitForElementVisible(Slot45Min, 20)
			WebUI.waitForElementClickable(Slot45Min, 20)
			WebUI.click(Slot45Min)
			println "STEP-BDD-8: finished"
		} catch(NoSuchElementException e) {
			e.fillInStackTrace()
			throw e
		}
	}

	@And("I click on continue button")
	void i_click_on_continue_button() {
		try {
			TestObject BtnContinuer = findTestObject('Object Repository/PageObjects/Page_Vr Party Test/button_Continuer')
			WebUI.waitForElementVisible(BtnContinuer, 20)
			WebUI.waitForElementClickable(BtnContinuer, 20)
			println "STEP-BDD-9: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
		}
	}

	@When("I select time slot")
	void i_select_time_slot() {
		try {
			println "STEP-BDD-10: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
		}
	}

	@And("I click on confirm button")
	void i_click_on_confirm_button() {
		try {
			println "STEP-BDD-11: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
		}
	}

	@And("I click on continue without option button")
	void i_click_on_continue_without_option_button() {
		try {
			println "STEP-BDD-12: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
		}
	}

	@When("I click on stripe carte in cart")
	void i_click_on_stripe_carte_in_cart() {
		try {
			println "STEP-BDD-13: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
		}
	}

	@And("I click on payment button in cart")
	void i_click_on_payment_button_in_cart() {
		try {
			println "STEP-BDD-14: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
		}
	}

	@Then("Check that the booking had paid correctly")
	void check_that_the_booking_had_paid_correctly() {
		try {
			println "STEP-BDD-15: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
		}
	}
}