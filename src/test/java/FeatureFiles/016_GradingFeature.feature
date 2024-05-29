Feature: Grading Feature
  Scenario: See lecture notes and transcripts.
    Given the user navigates to the website and logs in
    When the user clicks grading
    Then the user clicks course grade
    And the user clicks student transcript
    When the user clicks transcript by subject