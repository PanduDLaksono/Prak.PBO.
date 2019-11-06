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
public class StaffTetap1941723006Pandu extends Staff1941723006Pandu{
    public String mGolongan;
    public int mAsuransi;

    public StaffTetap1941723006Pandu() {
    }

    public StaffTetap1941723006Pandu(String mNama, String mAlamat, String mJK, int mUmur, int mGaji, int mLembur, int mPotongan,String mGolongan, int mAsuransi) {
        super(mLembur, mPotongan, mNama, mAlamat, mJK, mUmur, mGaji);
        this.mGolongan = mGolongan;
        this.mAsuransi = mAsuransi;
    }
    
    public void tampilStaffTetapPandu(){
        System.out.println("==========Data Staff Tetap==========");
        super.tampilDataStaffPandu();
        System.out.println("Golongan        : " + mGolongan);
        System.out.println("Jumlah Asuransi : " + mAsuransi);
        System.out.println("Gaji Bersih     : " + (mGaji + mLembur - mPotongan - mAsuransi));
    }
}
