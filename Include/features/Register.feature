Feature: Login
  As a user, I want to register in Secondhand Store app.

  @REG01
  Scenario Outline: Verify to register using valid credentials
    Given I already installed the app and on the register page
    When I input nama for register <nama> and <statusnama>
    And I input email for register <email> and <statusemail>
    And I input password for register <password>
    And I input nomor hp with <nomor_hp>
    And I input kota with <kota>
    And I input alamat with <alamat>
    And I click Register button
    Then I should see the next step: <status> for register

    Examples: 
      | nama | statusnama | email | statusemail | password  | nomor_hp     | kota | alamat      | status  |
      |      | random     |       | random      | abc!12345 | 088811223344 | Sby  | Jln. Raya 1 | success |

  @REG02
  Scenario Outline: Verify to register using invalid email
    Given I already installed the app and on the register page
    When I input nama for register <nama> and <statusnama>
    And I input email for register <email> and <statusemail>
    And I input password for register <password>
    And I input nomor hp with <nomor_hp>
    And I input kota with <kota>
    And I input alamat with <alamat>
    And I click Register button
    Then I should see the next step: <status> for register

    Examples: 
      | nama         | statusnama | email               | statusemail | password  | nomor_hp     | kota | alamat      | status      |
      | registered   | testdata   | groupsatu@gmail.com | testdata    | abc!12345 | 088811223344 | Sby  | Jln. Raya 1 | registered  |
      | without @    | testdata   | groupsatuyahoo.id   | testdata    | abc!12345 | 088811223344 | Sby  | Jln. Raya 1 | invalid     |
      | without TLD  | testdata   | groupsatu@mail      | testdata    | abc!12345 | 088811223344 | Sby  | Jln. Raya 1 | invalid     |
      | empty email  | testdata   |                     | testdata    | abc!12345 | 088811223344 | Sby  | Jln. Raya 3 | empty email |
      | without name | testdata   | @rocketmail.com     | testdata    | abc!12345 | 088811223344 | Sby  | Jln. Raya 3 | invalid     |

  @REG03
  Scenario Outline: Verify to register without enter any data
    Given I already installed the app and on the register page
    When I input nama for register <nama> and <statusnama>
    And I input email for register <email> and <statusemail>
    And I input password for register <password>
    And I input nomor hp with <nomor_hp>
    And I input kota with <kota>
    And I input alamat with <alamat>
    And I click Register button
    Then I should see the next step: <status> for register

    Examples: 
      | nama | statusnama | email | statusemail | password | nomor_hp | kota | alamat | status     |
      |      | testdata   |       | testdata    |          |          |      |        | empty nama |
