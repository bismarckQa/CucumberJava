Feature: Add Final Signature

  @test @regression
  Scenario: Adapt the functionality of the required field configuration only for the treatment finalization
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I adapt the configuration to the required fields to complete the treatment
    And   I open HD Treatment module
    Then   I create a simple new treatment if it does not exist
    And   I trying to finish the treatment but I must complete the required fields

  @test @regression
  Scenario: Add final signature with Nephrologist profile
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Treatment module
    Then   I create a simple new treatment if it does not exist
    And   I make the final signature with the nephrologist field

  @test @regression
  Scenario: Add final signature with Nephrologist profile (finalized treatment)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Treatment module
    Then   I create a simple new treatment if it does not exist
    And   I finish Final signature, the system must allow using read-only mode

  @test @regression
  Scenario: Show an extract the prescription changes of the treatment on the final notes
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Treatment module
    Then   I create a simple new treatment if it does not exist
    And   I make changes to the fields defined in the treatment prescription

  @test @regression
  Scenario: Add final signature with nurse profile
    Given I open the Baxter website
    And   I try to login with "login_baxter_nurse" credentials
    And   I login successful
    And   I Select the Group of patients "All patients"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open the HD Treatment module with a nurse profile
    Then  I create a simple new treatment if it does not exist
    And   I close the treatment with the nephrologist signature field not required