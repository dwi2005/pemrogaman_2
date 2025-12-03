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
// Class PhoneUser bertindak sebagai pengguna (controller)
// Tidak peduli HP mereknya apa, yang penting implements interface Phone (Polymorphism)
public class PhoneUser {

    public void usePhone(Phone phone) {
        phone.powerOn();
        phone.volumeUp();
        phone.camera();
        phone.volumeDown();
        phone.powerOff();
    }
}
