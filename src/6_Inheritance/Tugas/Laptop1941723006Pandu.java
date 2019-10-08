/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js6_tugas;

/**
 *
 * @author user
 */
public class Laptop1941723006Pandu extends Komputer1941723006Pandu{
    public String mJnsBaterai;

    public Laptop1941723006Pandu() {
    }

    public Laptop1941723006Pandu(String mJnsBaterai, String mMerek, String mJnsProcessor, int mKecProcessor, int mSizeMemory) {
        super(mMerek, mJnsProcessor, mKecProcessor, mSizeMemory);
        this.mJnsBaterai = mJnsBaterai;
    }
    
    public void tampilLaptopPandu(){
        super.tampilDataPandu();
        System.out.println("Jenis Baterai       : " + mJnsBaterai);
    }
}
