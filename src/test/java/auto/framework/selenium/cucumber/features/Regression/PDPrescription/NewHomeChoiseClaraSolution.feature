Feature: New Home Choose Clara Solution
  @test @smoke
  Scenario:  Add a HomeChoice / Claria solution
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I trying to add a Home Choice Claria solution

  @test @smoke
  Scenario:  Save a new home choise / Claria Solution to a prescription
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I am trying to save a new Home Choice Claria solution successfully
