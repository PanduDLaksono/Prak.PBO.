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
public class Karyawan1941723006Pandu {
    public String mNama, mAlamat, mJK;
    public int mUmur, mGaji;
    
    public Karyawan1941723006Pandu(){
 
    }

    public Karyawan1941723006Pandu(String mNama, String mAlamat, String mJK, int mUmur, int mGaji) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mJK = mJK;
        this.mUmur = mUmur;
        this.mGaji = mGaji;
    }
    
    public void tampilDataKaryawanPandu(){
        System.out.println("Nama            : " + mNama);
        System.out.println("Alamat          : " + mAlamat);
        System.out.println("Jenis Kelamin   : " + mJK);
        System.out.println("Umur            : " + mUmur);
        System.out.println("Gaji            : " + mGaji);
    }
}
