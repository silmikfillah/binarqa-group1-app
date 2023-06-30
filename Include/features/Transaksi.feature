@Transaksi
Feature: Transaksi
  As a User, I want to see Transaksi Page

  @TRS01
  Scenario: See Transaksi
    Given User on homepage
    And User already logged in and have order
    When User tap Transaksi navbar
    Then Verify Transaksi list exists
    
  @TRS02
  Scenario: See Transaksi - No Transaction Made
    Given User on homepage
    And User already logged in and have no order
    When User tap Transaksi navbar
    Then Verify no Transaksi exists