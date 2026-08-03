#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@PhysicalAssessment

Feature: Delete Assessment areas and Comments

Background:
Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    
  @test @TestCase_3671 @ALM_VR_TC_139
  Scenario: Successful deleted assessment and comments
    And   I click in Assessment area and comments
    And   I click button three points Assessment Area
    And   I click button option "Delete"
    Then  I filling in the data to delete the record, password: "renal2", reason: "Qa Test" and option: "OK"


  @test @TestCase_3672 @ALM_VR_TC_650
  Scenario: Cancelling deleted assessment and comments
    And   I click in Assessment area and comments
    And   I click button three points Assessment Area
    And   I click button option "Delete"
    Then  I filling in the data to delete the record, password: "renal2", reason: "Qa Test" and option: "Cancel"
