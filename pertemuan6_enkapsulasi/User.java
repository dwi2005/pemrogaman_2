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
class User {

    private String username;
    private String password;

    //ini methode setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //ini methode getter
    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

}
