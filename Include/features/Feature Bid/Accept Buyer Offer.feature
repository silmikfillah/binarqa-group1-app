Feature: Accept Offer
  Seller wants to accept buyer offer

  @AcceptOffer
  Scenario: Seller wants to accept buyer offer
  
    Given seller sudah melakukan login
    When seller click Daftar Jual Saya
    And seller click Diminati
    And seller click first Diminati
    And seller click Terima
    Then seller verify Hubungi via Whatsapp button
