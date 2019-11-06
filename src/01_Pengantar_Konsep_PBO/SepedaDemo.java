/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sepedademo;

/**
 *
 * @author user
 */
public class SepedaDemo {
    public static void main(String[] args) {
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();
        
        spd1.setMerek("Polygon");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.setWarna("Hitam");
        spd1.cetakStatus();
        
        spd2.setMerek("Wim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.setWarna("Biru");
        spd2.cetakStatus();
        
        spd3.setMerek("Polygon");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setWarna("kuning");
        spd3.setTipeSuspensi("Gas Susspension");
        spd3.cetakStatus();
    }
    
}
