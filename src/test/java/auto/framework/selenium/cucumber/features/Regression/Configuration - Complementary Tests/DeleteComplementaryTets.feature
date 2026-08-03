#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Configuration_Complementary_Tests

Feature: Delete Complementary Test

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    And   I verify that the user configuration opened correctly

  @test @TestCase_4045 @ALM_VR_TC_443
  Scenario: Cancelling delete complementary test
   Then  I try to delete the supplementary test, but I cancel deleting

  @test @TestCase_4044 @ALM_VR_TC_444
  Scenario: Successful delete complementary test
    Then  I successfully removed the Supplementary Test

  @test @TestCase_4046 @ALM_VR_TC_445
  Scenario: Delete complementary test that is referenced
    Then  I try to delete the referenced complementary test, but the system does not allow it.