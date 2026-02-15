Feature: New APD Sleep Safe Prescription
  @test @smoke
  Scenario:  Create a New APD Sleep Safe Prescription
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I saving a new prescription for APD Sleep Safe

  @test @smoke
  Scenario:  Cancel a new APD Sleep Safe Prescription
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I try saving a new prescription for APD Sleep Safe, but I cancel

  @test @smoke
  Scenario:  Save a New APD Sleep Safe Prescription with the field "Total vol." and/or "Last Infusion" and/or "Prescribed by" empty
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I try saving a new prescription with empty Total vol and last infusion, but I cancel

  @test @smoke
  Scenario:  Save a New APD Sleep Safe Prescription with the field "Weekdays" empty.
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I try saving a new prescription with weekdays empty, the system shall display the error message
