/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author Dwi
 */
import java.sql.PreparedStatement;
// Digunakan untuk menjalankan perintah SQL dengan parameter (lebih aman)
import java.sql.Statement;
// Digunakan untuk menjalankan perintah SQL biasa (tidak dipakai di kode ini)
import javax.swing.JOptionPane;
// Digunakan untuk menampilkan pesan dialog pada GUI

public class InsertData {
// Class untuk menangani proses insert data ke database

    Koneksi konek = new Koneksi();
    // Membuat objek koneksi database

    public void insertProduk(String nama, int harga, int stok) {
    // Method untuk menyimpan data produk ke tabel produk
        try {
            konek.koneksi();
            // Memanggil method koneksi database

            String sql = "INSERT INTO produk (nama_produk, harga, stok) VALUES (?, ?, ?)";
            // Query SQL untuk menambah data produk
            PreparedStatement ps = konek.con.prepareStatement(sql);
            // Menyiapkan query SQL dengan parameter

            ps.setString(1, nama);
            // Mengisi parameter pertama (nama produk)
            ps.setInt(2, harga);
            // Mengisi parameter kedua (harga)
            ps.setInt(3, stok);
            // Mengisi parameter ketiga (stok)

            ps.executeUpdate();
            // Menjalankan perintah INSERT ke database
            ps.close();
            // Menutup PreparedStatement

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            // Menampilkan pesan jika data berhasil disimpan
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            // Menampilkan pesan error jika terjadi kesalahan
        }
    }

}
