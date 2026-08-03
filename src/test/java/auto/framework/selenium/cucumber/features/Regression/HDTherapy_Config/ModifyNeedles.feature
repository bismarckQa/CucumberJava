#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy

Feature: Modify Needles

Background:

    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module

  @test @TestCase_2710 @ALM_VR_TC_103
  Scenario: Empty Data
    And   I click button needles section
    And   I looking for the needles with the name: "Test_1"
    When  I click button three points needles
    And   I click button edit needles
    And   I insert data at name needles ""
    And   I insert data at Caliber needles ""
    When  I click button three points needles
    And   I click button cancel add new needles
    Then  I click button arrow up

  @test @TestCase_2711 @ALM_VR_TC_99
  Scenario: No Caliber
    And   I click button needles section
    And   I looking for the needles with the name: "Test_1"
    When  I click button three points needles
    And   I click button edit needles
    And   I insert data at name needles "Tes Modified"
    And   I insert data at Caliber needles ""
    When  I click button three points needles
    And   I click button cancel add new needles
    Then  I click button arrow up

  @test @TestCase_2712 @ALM_VR_TC_531
  Scenario: Full Data
    And   I click button needles section
    And   I looking for the needles with the name: "Test_1"
    When  I click button three points needles
    And   I click button edit needles
    And   I insert data at name needles "Test_Modified"
    And   I insert data at Caliber needles "14"
    When  I click button three points needles
    And   I click button save add new needles
    Then  I click button arrow up
    And   I looking for the needles with the name: "Test_Modified"

  @test @TestCase_2714 @ALM_VR_TC_532
  Scenario: Set as inactive to active
    And   I click button needles section
    Then  I click the checkbox to show all inactive needles
    And   I looking for the needles with the name: "Test_inactive"
    When  I click button three points needles
    And   I click button edit needles
    And   I insert data at name needles "Test_Active"
    And   I select or unselect needles checkbox if it is "active"
    When  I click button three points needles
    And   I click button save add new needles
    Then  I click button arrow up
    Then  I click the checkbox to show all inactive needles
    And   I looking for the needles with the name: "Test_Active"
