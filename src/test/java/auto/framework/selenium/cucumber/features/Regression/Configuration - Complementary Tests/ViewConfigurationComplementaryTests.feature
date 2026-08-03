#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Configuration_Complementary_Tests

Feature: View Configuration Complementary Tests

Background:
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user


  @test @TestCase_4061 @ALM_VR_TC_62
  Scenario: View Categories
    And   I verify that the user configuration opened correctly
    Then  I will be able to view all the category records

  @test @TestCase_4062 @ALM_VR_TC_433
  Scenario: View Complementary tests
    And   I verify that the user configuration opened correctly
    Then  I will be able to view all the tests records


  @test @TestCase_4063 @ALM_VR_TC_434
  Scenario: View relation Categories Tests
    And   I verify that the user configuration opened correctly
    Then  I will be able to view all the categories tests records