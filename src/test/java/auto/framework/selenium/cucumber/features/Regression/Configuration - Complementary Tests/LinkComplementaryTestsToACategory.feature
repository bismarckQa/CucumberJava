#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Configuration_Complementary_Tests

Feature: Link Complementary Tests to a category
  @test @TestCase_4069 @ALM_VR_TC_56
  Scenario:  Add test to category
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    And   I verify that the user configuration opened correctly
    Then  I drag and drop any test from the left grid to the right

  @test @TestCase_4072 @ALM_VR_TC_446
  Scenario:  Remove test from category
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    And   I verify that the user configuration opened correctly
    Then  I Drag and drop the test from right to left