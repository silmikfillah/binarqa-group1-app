@PesananSaya
Feature: Pesanan Saya
  As a User, I want to see Pesanan Saya Page

  @PSN01
  Scenario: See Pesanan Saya
    Given User on homepage
    And User already logged in and have order
    When User tap Akun navbar
    And User tap Pesanan Saya
    Then Verify card list exists
    
  @PSN02
  Scenario: See Pesanan Saya - No Bid Made
    Given User on homepage
    And User already logged in and have no order
    When User tap Akun navbar
    And User tap Pesanan Saya
    Then Verify no Pesanan exists