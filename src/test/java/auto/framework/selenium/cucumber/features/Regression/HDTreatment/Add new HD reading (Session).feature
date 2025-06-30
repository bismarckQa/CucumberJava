Feature: Add new HD reading (Session)

  @test @smoke
  Scenario: Delete a active HD Treatment
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Treatment module
    And   I open three buttons
    When  I click remove the actual treatment
    And   I accept the delete Alert windows, fill the data and the reason "TestQA"

  @test @smoke
  Scenario: Cancelling a active HD Treatment
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Treatment module
    And   I open three buttons
    When  I click remove the actual treatment
    And   I cancel remove in alert window

  @test @smoke
  Scenario: Delete a finalized HD Treatment (treatment must finalised)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Treatment module
    And   I open three buttons
    When  I click remove the actual treatment
    And   I accept the delete Alert windows, fill the data and the reason "TestQA"

    











