
@ea
Feature: edit feature profile
  I want to use edit profile

  @ea1
  Scenario Outline: i want edit nama
    Given I am direct homapage
    When I check for 
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |