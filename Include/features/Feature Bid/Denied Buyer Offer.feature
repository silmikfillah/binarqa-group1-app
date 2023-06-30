Feature: Denied Offer
  Seller wants to Denied buyer offer

  @DeniedOffer
  Scenario: Seller wants to Denied buyer offer
  
    Given sellerr sudah melakukan login
    When sellerr click Daftar Jual Saya
    And sellerr click Diminati
    And sellerr click first Diminati
    And sellerr click Tolak
    Then sellerr verify Penawaran ditolak
