/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7_InterFace;

/**
 *
 * @author Dwi
 */
// Interface sebagai aturan atau kontrak yang harus diikuti oleh semua brand HP
public interface Phone {

    // Konstanta batas maksimal volume
    int MAX_VOLUME = 100;

    // Method abstract (tidak ada isi), wajib di-override oleh class implementasi
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    void camera();
}