/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author Dwi
 */

public class pbo_cat {
    
    //variabel
    String merk = "";
    String warna = "";
    int berat;
 
    //konstruktor
    public pbo_cat (String merk, String warna, int berat) {
        this.merk = merk;
        this.warna = warna;
        this.berat = berat;   
    }
    
    public void tampilData(){
        System.out.println("merk     :" + merk);
        System.out.println("warna    :" + warna);
        System.out.println("berat    :" + berat + "kg");
       
        
        
    }
    
}
