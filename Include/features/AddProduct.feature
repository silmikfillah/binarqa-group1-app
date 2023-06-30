@AddProduct
Feature: Add Product
  As a User, I want to add product to sell in Secondhand App

  @ADDP01
  Scenario Outline: Add Product With Input Valid Data
    Given User on homepage
    And User already logged in
    When User tap FAB Jual
    And User fill Nama Produk with <namaProduk>
    And User fill Harga Produk with <hargaProduk>
    And User fill Kategori with <kategoriProduk>
    And User fill Lokasi with <lokasiProduk>
    And User fill Deskripsi with <deskripsiProduk>
    And User fill Foto Produk with <fotoProduk>
    And User tap Terbitkan button
    Then Verify success message

    Examples: 
      | namaProduk | hargaProduk | kategoriProduk | lokasiProduk | deskripsiProduk    | fotoProduk |
      | Produk A   |       50000 | Kesehatan      | Kota         | Masih Bagus Banget | image      |

  @ADDP02 @ADDP03 @ADDP04 @ADDP05 @ADDP06 @ADDP07
  Scenario Outline: Add Product Without Input One Field
    Given User on homepage
    And User already logged in
    When User tap FAB Jual
    And User fill Nama Produk with <namaProduk>
    And User fill Harga Produk with <hargaProduk>
    And User fill Kategori with <kategoriProduk>
    And User fill Lokasi with <lokasiProduk>
    And User fill Deskripsi with <deskripsiProduk>
    And User fill Foto Produk with <fotoProduk>
    And User tap Terbitkan button
    Then Verify Error <error> message appeared

    Examples: 
      | namaProduk    | hargaProduk | kategoriProduk     | lokasiProduk | deskripsiProduk  | fotoProduk | error          |
      | empty         |       50000 | Otomotif           | Kota         | Masih bagus      | image      | namaEmpty      |
      | Hotwheels     | empty       | Hobi dan Koleksi   | Semarang     | Masih segel      | image      | hargaEmpty     |
      | Gelas Estetik |       75000 | empty              | Balikpapan   | Unik dan Estetik | image      | kategoriEmpty  |
      | Speaker       |      250000 | Elektronik         | empty        | Lecet pemakaian  | image      | lokasiEmpty    |
      | Lemari Unik   |      169000 | Perlengkapan Rumah | Jaksel       | empty            | image      | deskripsiEmpty |
      | Canon         |     7500000 | Fotografi          | Surabaya     | Masih mulus      | empty      | fotoEmpty      |

  @ADDP08
  Scenario: Add Product While Not Logged In
    Given User on homepage
    And User not logged in
    When User tap FAB Jual
    Then Verify User prompted to login
