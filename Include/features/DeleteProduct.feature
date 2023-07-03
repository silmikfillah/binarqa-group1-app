@DeleteProduct
Feature: Delete Product

  @DP01
  Scenario: DP01 - Delete Product
    Given User login as seller
    And User tab akun
    And User tab Daftar Jual
    When User tap button trash
    And User tap Hapus
    Then User will see success delete message
