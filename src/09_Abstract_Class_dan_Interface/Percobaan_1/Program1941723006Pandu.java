/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js9_percobaan1;

/**
 *
 * @author user
 */
public class Program1941723006Pandu {
    public static void main(String[] args) {
        Kucing1941723006Pandu KucingKampung = new Kucing1941723006Pandu();
        Ikan1941723006Pandu LumbaLumba = new Ikan1941723006Pandu();
        Beruang1941723006Pandu bear = new Beruang1941723006Pandu();
        
        Orang1941723006Pandu ani = new Orang1941723006Pandu("Ani");
        Orang1941723006Pandu budi = new Orang1941723006Pandu("Budi");
        
        ani.peliharaanHewanPandu(KucingKampung);
        budi.peliharaanHewanPandu(LumbaLumba);
        
        ani.ajakPeliharaanJalanJalanPandu();
        budi.ajakPeliharaanJalanJalanPandu();
        
        ani.peliharaanHewanPandu(bear);
    }
}
