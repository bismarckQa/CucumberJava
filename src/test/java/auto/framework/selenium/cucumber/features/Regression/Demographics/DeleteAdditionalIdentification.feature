#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Delete Additional Identification

Background:
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly


  @test @test_Case_2974 @ALM_VR_TC_75
  Scenario: Canceling a deleted Identification
   
    And   I click button delete identifications
    Then  I click button "No" in action modal

  @test @test_Case_2975 @ALM_VR_TC_475
  Scenario: Successful deleted Identification
    And   I click button delete identifications
    Then  I click button "Yes" in action modal