#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Modify Contact Addresses

  @test @regression @test_Case_3005
  Scenario: Editing a contact address with empty fields
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click button edit contact address
    And   I enter the address in the contact address row ""
    Then  I save the contact address row
    And   I cancel the contact address row
    And   I verify the action was performed successfully

  @test @regression @test_Case_3006
  Scenario: Cancelling an edited contact address
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click button edit contact address
    And   I enter the address in the contact address row "Calle Modificada 456"
    Then  I cancel the contact address row

  @test @regression @test_Case_3007
  Scenario: Editing a contact address with wrong dates
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click button edit contact address
    And   I enter the end date of the contact address row "01/01/2020"
    Then  I save the contact address row
    And   I click button OK modal error
    And   I cancel the contact address row

  @test @regression @test_Case_3008
  Scenario: Successful edited contact address
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click button edit contact address
    And   I enter the address in the contact address row "Calle Modificada 456"
    And   I enter the start date of the contact address row "05/01/2026"
    And   I enter the end date of the contact address row "05/30/2027"
    And   I enter the other field in the contact address row "Edited"
    Then  I save the contact address row
    And   I verify the action was performed successfully