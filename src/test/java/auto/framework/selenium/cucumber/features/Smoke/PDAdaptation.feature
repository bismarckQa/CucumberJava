
Feature: Smoke test PD Adaptation module
  @test @smoke
  Scenario: Check PD Adaptation module
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Pruebas Miguel DP, Paciente - SrRoblesDpNumHist"
    And   I open PD Adaptation module
    Then  I check the module PD Adaptation appear correctly
