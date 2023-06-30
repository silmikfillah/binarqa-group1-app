Feature: Update Berhasil Terjual
  Seller wants to update sell status to Berhasil Terjual

  @UpdateStatusValid
  Scenario: Seller wants to update sell status to Berhasil Terjual
    Given seller sudah melakukan login
    When seller click Daftar Jual Saya
    And seller click Diminati
    And seller click first Diminati
    And seller click Terima
    And seller click Back
    And seller click Status
    And seller click Berhasil Terjual radio button
    And seller click Simpan
    Then seller verify Berhasil terjual
