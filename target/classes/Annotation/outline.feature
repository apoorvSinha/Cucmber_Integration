Feature: This is to prevent replicating of steps
  Background: user navigates to Facebook page
    Given I am on Facebook page
    #scenario with And
  Scenario:
    When I enter username as "Tom"
    And I enter password as "Jerry"
    Then login should fail
    #Scenario with But
  Scenario:
    When I enter username as "apoorvlifeok@outlook.com"
    And I enter password as "Vs_cJ8wMR5C5U4r"
    Then login should fail
    But relogin option should be available
