@EditProfile
Feature: Edit Profile
  As a User, I want to edit profile account

  @EP01
  Scenario: Edit profile with nama
    Given User login to homapage
    When User tap akun user profile
    And User input nama profile
    Then User verify success massages

  @EP02
  Scenario: Edit profile with nomor handphone
    Given User login homapage
    When User tap akun porifle
    And User input nomor handphone user
    Then User verify success massages update profile

  @EP03
  Scenario: Edit profile with with alamat
    Given User login to akun
    When User tap akun profile
    And User input alamat rumah
    Then User verify success massages

  @EP04
  Scenario: Edit profile with edit kota
    Given User login akun
    When User tap akun login
    And User input kota jakarta
    Then User verify success ok

  @EP06
  Scenario: Edit profile with Valid Data
    Given User login
    When User tap akun
    And User input nama
    And User input nomor handphone
    And User input kota
    And User input alamat
    Then User verify success
