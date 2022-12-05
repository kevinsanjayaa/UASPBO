/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Package2;
/**
 *
 *
 */
public interface CRUD {
    public abstract void insertdataSiswa(String nama_siswa, String orangtua_siswa, String kelas ) ;
    public abstract void updateSiswa (String nama_siswa, String orangtua_siswa, String kelas, String id_siswa );
    public abstract void deleteSiswa(String id_siswa );
}
