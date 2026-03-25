import com.kms.katalon.core.annotation.Keyword
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class Search {
	
	@Given("Flipkart is open")
	def OpenFlipkart() {
		println("Page Flipkart is opened !")
	}
	
	@When("I enter a product (.*) in the search box")
	def EnterProduct(String name) {
		println("Product name is entered in search bar: " + name)
	}
	
	@And("I click on the search icon")
	def ClickSearchIcon() {
		println("The Search Icon is clicked !")
	}
	
	@Then("I should see the list of products related to the search")
	def VerifySearchResults() {
		println("The list of products related to the search is displayed !")
	}
}