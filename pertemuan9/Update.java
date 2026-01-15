/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Dwi
 */
public class Update {
       Koneksi konek = new Koneksi();

//, String nama, String alamat, String jenis
    public void update(int nim, String nama, String alamat, String jenis) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql_alamat = "update datamahasiswa set alamat='" + alamat + "'where nim='" + nim + "'";
            String sql_nama = "update datamahasiswa set nama='" + nama + "'where nim='" + nim + "'";
            String sql_jenis = "update datamahasiswa set gender='" + jenis + "'where nim='" + nim + "'";
           
           
//String sql_nim = "update identitas set nim ='" + nim + "' where nim = '" + nim + "'";
            //    String sql = "update identitas set nim ='" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_jenis);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public static void main(String[] args) {
        Update ganti = new Update ();
        ganti.update (2244, "burok", "celeng", "P");
    
    }
}
