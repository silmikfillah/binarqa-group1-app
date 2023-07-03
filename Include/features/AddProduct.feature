@AddProduct
Feature: Add Product
  As a User, I want to add product to sell in Secondhand App

  @Positive
  Scenario Outline: <case> - Add Product With Input Valid Data
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
      | namaProduk | hargaProduk | kategoriProduk | lokasiProduk | deskripsiProduk    | fotoProduk | case   |
      | Produk A   |       50000 | Kesehatan      | Kota         | Masih Bagus Banget | image      | ADDP01 |

  @Negative
  Scenario Outline: <case> - Add Product without input <condition>
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
      | namaProduk    | hargaProduk | kategoriProduk     | lokasiProduk | deskripsiProduk  | fotoProduk | error          | case   | condition        |
      | empty         |       50000 | Otomotif           | Kota         | Masih bagus      | image      | namaEmpty      | ADDP02 | Nama Produk      |
      | Hotwheels     | empty       | Hobi dan Koleksi   | Semarang     | Masih segel      | image      | hargaEmpty     | ADDP03 | Harga Produk     |
      | Gelas Estetik |       75000 | empty              | Balikpapan   | Unik dan Estetik | image      | kategoriEmpty  | ADDP04 | Kategori Produk  |
      | Speaker       |      250000 | Elektronik         | empty        | Lecet pemakaian  | image      | lokasiEmpty    | ADDP05 | Lokasi Produk    |
      | Lemari Unik   |      169000 | Perlengkapan Rumah | Jaksel       | empty            | image      | deskripsiEmpty | ADDP06 | Deskripsi Produk |
      | Canon         |     7500000 | Fotografi          | Surabaya     | Masih mulus      | empty      | fotoEmpty      | ADDP07 | Foto Produk      |

  @Negative
  Scenario: ADDP08 - Add Product While Not Logged In
    Given User on homepage
    And User not logged in
    When User tap FAB Jual
    Then Verify User prompted to login
