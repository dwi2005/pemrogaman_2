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
//List adalah interface koleksi data.
//ArrayList adalah class konkret yang mengimplementasikan List.
import java.util.ArrayList;
import java.util.List;

// POLYMORPHISM: MahasiswaService mengimplementasikan kontrak PengelolaData
public class MahasiswaService implements PengelolaData { 
    
    //private untuk menerapkan enkapsulasi, data tidak bisa diakses langsung dari luar class.
    //List<Mahasiswa> untuk list yang hanya bisa menyimpan objek bertipe Mahasiswa.
    //new ArrayList<>() untuk membuat objek ArrayList.
    private List<Mahasiswa> daftarMhs = new ArrayList<>(); 

    // Implementasi method dari Interface (Polymorphism)
    //@Override method ini meng-override method dari interface.
    //public void tambahData  method untuk menambah data.
    //Object data parameter bertipe umum (Object), agar fleksibel.
    @Override
    public void tambahData(Object data) { // Method Berparameter
        if (data instanceof Mahasiswa) { 
            daftarMhs.add((Mahasiswa) data);
        }
    }

    @Override
    // //public void hapusData  method untuk menghapus data.
    public void hapusData(String nim) { // Method Berparameter
        daftarMhs.removeIf(m -> m.getNim().equals(nim));
    }
    
    //public List<Mahasiswa>  method untuk mengembalikan seluruh data.
    //Digunakan oleh GUI atau class lain untuk menampilkan data.
    public List<Mahasiswa> getDaftarMahasiswa() {
        return daftarMhs;
    }
}
