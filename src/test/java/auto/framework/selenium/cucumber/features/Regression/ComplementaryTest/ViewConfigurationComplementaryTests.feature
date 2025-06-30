Feature: View Configuration Complementary Tests
  @test @smoke
  Scenario: View Categories
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    And   I verify that the user configuration opened correctly
    Then  I will be able to view all the category records

  @test @smoke
  Scenario: View Complementary tests
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    And   I verify that the user configuration opened correctly
    Then  I will be able to view all the tests records


  @test @smoke
  Scenario: View relation Categories Tests
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    And   I verify that the user configuration opened correctly
    Then  I will be able to view all the categories tests records