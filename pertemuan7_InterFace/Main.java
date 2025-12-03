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
// Class utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {

        Phone samsung = new Samsung();
        Phone xiaomi  = new Xiaomi();
        Phone iphone  = new iPhone();
        Phone oppo    = new Oppo();

        PhoneUser user = new PhoneUser();

        System.out.println("\n===== Samsung =====");
        user.usePhone(samsung);

        System.out.println("\n===== Xiaomi =====");
        user.usePhone(xiaomi);

        System.out.println("\n===== iPhone =====");
        user.usePhone(iphone);

        System.out.println("\n===== Oppo =====");
        user.usePhone(oppo);
    }
}