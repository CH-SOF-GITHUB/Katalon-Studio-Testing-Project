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
	@Given("I open login page")
	def i_open_login_page() {
		WebUI.openBrowser("https://demotenant.playpro.fr/connexion")
		WebUI.maximizeWindow()
		WebUI.click(findTestObject('Object Repository/Cookies/button_Accepter'))
		println "STEP-BDD-1: finished"
	}

	@And("I type email {string}")
	void i_type_address_email(String email) {
		WebUI.setText(findTestObject('Object Repository/FO_Login/input__email'), email)
		println "STEP-BDD-2: finished"
	}

	@And("I type pwd {string}")
	void i_type_password(String password) {
		WebUI.setText(findTestObject('Object Repository/FO_Login/input__password'), password)
		println "STEP-BDD-3: finished"
	}

	@When("I click on Login Btn")
	void i_click_on_LoginBtn() {
		WebUI.click(findTestObject('Object Repository/FO_Login/button_Me connecter'))
		println "STEP-BDD-4: finished"
	}

	@Given("Click on Btn Offer a gift voucher")
	def click_on_Btn_Offer_a_gift_voucher() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PageObjects/Page_playprosite/a_Offrir un bon cadeau'), 15)
		WebUI.click(findTestObject('Object Repository/PageObjects/Page_playprosite/a_Offrir un bon cadeau'))
		println "STEP-BDD-5: finished"
	}

	@When("Choose the amount of your gift card 250 CHF")
	def choose_the_amount_of_your_gift_card_250_CHF() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PageObjects/Page_VOUCHER PLAYPRO/button_250CHF'), 15)
		WebUI.click(findTestObject('Object Repository/PageObjects/Page_VOUCHER PLAYPRO/button_250CHF'))
		println "STEP-BDD-6: finished"
	}

	@And("I click on Next Btn")
	def i_click_on_Next_Btn() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PageObjects/Page_VOUCHER PLAYPRO/button_Suivant'), 15)
		WebUI.click(findTestObject('Object Repository/PageObjects/Page_VOUCHER PLAYPRO/button_Suivant'))
		println "STEP-BDD-7: finished"
	}

	@And("I click on bank card stripe in cart")
	def i_click_on_bank_card_stripe_in_cart() {
		// wait for 7s
		WebUI.delay(7)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PageObjects/Page_Paiement scuris/div_Carte bancaire'), 15)
		WebUI.click(findTestObject('Object Repository/PageObjects/Page_Paiement scuris/div_Carte bancaire'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/PageObjects/Page_Paiement scuris/div_xxxxxxxxxxxx42421126'), 15)
		WebUI.click(findTestObject('Object Repository/PageObjects/Page_Paiement scuris/div_xxxxxxxxxxxx42421126'))
		println "STEP-BDD-8: finished"
	}

	@When("I click on payment btn")
	def i_click_on_payment_btn() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PageObjects/Page_Paiement scuris/button_Payer maintenant'), 15)
		WebUI.click(findTestObject('Object Repository/PageObjects/Page_Paiement scuris/button_Payer maintenant'))
		println "STEP-BDD-9: finished"
	}

	@Then("Check that Voucher was buying successfully")
	def check_that_Voucher_was_buying_successfully() {
		WebUI.delay(7)
		def ActuelURL = WebUI.getUrl()
		WebUI.verifyEqual(ActuelURL, "https://demotenant.playpro.fr/Panier")
		println "STEP-BDD-10: finished"
	}
}