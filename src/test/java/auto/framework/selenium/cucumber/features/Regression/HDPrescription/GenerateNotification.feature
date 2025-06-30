Feature: Generate a Notification HD Prescription

  @test @regression
  Scenario: configure notification profile to generate with new HD prescription
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I configure the notification profile to generate it with new HD prescription

  @test @regression
  Scenario: New HD Prescription is created, a notification is generated
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    Then  I create a new simple prescription
    And   I check the bell symbol and its value increases by one

  @test @regression
  Scenario: HD Prescription is modified, a Notification indicates the change
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    Then  I create a new modified simple prescription.
    And   I check the bell symbol and its value increases by one

  @test @regression
  Scenario: New HD Prescription is created but notification is not generated
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I clean the notification profile settings to generate it with a new HD prescription
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    Then  I create a new simple prescription
    And   I check the bell symbol and its value does not increase by one.