@Register
Feature: Android User Register
  As a user, I want to register in Secondhand Store app.

  @REG01 @Positive
  Scenario Outline: Verify to register using valid credentials
    Given I already installed the app and on the register page
    When I input nama for register <nama>
    And I input email for register <email>
    And I input password for register <password>
    And I input nomor hp with <nomor_hp>
    And I input kota with <kota>
    And I input alamat with <alamat>
    And I click Register button
    Then I should see the next step: <status> for register

    Examples: 
      | nama   | email  | password  | nomor_hp     | kota | alamat      | status  |
      | random | random | abc!12345 | 088811223344 | Sby  | Jln. Raya 1 | success |

  @REG02 @Negative
  Scenario Outline: Verify to register using invalid email: <condition>
    Given I already installed the app and on the register page
    When I input nama for register <nama>
    And I input email for register <email>
    And I input password for register <password>
    And I input nomor hp with <nomor_hp>
    And I input kota with <kota>
    And I input alamat with <alamat>
    And I click Register button
    Then I should see the next step: <status> for register

    Examples: 
      | nama       | email               | password  | nomor_hp     | kota | alamat      | status        | condition          |
      | Group Satu | groupsatu@gmail.com | abc!12345 | 088811223344 | Sby  | Jln. Raya 1 | registered    | already registered |
      | John Doe   | groupsatuyahoo.id   | abc!12345 | 088811223344 | Sby  | Jln. Raya 1 | invalid email | without @          |
      | Alan Kruss | groupsatu@mail      | abc!12345 | 088811223344 | Sby  | Jln. Raya 1 | invalid email | non-TLD            |
      | Charlotte  | empty               | abc!12345 | 088811223344 | Sby  | Jln. Raya 3 | empty email   | empty email        |
      | Mia Clark  | @rocketmail.com     | abc!12345 | 088811223344 | Sby  | Jln. Raya 3 | invalid email | without email name |

  @REG03 @Negative
  Scenario Outline: Verify to register without enter any data
    Given I already installed the app and on the register page
    When I input nama for register <nama>
    And I input email for register <email>
    And I input password for register <password>
    And I input nomor hp with <nomor_hp>
    And I input kota with <kota>
    And I input alamat with <alamat>
    And I click Register button
    Then I should see the next step: <status> for register

    Examples: 
      | nama  | email | password | nomor_hp | kota  | alamat | status     |
      | empty | empty | empty    | empty    | empty | empty  | empty nama |

  @REG04 @Negative
  Scenario Outline: Verify to register with invalid password: <condition>
    Given I already installed the app and on the register page
    When I input nama for register <nama>
    And I input email for register <email>
    And I input password for register <password>
    And I input nomor hp with <nomor_hp>
    And I input kota with <kota>
    And I input alamat with <alamat>
    And I click Register button
    Then I should see the next step: <status> for register

    Examples: 
      | nama       | email                | password | nomor_hp     | kota     | alamat      | status         | condition              |
      | Group Satu | kurangdari6@mail.com | 45a!     | 088811223344 | Surabaya | Jln. Raya 1 | invalid pass   | less than 6 characters |
      | Group Dua  | emptypass@test.com   | empty    | 088811223344 | Malang   | Jln. Raya 3 | empty password | empty password         |

  @REG05 @Negative
  Scenario Outline: Verify to register by leaving one field empty: <status>
    Given I already installed the app and on the register page
    When I input nama for register <nama>
    And I input email for register <email>
    And I input password for register <password>
    And I input nomor hp with <nomor_hp>
    And I input kota with <kota>
    And I input alamat with <alamat>
    And I click Register button
    Then I should see the next step: <status> for register

    Examples: 
      | nama       | email                 | password  | nomor_hp     | kota     | alamat      | status       |
      | empty      | namakosong@mail.com   | abc!12345 | 088811223344 | Denpasar | Jln. Raya 1 | empty nama   |
      | John Doe   | hpkosong@mail.com     | abc!12345 | empty        | Denpasar | Jln. Raya 1 | empty hp     |
      | Alan Kruss | kotakosong@mail.com   | abc!12345 | 088811223344 | empty    | Jln. Raya 1 | empty kota   |
      | Charlotte  | alamatkosong@mail.com | abc!12345 | 088811223344 | Denpasar | empty       | empty alamat |
