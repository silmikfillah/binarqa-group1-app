@EditProfile
Feature: editprofile nomor handphone

  @EPD01213
  Scenario: Edit profile with nomor handphone
    Given User login homapage
    When User tap akun porifle
    And User input nomor handphone user
    Then User verify success massages update profile
