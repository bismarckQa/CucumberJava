Feature: Modify Biometric Marker
  @test @smoke
  Scenario:  Modify Biometric Marker
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I check the module PD Prescription appear correctly
    And   I save the changes in the Biometric Markers
