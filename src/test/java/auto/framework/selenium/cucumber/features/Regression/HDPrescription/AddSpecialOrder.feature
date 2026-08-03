#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@HD_Prescription
Feature: Add special order

Background:
Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly



  @test @Test_case_4650 @ALM_VR_TC_105
  Scenario: Canceling an added special order
    And   I canceling to create a special order by clicking on the add special order button

  @test @Test_case_4651 @ALM_VR_TC_535
  Scenario: Add new special order with empty required fields
    And   I verify that the save button does not appear

  @test @Test_case_4649 @ALM_VR_TC_536
  Scenario: Successful added special order
    And   I create a special order by clicking on the add special order button

  @test @Test_case @ALM_VR_TC_537
  Scenario: Add new special order with an earlier end date than start date
   
  @test @Test_case @ALM_VR_TC_538
  Scenario: Add new special order with an later start date than end date
     