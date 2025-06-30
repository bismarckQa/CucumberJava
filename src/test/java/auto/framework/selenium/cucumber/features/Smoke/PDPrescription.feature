
Feature: Smoke test PD Prescription module
  @test @smoke
  Scenario: Check PD Prescription module
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Pruebas Miguel DP, Paciente - SrRoblesDpNumHist"
    And   I open PD Prescription module
    Then  I check the module PD Prescription appear correctly
