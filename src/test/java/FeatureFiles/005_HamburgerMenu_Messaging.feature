Feature:

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully
    And Checkout Hamburger Menu
  Scenario:
    Given Click new message button
    When Click AddReceiver button
    Then Enter Text
    And Checkout Sended Message