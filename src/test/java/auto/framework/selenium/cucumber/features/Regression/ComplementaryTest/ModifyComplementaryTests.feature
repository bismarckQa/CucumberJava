#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Complementary_Test

Feature: Modify Complementary Tests

Background:
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module


  @test @TetsCase_3615 @ALM_VR_TC_58
  Scenario: Canceling and edited complementary test"
    And   I edit complementary test added recently
    And   I add all data correctly for add the complementary test with the reception date "1352024" description "QATestEdit"
    And   I Cancel the edition of this complementary test
   

  @test @TetsCase_3594 @ALM_VR_TC_424
  Scenario: Edit a complementary test with empty required fields
    Then  I check that the new test added correctly
    And   I edit complementary test added recently
    And   I delete the Date of Record
    Then  I check the save button doesn't appear
   

  @test @TetsCase_3588 @ALM_VR_TC_425
  Scenario: Successful edited complementary test
    And   I edit complementary test added recently
    And   I add all data correctly for add the complementary test with the reception date "6062024" description "QATestEdit"
    And   I save the new complementary test




 