/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author Dwi
 */
// INTERFACE: Kontrak untuk operasi data
//Digunakan untuk menyimpan kumpulan data secara dinamis (ukuran bisa bertambah / berkurang)
import java.util.ArrayList;
import java.util.List;

//Mendefinisikan sebuah interface bernama PengelolaData
public interface PengelolaData { 
    
    //Method abstract (tanpa body)
    //Digunakan untuk menambahkan data
    void tambahData(Object data); 
    
    //digunakan untuk menghapus data
    void hapusData(String id);    
    
    //Method abstract yang mengembalikan daftar mahasiswa
    //Menunjukkan bahwa data disimpan dalam bentuk koleksi
    List<Mahasiswa> getDaftarMahasiswa(); // TAMBAHAN
 
    // Method lain bisa ditambahkan (cari, edit, dll)
}