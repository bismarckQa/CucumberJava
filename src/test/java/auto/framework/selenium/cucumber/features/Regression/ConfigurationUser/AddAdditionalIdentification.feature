#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Add Additional Identification

  @test @regression @TestCase_2400
  Scenario: Add new add identification
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Additional identifications section is displayed
    When  I click button new record in additional identifications
    And   I select the identification type "Ticket Telemedicina" in additional identifications row
    And   I enter the value in additional identifications row "40565441H"
    And   I enter the observations in additional identifications row "principal number"
    Then  I save the additional identifications row
    And   I verify the action was performed successfully

  @test @regression @TestCase_2402
  Scenario: Cancelling add identification
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Additional identifications section is displayed
    When  I click button new record in additional identifications
    And   I select the identification type "Ticket Telemedicina" in additional identifications row
    And   I enter the value in additional identifications row "40565441H"
    And   I enter the observations in additional identifications row "principal number"
    Then  I cancel the additional identifications row

  @test @regression @TestCase_2405
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
    Then  I verify that Additional identifications section is displayed
    When  I click button new record in additional identifications
    Then  I save the additional identifications row
    And   I cancel the additional identifications row