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
    When  I select the patient "BisRic 1, ELVIRA"
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly



  @test @Test_case_4650 @ALM_VR_TC_105
  Scenario: Canceling an added special order
    When  I click add special order in HD Prescription
    And   I enter special order description "QA test" in HD Prescription
    And   I click button "Cancel" in special order

  @test @Test_case_4651 @ALM_VR_TC_535
  Scenario: Add new special order with empty required fields
    When  I click add special order in HD Prescription
    Then  I verify save special order button is not displayed in HD Prescription
    And   I click button "Cancel" in special order

  @test @Test_case_4649 @ALM_VR_TC_536
  Scenario: Successful added special order
    When  I click add special order in HD Prescription
    And   I enter special order description "QA test" in HD Prescription
    And   I click button "Save" in special order

  @test @Test_case_4656 @ALM_VR_TC_537
  Scenario: Add new special order with an earlier end date than start date
    When  I click add special order in HD Prescription
    And   I enter special order description "QA test" in HD Prescription
    And   I enter special order end date "01/01/2020" in HD Prescription
    And   I click button "Save" in special order
    Then  I click button OK modal error
    And   I click button "Cancel" in special order

  @test @Test_case_4657 @ALM_VR_TC_538
  Scenario: Add new special order with an later start date than end date
    When  I click add special order in HD Prescription
    And   I enter special order description "QA test" in HD Prescription
    And   I enter special order start date "12/31/2030" in HD Prescription
    And   I enter special order end date "01/01/2025" in HD Prescription
    And   I click button "Save" in special order
    Then  I click button OK modal error
    And   I click button "Cancel" in special order