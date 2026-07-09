#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Create a Culture for an Access

  @test @TestCase_3673 @ALM_VR_TC_28
  Scenario: Create New Swab of Access
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I click button implantation section
    Then  I click button three points swab
    And   I click button "New swab"
    And   I select option location swab
    And   I insert data into evaluation area "Qa test"
    Then  I click button three points swab
    And   I click button save

  @test @TestCase_3940 @ALM_VR_TC_340
  Scenario: Cancel a Swab
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I click button implantation section
    Then  I click button three points swab
    And   I click button "New swab"
    And   I select option location swab
    And   I insert data into evaluation area "Qa test"
    Then  I click button three points swab
    And   I click button cancel

  @test @TestCase_3941 @ALM_VR_TC_341
  Scenario: Save with at least one of required  fields empty
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I click button implantation section
    Then  I click button three points swab
    And   I click button "New swab"
    And   I insert data into evaluation area "Qa test"
    Then  I click button three points swab
    And   I click button cancel
