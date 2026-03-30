# Author: your.email@your.domain.com
# Keywords Summary :
# Feature: List of scenarios.
# Scenario: Business rule through list of steps with arguments.
# Given: Some precondition step
# When: Some key actions
# Then: To observe outcomes or validation
# And,But: To enumerate more Given,When,Then steps
# Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
# Examples: Container for s table
# Background: List of steps run before each of the scenarios
# """ (Doc Strings)
# | (Data Tables)
# @ (Tags/Labels):To group Scenarios
# <> (placeholder)
# ""
# # (Comments)
# Sample Feature Definition Template
@tag
Feature: LambdaTest E-Commerce Web Site
  I want to use this site for my feature file

  @tag1
  Scenario Outline: Search of products by names
    Given Open The LambdaTest Web Site
    And I type a name "<name>" of product
    When I click on search button
    Then I verify the "<status>" of search results

    Examples:
      | name            | status  |
      | iMac            | success |
      | HTC Touch HD    | success |
      | Apple Cinema 30 | success |
      | text1234        | Fail    |
