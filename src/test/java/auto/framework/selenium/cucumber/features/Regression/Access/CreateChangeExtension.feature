#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Create a change of extension

  @test @TestCase_3807  @ALM_VR_TC_25
  Scenario: Create a Change of Extension
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I click button implantation section
    And   I verify section change of extension is displayed
    Then  I click button three points change of extension
    And   I click button new extender change
    And   I insert data into date change of extension "10/20/2025"
    When  I select option type of configuration for change extension
    And   I click button three points change of extension
    And   I click button save
    Then  I click button arrow up

  @test @TestCase_3945 @ALM_VR_TC_335
  Scenario: Save with required  field empty (Date)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I click button implantation section
    And   I verify section change of extension is displayed
    Then  I click button three points change of extension
    And   I click button new extender change
    And   I insert data into date change of extension ""
    When  I select option type of configuration for change extension
    And   I click button three points change of extension
    And   I click button cancel
    Then  I click button arrow up

  @test @TestCase_3946 @ALM_VR_TC_336
  Scenario: Canceling a new Change extension
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I click button implantation section
    And   I verify section change of extension is displayed
    Then  I click button three points change of extension
    And   I click button new extender change
    And   I insert data into date change of extension "10/21/2025"
    When  I select option type of configuration for change extension
    And   I click button three points change of extension
    And   I click button cancel
    Then  I click button arrow up

  @test @TestCase_4316  @ALM_VR_TC_337
  Scenario: Save with required field (Date) outside of the range
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I click button implantation section
    And   I verify section change of extension is displayed
    Then  I click button three points change of extension
    And   I click button new extender change
    And   I insert data into date change of extension "10/21/2010"
    When  I select option type of configuration for change extension
    And   I click button three points change of extension
    And   I click button save
    And   I click button OK modal error
    And   I click button three points change of extension
    And   I click button cancel
    Then  I click button arrow up
