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
//Mendefinisikan class Mahasiswa, sebagai blueprint objek mahasiswa.
public class Mahasiswa {
    
    // ENKAPSULASI: Variabel private
    //Menyimpan NIM,nama dan IPK mahasiswa, dibuat private agar tidak bisa diakses langsung dari luar class (enkapsulasi).
    //Tipe data string
    private String nim; 
    //tipe data string
    private String nama;
    //tipe data double
    private double ipk;

    // KONSTRUKTOR (METHOD BERPARAMETER)
    //yang akan di panggil saat objek dibuat menggunakan objek classnew mahasiswa
    public Mahasiswa(String nim, String nama, double ipk) {
        //parameter nim,nama dan ipk digunakan untuk mengisi data awal objek
        //Keyword this digunakan untuk membedakan variabel milik class dengan parameter
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    // Getter untuk mengakses data private(PENERAPAN ENKAPSULASI)
    //Method getter untuk mengambil nim,nama dan IPK mahasiswa
    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public double getIpk() { return ipk; }

    // METHOD BERPARAMETER (LOGIKA)
    //Method getPredikat() digunakan untuk mengolah data IPK
    //IF digunakan untuk mendapatkan predikat apa yang di peroleh dengan suatu ketentuan
    //return digunakan untuk mengembalikan hasil dan menghentikan methode
    public String getPredikat() {
        if (ipk >= 3.50) {
            return "Cumlaude";
        } else if (ipk >= 3.25) {
            return "Sangat Baik";
        } else {
            return "Memuaskan";
        }
    }
}