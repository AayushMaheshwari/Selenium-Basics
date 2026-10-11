Feature: Login to test login functionality

  @SmokeTest
  Scenario: Login with valid credentials
    Given user is on login page
    When user enters username and password
    And user clicks on login button
    Then user is navigated to homepage
