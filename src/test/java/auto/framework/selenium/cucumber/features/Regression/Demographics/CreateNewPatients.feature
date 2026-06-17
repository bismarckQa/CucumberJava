#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Create New Patient

  @test @test_Case_2960
  Scenario: New patient. No data required (Not Applicable)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I open options of user
    And   I enter into user configuration options
    And   I verify the New patient x_title is visible with scroll
    When  I click the three points menu of New patient
    And   I click "New" option in the three points menu of New patient
    And   I click the three points menu of New patient
    Then  I click "Cancel" option in the three points menu of New patient

  @test @regression @test_Case_2961
  Scenario: New patient. All data required (Not Applicable)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I open options of user
    And   I enter into user configuration options
    Then  I verify the New patient x_title is visible with scroll
    And   I click the three points menu of New patient
    And   I click "New" option in the three points menu of New patient
    And   I enter the name "1 Tets "
    And   I enter the last name "Patient"
    And   I enter the surname 2 "Qa"
    And   I enter the date of birth "01/01/1990"
    And   I select the gender
    And   I select the blood group
    And   I select the referred by
    And   I enter the ID patient "12345"
    And   I enter the date of 1st dialysis "03/01/2026"
    And   I select the primary center
    And   I enter the date of admission "03/01/2026"
    And   I select the patient group
    And   I select the clinical status
    And   I enter the start date "03/13/2026"
    And   I select the method
    And   I select the referred by clinical status
    #And   I select the modalidad referred by
    #And   I select the submethod
    #And   I select the location
    #And   I select the attendance
    #When  I select the monitor brand
    #And   I select the reason for start
    When  I click button arrow up
    And   I click the three points menu of New patient
    And   I click "Cancel" option in the three points menu of New patient