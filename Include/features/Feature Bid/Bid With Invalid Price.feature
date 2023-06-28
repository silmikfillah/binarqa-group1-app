Feature: Buyer Bid Invalid
  Buyer want to bid with Invalid Price

  @BidInvalid
  Scenario: Buyer - Bid with Invalid Price
  
    Given buyer1 sudah login
    And buyer1 berada di halaman produk
		
		When buyer1 click search
    And buyer1 input "Kelompok 1"
    And buyer1 click first product
    And buyer1 click Saya tertarik dan ingin nego button
    And buyer1 memasukan harga tawaran "999999999"
    And buyer1 click di tombol Kirim button
    Then buyer1 menunggu respon penjual
		
    