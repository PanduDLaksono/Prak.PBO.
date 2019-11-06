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
public class Komputer1941723006Pandu {
    public String mMerek, mJnsProcessor;
    public int mKecProcessor, mSizeMemory;

    public Komputer1941723006Pandu() {
    }

    public Komputer1941723006Pandu(String mMerek, String mJnsProcessor, int mKecProcessor, int mSizeMemory) {
        this.mMerek = mMerek;
        this.mJnsProcessor = mJnsProcessor;
        this.mKecProcessor = mKecProcessor;
        this.mSizeMemory = mSizeMemory;
    }
    
    public void tampilDataPandu(){
        System.out.println("Merk Komputer       : " + mMerek);
        System.out.println("Jenis Processor     : " + mJnsProcessor);
        System.out.println("Kecepatan Processor : " + mKecProcessor + " GHz");
        System.out.println("Ukuran Memori       : " + mSizeMemory + " GB");
    }
}
