/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.sql.PreparedStatement;
// Untuk menjalankan query SQL UPDATE dengan parameter
import javax.swing.JOptionPane;
// Untuk menampilkan pesan dialog (info / error)

/**
 *
 * @author Dwi
 */
public class UpdateProduk {
// Class untuk mengelola proses update data produk

    Koneksi konek = new Koneksi();
    // Objek koneksi ke database

    public void updateProduk(int idProduk, String nama, int harga, int stok) {
    // Method untuk mengupdate data produk berdasarkan I
        try {
            konek.koneksi();
            // Method untuk mengupdate data produk berdasarkan I
            String sql = "UPDATE produk SET "
                    + "nama_produk = ?, "
                    + "harga = ?, "
                    + "stok = ? "
                    + "WHERE id_produk = ?";
                    // Query SQL untuk mengupdate data produk

            PreparedStatement pst = konek.con.prepareStatement(sql);
            // Menyiapkan statement SQL

            pst.setString(1, nama);
            pst.setInt(2, harga);
            pst.setInt(3, stok);
            pst.setInt(4, idProduk);
            // Mengisi parameter query

            int hasil = pst.executeUpdate();
            // Menjalankan query update dan mengambil jumlah baris yang terpengaruh

            if (hasil > 0) {
                JOptionPane.showMessageDialog(null, "Data produk berhasil diupdate");
            } else {
                JOptionPane.showMessageDialog(null, "ID Produk tidak ditemukan");
            }
            // Menampilkan pesan hasil update

            pst.close();
            // Menutup PreparedStatement

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            // Menampilkan pesan error jika terjadi kesalahan
        }
    }
}
