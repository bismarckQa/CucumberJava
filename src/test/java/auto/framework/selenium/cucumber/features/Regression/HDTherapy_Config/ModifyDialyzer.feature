#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy
Feature: Modify Dialyzer
  @test @TestCase_2683
  Scenario: Empty Model Field
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button dialyzer section
    When  I looking for the model to edit with the name: "Test_full_data"
    And   I click button three points dialyzer
    And   I click button edit dialyzer
    And   I clean the model field
    And   I click button three points dialyzer
    Then  I click button cancel add new dialyzer

  @test @TestCase_2684
  Scenario: Empty Manufacturer field
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I click button Ok in modal error
    And   I open options of user
    Then  I enter into user configuration options
    And   I click button Ok in modal error
    And   I successfully opened the HD Therapy module
    And   I click button dialyzer section
    When  I looking for the model to edit with the name: "Test_full_data"
    And   I click button three points dialyzer
    And   I click button edit dialyzer
    And   I clean the manufacturer field
    And   I click button three points dialyzer
    Then  I click button cancel add new dialyzer

  @test @TestCase_2685
  Scenario: Empty Model and Manufacturer Fields
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I click button Ok in modal error
    And   I open options of user
    Then  I enter into user configuration options
    And   I click button Ok in modal error
    And   I successfully opened the HD Therapy module
    And   I click button dialyzer section
    When  I looking for the model to edit with the name: "Test_full_data"
    And   I click button three points dialyzer
    And   I click button edit dialyzer
    And   I clean the model field
    And   I clean the manufacturer field
    And   I click button three points dialyzer
    Then  I click button cancel add new dialyzer

  @test @TestCase_2686
  Scenario: All required data
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button dialyzer section
    When  I looking for the model to edit with the name: "Test_full_data"
    And   I click button three points dialyzer
    And   I click button edit dialyzer
    Then  I edit the necessary data in Dialyzer "Test_dialyzer_modified"
    And   I click button three points dialyzer
    And   I click button save new dialyzer
    And   I click button arrow up

  @test @TestCase_2687
  Scenario: Set dialyzer as inactive
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button dialyzer section
    When  I looking for the model to edit with the name: "Test_dialyzer_modified"
    And   I click button three points dialyzer
    And   I click button edit dialyzer
    And   I select or unselect the dialyzer checkbox if it is "inactive"
    And   I click button three points dialyzer
    And   I click button save new dialyzer
    And   I click button arrow up
    Then  I click the checkbox to show all inactive dialyzers
    And   I looking for the model to edit with the name: "Test_dialyzer_modified"


  @test @TestCase_2688
  Scenario: Set dialyzer as active
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button dialyzer section
    Then  I click the checkbox to show all inactive dialyzers
    When  I looking for the model to edit with the name: "Test_Complet_data"
    And   I click button edit dialyzer
    And   I select or unselect the dialyzer checkbox if it is "active"
    And   I click button save new dialyzer
    And   I click button arrow up
    Then  I click the checkbox to show all inactive dialyzers
    When  I looking for the model to edit with the name: "Test_Complet_data"
