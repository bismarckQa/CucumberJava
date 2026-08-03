#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Delete Emergency Contact

Background:
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly


  @test @test_Case_3093 @ALM_VR_TC_78
  Scenario: Cancelling a delete emergency contact
    And   I click the delete button of the emergency contact row
    Then  I click button "No" in action modal

  @test @test_Case_3094 @ALM_VR_TC_478
  Scenario: Successful delete emergency contact
    And   I click the delete button of the emergency contact row
    And   I click button "Yes" in action modal
    Then  I verify the action was performed successfully