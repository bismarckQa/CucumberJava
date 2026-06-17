Feature: Add administered medication


  @test @regression
  Scenario: Add the most recent lab result table in HD Treatment - Medication Administration
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    Then  I configure the latest lab results by time interval
    And   I open HD Treatment module
    Then  I create a simple new treatment if it does not exist
    And   I review the information displayed under drugs and other


  @test @regression
  Scenario: Add configuration for laboratory result options in "HD Therapy" section
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    Then  I select laboratory results maximum date range


  @test @regression
  Scenario: Create new endpoint to get the last lab result for specific profile
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    Then  I select HD Therapy option in the configuration section
