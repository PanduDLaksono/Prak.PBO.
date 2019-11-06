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
public class Mac1941723006Pandu extends Laptop1941723006Pandu{
    public String mSecurity;

    public Mac1941723006Pandu() {
    }

    public Mac1941723006Pandu(String mSecurity, String mJnsBaterai, String mMerek, String mJnsProcessor, int mKecProcessor, int mSizeMemory) {
        super(mJnsBaterai, mMerek, mJnsProcessor, mKecProcessor, mSizeMemory);
        this.mSecurity = mSecurity;
    }
    
    public void tampilMacPandu(){
        super.tampilLaptopPandu();
        System.out.println("Keamanan            : " + mSecurity);
    }
}
