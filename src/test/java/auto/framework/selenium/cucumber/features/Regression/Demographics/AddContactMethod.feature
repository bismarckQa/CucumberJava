#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Add Contact Method

  @test @regression @test_Case_3046
  Scenario: Cancelling an added contact method
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click the New button at position 5
    And   I select a contact type in the contact method row
    And   I enter the value in the contact method row "pascuale@correo.com"
    Then  I cancel the contact method row

  @test @regression @test_Case_3047
  Scenario: Adding a contact method with empty fields
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click the New button at position 5
    And   I select a contact type in the contact method row
    Then  I save the contact method row
    And   I cancel the contact method row

  @test @regression @test_Case_3048
  Scenario: Successful added contact method
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click the New button at position 5
    And   I select a contact type in the contact method row
    And   I enter the value in the contact method row "foianini@vantive.com"
    Then  I save the contact method row
    And   I verify the action was performed successfully