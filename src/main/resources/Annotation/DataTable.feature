Feature: Data Table
  new user registration is unsuccessful after incorrect credentials.
  Scenario: Facebook registration unsuccessful
    Given User is logged in facebook registration page
    When User enters invalid data on page
    | Fields | values |
    | FirstName | test |
    | SurName    | user1     |
    | mobile_number | 123456789 |
    | newPassword   | password1 |
    Then User registration must be unsuccessful

