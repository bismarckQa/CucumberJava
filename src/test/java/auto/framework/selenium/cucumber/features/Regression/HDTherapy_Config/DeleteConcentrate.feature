#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy

Feature: Delete Concentrate

Background:
Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    
  @test @TestCase_2703 @ALM_VR_TC_95
  Scenario: Prescribed concentrate
    And   I click button concentrates section
    And   I looking for the concentrate with the name: "Ca=2,25"
    When  I click button three points concentrates
    And   I click button delete concentrate
    Then  I click button arrow up
    And   I click button yes Confirmation delete concentrate
    And   I click button OK  modal error

  @test @TestCase_2704 @ALM_VR_TC_515
  Scenario: Concentrate not prescribed
    And   I click button concentrates section
    And   I looking for the concentrate with the name: "Test_case_2"
    When  I click button three points concentrates
    And   I click button delete concentrate
    Then  I click button arrow up
    And   I click button yes Confirmation delete concentrate
