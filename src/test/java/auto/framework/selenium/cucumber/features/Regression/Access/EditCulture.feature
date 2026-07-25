#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Edit Culture

Background:
Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I click button implantation section
    Then  I click button three points swab


  @test @TestCase_3789 @ALM_VR_TC_42
  Scenario: Edit the Swab
    And   I click button "Edit"
    When  I insert data into input date: "12/16/2025"
    And   I select option location swab
    And   I insert data into evaluation area "Swab Modified"
    Then  I click button three points swab
    And   I click button save

  @test @TestCase_3942 @ALM_VR_TC_402
  Scenario: Cancel edited Swab
    And   I click button "Edit"
    When  I insert data into input date: "12/17/2025"
    And   I select option location swab
    And   I insert data into evaluation area "Swab Modified"
    Then  I click button three points swab
    And   I click button cancel


  @test @TestCase_3943 @ALM_VR_TC_403
  Scenario: Save with (at least one) of required  fields empty
    And   I click button "Edit"
    When  I insert data into input date: "12/17/2025"
    And   I clear input data location swab
    And   I insert data into evaluation area "Swab Modified"
    Then  I click button three points swab
    And   I click button cancel
