Feature: New OCPD Therapy Prescription
  Scenario:  Create a New OCPD therapy Prescription for Baxter Exchange
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I Save new OCPD Therapy Prescription for Manual Exchange

  @test @regression
  Scenario:  Cancel a New OCPD therapy Prescription
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I try to create a new OCPD therapy prescription for manual exchange, but it gets canceled

  @test @regression
  Scenario:  Create a New OCPD therapy Prescription with, at least, one Required field empty
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I try to create a new OCPD therapy prescription for manual exchange, with required field empty
