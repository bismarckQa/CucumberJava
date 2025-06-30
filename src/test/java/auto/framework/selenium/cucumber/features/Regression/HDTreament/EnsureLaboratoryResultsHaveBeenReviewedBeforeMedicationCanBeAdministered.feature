Feature: Ensure laboratory result have been reviewed before medication can be administered


  @test @regression
  Scenario: Add a confirmation that the lab results have been reviewed by the user before administering a medication
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Treatment module
    Then  I try in the pop-up window, administer the medication, confirm with the checkbox, review the lab results, and then add