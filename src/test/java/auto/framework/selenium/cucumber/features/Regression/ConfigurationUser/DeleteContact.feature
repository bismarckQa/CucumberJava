#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Delete Contact

  @test @regression @TestCase_2398
  Scenario: Delete a contact
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Contacts section is displayed
    When  I accept delete contacts row
    Then  I verify the action was performed successfully

  @test @regression @TestCase_2399
  Scenario: Cancelling a delete contact
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Contacts section is displayed
    When  I cancel delete contacts row
    Then  I verify the action was performed successfully