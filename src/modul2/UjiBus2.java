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
public class UjiBus2 {

    public UjiBus2(int par) {
    }
    public static void main(String[] abc)
    {
        Bus2 bus = new Bus2(5);
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
    }
}
