#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@PD_Prescription
Feature: Assign Questionnaire

Background:
Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 12, Sharesource - SHS11912"
    And   I open PD Prescription module
    


  @test @Test_Case_4853 @ALM_VR_TC_676
  Scenario: Cancel Questionnaire Assignation
    Then  I have completed the necessary information, but the system will cancel the Questionnaire assignment

  @test @Test_Case_4854 @ALM_VR_TC_677
  Scenario: See Questionnaire
    Then  I verify that the system will display "View Questionnaire" with all the information

  @test @Test_Case_4852 @ALM_VR_TC_678
  Scenario: Assign without Questionnaire selected
    Then  I verified that the questionnaire field is REQUIRED and empty. The Save button should not appear in this section. Only the Cancel button will be available

  @test @Test_Case_4850 @ALM_VR_TC_679
  Scenario: Assign Questionnaire
    Then  I successfully assign new questionnaire

  @test @Test_Case_4851 @ALM_VR_TC_680
  Scenario: Configure Questionnaire
    Then  I successfully modified the assigned questionnaire
