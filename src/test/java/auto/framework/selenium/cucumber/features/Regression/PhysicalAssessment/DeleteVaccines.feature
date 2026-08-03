#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@PhysicalAssessment

Feature: Delete Vaccines


Background: 
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly


  @test @TestCase_3637 @ALM_VR_TC_141
  Scenario: Successful deleted Vaccine
    And   I click in vaccines area
    When  I click button three points dose
    And   I click button option "Delete"
    Then  I filling in the data to delete the record, password: "renal2", reason: "Qa Test" and option: "OK"

  @test @TestCase_3638 @ALM_VR_TC_654
  Scenario: Cancelling an deleted Vaccine
    And   I click in vaccines area
    When  I click button three points dose
    And   I click button option "Delete"
    Then  I filling in the data to delete the record, password: "renal2", reason: "Qa Test" and option: "Cancel"


  @test @TestCase_10690 @ALM_VR_TC_655
  Scenario: Cancelling a deleted Extra Dose
    And   I click in vaccines area
    And   I click button delete extra dose
    Then  I click button "No" in action modal

  @test @TestCase_10691 @ALM_VR_TC_656
  Scenario: Delete an Extra Dose
    And   I click in vaccines area
    And   I click button delete extra dose
    Then  I click button "Yes" in action modal
