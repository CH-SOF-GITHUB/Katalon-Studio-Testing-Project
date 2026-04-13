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
Feature: PlayPro FO - Buy Gift Voucher(s)
  I want to use this template for my feature file

  Background:
    Given I navigate the login page
    And I type the email "demotenant1@yopmail.com"
    And I type the pwd "Admin1234!"
    When I click on BTNLogin

  @tag1
  Scenario Outline: Buy Different(s) Gift Voucher(s)
    Given Click on Button Offer a gift voucher
    When Choose the amount of your gift card <amount> CHF
    And I click on Next Button
    And I click on bank card stripe
    When I click on payment button
    Then Check that Voucher was successfully buying

    Examples:
      | amount | status  |
      | 250    | success |
      | 200    | success |
      | 100    | success |
      | 50     | success |
      | 25     | success |
