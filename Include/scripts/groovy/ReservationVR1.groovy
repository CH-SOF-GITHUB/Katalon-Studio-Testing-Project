import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.junit.Assert.assertEquals

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

	@Given("I open discover reservation page")
	void i_open_discover_reservation_page() {
		try {
			TestObject LinkReservation = findTestObject('Reservation/Page_DEMO TENANT/a_Rserver')
			WebUI.waitForElementVisible(LinkReservation, 25)
			WebUI.waitForElementClickable(LinkReservation, 25)
			WebUI.click(LinkReservation)
			WebUI.waitForPageLoad(10)
			println "STEP-BDD-5: finished"
		} catch(NoSuchElementException e) {
			e.fillInStackTrace()
			throw e
		}
	}

	@When("I click on Exp Vr Card")
	void i_click_on_exp_vr_card() {
		try {
			TestObject CardVr = findTestObject('Reservation/Page_BOOKING PLAYPRO/div_Rserver')
			WebUI.waitForElementVisible(CardVr, 25)
			WebUI.waitForElementClickable(CardVr, 25)
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
			TestObject Select1 = findTestObject('Reservation/Page_Vr Party Test/div_Veuillez slectionner')
			WebUI.waitForElementVisible(Select1, 25)
			WebUI.waitForElementClickable(Select1, 25)
			WebUI.click(Select1)
			TestObject NbrPers4 = findTestObject('Reservation/Page_Vr Party Test/button_4 personnes')
			WebUI.waitForElementVisible(NbrPers4, 25)
			WebUI.waitForElementClickable(NbrPers4, 25)
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
			TestObject Select2 = findTestObject('Reservation/Page_Vr Party Test/span_Slectionner une formule')
			WebUI.waitForElementVisible(Select2, 25)
			WebUI.waitForElementClickable(Select2, 25)
			WebUI.click(Select2)
			TestObject Slot45Min = findTestObject('Reservation/Page_Vr Party Test/button_4 personnes')
			WebUI.waitForElementVisible(Slot45Min, 25)
			WebUI.waitForElementClickable(Slot45Min, 25)
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
			TestObject BtnContinue = findTestObject('Reservation/Page_Vr Party Test/button_Continuer')
			WebUI.waitForElementVisible(BtnContinue, 25)
			WebUI.waitForElementClickable(BtnContinue, 25)
			WebUI.click(BtnContinue)
			println "STEP-BDD-9: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
		}
	}

	@When("I select time slot")
	void i_select_time_slot() {
		try {
			TestObject TimeSlot = findTestObject('Reservation/Page_Vr Party Test/button_20_00438')
			WebUI.waitForElementVisible(TimeSlot, 25)
			WebUI.waitForElementClickable(TimeSlot, 25)
			WebUI.click(TimeSlot)
			println "STEP-BDD-10: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
		}
	}

	@And("I click on confirm button")
	void i_click_on_confirm_button() {
		try {
			TestObject ConfirmBtn = findTestObject('Reservation/Page_Vr Party Test/span_Soit 109.5_pers')
			WebUI.waitForElementVisible(ConfirmBtn, 25)
			WebUI.waitForElementClickable(ConfirmBtn, 25)
			WebUI.click(ConfirmBtn)
			println "STEP-BDD-11: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
		}
	}

	@And("I click on continue without option button")
	void i_click_on_continue_without_option_button() {
		try {
			TestObject ContinueBtn2 = findTestObject('Reservation/Page_Vr Party Test/button_Continuer')
			WebUI.waitForElementVisible(ContinueBtn2, 25)
			WebUI.waitForElementClickable(ContinueBtn2, 25)
			WebUI.click(ContinueBtn2)
			TestObject ContinueBtnWithoutOption = findTestObject('Reservation/Page_Vr Party Test/button_Continuer sans option')
			WebUI.waitForElementVisible(ContinueBtnWithoutOption, 25)
			WebUI.waitForElementClickable(ContinueBtnWithoutOption, 25)
			WebUI.click(ContinueBtnWithoutOption)
			println "STEP-BDD-12: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
		}
	}

	@When("I click on stripe carte in cart")
	void i_click_on_stripe_carte_in_cart() {
		try {
			TestObject StripeCart = findTestObject('Reservation/Page_Paiement scuris/span_md_w-5 w-4 md_h-5 h-4 border-2 border-black')
			WebUI.waitForElementVisible(StripeCart, 25)
			WebUI.waitForElementClickable(StripeCart, 25)
			WebUI.click(StripeCart)
			println "STEP-BDD-13: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
		}
	}

	@And("I click on payment button in cart")
	void i_click_on_payment_button_in_cart() {
		try {
			TestObject PaymentBtn = findTestObject('Reservation/Page_Paiement scuris/button_Payer maintenant')
			WebUI.waitForElementVisible(PaymentBtn, 25)
			WebUI.waitForElementClickable(PaymentBtn, 25)
			WebUI.click(PaymentBtn)
			WebUI.waitForPageLoad(10)
			println "STEP-BDD-14: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
		}
	}

	@Then("Check that the booking had paid correctly")
	void check_that_the_booking_had_paid_correctly() {
		try {
			WebUI.delay(5)
			TestObject MsgSuccessReservation = findTestObject('Reservation/Page_Paiement scuris/p_Merci pour votre rservation')
			WebUI.waitForElementVisible(MsgSuccessReservation, 25)
			String ActualMsg = WebUI.getText(MsgSuccessReservation)
			assertEquals("Expected and actual msgs are not match!","Merci pour votre réservation ! 🎉", ActualMsg)
			println "STEP-BDD-15: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
		}
	}
}