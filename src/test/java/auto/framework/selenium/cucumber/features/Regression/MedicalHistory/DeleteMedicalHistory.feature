#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Medical_History
Feature: Delete Medical History

  Background:
    Given I open the Baxter website
    And   I try to login with "login_core" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open Medical History module
    Then  I check the module Medical History appear correctly

  @test @Test_case_3409 @ALM_VR_TC_813
  Scenario: Cancelling a delete Personal History
    When  I click delete row in Medical History
    And   I click No in delete confirmation modal in Medical History

  @test @Test_case_3410 @ALM_VR_TC_814
  Scenario: Successful delete Personal History
    When  I click delete row in Medical History
    And   I click Yes in delete confirmation modal in Medical History
