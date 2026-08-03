#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Modify Emergency Contact


Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly


  @test @test_Case_3089 @ALM_VR_TC_87
  Scenario: Cancelling an edited emergency contact
    When  I click the edit button of the emergency contact row
    And   I enter the name in the emergency contact row "QA Test Edit"
    Then  I cancel the emergency contact row

  @test @test_Case_3090 @ALM_VR_TC_489
  Scenario: Fields are empty when editing emergency contact
    When  I click the edit button of the emergency contact row
    And   I enter the name in the emergency contact row ""
    Then  I save the emergency contact row
    And   I cancel the emergency contact row

  @test @test_Case_3091 @ALM_VR_TC_490
  Scenario: Successful edit emergency contact
    When  I click the edit button of the emergency contact row
    And   I enter the name in the emergency contact row "QA Test Edit"
    And   I enter the telephone in the emergency contact row "665372854"
    Then  I save the emergency contact row
    And   I verify the action was performed successfully