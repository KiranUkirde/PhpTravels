Feature: To verify login functionality

  Scenario: To validate customer is able to login successfully
    Given Customer is on login page
    When Customer logged in with valid credentials
    And Customer logged out and re login
    Then Customer name "Kiran" is displayed on homepage



