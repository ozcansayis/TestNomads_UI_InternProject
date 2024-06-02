Feature: Calendar Feature 2

  Scenario: Calendar Contents
    Given the user navigates to the website and logs in
    And the user navigates to weekly course plan section
    When the user clicks a lesson that has been published
    And the user clicks the Recording button
    Then the user should access the course video
    When the user clicks the Play icon
    Then the user should start watching the video