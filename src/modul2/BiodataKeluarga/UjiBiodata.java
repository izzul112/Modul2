/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.BiodataKeluarga;

/**
 *
 * @author User
 */
public class UjiBiodata {
    public static void main(String[] args){
       BiodataKeluarga bio = new BiodataKeluarga
    
   bio.setNamaAyah("Jahit Untung Subagyo");
    bio.setNamaIbu("Karini");
    bio.setNamaSaudara("Ubhait Rahim Nur");
    bio.setNamaSaya("habib Azizul Haq");
    bio.setAlamat("jl.manggar no. 19d Tulungrejo Pare, Kediri");
    bio.setTempatLahir("Kediri");
    bio.setTanggalLahir("17 04 2002");
    bio.setHobi("Tidur, Nonton Anime, Main Game");
    bio.setCita_cita("Masuk Surga");
    bio.setNoTelepon("081555367184");
    
        System.out.println("************************BIODATA KELUARGA***************************");
        System.out.println("Nama Ayah: "+bio.getNamaAyah());
        System.out.println("Nama Ibu: "+bio.getNamaIbu());
        System.out.println("Nama Saudara: "+bio.getNamaSaudara());
        System.out.println("Nama Saya: "+bio.getNamaSaya());
        System.out.println("Alamat: "+bio.getAlamat());
        System.out.println("Tempat Lahir: "+bio.getTempatLahir());
        System.out.println("Tanggal Lahir: "+bio.getTanggalLahir());
        System.out.println("Hobi: "+bio.getHobi());
        System.out.println("Cita-cita: "+bio.getCita_cita());
        System.out.println("No.Telepon: "+bio.getNoTelepon());
    }
 }
