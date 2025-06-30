Feature: Add New Additional Signature


    @test @regression
    Scenario: Check whether in the Hd treatment tab, the field "signed by" in the "additional signatures" section is filled if the user is a nurse
        Given I open the Baxter website
        And   I try to login with "login_baxter_nurse" credentials
        And   I login successful
        And   I Select the Group of patients "All patients"
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open the HD Treatment module with a nurse profile
        Then  I create a simple new treatment if it does not exist
        And   I check if the “signed by” field in the “additional signatures” section is complete if the user is a nurse

    @test @regression
    Scenario: Add additional signature (Finalized treatment Nurse profile)
        Given I open the Baxter website
        And   I try to login with "login_baxter_nurse" credentials
        And   I login successful
        And   I Select the Group of patients "All patients"
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open the HD Treatment module with a nurse profile
        Then  I create a simple new treatment if it does not exist
        And   I check Final Signature and Additional Signatures, the system should allow using read-only mode


    @test @regression
    Scenario: Add additional signature (finalized treatment nephrologist profile)
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open HD Treatment module
        Then  I create a simple new treatment if it does not exist
        And   I try to close the treatment without the nephrologist's signature and it shows me an alert
