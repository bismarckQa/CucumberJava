#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Medical_History
Feature: Modify Medical History

  Background:
    Given I open the Baxter website
    And   I try to login with "login_core" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open Medical History module
    Then  I check the module Medical History appear correctly

  @test @Test_case_3407 @ALM_VR_TC_811
  Scenario: Cancelling an edited Personal History
    When  I click edit row in Medical History
    And   I check father in Medical History
    And   I check mother in Medical History
    And   I click cancel row in Medical History

  @test @Test_case_3408 @ALM_VR_TC_812
  Scenario: Successful edited Personal History
    When  I click edit row in Medical History
    And   I check father in Medical History
    And   I check mother in Medical History
    And   I click save row in Medical History
