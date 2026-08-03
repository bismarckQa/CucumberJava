#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Configuration_Complementary_Tests

Feature: Modify Category
Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    And   I verify that the user configuration opened correctly



  @test @TetsCase_4048 @ALM_VR_TC_57
  Scenario: Cancelling edit category
    Then  I try to edit the selected category, but I cancel it

@test @TetsCase_4049 @ALM_VR_TC_447
  Scenario: Successful edit category
    Then  I edit the category successfully

  @test @TetsCase_4051 @ALM_VR_TC_448
  Scenario: Duplicated record
    Then  I try to Edit by duplicating a category, but the system shows an alert that it is not possible
 
 
 @test @TetsCase_4052 @ALM_VR_TC_449
  Scenario: Required fields are empty
  
