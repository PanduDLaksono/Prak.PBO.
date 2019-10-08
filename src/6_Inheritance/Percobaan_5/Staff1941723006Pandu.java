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
public class Staff1941723006Pandu extends Karyawan1941723006Pandu{
    public int mLembur, mPotongan;

    public Staff1941723006Pandu() {
    }

    public Staff1941723006Pandu(int mLembur, int mPotongan, String mNama, String mAlamat, String mJK, int mUmur, int mGaji) {
        super(mNama, mAlamat, mJK, mUmur, mGaji);
        this.mLembur = mLembur;
        this.mPotongan = mPotongan;
    }
    
    public void tampilDataStaffPandu(){
        super.tampilDataKaryawanPandu();
        System.out.println("Lembur          : " + mLembur);
        System.out.println("Potongan        : " + mPotongan);
        System.out.println("Total Gaji      : " + (super.mGaji + mLembur - mPotongan));
    }
}
