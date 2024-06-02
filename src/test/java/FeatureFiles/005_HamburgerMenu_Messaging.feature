Feature:

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully
    And Checkout Hamburger Menu

  Scenario: Navigate to the Hamburger Menu Messaging Functionality
    Given Click on the New Message button
    When User should be redirected to the new message page
    Then User clicks on the Add Receiver button
    And The user select receivers
    And User clicks on the Add & Close button and user should see the success message
    Then Enter subject to the new message
    And Enter message to the text and attach a file to it.
    And Click on the Send button and user should see the success message
