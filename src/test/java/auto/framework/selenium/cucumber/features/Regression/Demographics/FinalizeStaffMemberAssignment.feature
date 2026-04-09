#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Finalize Staff Member Assignment

  @test @regression @test_Case_2998
  Scenario: Successful finalized staff member assignment
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click the finalize button on the staff row
    Then  I verify the action was performed successfully