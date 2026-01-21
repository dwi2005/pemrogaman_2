/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.sql.Statement;
// Untuk menjalankan perintah SQL tanpa parameter

/**
 *
 * @author Dwi
 */
public class delate {
// Class untuk menghapus data produk dari database

    Koneksi konek = new Koneksi();
    // Objek koneksi ke database

    public void delete(String nama) {
    // Method untuk menghapus data produk berdasarkan nama
        try {
            konek.koneksi();
            // Membuka koneksi ke database
            Statement statement = konek.con.createStatement();
            // Membuat objek Statement

            String sql = "delete from produk where nama_produk = '" + nama + "'";
            // Query SQL untuk menghapus data produk
            statement.executeUpdate(sql);
            // Menjalankan perintah delete
            statement.close();
            // Menutup Statement
        } catch (Exception ex) {
          // Menangani error (belum ditampilkan ke user)

        }
    }
}
