#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Delete Contact

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly


  @test @TestCase_2398 @ALM_VR_TC_237
  Scenario: Delete a contact
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Contacts section is displayed
    When  I accept delete contacts row
    Then  I verify the action was performed successfully

  @test @TestCase_2399 @ALM_VR_TC_238
  Scenario: Cancelling a delete contact
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Contacts section is displayed
    When  I cancel delete contacts row
    Then  I verify the action was performed successfully