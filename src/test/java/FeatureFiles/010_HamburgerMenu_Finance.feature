Feature: Hamburger Menu Finance

  Background:
    Given Go to the Campus test website and log in
    Then Go to the My Finance page
    And Verify that user financial information is displayed

  Scenario: Fee Payment
    And Go to the payment page
    Then Check the functionality of payment options
    And Enter the card details and make the payment
    Then Payment success message should be displayed
    And Verify that the values are updated on the finance page
    Then Check the Fee Balance Detail button on the payment page
    And Verify the message confirming the successful payment in the message box