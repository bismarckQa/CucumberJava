#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Medical_History
Feature: Add Medical History

  Background:
    Given I open the Baxter website
    And   I try to login with "login_core" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open Medical History module
    Then  I check the module Medical History appear correctly

  @test @Test_case_3406 @ALM_VR_TC_806
  Scenario: Cancelling an added Personal History
    When  I click add new in Medical History
    And   I select history "Hipertension" in Medical History
    And   I check father in Medical History
    And   I check mother in Medical History
    And   I click cancel row in Medical History

  @test @Test_case_3405 @ALM_VR_TC_807
  Scenario: Add new Personal History with empty required fields
    When  I click add new in Medical History
    And   I click save row in Medical History
    And   I click Ok in validation error modal in Medical History
    And   I click cancel row in Medical History

  @test @Test_case_3404 @ALM_VR_TC_808
  Scenario: Successful added Personal History
    When  I click add new in Medical History
    And   I select history "Hipertension" in Medical History
    And   I check father in Medical History
    And   I check mother in Medical History
    And   I click save row in Medical History
