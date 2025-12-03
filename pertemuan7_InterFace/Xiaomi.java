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
// Xiaomi juga implements interface Phone
public class Xiaomi implements Phone {

    private int volume = 30;
    private boolean isOn = false;

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Xiaomi: HP Menyala");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("Xiaomi: HP Dimatikan");
    }

    @Override
    public void volumeUp() {
        if (isOn && volume < MAX_VOLUME) {
            volume++;
            System.out.println("Xiaomi: Volume = " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isOn && volume > 0) {
            volume--;
            System.out.println("Xiaomi: Volume = " + volume);
        }
    }

    @Override
    public void camera() {
        if (isOn) System.out.println("Xiaomi: Jepret! Foto tersimpan.");
        else System.out.println("Xiaomi: Nyalakan dulu untuk pakai kamera.");
    }
}
