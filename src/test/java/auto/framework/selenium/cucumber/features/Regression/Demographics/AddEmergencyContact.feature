#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Add Emergency Contact

  @test @regression @test_Case_3057
  Scenario: Cancelling an added emergency contacts
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click the New button at position 6
    And   I enter the name in the emergency contact row "QA Test"
    And   I enter the telephone in the emergency contact row "600000000"
    And   I select a relationship in the emergency contact row
    Then  I cancel the emergency contact row

  @test @regression @test_Case_3060
  Scenario: Adding an emergency contact with empty fields
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click the New button at position 6
    Then  I save the emergency contact row
    And   I cancel the emergency contact row

  @test @regression @test_Case_3061
  Scenario: Successful added emergency contacts
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click the New button at position 6
    And   I enter the name in the emergency contact row "QA Test"
    And   I enter the telephone in the emergency contact row "665372854"
    And   I select a relationship in the emergency contact row
    And   I check the primary emergency contact checkbox
    Then  I save the emergency contact row
    And   I verify the action was performed successfully

  @test @regression @test_Case_3062
  Scenario: Adding an emergency contact with primary declared twice
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click the New button at position 6
    And   I enter the name in the emergency contact row "QA Test"
    And   I enter the telephone in the emergency contact row "65549866"
    And   I select a relationship in the emergency contact row
    And   I check the primary emergency contact checkbox
    Then  I save the emergency contact row
    And   I cancel the emergency contact row