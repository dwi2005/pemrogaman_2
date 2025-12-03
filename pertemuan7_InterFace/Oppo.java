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
// Oppo implements interface Phone
public class Oppo implements Phone {

    private int volume = 45;
    private boolean isOn = false;

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Oppo: Selamat Datang!");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("Oppo: Sampai Jumpa!");
    }

    @Override
    public void volumeUp() {
        if (isOn && volume < MAX_VOLUME) {
            volume++;
            System.out.println("Oppo: Volume = " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isOn && volume > 0) {
            volume--;
            System.out.println("Oppo: Volume = " + volume);
        }
    }

    @Override
    public void camera() {
        if (isOn) System.out.println("Oppo: Kamera AI aktif, jepret!");
        else System.out.println("Oppo: Nyalakan HP dulu!");
    }
}

