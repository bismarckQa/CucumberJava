#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Configuration_Complementary_Tests


Feature: Add Complementary Test

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    And   I verify that the user configuration opened correctly


  @test @TestCase_4041  @ALM_VR_TC_53
  Scenario: Cancelling add complementary test
    Then  I try to create a new supplementary test, but I select cancel

  @test @TestCase_4040  @ALM_VR_TC_438
  Scenario: Successful add Complementary test
    Then  I created the Supplementary Test successfully

  @test @TestCase_4043  @ALM_VR_TC_439
  Scenario: Duplicated record
    Then  I am trying to duplicate a saved Test, but The system will not save the new supplementary test

  @test @TestCase_4042  @ALM_VR_TC_440
  Scenario: Add new complementary test with required fields empty
     