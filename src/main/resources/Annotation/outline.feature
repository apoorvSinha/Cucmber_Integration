Feature: This is to prevent replicating of steps
  Background: user navigates to Facebook page
    Given I am on Facebook page
    #scenario with And
#  Scenario:
#    When I enter username as "Tom"
#    And I enter password as "Jerry"
#    Then login should fail
    #Scenario with But
  Scenario Outline: Login functionality for a social networking site
    When I enter username as "<username>"
    And I enter password as "<password>"
    Then login should fail
    But relogin option should be available
    Examples:
      | username  | password  |
      | username1 | password1 |
      | username2 | password2 |