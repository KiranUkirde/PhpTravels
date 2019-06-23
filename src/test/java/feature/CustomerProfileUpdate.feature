Feature: Customer profile update
  @RegressionTest
  Scenario: To verify customer is able to update his/her profile
    Given Customer is on login page
    When Customer logged in with valid credentials
    And Customer update phone number as "+31619445369"
    Then Customer is able to see new updates