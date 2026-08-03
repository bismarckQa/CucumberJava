#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@PD_Prescription

Feature: Create an Initial PD Prescription for a Patient
 
  @test @Test_Case_4588 @ALM_VR_TC_723
  Scenario:  Create a New Prescription for APD Treatment
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I check the module PD Prescription appear correctly
    And   I create and save a new prescription

  @test @Test_Case_4589 @ALM_VR_TC_724
  Scenario:  Add Prescription
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I check if in prescription history I can add

  @test @Test_Case_4590 @ALM_VR_TC_725
  Scenario:  Save Prescription with at least one Required field empty
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I try to save a recipe with at least one required field empty.

  @test @Test_Case_4591 @ALM_VR_TC_726
  Scenario:  Cancel Prescription
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I try to create a new prescription but I click the cancel button

  @test @Test_Case_4592 @ALM_VR_TC_727
  Scenario:  Prescription History
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I verify that Previous Recipes will be displayed on the left and Active Recipes on the right, with their respective date.

  @test @Test_Case_4593 @ALM_VR_TC_728
  Scenario:  Add Exchange
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I create and add a new Exchange

  @test @Test_Case_4594 @ALM_VR_TC_729
  Scenario:  Assistant View
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I check that the information for each solution and a delete button are displayed

  @test @Test_Case_4595 @ALM_VR_TC_730
  Scenario:  Solutions View
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I do Click on each label to drag and drop the desired solutions

  @test @Test_Case_4596 @ALM_VR_TC_731
  Scenario:  View Parameter Adjustments (for APD Treatment)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I check The system hides details

  @test @Test_Case_4598 @ALM_VR_TC_732
  Scenario:  Assign Questionnaire
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I verify that the system assigned the Questionnaire

  @test @Test_Case_4599 @ALM_VR_TC_733
  Scenario:  New Questionnaire
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I create and save the new Questionnaire

  @test @Test_Case_4608 @ALM_VR_TC_734
  Scenario:  Create a New Prescription for CAPD Treatment
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I create a new CAPD prescription and verify that it is in history

  @test @Test_Case_4612 @ALM_VR_TC_735
  Scenario:  Save Prescription with at least one field with wrong value entered
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 12, Sharesource - SHS11912"
    And   I open PD Prescription module
    And   I try to create a new Prescription, but the system cancels the prescription

  @test @Test_Case_4622 @ALM_VR_TC_736
  Scenario:  Delete Exchange
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I verify that The system will delete the selected change line