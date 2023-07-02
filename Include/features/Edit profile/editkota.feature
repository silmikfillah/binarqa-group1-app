@EditProfile123
Feature: editprofile with edit kota

  @EPkota
  Scenario: Edit profile with edit kota
    Given User login akun
    When User tap akun login
    And User input kota jakarta
    Then User verify success ok
