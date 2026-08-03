#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Delete Address

Background:
  Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
   

  @test @TestCase_2459 @ALM_VR_TC_253
  Scenario: Cancelling delete address
   When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Addresses section is displayed
    When  I cancel delete addresses row
    Then  I verify the action was performed successfully

  @test @TestCase_2460 @ALM_VR_TC_254
  Scenario: Successful delete address
   When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Addresses section is displayed
    When  I accept delete addresses row
    Then  I verify the action was performed successfully