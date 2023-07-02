@EditProfile
Feature: editprofile with alamat

  @EPalamat
  Scenario: Edit profile with with alamat
    Given User login to akun
    When User tap akun profile
    And User input alamat rumah
    Then User verify success massages
