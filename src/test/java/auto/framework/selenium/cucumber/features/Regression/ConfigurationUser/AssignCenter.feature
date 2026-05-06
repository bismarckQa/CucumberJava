#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Assign Center

  @test @regression @TestCase_2377
  Scenario: New center
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Center assignment section is displayed
    When  I click button new record in center assignment
    And   I select the center in center assignment row
    And   I enter the start date in center assignment row "05/05/2026"
    Then  I save the center assignment row
    And   I verify the action was performed successfully

  @test @regression @TestCase_2378
  Scenario: Cancelling a new center
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Center assignment section is displayed
    When  I click button new record in center assignment
    And   I select the center in center assignment row
    And   I enter the start date in center assignment row "05/05/2026"
    Then  I cancel the center assignment row

  @test @regression @TestCase_2379
  Scenario: Wrong date
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Center assignment section is displayed
    When  I click button new record in center assignment
    And   I select the center in center assignment row
    And   I enter the start date in center assignment row "03/01/2026"
    And   I enter the end date in center assignment row "01/01/2018"
    Then  I save the center assignment row
    And   I click button OK modal error
    Then  I cancel the center assignment row