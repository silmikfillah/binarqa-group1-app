@Login
Feature: Login
  As a user, I want to login in Secondhand Store app

  @LGN01
  Scenario Outline: Verify to login using valid credentials
    Given I already register an account and on the login page
    When I input email with <email>
    And I input password with <password>
    And I tap Masuk button
    Then I should see the next step <status>

    Examples: 
      | email                    | password  | status  |
      | silmi.k.fillah@gmail.com |  12345678 | success |
      | groupsatu@gmail.com      | abc!12345 | success |

  @LGN02 @LGN05
  Scenario Outline: Verify to login using invalid email
    Given I already register an account and on the login page
    When I input email with <email>
    And I input password with <password>
    And I tap Masuk button
    Then I should see the next step <status>

    Examples: 
      | email                   | password  | status      |
      | unregistered@gmail.com  |  12345678 | incorrect   |
      | incorrectmail@gmail.com |  12345678 | incorrect   |
      |                         |  12345678 | empty email |
      | groupsatu@gm            |  12345678 | invalid     |
      | aa@ss                   |  12345678 | invalid     |
      | namaku1357.com          | abc!12345 | invalid     |
      | namaku1357gmail         | abc!12345 | invalid     |

  @LGN03
  Scenario Outline: Verify to login without enter any data into the fields
    Given I already register an account and on the login page
    When I input email with <email>
    And I input password with <password>
    And I tap Masuk button
    Then I should see the next step <status>

    Examples: 
      | email | password | status      |
      |       |          | empty email |

  @LGN04
  Scenario Outline: Verify to login with correct email and incorrect password
    Given I already register an account and on the login page
    When I input email with <email>
    And I input password with <password>
    And I tap Masuk button
    Then I should see the next step <status>

    Examples: 
      | email               | password | status    |
      | groupsatu@gmail.com | abc!!!22 | incorrect |
