Feature:View prescription history

  @test @regression
  Scenario: View Prescription history
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    And   I check the current prescription, it is in green and the closed ones are in blue

