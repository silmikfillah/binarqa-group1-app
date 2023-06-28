Feature: Buyer Bid Valid
  Buyer want to bid with Valid Price

  @BidValid
  Scenario: Buyer - Bid with Valid Price
  
    Given buyer sudah login
    And buyer berada di halaman produk
    
    When buyer click search
    And buyer input "Barang kelompok 11"
    And buyer click first product
    And buyer click Saya tertarik dan ingin nego button
    And buyer memasukan harga tawaran "2000"
    And buyer click di tombol Kirim button
    Then buyer menunggu respon penjual
