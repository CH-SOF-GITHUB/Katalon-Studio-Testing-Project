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
Feature: PlayPro Fo - Reservation Foods (Envie d’une pause gourmande ?)
  As a client, I want to go to reservation foods page

  Background: Firstly, System Login
    Given I open login page web
    And I type email value "demotenant1@yopmail.com"
    And I type pwd value "Admin1234!"
    When I click on Login Button

  @tag1
  Scenario: Navigate to Reservation Resto Page
    Given I click on Commander Button
    Then I verify that the reservation page is opening correctly
