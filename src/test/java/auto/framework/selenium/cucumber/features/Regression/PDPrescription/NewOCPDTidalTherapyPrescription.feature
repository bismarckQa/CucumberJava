Feature: New OCPD Tidal Therapy prescription
  @test @regression
  Scenario:  Cancel  a New OCPD Tidal Prescription
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I trying to create a new OCPD Tidal prescription, but I get the option to cancel

  @test @regression
  Scenario: Create a New OCPD  Tidal Prescription with, at least, one Required field empty
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I trying to create a new OCPD Tidal prescription, with one required field empty

  @test @regression
  Scenario: Create a New OCPD  Tidal Prescription.
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I successfully created a new Tidal prescription
