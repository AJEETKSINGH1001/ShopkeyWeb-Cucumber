#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Logo Image Test

  Scenario: Verify the title of the home page
    Given I open the browser2
    When I navigate to the homepage2

  Scenario: Verify Logo Image is Displayed
    Given User navigates to the homepage
    Then Logo image is displayed

  Scenario: Verify Logo Image has Correct Alt Text
    Given User navigates to the homepage
    Then Logo image has correct alt text

  Scenario: Verify Logo Image Links to Homepage
    Given User navigates to the homepage
    When User clicks on the logo image
    Then User should be redirected to the homepage


