#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Complementary_Test


Feature: Delete Complementary test

Background:
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module

  @test @TestCase_3617 @ALM_VR_TC_55
  Scenario: Canceling a deleted complementary test
    When  I push in delete complementary test
    And   Confirmation windows open but I push in No
    Then  The test not deleted

  @test @TestCase_3616 @ALM_VR_TC_426
  Scenario: Successful deleted complementary test
    When  I push in delete complementary test
    And   Confirmation windows open but I push in yes
    Then  The test deleted correctly


  @test @TestCase_3622 @ALM_VR_TC_427
  Scenario: Canceling deleted complementary test related to  Hospitalization
    And   I try to delete the complementary test
    And   The alert showed because there is relation
    And   The test not deleted
    When  I push in delete complementary test
    And   Confirmation windows open but I push in No
    Then  The test not deleted  

   @test @TestCase_3621 @ALM_VR_TC_428
  Scenario: Sucessful deleted complementary test related to a hospitalization (Expired Test)
    And   I remove the additional study with the Hospitalization
    And   I select the additional study created and remove the associate with Hospitalization
    Then  I remove the Hospitalization created
    When  I open Complementary tests module
    Then  I delete the test added recently  

  
  @test @TestCase_3639 @ALM_VR_TC_429
  Scenario: Successful deleted complementary test related to a waiting list (Expired Test)
    And   I open the menu and delete waiting list
    When  The confirmation windows open, I write password of "login_baxter" credentials and "Test" of waiting list
    And   I accept delete access and accept information window of waiting list
    Then  I delete the test added recently  

  @test @TestCase_3640 @ALM_VR_TC_430
  Scenario: Canceling deleted complementary test related to a waiting list
    And   I try to delete the complementary test
    And   The alert showed because there is relation
    And   The test not deleted
    When  I push in delete complementary test
    And   Confirmation windows open but I push in No
    Then  The test not deleted 

  @test @TestCase_3641 @ALM_VR_TC_431
  Scenario: Successful deleted complementary test related to an access (Expired Test)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I open the menu and delete access
    When  The confirmation windows open, I write password of "login_baxter" credentials and "Test"
    And   I accept delete access and accept information window
    And   I open Complementary tests module
    Then  I delete the test added recently


  @test @TestCase_3642 @ALM_VR_TC_432
  Scenario: Cancelling deleted complementary test related to an access
    And   I try to delete the complementary test
    Then  The alert showed because there is relation
    Then  The test not deleted









 











