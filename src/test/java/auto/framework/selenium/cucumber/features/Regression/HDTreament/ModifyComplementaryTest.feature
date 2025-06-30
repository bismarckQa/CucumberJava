Feature: Regression Test Modify Complementary Test

  @test @ModifyComplementaryTest
  Scenario: Canceling and edited complementary test
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    And   I open the menu and add new line of complementary test
    And   I add all data correctly for add the complementary test with the reception date "5052024" description "QATest"
    And   I save the new complementary test
    And   I logout of Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    Then  I check that the new test added correctly
    And   I edit complementary test added recently
    And   I add all data correctly for add the complementary test with the reception date "1352024" description "QATestEdit"
    And   I Cancel the edition of this complementary test
    And   I logout of Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    Then  I Check that the changes not saved
    Then  I delete the test added recently

  @test @ModifyComplementaryTest
  Scenario: Edit a complementary test with empty required fields
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    And   I open the menu and add new line of complementary test
    And   I add all data correctly for add the complementary test with the reception date "5052024" description "QATest"
    And   I save the new complementary test
    And   I logout of Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    Then  I check that the new test added correctly
    And   I edit complementary test added recently
    And   I delete the Date of Record
    Then  I check the save button doesn't appear
    And   I logout of Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    Then  I Check that the changes not saved
    Then  I delete the test added recently




  @test @ModifyComplementaryTest
  Scenario: Successful edited complementary test
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    And   I open the menu and add new line of complementary test
    And   I add all data correctly for add the complementary test with the reception date "5052024" description "QATest"
    And   I save the new complementary test
    And   I logout of Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    Then  I check that the new test added correctly
    And   I edit complementary test added recently
    And   I add all data correctly for add the complementary test with the reception date "6062024" description "QATestEdit"
    And   I save the new complementary test
    And   I logout of Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    Then  I check that the new test added correctly with description QATestEdit
    Then  I delete the test added recently



  @test @ModifyComplementaryTest
  Scenario: Check the Server Functionality to CREATE data in Complementary Test
    Given I open the Baxter website
    And   I try to login with "login_baxter_t" credentials
    And   I login successful
    And   I Select the Group of patients "Pacientes en HD"
    When  I select the patient "M16 M17, M15 - 5216135"
    And   I open Complementary tests module
    And   I open the menu and add new line of complementary test
    And   I add all data correctly for add the complementary test with the reception date "5052024" description "QATest"
    And   I save the new complementary test
    And   I logout of Baxter website
    And   I try to login with "login_baxter_t" credentials
    And   I login successful
    And   I Select the Group of patients "Pacientes en HD"
    When  I select the patient "M16 M17, M15 - 5216135"
    And   I open Complementary tests module
    And   I edit complementary test added recently
    And   I add all data correctly for add the complementary test with the reception date "6062024" description "QATestEdit"
    And   I save the new complementary test
    And   I logout of Baxter website
    And   I try to login with "login_baxter_t" credentials
    And   I login successful
    And   I Select the Group of patients "Pacientes en HD"
    When  I select the patient "M16 M17, M15 - 5216135"
    And   I open Complementary tests module
    Then  I check that the new test added correctly with description QATestEdit
    Then  I delete the test added recently
