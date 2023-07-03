@PesananSaya
Feature: Pesanan Saya
  As a User, I want to see Pesanan Saya Page

  @Positive
  Scenario: PSN01 - See Pesanan Saya
    Given User on homepage
    And User already logged in and have order
    When User tap Akun navbar
    And User tap Pesanan Saya
    Then Verify card list exists
    
  @Negative
  Scenario: PSN02 - See Pesanan Saya While No Bid Made
    Given User on homepage
    And User already logged in and have no order
    When User tap Akun navbar
    And User tap Pesanan Saya
    Then Verify no Pesanan exists