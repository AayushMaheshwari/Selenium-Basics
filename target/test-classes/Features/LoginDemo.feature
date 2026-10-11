Feature: Test login functionality

  Background:
    Given browser is open
    And user is on login page

  Scenario: Check login is available to login
    Then user should see the login page

  Scenario Outline: Check login is successful with valid credentials
    When user enters <username> and <password>
    Then user is navigated to the home page

    Examples:
      | username | password    |
      | student  | Password123 |
