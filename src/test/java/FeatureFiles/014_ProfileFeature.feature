Feature: Profile Feature

  Scenario: Change profile photo
    Given the user navigates to the website and logs in
    When the user clicks the profile picture and settings button
    Then the user clicks picture icon
    And the user clicks upload picture icon
    When the user selects picture from computer
    Then the user clicks upload and save button
    And the user verifies that the ricture was succesfully updated
