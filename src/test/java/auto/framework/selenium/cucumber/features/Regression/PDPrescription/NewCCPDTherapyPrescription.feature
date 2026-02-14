Feature: New CCPD therapy Prescription
  @test @smoke
  Scenario:  Create a New CCPD Prescription for Baxter Exchange
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I am trying to create a new CCPD prescription using the Housing Choice System

  @test @smoke
  Scenario:  Cancel a New CCPD Prescription
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I try to create a new CCPD prescription using the Home Choice System, but it keeps getting canceled
