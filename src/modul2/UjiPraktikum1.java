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
public class UjiPraktikum1 {
    
    public UjiPraktikum1(int par) {
    }
    public static void main(String[] abc)
    {
        Praktikum1 bus = new Praktikum1(5);
        
        
        bus.getpenumpang(17);
        bus.getpenumpang(24);
        bus.cetakpenumpang();
        
        bus.addpenumpang(2);
        bus.cetakpenumpang();
        
        bus.addpenumpang(1);
        bus.cetakpenumpang();
        
        bus.addpenumpang(2);
        bus.cetakpenumpang();
        
        bus.addpenumpang(2);
        bus.cetakpenumpang();
        
        bus.setJumlahBerat(30);
        bus.setJumlahPenumpang(3);
        bus.getaverage();
        System.out.println("Rata-rata: "+bus.getaverage());
    }
}
