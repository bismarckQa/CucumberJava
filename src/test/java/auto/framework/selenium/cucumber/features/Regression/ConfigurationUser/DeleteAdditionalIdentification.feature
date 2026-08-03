#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Delete Additional Identification

Background:
Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    
  @test @TestCase_2449 @ALM_VR_TC_245
  Scenario: Successful delete additional identification
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Additional identifications section is displayed
    When  I accept delete additional identifications row
    Then  I verify the action was performed successfully

  @test @TestCase_2450 @ALM_VR_TC_246
  Scenario: Cancelling a deleted additional identification
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Additional identifications section is displayed
    When  I cancel delete additional identifications row
    Then  I verify the action was performed successfully