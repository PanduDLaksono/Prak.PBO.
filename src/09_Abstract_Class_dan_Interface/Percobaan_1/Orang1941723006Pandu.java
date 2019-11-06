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
public class Orang1941723006Pandu {
    private String mNama;
    private Hewan1941723006Pandu mHewanPeliharaan;

    public Orang1941723006Pandu(String mNama) {
        this.mNama = mNama;
    }
    
    public void peliharaanHewanPandu(Hewan1941723006Pandu hewanPeliharaan){
        this.mHewanPeliharaan = hewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalanPandu(){
        System.out.println("Namaku " + this.mNama);
        System.out.println("Hewan Peliharaanku berjalan dengan cara : ");
        this.mHewanPeliharaan.bergerakPandu();
        System.out.println("------------------------------------------");
    }
}
