#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Configuration_Complementary_Tests


Feature: Add Category

Background:
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    And   I verify that the user configuration opened correctly


@test @TestCase_4029  @ALM_VR_TC_52
 Scenario: Add category without required fields   

@test @TestCase_4030  @ALM_VR_TC_435
Scenario: Cancelling add category
    Then  I try to add a new category of complementary tests, but I cancel the add

@test  @TestCase_4032  @ALM_VR_TC_436
Scenario: Successful add category
    Then  I successfully created a new Category

@test @TestCase_4034  @ALM_VR_TC_437
Scenario: Duplicated record
    Then  I try to duplicate a category, but I get a warning that it is not possible

