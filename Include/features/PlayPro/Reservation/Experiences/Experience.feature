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
Feature: PlayPro Fo - Sample Reservation Experience
  As a client, I want to book an activity Vr

  Background: Firstly, System Login
    Given I open login page web
    And I type email value "demotenant1@yopmail.com"
    And I type pwd value "Admin1234!"
    When I click on Login Button

  @Reservation
  Scenario: Booking Experience named: Vr Party Test
    Given I open discover reservation page
    When I click on Exp Vr Card
    And I select number of participants
    And I select duration by price
    And I click on continue button
    When I select time slot
    And I click on confirm button
    And I click on continue without option button
    When I click on stripe carte in cart
    And I click on payment button in cart
    Then Check that the booking had paid correctly
