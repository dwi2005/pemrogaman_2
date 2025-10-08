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
public class daftar_cat {
    public static void main(String[] args) {
        pbo_cat jenis_cat1 = new pbo_cat("avian", "hitam",5);
        jenis_cat1.tampilData();
        pbo_cat jenis_cat2 = new pbo_cat("nippon paint", "putih", 10);
        jenis_cat2.tampilData();
    }
    
}
