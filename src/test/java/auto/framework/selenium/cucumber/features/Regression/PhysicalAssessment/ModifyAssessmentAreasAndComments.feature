#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@PhysicalAssessment

Feature: Modify Assessment Areas and Comments

  @test @TestCase_3669
  Scenario: Successful edit assessment and comments
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    And   I click in Assessment area and comments
    And   I click button three points Assessment Area
    Then  I click button option "Edit"
    And   I insert data into input date: "01/26/2026"
    And   I insert data into observations Assessment area "Assessment Modified"
    When  I click button arrow up
    And   I click button three points Assessment Area
    Then  I click button option "Save"

  @test @TestCase_3670
  Scenario: Cancelling an edit assessment and comments
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    And   I click in Assessment area and comments
    And   I click button three points Assessment Area
    Then  I click button option "Edit"
    And   I insert data into input date: "01/26/2026"
    And   I insert data into observations Assessment area "Assessment Modified"
    When  I click button arrow up
    And   I click button three points Assessment Area
    Then  I click button option "Cancel"
