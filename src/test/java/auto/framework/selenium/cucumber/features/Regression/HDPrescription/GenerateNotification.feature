#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@HD_Prescription

Feature: Generate a Notification HD Prescription

Background:
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly

  @test @ALM_VR_TC_550
  Scenario: configure notification profile to generate with new HD prescription
    And   I configure the notification profile to generate it with new HD prescription

  @test @ALM_VR_TC_551
  Scenario: New HD Prescription is created, a notification is generated
    Then  I create a new simple prescription
    And   I check the bell symbol and its value increases by one

  @test @ALM_VR_TC_552
  Scenario: HD Prescription is modified, a Notification indicates the change
    Then  I create a new modified simple prescription.
    And   I check the bell symbol and its value increases by one

  @test @ALM_VR_TC_553
  Scenario: New HD Prescription is created but notification is not generated
    Then  I create a new simple prescription
    And   I check the bell symbol and its value does not increase by one.