#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@PD_Prescription


Feature: New Questionnaire

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 12, Sharesource - SHS11912"
    And   I open PD Prescription module
    
  @test @Test_Case_4862 @ALM_VR_TC_709
  Scenario: Cancel New Questionnaire
    Then  I try to create a new questionnaire, but the system cancels it

  @test @Test_Case_4860 @ALM_VR_TC_710
  Scenario: Save quetionnaire with at least one Requiered field empty
    Then  I try to create a new questionnaire, with one required field empty

  @test @Test_Case_4863 @ALM_VR_TC_711
  Scenario: Save questionnaire with at least one field with wrong value
    Then  I try to create a new questionnaire, with one wrong values

  @test @Test_Case_4859 @ALM_VR_TC_712
  Scenario: Create New Questionnaire (without copying Questionnaire)
    Then  I save a new questionnaire, without copying an existing one

  @test @Test_Case_4865 @ALM_VR_TC_713
  Scenario: Add questions to the Questionnaire (copying a Questionnaire)
    Then  I save a new questionnaire, with copying an existing one

  @test @Test_Case_4861 @ALM_VR_TC_714
  Scenario: Delete Question
    Then  I try to save a new questionnaire, with copying an existing one but I delete a question

  @test @Test_Case_4867 @ALM_VR_TC_715
  Scenario: Add question to New Questionnaire
    Then  I insert a new question to the questionnaire
