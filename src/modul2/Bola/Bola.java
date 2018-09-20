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
public class Bola {

    private double r, d, LP, V;

    public double getR() {
        r = 10;
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getD() {
        d = r + r;
        return d;
    }

    public double getLP() {
       LP = 4* Math.PI * r * r;
        return LP;
    }

    public double getV() {
        V = 4 * Math.PI * r * r * r / 3;
        return V;
    }

}
