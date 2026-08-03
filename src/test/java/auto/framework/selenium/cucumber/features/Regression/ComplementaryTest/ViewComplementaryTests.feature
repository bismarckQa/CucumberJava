#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Complementary_Test


Feature:View Complementary Tests

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module



  @test @TestCase_3647 @ALM_VR_TC_61
  Scenario: Successful view complementary tests
   And   I open the menu and filter
   And   I filter category test 1
   And   I check if not select filter all complementary test showed
   

 
   



