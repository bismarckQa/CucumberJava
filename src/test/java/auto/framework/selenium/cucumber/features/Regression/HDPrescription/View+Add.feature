Feature: View + Add HD Prescription

  @test @regression
  Scenario: New Access
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I click location accesses
    When  I create a new jugular catheter type access: Access Type "Catéter percutáneo yugular", Location "Muñeca izquierda", Comment "QA test"
    Then  I save the Access Data Implantation

  @test @regression
  Scenario: View + Add HD Prescription
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    And   I check the information that in the field Prescribe by