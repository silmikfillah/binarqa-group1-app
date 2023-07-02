@EditProfile
Feature: editprofile valid data

  @EPD01
  Scenario: Edit profile with Valid Data
    Given User login
    When User tap akun
    And User input nama
    And User input nomor handphone
    And User input kota
    And User input alamat
    Then User verify success
