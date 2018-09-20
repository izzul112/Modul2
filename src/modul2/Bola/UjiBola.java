/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.Bola;

/**
 *
 * @author User
 */
public class UjiBola {

    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.setR(10);
        
        System.out.println("Jeri-jari bola: "+ bola.getR());

        bola.getD();
        System.out.println("Diameter Bola: " + bola.getD());

        bola.getV();
        System.out.println("Volume Bola: " + bola.getV());

        bola.getLP();
        System.out.println("Luas Permukaan Bola: " + bola.getLP());
    }
}
