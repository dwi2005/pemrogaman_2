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
// Class Samsung wajib mengikuti method dari interface Phone
public class Samsung implements Phone {

    private int volume = 50;
    private boolean isOn = false;

    @Override
    public void powerOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Samsung: HP Menyala");
        }
    }

    @Override
    public void powerOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Samsung: HP Dimatikan");
        }
    }

    @Override
    public void volumeUp() {
        if (isOn && volume < MAX_VOLUME) {
            volume++;
            System.out.println("Samsung: Volume = " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isOn && volume > 0) {
            volume--;
            System.out.println("Samsung: Volume = " + volume);
        }
    }

    @Override
    public void camera() {
        if (isOn) System.out.println("Samsung: Mengambil Foto...");
        else System.out.println("Samsung: Hidupkan HP dulu!");
    }
}