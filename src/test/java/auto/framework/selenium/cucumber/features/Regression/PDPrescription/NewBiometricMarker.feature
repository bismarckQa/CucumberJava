Feature: New biometric marker
  @test
  Scenario:  Save a New Biometric Marker with at least one Required field empty
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I check the module PD Prescription appear correctly
    And   I try to save a new biometric marker with at least one required field empty


  @test
  Scenario:  Create a New Biometric Marker
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I check the module PD Prescription appear correctly
    And   I successfully create and save the new Biometric Marker
