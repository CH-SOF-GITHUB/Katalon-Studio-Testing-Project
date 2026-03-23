Feature: Searching functionality on Flipkart
Scenario: Search product
  Given Flipkart is open
  When I enter a product name in the search box
  And I click on the search icon
  Then I should see the list of products related to the search