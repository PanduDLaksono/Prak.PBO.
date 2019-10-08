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
public class PC1941723006Pandu extends Komputer1941723006Pandu{
    public int mUkuranMonitor;

    public PC1941723006Pandu() {
    }

    public PC1941723006Pandu(int mUkuranMonitor, String mMerek, String mJnsProcessor, int mKecProcessor, int mSizeMemory) {
        super(mMerek, mJnsProcessor, mKecProcessor, mSizeMemory);
        this.mUkuranMonitor = mUkuranMonitor;
    }
    
    public void tampilPcPandu(){
        super.tampilDataPandu();
        System.out.println("Ukuran Monitor         : " + mUkuranMonitor + " Inchi");
    }
}
