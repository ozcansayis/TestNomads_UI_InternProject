Feature: Calendar Feature 1

  Scenario: Calender Restrictions
    Given the user navigates to the website and logs in
    And the user navigates to weekly course plan section
    When the user clicks a lesson that has not yet been published
    Then the user should see the required information and the corresponding message
    When the user clicks a lesson that has been published
    Then the user should see the necessary information