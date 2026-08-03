#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Modify Center

Background:
Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    
  @test @TestCase_2384 @ALM_VR_TC_226
  Scenario: All data correct
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Center assignment section is displayed
    When  I click button edit center assignment row
    And   I enter the start date in center assignment row "04/01/2026"
    And   I enter the end date in center assignment row "12/25/2026"
    Then  I save the center assignment row
    And   I verify the action was performed successfully

  @test @TestCase_2385 @ALM_VR_TC_227
  Scenario: Wrong date
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Center assignment section is displayed
    When  I click button edit center assignment row
    And   I enter the start date in center assignment row "03/01/2026"
    And   I enter the end date in center assignment row "01/01/2018"
    Then  I save the center assignment row
    And   I click button OK modal error
    Then  I cancel the center assignment row

  @test @TestCase_2386 @ALM_VR_TC_228
  Scenario: Cancelling an edited center
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Center assignment section is displayed
    When  I click button edit center assignment row
    And   I enter the start date in center assignment row "04/01/2026"
    And   I enter the end date in center assignment row "06/04/2026"
    Then  I cancel the center assignment row