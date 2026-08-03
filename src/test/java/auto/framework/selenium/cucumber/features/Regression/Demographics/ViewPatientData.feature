#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: View Patient Data

  @test @test_Case_4561 @ALM_VR_TC_88
  Scenario: View demographic data screen
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale - 00250"
    And   I click on the selected patient
    Then  I verify that the demographic module opened correctly
    And   I scroll to the secondary centers section of demographics
    And   I scroll to the contact addresses section of demographics
    And   I scroll to the transport method section of demographics
    Then  I click button arrow up