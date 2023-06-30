@SearchProduct
Feature: Search Product
  As a User, I want to search product

  @SRC01
  Scenario Outline: Search Product
    Given User on homepage
    When User tap search field
    And User input text <searchText> in search field
    Then Verify search <searchText> result appeared

    Examples: 
      | searchText |
      | key        |
      | tesla      |
      | meja       |
