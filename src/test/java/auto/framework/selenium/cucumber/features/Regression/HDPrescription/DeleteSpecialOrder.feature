#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@HD_Prescription

Feature:Delete Special Order

Background:
  Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly

@test @Test_case_4665 @ALM_VR_TC_548
Scenario:Cancelling a deleted special order
    When  I click delete special order in HD Prescription
    And   I click button "No" in action modal

@test @Test_case_4666 @ALM_VR_TC_549
Scenario:Successful deleted special order
    When  I click delete special order in HD Prescription
    And   I click button "Yes" in action modal
