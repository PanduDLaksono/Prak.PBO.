/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandu.relasiclass.percobaan2;

/**
 *
 * @author user
 */
public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil1941723006Pandu m = new Mobil1941723006Pandu();
        m.setMerk("Avanza");
        m.setBiaya(350000);
        
        Sopir1941723006Pandu s = new Sopir1941723006Pandu();
        s.setNama("Jonny Sa");
        s.setBiaya(200000);
        
        Pelanggan1941723006Pandu p = new Pelanggan1941723006Pandu();
        p.setNama("Dika");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya Total : " + p.hitungBiayaTotal());
        p.getMobil().getMerk();
    }
}
