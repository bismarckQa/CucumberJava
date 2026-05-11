#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Add Contact

  @test @regression @TestCase_2390
  Scenario: Cancelling an added contact
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
    When  I click button new record in contacts
    And   I select the contact type in contacts row
    And   I enter the value in contacts row "qa.contact@test.com"
    Then  I cancel the contacts row

  @test @regression @TestCase_2391
  Scenario: Add contact
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
    When  I click button new record in contacts
    And   I select the contact type in contacts row
    And   I enter the value in contacts row "qa.contact@test.com"
    Then  I save the contacts row
    And   I verify the action was performed successfully

  @test @regression @TestCase_2394
  Scenario: Empty required fields
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
    When  I click button new record in contacts
    And   I select the contact type in contacts row
    Then  I save the contacts row
    And   I cancel the contacts row