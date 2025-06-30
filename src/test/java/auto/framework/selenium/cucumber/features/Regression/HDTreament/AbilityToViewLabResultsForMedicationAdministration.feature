#project name
@VersiaRenal
#Module
@HDTreatment

Feature: Ability to View Lab Results for medication administration


  @test @regression
  Scenario: Add configuration for laboratory result options in "HD Therapy" section
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    Then  I select an active lab profile and date range and save them



  @test @regression
  Scenario: Clone Add configuration for laboratory result options in "HD Therapy" section
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    Then  I select an active lab profile and date range and save them
