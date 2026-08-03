#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Modify Patient Data


Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly



  @test @test_Case_4558 @ALM_VR_TC_83
  Scenario: Cancelling an edited patient data
    And   I click the three points menu of demographics
    And   I click button option "EDIT"
    And   I click button edit in patient data demographics
    And   I enter the surname 2 "Baggio"
    And   I select the sex at birth
    Then  I click the three points menu of demographics
    And   I click button option "CANCEL"

  @test @test_Case_4559 @ALM_VR_TC_491
  Scenario: Edited patient data with empty required fields
    And   I click the three points menu of demographics
    And   I click button option "EDIT"
    And   I enter the surname 2 "Baggio"
    Then  I click the three points menu of demographics
    And   I click button option "CANCEL"

  @test @test_Case_4557 @ALM_VR_TC_492
  Scenario: Successful edited patient data
    And   I click the three points menu of demographics
    And   I click button option "Edit"
    And   I enter the surname 2 "Baggio"
    And   I select the sex at birth
    Then  I click the three points menu of demographics
    And   I click button option "Save"
    And   I verify the action was performed successfully