@Transaksi
Feature: Transaksi
  As a User, I want to see Transaksi Page

  @Positive
  Scenario: TRS01 - See Transaksi
    Given User on homepage
    And User already logged in and have order
    When User tap Transaksi navbar
    Then Verify Transaksi list exists
    
  @Negative
  Scenario: TRS02 - See Transaksi While No Transaction Made
    Given User on homepage
    And User already logged in and have no order
    When User tap Transaksi navbar
    Then Verify no Transaksi exists