#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Add New HD Treatment

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful

  @test @TestCase_3219 @ALM_VR_TC
  Scenario: New treatment without active HD prescription
    When  I select the patient "Ape1_1839 Ape2_1839, Nom_1839"
    And   I open HD Treatment module
    And   I click button three points HD Treatment
    And   I click button "New treatment" in HD Treatment
    Then  I verify alert window is displayed in HD Treatment
    And   I click button OK in HD Treatment alert

  @test @TestCase_3220 @ALM_VR_TC
  Scenario: New treatment with active HD prescription
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    And   I click button three points HD Treatment
    And   I click button "New treatment" in HD Treatment
    Then  I verify HD Treatment form is displayed
    When  I select center "Centro 1" in HD Treatment location
    And   I select room "Test" in HD Treatment location
    And   I select shift "Test" in HD Treatment location
    And   I select location "Test1" in HD Treatment location
    And   I select monitor "AK98" in HD Treatment location
    And   I open "Preparation" section in HD Treatment
    And   I open "Session" section in HD Treatment
    And   I open "Admin. drugs/other" section in HD Treatment
    Then  I open "Final signature" section in HD Treatment
