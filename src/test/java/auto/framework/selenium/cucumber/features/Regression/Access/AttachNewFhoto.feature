#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature:Attach a new photo/image to an access

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly


  @test @TestCase_3562 @ALM_VR_TC_21
  Scenario: Attach  Photographs
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    When  I select the Evaluation in main menu
    And   I verify Historic Photographs of Accesses
    And   I click button image photo
    Then  I select Image to upload
    And   I click button OK modal error
    And   I verify Historic Photographs of Accesses

  @test @TestCase_3929 @ALM_VR_TC_330
  Scenario: Save Add with no photo selected
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    When  I select the Evaluation in main menu
    And   I verify Historic Photographs of Accesses
    And   I click button image photo
    And   I click button "Add" upload photo
    And   I click button "Cancel" upload photo
    And   I verify Historic Photographs of Accesses

  @test @TestCase_3930 @ALM_VR_TC_331
  Scenario: Save Add with of required  field (date) empty
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    When  I select the Evaluation in main menu
    And   I verify Historic Photographs of Accesses
    And   I click button image photo
    And   I insert data into date add photograph " "
    When  I select Image to upload
    And   I click button "Add" upload photo
    Then  I click button "Cancel" upload photo
    And   I verify Historic Photographs of Accesses
