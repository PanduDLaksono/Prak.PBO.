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
public class Windows1941723006Pandu extends Laptop1941723006Pandu{
    public String mFitur;

    public Windows1941723006Pandu() {
    }

    public Windows1941723006Pandu(String mFitur, String mJnsBaterai, String mMerek, String mJnsProcessor, int mKecProcessor, int mSizeMemory) {
        super(mJnsBaterai, mMerek, mJnsProcessor, mKecProcessor, mSizeMemory);
        this.mFitur = mFitur;
    }
    
    public void tampilWindowsPandu(){
        super.tampilLaptopPandu();
        System.out.println("Fitur               : " + mFitur);
    }
}
