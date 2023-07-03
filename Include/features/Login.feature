@Login
Feature: Android User Login
  As a user, I want to login in Secondhand Store app

  @LGN01 @Positive
  Scenario Outline: Verify to login using valid credentials
    Given I already register an account and on the login page
    When I input email with <email>
    And I input password with <password>
    And I tap Masuk button
    Then I should see the next step <status>

    Examples: 
      | email               | password  | status  |
      | groupsatu@gmail.com | abc!12345 | success |

  @LGN02 @LGN05 @Negative
  Scenario Outline: Verify to login using invalid email: <condition>
    Given I already register an account and on the login page
    When I input email with <email>
    And I input password with <password>
    And I tap Masuk button
    Then I should see the next step <status>

    Examples: 
      | email                  | password  | status      | condition                 |
      | unregistered@gmail.com |  12345678 | incorrect   | unregistered email        |
      | groupsatuuuu@gmail.com |  12345678 | incorrect   | wrong email               |
      | empty                  |  12345678 | empty email | empty email               |
      | groupsatu@yahoo        |  12345678 | invalid     | non-tld email             |
      | namaku1357.com         | abc!12345 | invalid     | without @                 |
      | namaku1357gmail        | abc!12345 | invalid     | without @ and without tld |

  @LGN03 @Negative
  Scenario Outline: Verify to login without enter any data into the fields
    Given I already register an account and on the login page
    When I input email with <email>
    And I input password with <password>
    And I tap Masuk button
    Then I should see the next step <status>

    Examples: 
      | email | password | status      |
      | empty | empty    | empty email |

  @LGN04 @Negative
  Scenario Outline: Verify to login with correct email and incorrect password
    Given I already register an account and on the login page
    When I input email with <email>
    And I input password with <password>
    And I tap Masuk button
    Then I should see the next step <status>

    Examples: 
      | email               | password | status         |
      | groupsatu@gmail.com | abc!!!22 | incorrect      |
      | groupsatu@gmail.com | a12q     | invalid pass   |
      | groupsatu@gmail.com | empty    | empty password |
