@DaftarJualSaya
Feature: Daftar Jual Saya
  As a User, I want to see Daftar Jual Saya Page

  @DJS01
  Scenario: See Daftar Jual Saya Product List
    Given User on homepage
    And User already logged in and have product
    When User tap Akun navbar
    And User tap Daftar Jual Saya
    Then Verify product card exists

  @DJS02
  Scenario: See Daftar Jual Saya Product List - No Product
    Given User on homepage
    And User already logged in and have no product
    When User tap Akun navbar
    And User tap Daftar Jual Saya
    Then Verify no product exists

  @DJS03
  Scenario: See Diminati List
    Given User on homepage
    And User already logged in and have product
    When User tap Akun navbar
    And User tap Daftar Jual Saya
    And User tap Diminati tab
    Then Verify product diminati exists

  @DJS04
  Scenario: See Diminati List - No Product
    Given User on homepage
    And User already logged in and have no product
    When User tap Akun navbar
    And User tap Daftar Jual Saya
    And User tap Diminati tab
    Then Verify no product exists

  @DJS05
  Scenario: See Terjual List
    Given User on homepage
    And User already logged in and have product
    When User tap Akun navbar
    And User tap Daftar Jual Saya
    And User tap Terjual tab
    Then Verify product card exists

  @DJS06
  Scenario: See Terjual List - No Product
    Given User on homepage
    And User already logged in and have no product
    When User tap Akun navbar
    And User tap Daftar Jual Saya
    And User tap Terjual tab
    Then Verify no product exists
