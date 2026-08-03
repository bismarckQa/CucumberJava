#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Assign Main Center

Background:
  Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly


  @test @test_Case_2963 @ALM_VR_TC_73
  Scenario: Cancelling an assigned centre
    When  I click the New button at position 2
    And   I select a centre in the new row
    And   I enter the start date of the centre row "03/01/2026"
    Then  I click option cancel add center
    And   I click button arrow up


  @test @test_Case_2964 @ALM_VR_TC_470
  Scenario:  Successful assigned centre
    When  I click the New button at position 2
    And   I select a centre in the new row
    And   I enter the start date of the centre row "02/01/2026"
    Then  I save the centre row
    And   I assign an associated staff member to the new selected center
    And   I click button "OK"

  @test @test_Case_4562 @ALM_VR_TC_471
  Scenario: Assign a centre with empty required fields
    When  I click the New button at position 2
    And   I enter the start date of the centre row ""
    Then  I save the centre row
    And   I click option cancel add center
    And   I click button arrow up