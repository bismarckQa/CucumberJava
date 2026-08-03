#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Complementary_Test

Feature: Add Complementary test

Background:
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module


  @test @TestCase_3564 @ALM_VR_TC_60
  Scenario: Canceling add complementary tests
    And   I open the menu and add new line of complementary test
    And   I add all data correctly for add the complementary test with the reception date "5052024" description "QATest"
    Then  I cancel the creation new complementary test
    Then  I check the creation of test is cancelled

  @test @TestCase_3556 @ALM_VR_TC_422
  Scenario: Successful Add Complementary Tests
    And   I open the menu and add new line of complementary test
    And   I add all data correctly for add the complementary test with the reception date "5052024" description "QATest"
    And   I save the new complementary test
    Then  I check that the new test added correctly
    Then  I delete the test added recently

  @test @TestCase_3576 @ALM_VR_TC_423
  Scenario: Add a complementary tests with empty required fields
    And   I open the menu and add new line of complementary test
    And   I add all data less test field for add the complementary test with the reception date "5052024" description "QATest"
    Then  I check the save button doesn't appear




