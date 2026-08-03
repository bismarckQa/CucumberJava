#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Configuration_Complementary_Tests

Feature: Modify Complementary Test

Background:
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    And   I verify that the user configuration opened correctly

  @test @TestCase_4055 @ALM_VR_TC_59
  Scenario: Successfully edit complementary test
    Then  I successfully modified the complementary test  

  @test @TestCase_4056 @ALM_VR_TC_450
  Scenario: Cancelling edit complementary test
    Then  I try to edit the supplementary test, but the editing is cancelled

  @test @TestCase_4057 @ALM_VR_TC_451
  Scenario: Edit complementary test without required fields

  @test @TestCase_4058 @ALM_VR_TC_452
  Scenario: Duplicated record 
    Then  I try to edit the complementary test by duplicating it, but the system shows an alert that it is not possible

