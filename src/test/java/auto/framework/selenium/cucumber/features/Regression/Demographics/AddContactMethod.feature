#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Add Contact Method

Background:
   Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly


  @test  @test_Case_3046 @ALM_VR_TC_67
  Scenario: Cancelling an added contact method
    When  I click the New button at position 5
    And   I select a contact type in the contact method row
    And   I enter the value in the contact method row "pascuale@correo.com"
    Then  I cancel the contact method row

  @test  @test_Case_3047 @ALM_VR_TC_458
  Scenario: Adding a contact method with empty fields
    When  I click the New button at position 5
    And   I select a contact type in the contact method row
    Then  I save the contact method row
    And   I cancel the contact method row

  @test  @test_Case_3048 @ALM_VR_TC_459
  Scenario: Successful added contact method
    When  I click the New button at position 5
    And   I select a contact type in the contact method row
    And   I enter the value in the contact method row "foianini@vantive.com"
    Then  I save the contact method row
    And   I verify the action was performed successfully