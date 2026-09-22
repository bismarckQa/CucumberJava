#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Planning_Care
Feature: Modify Planning Care

  Background:
    Given I open the Baxter website
    And   I try to login with "login_core" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open Planning Care module
    Then  I check the module Planning Care appear correctly

  @test @Test_case_3481 @ALM_VR_TC_799
  Scenario: Cancelling an edited Planning Care
    When  I select period "Multi" in Planning Care
    And   I click button three points Planning Care
    And   I click edit in Planning Care
    And   I select subject "Asunto Planes Cuidados: ALTA" in Planning Care
    When  I click button three points Planning Care
    And   I click cancel in Planning Care

  @test @Test_case_3483 @ALM_VR_TC_800
  Scenario: Edit Planning Care with empty required fields
    When  I select period "Multi" in Planning Care
    And   I click button three points Planning Care
    And   I click edit in Planning Care
    When  I click button three points Planning Care
    And   I click cancel in Planning Care

  @test @Test_case_3482 @ALM_VR_TC_801
  Scenario: Successful edited Planning Care
    When  I select period "Multi" in Planning Care
    And   I click button three points Planning Care
    And   I click edit in Planning Care
    And   I select position "Prueba Centro 2" in Planning Care
    And   I select subject "Asunto Planes Cuidados: ALTA" in Planning Care
    When  I click button three points Planning Care
    And   I click save in Planning Care
