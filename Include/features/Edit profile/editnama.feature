@EditProfile
Feature: editprofile with nama

  @EPD01
  Scenario: Edit profile with nama
    Given User login to homapage
    When User tap akun user profile
    And User input nama profile
    Then User verify success massages
