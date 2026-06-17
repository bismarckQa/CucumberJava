
Feature: Regression Test Add New Complementary Test

  @test @regression
  Scenario: Canceling an added complementary tests
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    And   I open the menu and add new line of complementary test
    And   I add all data correctly for add the complementary test with the reception date "5052024" description "QATest"
    Then  I cancel the creation new complementary test
    Then  I check the creation of test is cancelled

  @test @regression
  Scenario: Successful Added Complementary Tests
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    And   I open the menu and add new line of complementary test
    And   I add all data correctly for add the complementary test with the reception date "5052024" description "QATest"
    And   I save the new complementary test
    Then  I check that the new test added correctly
    Then  I delete the test added recently

  @test @regression
  Scenario: Add a complementary tests with empty required fields
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    And   I open the menu and add new line of complementary test
    And   I add all data less test field for add the complementary test with the reception date "5052024" description "QATest"
    Then  I check the save button doesn't appear


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
    Then  I check that the new test added correctly
    Then  I delete the test added recently

