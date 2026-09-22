#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Medical_History
Feature: Modify History Textbox

  Background:
    Given I open the Baxter website
    And   I try to login with "login_core" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open Medical History module
    Then  I check the module Medical History appear correctly

  @test @Test_case_3411 @ALM_VR_TC_809
  Scenario: Cancelling an edited History textbox
    When  I click button three points menu in Medical History
    And   I click menu option "Edit" in Medical History
    And   I write history "QA test cancel" in Medical History
    When  I click button arrow up
    And   I click button three points menu in Medical History
    And   I click menu option "Cancel" in Medical History

  @test @Test_case_3412 @ALM_VR_TC_810
  Scenario: Successful edited Personal History textbox
    When  I click button three points menu in Medical History
    And   I click menu option "Edit" in Medical History
    And   I write history "QA test save" in Medical History
    When  I click button arrow up
    And   I click button three points menu in Medical History
    And   I click menu option "Save" in Medical History
