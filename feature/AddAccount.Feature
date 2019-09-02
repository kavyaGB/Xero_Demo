Feature: To validate if Xero user can add ANZ (NZ) bank account 
  As a Xero user, In order to manage my business successfully
  I should be able to add ANZ (NZ) bank account inside my Xero organisation 
  
  Scenario: Adding ANZ (NZ) bank account in Xero organisation
    Given User is on the home page
    When User clicks on Login button
    And User enters valid Username, Password
    Then Complete login with Authenticator app page displayed
    Given Authentication page loaded successfully
    When User enters Authentication code
    Then Demo organisation landing page displayed
    Given User navigates to Accounting, Bank accounts,, using system tab
    When User clicks on Add bank account, search for ANZ (NZ) bank
    And User enters Account Name, Account Type, Account Number
    And The user clicks on I've got a form, I'll do it later, Go to dashboard
    Then Account added succesfully
    