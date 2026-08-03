#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Modify Contact Method

Background:
  Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly

  @test @test_Case_3050 @ALM_VR_TC_86
  Scenario: Cancelling an edited contact method
    When  I click the edit button of the contact method row
    And   I enter the value in the contact method row "foianinimodified@vantive.com"
    Then  I cancel the contact method row

  @test @test_Case_3051 @ALM_VR_TC_487
  Scenario: Fields are empty when editing contact method
    When  I click the edit button of the contact method row
    And   I enter the value in the contact method row ""
    Then  I save the contact method row
    And   I cancel the contact method row

  @test @test_Case_3052 @ALM_VR_TC_488
  Scenario: Successful edit contact method
    When  I click the edit button of the contact method row
    And   I enter the value in the contact method row "foianinimodified@vantive.com"
    Then  I save the contact method row
    And   I verify the action was performed successfully