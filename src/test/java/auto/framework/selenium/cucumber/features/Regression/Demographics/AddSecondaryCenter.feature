#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Add Secondary Center

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly


  @test @test_Case_2977 @ALM_VR_TC_71
  Scenario: Adding a secondary centre with empty fields
    When  I click the New button at position 4
    Then  I save the secondary centre row
    And   I cancel the secondary centre row

  @test @test_Case_2978 @ALM_VR_TC_463
  Scenario: Cancelling an added secondary centre
    When  I click the New button at position 4
    And   I select a secondary centre in the new row
    And   I enter the start date of the secondary centre row "03/01/2026"
    Then  I cancel the secondary centre row

  @test @test_Case_2979 @ALM_VR_TC_464
  Scenario: Successful added secondary centre
    When  I click the New button at position 4
    And   I select a secondary centre in the new row
    And   I enter the start date of the secondary centre row "03/01/2026"
    And   I select a category in the secondary centre row
    Then  I save the secondary centre row

  @test @test_Case_2980 @ALM_VR_TC_465
  Scenario: Adding a secondary centre with wrong dates
    When  I click the New button at position 4
    And   I select a secondary centre in the new row
    And   I enter the start date of the secondary centre row "03/01/2026"
    And   I enter the end date of the secondary centre row "01/01/2020"
    And   I select a category in the secondary centre row
    Then  I save the secondary centre row
    And   I click button OK modal error
    And   I cancel the secondary centre row