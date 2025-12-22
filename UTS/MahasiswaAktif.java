/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Menentukan package tempat class ini berada, agar terorganisir dalam project.
package UTS;

/**
 *
 * @author Dwi
 */
// INHERITANCE:
//Keyword extends Mahasiswa berarti:
//MahasiswaAktivis adalah class anak (subclass).
//Mahasiswa adalah class induk (superclass).
public class MahasiswaAktif extends Mahasiswa { 
    
    //Mendeklarasikan atribut jumlahOrganisasi.
    //Bertipe int karena menyimpan jumlah
    private int jumlahOrganisasi;

    
//Konstruktor memiliki parameter:
//nim, nama, ipk → milik class induk
//jumlahOrganisasi → milik class anak
//Konstruktor dipanggil saat objek MahasiswaAktivis dibuat.
    public MahasiswaAktif(String nim, String nama, double ipk, int jumlahOrganisasi) {
        
        //Keyword super digunakan untuk memanggil konstruktor class induk (Mahasiswa).
        super(nim, nama, ipk); // Memanggil constructor Mahasiswa
        
        //Mengisi nilai parameter jumlahOrganisasi ke atribut milik class ini.
        this.jumlahOrganisasi = jumlahOrganisasi;
    }
    
    // Method baru spesifik untuk class anak
    //Method ini digunakan untuk menentukan status keaktifan mahasiswa.
    public String getStatusAktif() {
        
        //mahasiswa yang mengikuti lebih dari 2 organisasi,akan dinyatakan mahasiswa super aktif
        //mahasiswa yang ikut kurang dari 2 adalah mahasiswa aktif biasa
        if (jumlahOrganisasi > 2) return "Super Aktif";
        return "Aktif Biasa";
    }
    
    //Mengembalikan nilai atribut jumlahOrganisasi.
    public int getJumlahOrganisasi() {
        return jumlahOrganisasi;
    }
}