Feature: View Complementary Test

  @test @regression
  Scenario: Automatic filter of Complementary Tests from Access section
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
    Then  I check the test is correctly filtered

  @test @regression
  Scenario: Automatic filter of Complementary Tests from Access section
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    And   I open the menu and filter
    And   I filter category test 1
    Then  Check filter correctly

  @test @regression
  Scenario: Without filtering Complementary Tests by its Categories
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    And   I open the menu and filter
    And   I check if not select filter all complementary test showed



