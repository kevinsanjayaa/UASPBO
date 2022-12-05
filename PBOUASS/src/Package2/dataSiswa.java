/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package2;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class dataSiswa extends Koneksi implements CRUD{
//overloading
    public static void insertdataSiswa(String ns) {
        System.out.println(ns + " berhasil di tambahkan");
    }
    // Constructor untuk Connect ke Database
    public dataSiswa() throws ClassNotFoundException, SQLException {
        super();
    }

    // Create
    @Override
    public void insertdataSiswa(String nama_siswa, String orangtua_siswa, String kelas ){
        try {
        String sql = String.format("INSERT INTO data_siswa (nama_siswa,orangtua_siswa,kelas) VALUE ('%s', '%s','%s')", nama_siswa, orangtua_siswa, kelas);
        this.setQuery(sql);
        this.execute();  
        } catch (Exception e) {
        }

    }

    // Read
    public void getAll() throws SQLException {
        String sql = "SELECT * FROM data_siswa";
        this.setQuery(sql);
        this.fetch();
    }
    
    // Update
    @Override
    public void updateSiswa (String nama_siswa, String orangtua_siswa, String kelas, String id_siswa){
        try {
            String sql = String.format("UPDATE data_siswa SET nama_siswa = '%s', orangtua_siswa ='%s', kelas ='%s' WHERE id_siswa = %s",
            nama_siswa, orangtua_siswa, kelas, id_siswa);
            this.setQuery(sql);
            this.execute();
        } catch (Exception e) {
        }
        
    }

    // Delete
    @Override
    public void deleteSiswa(String id_siswa ) {
        try {
            String sql = String.format("DELETE FROM data_siswa WHERE id_siswa = '%s'", id_siswa);
            this.setQuery(sql);
            this.execute();
        } catch (Exception e) {
        }
        
    }

    // Validation untuk mencegah redudansi data
    public boolean checkSiswa(String nama) throws SQLException {
        getAll();
        while (this.rs.next()) {
            if (this.rs.getString("data_siswa") == nama) {
                return false;
            }
        }
        return true;
    }

    // Print hewan
    public String[][] showSiswa() throws SQLException {
        String[][] data = new String[this.lenSiswa()][4];
        getAll();
        this.fetch();
        int i = 0;
        while (this.rs.next()) {
            data[i][0] = this.rs.getString("id_siswa");
            data[i][1] = this.rs.getString("nama_siswa");
            data[i][2] = this.rs.getString("orangtua_siswa");
            data[i][3] = this.rs.getString("kelas");
            i++;
        }
        return data;
    }
    
    public int lenSiswa() throws SQLException {
        getAll();
        this.fetch();
        int i = 0;
        while (this.rs.next()) {
            i++;
        }
        return i;
    }
}


