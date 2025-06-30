Feature: Modify Category Configuration
  @test @smoke
  Scenario: Cancelling edit category
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    And   I verify that the user configuration opened correctly
    Then  I try to edit the selected category, but I cancel it

  @test @smoke
  Scenario: Duplicated record
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    And   I verify that the user configuration opened correctly
    Then  I try to Edit by duplicating a category, but the system shows an alert that it is not possible

  @test @smoke
  Scenario: Successful edit category
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    And   I verify that the user configuration opened correctly
    Then  I edit the category successfully
