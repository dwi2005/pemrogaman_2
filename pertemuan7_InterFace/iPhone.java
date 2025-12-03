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
// iPhone juga wajib mengikuti aturan interface Phone
public class iPhone implements Phone {

    private int volume = 60;
    private boolean isOn = false;

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("iPhone: Welcome to iOS");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("iPhone: Shutting down...");
    }

    @Override
    public void volumeUp() {
        if (isOn && volume < MAX_VOLUME) {
            volume++;
            System.out.println("iPhone: Volume = " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isOn && volume > 0) {
            volume--;
            System.out.println("iPhone: Volume = " + volume);
        }
    }

    @Override
    public void camera() {
        if (isOn) System.out.println("iPhone: Taking photo with Deep Fusion...");
        else System.out.println("iPhone: Turn on device first!");
    }
}
