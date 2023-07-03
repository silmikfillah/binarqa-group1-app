@EditProduct
Feature: Edit Product
  As a User, I want to edit product

  Scenario Outline: <case> - Edit Product with <condition>
    Given User login as seller
    And User tab akun
    And User tab Daftar Jual
    When User tap product
    And User edit Nama Produk with <namaProduk>
    And User edit Harga Produk with <hargaProduk>
    And User edit Kategori with <kategoriProduk>
    And User edit Lokasi with <lokasiProduk>
    And User edit Deskripsi with <deskripsiProduk>
    And Click publish button
    Then User will see <status> message

    Examples: 
      | case  | condition              | namaProduk        | hargaProduk | kategoriProduk | lokasiProduk | deskripsiProduk    | status          |
      | EPD01 | Input Valid Data       | Produk Kelompok   |      100000 | Kesehatan      | Serang       | Deskripsi Produk 1 | success         |
      | EPD02 | Empty Nama Produk      | empty             |      200000 | Elektronik     | Jakarta      | Deskripsi Produk 2 | error nama      |
      | EPD03 | Empty Harga Produk     | Produk Kelompok 1 | empty       | Voucher        | Subang       | Deskripsi Produk 3 | error harga     |
      | EPD04 | Empty Kategori Produk  | Produk Kelompok 1 |      400000 | empty          | Subang       | Deskripsi Produk 3 | error kategori  |
      | EPD05 | Empty Lokasi Produk    | Produk Kelompok 1 |      500000 | Fotografi      | empty        | Deskripsi Produk 4 | error lokasi    |
      | EPD06 | Empty Deskripsi Produk | Produk Kelompok 1 |      600000 | Kesehatan      | Bandung      | empty              | error deskripsi |
