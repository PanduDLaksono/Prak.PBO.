/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js6_percobaan5;

/**
 *
 * @author user
 */
public class Manager1941723006Pandu extends Karyawan1941723006Pandu{
    public int mTunjangan;
    
    public Manager1941723006Pandu(){
        
    }
    
    public void tampilDataManagerPandu(){
        super.tampilDataKaryawanPandu();
        System.out.println("Tunjangan       : " + mTunjangan);
        System.out.println("Total Gaji      : " + (super.mGaji + mTunjangan));
    }
}
