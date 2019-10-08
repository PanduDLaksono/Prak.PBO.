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
public class StaffHarian1941723006Pandu extends Staff1941723006Pandu{
    public int mjmlJamKerja;

    public StaffHarian1941723006Pandu() {
    }

    public StaffHarian1941723006Pandu(String mNama, String mAlamat, String mJK, int mUmur, int mGaji, int mLembur, int mPotongan, int mjmlJamKerja ) {
        super(mLembur, mPotongan, mNama, mAlamat, mJK, mUmur, mGaji);
        this.mjmlJamKerja = mjmlJamKerja;
    }
    
    public void tampilStaffharianPandu(){
        System.out.println("==========Data Staff Harian==========");
        super.tampilDataStaffPandu();
        System.out.println("Jumlah Jam Kerja: " + mjmlJamKerja);
        System.out.println("Gaji Bersih     : " + (mGaji * mjmlJamKerja + mLembur - mPotongan));
    }
}
