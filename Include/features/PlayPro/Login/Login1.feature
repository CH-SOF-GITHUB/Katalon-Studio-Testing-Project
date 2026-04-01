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
Feature: PlayPro Login System
  I want to login with valid credentials

  @tag1
  Scenario Outline: Login - Front scenario outline
    Given I want to open login page
    And I type address email "<email>"
    And I type password "<pwd>"
    When I click on LoginBtn
    Then I verify the status "<status>"

    Examples:
      | email                   | pwd        | status  |
      | demotenant1@yopmail.com | Admin1234! | success |
      | demo@gmail.com          | Admin1234! | Fail    |
      | chaker@yopmail.com      | Admin123   | Fail    |
