#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Hospitalization

Feature: Add Hospitalization

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    And   I open the menu and add new line of Hospitalization


  @test @Test_case_3690 @ALM_VR_TC_124
  Scenario: Cancelling an added Hospitalization
    Then  I enter all the necessary data to create a new hospitalization
    And   I cancel saving the new hospitalization

  @test @Test_case_3691 @ALM_VR_TC_591
  Scenario: Successful added Hospitalization
    Then  I enter all the necessary data to create a new hospitalization
    And   I save the new Hospitalization

@test @Test_case_3702 @ALM_VR_TC_592
  Scenario:Add new Hospitalization with empty required fields