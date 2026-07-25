Feature: Delete Complementary test

  @test @regression
  Scenario: Canceling a deleted complementary test
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    And   I open the menu and add new line of complementary test
    And   I add all data correctly for add the complementary test with the reception date "5052024" description "QATest"
    And   I save the new complementary test
    When  I push in delete complementary test
    And   Confirmation windows open but I push in No
    Then  The test not deleted

  @test @regression
  Scenario: Successful deleted complementary test
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    When  I push in delete complementary test
    And   Confirmation windows open but I push in yes
    Then  The test deleted correctly

  @test @regression
  Scenario: Warning message when trying to delete a complementary test with an Access. The user should not be able to delete the registry.
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    And   I open the menu and add new line of complementary test
    And   I add all data correctly for add the complementary test with the data record "5052024" the reception date "11052024" description "QATest"
    And   I save the new complementary test
    And   I open Accesses module
    And   I click location accesses
    And   I add all data correctly for add the Access Data with the access type "Catéter percutáneo femoral" and comment "QATestAccess"
    And   I Add New Additional Test
    When  I save the Access Data Implantation
    And   The See Further Test showed
    And   I click See Further Test and then click attached test
    And   I check the test is correctly filtered
    And   I try to delete the complementary test
    Then  The alert showed because there is relation

  @test @regression
  Scenario: Canceling deleted complementary test related to an access
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    And   I try to delete the complementary test
    Then  The alert showed because there is relation
    Then  The test not deleted

  @test @regression
  Scenario: Delete data created of Accesses and Additional studies
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

  @test @regression
  Scenario: Warning message when trying to delete a complementary test with a waiting list. The user should not be able to delete the registry.
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    And   I open the menu and add new line of complementary test
    And   I add all data correctly for add the complementary test with the data record "5052024" the reception date "11052024" description "QATest"
    And   I save the new complementary test
    And   I open Waiting List module
    When  I open the menu and add new line of waiting List
    And   I add all data correctly for add the waiting list with this data: organ "Prueba Activo", situation "Activo", hospital list "Prueba", origin hospital "Hospital de Txagorritxu" and level of urgency "Normal"
    And   I save the new waiting list
    And   I attached the additional study with the waiting list created
    And   I select the additional study created and associate with waiting list
    And   I open Complementary tests module
    And   I try to delete the complementary test
    And   The alert showed because there is relation

  @test @regression
  Scenario: Canceling deleted complementary test related to a waiting list
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    And   I try to delete the complementary test
    And   The alert showed because there is relation
    And   The test not deleted
    When  I push in delete complementary test
    And   Confirmation windows open but I push in No
    Then  The test not deleted

  @test @regression
  Scenario: Delete data created of waiting list and Additional studies
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Waiting List module
    And   I open the menu and delete waiting list
    When  The confirmation windows open, I write password of "login_baxter" credentials and "Test" of waiting list
    And   I accept delete access and accept information window of waiting list
    And   I logout of Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    Then  I delete the test added recently

  @test @regression
  Scenario: Warning message when trying to delete a complementary test with an Hospitalization. The user should not be able to delete the registry
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    And   I open the menu and add new line of Hospitalization
    And   I add all data correctly for add the Hospitalization with this data: Date of admission "11062024", Type of admission "Programado", Hospital "Can Ruti", Physician "Abbondanza , Gianni" and Reason for admission "Test"
    And   I save the new Hospitalization
    And   I open Complementary tests module
    And   I open the menu and add new line of complementary test
    And   I add all data correctly for add the complementary test with the data record "12062024" the reception date "12062024" description "QATest"
    And   I save the new complementary test
    And   I open Hospitalization module
    And   I attached the additional study with the Hospitalization created
    And   I select the additional study created and associate with Hospitalization
    And   I open Complementary tests module
    And   I try to delete the complementary test
    And   The alert showed because there is relation

  @test @regression
  Scenario: Canceling deleted complementary test related to a Hospitalization
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    And   I try to delete the complementary test
    And   The alert showed because there is relation
    And   The test not deleted
    When  I push in delete complementary test
    And   Confirmation windows open but I push in No
    Then  The test not deleted

  @test @regression
  Scenario: Delete data created of Hospitalization and Additional studies
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    And   I remove the additional study with the Hospitalization
    And   I select the additional study created and remove the associate with Hospitalization
    Then  I remove the Hospitalization created
    When  I open Complementary tests module
    Then  I delete the test added recently











