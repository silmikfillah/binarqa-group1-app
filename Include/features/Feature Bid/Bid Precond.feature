Feature: Buyer Bid Valid
  Buyer want to bid with Valid Price

  Scenario: Buyer - Bid with Valid Price
    Given buyer2 sudah login
    And buyer berada di halaman produk
    When buyer click search
    And buyer input "barang dijual"
    And buyer click first product
    And buyer click Saya tertarik dan ingin nego button
    And buyer memasukan harga tawaran "2000"
    And buyer click di tombol Kirim button
    Then buyer menunggu respon penjual
