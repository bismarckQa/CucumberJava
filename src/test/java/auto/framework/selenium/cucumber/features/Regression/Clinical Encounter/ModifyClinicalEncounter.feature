#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Clinical_Encounter

Feature: Modify clinical encounter

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Reviews module
    Then  I check the module Reviews appear correctly


  @test @Test_case_3382 @ALM_VR_TC_672
  Scenario: Canceling an edited clinical encounter
    And   I create successful new review "Qa test case"
    And   I verify that the new review was created
    And   I try to edit the review created but I cancel it "Editing data"
    Then  I successfully delete the review created

  @test @Test_case_3383 @ALM_VR_TC_673
  Scenario: Successful edited clinical encounter (Physician profile)
    And   I create successful new review "Qa test case"
    And   I verify that the new review was created
    And   I edit the review created successful "Editing data but cancel"
    Then  I successfully delete the review created

  @test @Test_case_3384 @ALM_VR_TC_674
  Scenario: Edit clinical encounter with empty required fields
    And   I create successful new review "Qa test case"
    And   I verify that the new review was created
    And   I try to edit review with the required fields empty "Editing data empty fields"
    Then  I successfully delete the review created