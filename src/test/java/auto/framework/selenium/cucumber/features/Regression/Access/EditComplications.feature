#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Edit complications

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    When  I select the Complications in main menu


  @test @TestCase_3626 @ALM_VR_TC_43
  Scenario: Edit  Modify complications
    And   I click button three points complications
    And   I click button "Edit"
    When  I insert data into identification date "11/20/2025"
    And   I insert data into resolution date "11/20/2025"
    And   I click button arrow up
    And   I click button three points complications
    And   I click button save

  @test @TestCase_3936 @ALM_VR_TC_398
  Scenario: Cancel edited complication
    And   I click button three points complications
    And   I click button "Edit"
    When  I insert data into identification date "11/21/2025"
    And   I insert data into resolution date "11/21/2025"
    And   I click button arrow up
    And   I click button three points complications
    And   I click button cancel

  @test @TestCase_3937 @ALM_VR_TC_399
  Scenario: Save with at least one of required  fields empty
    And   I click button three points complications
    And   I click button "Edit"
    When  I insert data into identification date "11/24/2025"
    And   I delete type of problem selected
    And   I insert data into resolution date "11/24/2025"
    And   I click button arrow up
    And   I click button three points complications
    Then   I click button cancel

  @test @TestCase_4098 @ALM_VR_TC_400
  Scenario: Save with the Identification date out of range
    And   I click button three points complications
    And   I click button "Edit"
    When  I insert data into identification date "11/24/1990"
    And   I insert data into resolution date "11/24/1990"
    And   I click button arrow up
    And   I click button three points complications
    Then  I click button save
    And   I click button OK modal error
    And   I click button three points complications
    Then  I click button cancel

  @test @TestCase_4099 @ALM_VR_TC_401
  Scenario: Save with the Resolution date out of range
    And   I click button three points complications
    And   I click button "Edit"
    When  I insert data into identification date "11/24/2025"
    And   I insert data into resolution date "11/24/1990"
    And   I click button arrow up
    And   I click button three points complications
    Then  I click button save
    And   I click button OK modal error
    And   I click button three points complications
    Then  I click button cancel
