/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6_enkapsulasi;

/**
 *
 * @author Dwi
 */
public class main_user {
    public static void main(String[] args) {
        
    //membuat objek dari clas user
    User dwi = new User ();
    
    //menggunakan method setter
    dwi.setUsername("dwi");
    dwi.setPassword("dwi_ganteng");
     
    
    //menggunakan method getterg
    System.out.println("Username:"  + dwi.getUsername());
    System.out.println("Password:"  + dwi.getPassword());  
    }
    
}
