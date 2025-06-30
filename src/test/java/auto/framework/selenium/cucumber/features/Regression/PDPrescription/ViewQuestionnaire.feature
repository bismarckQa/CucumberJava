Feature: View Questionnaire
  @test @smoke
  Scenario:  View Questionnaire
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 12, Sharesource - SHS11912"
    And   I open PD Prescription module
    Then  I check the module PD Prescription appear correctly
    And   I check if the system will display the questionnaire view with the fields: Questionnaire Name, Active (Yes, No), All Questions
