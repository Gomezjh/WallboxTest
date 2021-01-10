Feature: Login Scenarios Wallbox App


  Scenario Outline: Login with invalid credentials
      When user enters username as "<username>"
      And user enters password as "<password>"
      And User clicks on login button
      Then Error message is displayed "<error>"
      Examples:
        | username                  | password        | error                                                |
        | jhonierge@hotmail.com     | invalidpass     | The email or password you have entered is not correct|
        | nouser@hotmail.com        | Validpass78     | The email or password you have entered is not correct|


    Scenario:  Login with invalid email format
      When user enters username as "jhonierge.com"
        And user enters password as "Validpass78"
        And User clicks on login button
        Then Error message is displayed "Entered email is not valid. Please try again."

  Scenario Outline: Login with missing field
    When user enters username as "<username>"
    And user enters password as "<password>"
    And User clicks on login button
    Then Error message is displayed "<error>"
    Examples:
      | username                  | password        | error                                                    |
      | jhonierge@hotmail.com     |                 | There is a field missing. Please review it and try again.|
      |                           | Validpass78     | There is a field missing. Please review it and try again.|

  Scenario: Login successful
      When user enters username as "jhonierge@hotmail.com"
      And  user enters password as "Validpass78"
      And User clicks on login button
      Then app navigates to the welcome page and displays "WELCOME TO THE BEST EV CHARGING EXPERIENCE"
