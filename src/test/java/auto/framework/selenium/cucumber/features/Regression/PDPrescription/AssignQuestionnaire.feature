Feature: Assign Questionnaire
  @test @regression
  Scenario: Cancel Questionnaire Assignation
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 12, Sharesource - SHS11912"
    And   I open PD Prescription module
    Then  I have completed the necessary information, but the system will cancel the Questionnaire assignment

  @test @regression
  Scenario: See Questionnaire
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 12, Sharesource - SHS11912"
    And   I open PD Prescription module
    Then  I verify that the system will display "View Questionnaire" with all the information

  @test @regression
  Scenario: Assign without Questionnaire selected
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 12, Sharesource - SHS11912"
    And   I open PD Prescription module
    Then  I verified that the questionnaire field is REQUIRED and empty. The Save button should not appear in this section. Only the Cancel button will be available

  @test @regression
  Scenario: Assign Questionnaire
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 12, Sharesource - SHS11912"
    And   I open PD Prescription module
    Then  I successfully assign new questionnaire

  @test @regression
  Scenario: Configure Questionnaire
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 12, Sharesource - SHS11912"
    And   I open PD Prescription module
    Then  I successfully modified the assigned questionnaire
