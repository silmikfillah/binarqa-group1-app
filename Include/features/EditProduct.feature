@EditProduct
Feature: Product Android

  @EPD01
  Scenario: Edit Product with Valid Data
    Given User login as seller
    And User tab akun
    And User tab Daftar Product
    When User tap product
    And User input product name
    And User input product price
    And User choose category
    And User input location
    And User input product description
    And Click publish button
    Then User will see success message