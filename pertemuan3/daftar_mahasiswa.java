/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author Dwi
 */
public class daftar_mahasiswa 

        //untuk memanggil pbo
    {
    public static void main(String[] args)
            
            //objek clas adalah yang ada di dalam m1
    {
      pbo_mahasiwa m1 = new pbo_mahasiwa("22", "dwi", 3.5 );
       
        //hasil fungsi parameter
        //remidi
        m1.remidi(0.1);
        m1.tampilData();
        
        //hasil proseudr parameter
        //sertifikat
        System.out.println("sertif saya "+ m1.sertif(10));
         
        //untuk mencetak tulisan dari pbo nama nim ipk + predikat
        System.out.println(m1.predikat());
        
}
    
}
