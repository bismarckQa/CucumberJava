#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Modify Center


  @test @regression @TestCase_2384
  Scenario: All data correct
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
    When  I click button edit center assignment row
    And   I enter the start date in center assignment row "04/01/2026"
    And   I enter the end date in center assignment row "12/25/2026"
    Then  I save the center assignment row
    And   I verify the action was performed successfully

