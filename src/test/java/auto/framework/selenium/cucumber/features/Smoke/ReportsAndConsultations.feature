Feature: Reports and Consultations Module
  @test @smoke
  Scenario: Check Reports and Consultations
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open options of user
    And   I open Reports and consultations
    Then  Reports and Consultations open correctly
