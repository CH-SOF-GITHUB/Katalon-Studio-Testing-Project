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



class AchatBC1Steps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Click on Btn Offer a gift voucher")
	void click_on_Btn_Offer_a_gift_voucher() {
		try {
			TestObject OffrirVoucherBtn = findTestObject('Object Repository/Reservation/Page_DEMO TENANT/span_Offrir un bon cadeau')
			WebUI.waitForElementVisible(OffrirVoucherBtn, 25)
			WebUI.waitForElementClickable(OffrirVoucherBtn, 25)
			WebUI.click(OffrirVoucherBtn)
			println "STEP-BDD-5: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
			throw e
		}
	}

	@When("Choose the amount of your gift card amount 250 CHF")
	void choose_the_amount_of_your_gift_card_250_amount_CHF() {
		try {
			TestObject Price250 = findTestObject('Object Repository/Reservation/Page_VOUCHER PLAYPRO/span_250')
			WebUI.waitForElementVisible(Price250, 25)
			WebUI.waitForElementClickable(Price250, 25)
			WebUI.click(Price250)
			println "STEP-BDD-6: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
			throw e
		}
	}

	@When("Choose the amount of your gift card amount 100 CHF")
	void choose_the_amount_of_your_gift_card_100_amount_CHF() {
		try {
			TestObject Price100 = findTestObject('Object Repository/Reservation/Page_VOUCHER PLAYPRO/span_100')
			WebUI.waitForElementVisible(Price100, 25)
			WebUI.waitForElementClickable(Price100, 25)
			WebUI.click(Price100)
			println "STEP-BDD-6: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
			throw e
		}
	}

	@And("I click on Next Btn")
	void i_click_on_Next_Btn() {
		try {
			TestObject NextBtn = findTestObject('Object Repository/Reservation/Page_VOUCHER PLAYPRO/button_Suivant')
			WebUI.waitForElementVisible(NextBtn, 25)
			WebUI.waitForElementClickable(NextBtn, 25)
			WebUI.click(NextBtn)
			println "STEP-BDD-7: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
			throw e
		}
	}

	@And("I click on bank card stripe in cart")
	def i_click_on_bank_card_stripe_in_cart() {
		try {
			TestObject StripeCart = findTestObject('Reservation/Page_Paiement scuris/span_md_w-5 w-4 md_h-5 h-4 border-2 border-black')
			WebUI.waitForElementVisible(StripeCart, 25)
			WebUI.waitForElementClickable(StripeCart, 25)
			WebUI.click(StripeCart)
			println "STEP-BDD-8: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
		}
	}

	@When("I click on payment btn")
	def i_click_on_payment_btn() {
		try {
			TestObject PaymentBtn = findTestObject('Reservation/Page_Paiement scuris/button_Payer maintenant')
			WebUI.waitForElementVisible(PaymentBtn, 25)
			WebUI.waitForElementClickable(PaymentBtn, 25)
			WebUI.click(PaymentBtn)
			WebUI.waitForPageLoad(10)
			println "STEP-BDD-9: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
			throw e
		}
	}

	@Then("Check that Voucher was buying successfully")
	void check_that_Voucher_was_buying_successfully() {
		try {
			WebUI.delay(5)
			TestObject MsgSuccessReservation = findTestObject('Object Repository/Reservation/Page_Paiement scuris/p_Merci pour votre commande')
			WebUI.waitForElementVisible(MsgSuccessReservation, 25)
			String ActualMsg = WebUI.getText(MsgSuccessReservation)
			assertEquals("Expected and actual msgs are not match!","Merci pour votre commande ! 🎉", ActualMsg)
			println "STEP-BDD-10: finished"
		} catch(Exception e) {
			e.fillInStackTrace()
		}
	}
}