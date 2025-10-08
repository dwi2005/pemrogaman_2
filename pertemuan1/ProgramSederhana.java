/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author Dwi
 */
import java.util.Scanner;

public class ProgramSederhana {
     public static void main(String[] args) {
        // Scanner untuk input dari user
        Scanner input = new Scanner(System.in);

        // Input nama
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        // Input usia
        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();

        // Menampilkan hasil
        System.out.println("\nHalo, " + nama + "!");
        if (usia >= 18) {
            System.out.println("Kamu sudah dewasa.");
        } else {
            System.out.println("Kamu masih anak-anak.");
        }

        // Menutup scanner
        input.close();
    }
}
    
