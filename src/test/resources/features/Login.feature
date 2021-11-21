Feature: Login functionality

  Scenario: Login Successful

    Given the user is on the login page of the Para Bank application
    When the user enters the credentials
    And the user logs in
    Then the user is on the home page