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
import static org.junit.Assert.assertEquals
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



class NavigateToSubsriptionsPage1 {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@When("I click on Abonnements link")
	void i_click_on_abonnements_link() {
		try {
			TestObject AbonnementsLink = findTestObject('Object Repository/Reservation/Page_DEMO TENANT/a_headlessui-menu-item-_r7')
			WebUI.waitForElementVisible(AbonnementsLink, 25)
			WebUI.waitForElementClickable(AbonnementsLink, 25)
			WebUI.click(AbonnementsLink)
			println "Subscriptions Link is clicked !"
		}catch(Exception e) {
			e.fillInStackTrace()
			throw e
		}
	}

	@Then("I verify the navigation to subscriptions page")
	void i_verify_the_navigation_to_subscriptions_page() {
		try {
			WebUI.delay(7)
			String ActualURL = WebUI.getUrl()
			assertEquals("Expected and Actual url of reservation food are not match!", "https://demotenant.playpro.fr/discover/serie", ActualURL)
			println("navigation to foods page successfully!")
		}catch(Exception e) {
			e.fillInStackTrace()
			throw e
		}
	}
}