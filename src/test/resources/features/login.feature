Feature: Login Test

  Scenario: Valid Login
    Given User is on login page
    When User logs in
    Then User should be logged in
