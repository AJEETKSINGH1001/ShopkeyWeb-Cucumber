#Author: ajeet.singh@gamechangesns.com
#Keywords Summary : Shopkey web Meddusa Test Framework
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

Feature: Home Page
  Scenario: Verify the title of the home page
    Given I open the browser
    When I navigate to the homepage
    Then I should see the title ""
