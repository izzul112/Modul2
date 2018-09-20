/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author User
 */
public class TestSiswa {
    public static void main(String[] args)
    {
        EncapSiswa Siswa = new EncapSiswa();
        Siswa.setNama("Julian");
        Siswa.setAbsen(23);
        Siswa.setAlamat("Malang");
        
        System.out.print("Nama : "+ Siswa.getNama()+ "\nAbsen : "+ Siswa.getAbsen()+"\nAlamat : "+ Siswa.getAlamat());
    }
}
