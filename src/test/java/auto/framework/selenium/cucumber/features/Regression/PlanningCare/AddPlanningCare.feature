#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Planning_Care
Feature: Add new Planning Care

  Background:
    Given I open the Baxter website
    And   I try to login with "login_core" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open Planning Care module
    Then  I check the module Planning Care appear correctly

  @test @Test_case_3479 @ALM_VR_TC_796
  Scenario: Cancelling an added Planning Care
    When  I select period "Multi" in Planning Care
    And   I click button three points Planning Care
    And   I click new in Planning Care
    And   I select subject "Prueba Activo" in Planning Care
    When  I click button three points Planning Care
    And   I click cancel in Planning Care

  @test @Test_case_3480 @ALM_VR_TC_797
  Scenario: Add new Planning Care with empty required fields
    When  I select period "Multi" in Planning Care
    And   I click button three points Planning Care
    And   I click new in Planning Care
    When  I click button three points Planning Care
    And   I click cancel in Planning Care

  @test @Test_case_3478 @ALM_VR_TC_798
  Scenario: Successful added Planning Care
    When  I select period "Multi" in Planning Care
    And   I click button three points Planning Care
    And   I click new in Planning Care
    And   I select subject "Prueba Activo" in Planning Care
    When  I click button three points Planning Care
    And   I click save in Planning Care
