Feature: Delete HD Prescription

  @test @regression
  Scenario: Delete Active HD Prescription (prescription used in a treatment)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    And   I try to delete the prescription because it already has treatment records associated with it


  @test @regression
  Scenario: Cancelling a deleted active HD Prescription
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    And   I tried to delete the active description but I canceled


  @test @regression
  Scenario: Successful delete active HD Prescription
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    And   I successfully delete the active prescription
