/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.sql.Connection;
//Digunakan untuk membuat objek koneksi ke database MySQL.
import java.sql.DriverManager;
//Digunakan untuk mengelola driver database dan membuat koneksi ke MySQL.
import javax.swing.JOptionPane;
// Untuk menampilkan pesan pop-up pada GUI

/**
 *
 * @author dwi
 */
public class Koneksi {
// Class untuk mengatur koneksi ke database MySQL
    Connection con = null;
    // Variabel untuk menyimpan koneksi database
    public void koneksi() {
    // Method untuk membuka koneksi ke database
        try {
            String connectionURL = "jdbc:mysql://localhost/db_penjualan";
            // URL koneksi database
            String username = "root";
            // Username database
            String password = "";
            // Password database
            Class.forName("com.mysql.jdbc.Driver");
            // Memanggil driver MySQL
            con = (Connection) DriverManager.getConnection(connectionURL, username, password);
            // Membuat koneksi ke database
        } catch (Exception e) {
          // Menangani error jika koneksi gagal
        }
    }

    Connection getConnection() {
    // Method untuk mengambil objek koneksi database
        throw new UnsupportedOperationException("Not supported yet."); 
        
    }
}
