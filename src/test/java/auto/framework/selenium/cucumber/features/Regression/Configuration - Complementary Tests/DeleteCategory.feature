#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Configuration_Complementary_Tests



Feature: Delete Category 

Background:
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    And   I verify that the user configuration opened correctly


  @test @TestCase_4037  @ALM_VR_TC_54
  Scenario: Successful delete category
    Then  I successfully deleted the selected category

  @test @TestCase_4038  @ALM_VR_TC_441 
  Scenario: Cancelling delete category
    Then  I try to delete a category, but it cancels it

  @test @TestCase_4047  @ALM_VR_TC_442
  Scenario: Delete category that is referenced
    Then  I trying to delete a related category, but the warning says it's not possible