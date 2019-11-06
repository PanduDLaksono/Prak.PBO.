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
public class Inheritance1_1941723006Pandu {
    public static void main(String[] args) {
        Manager1941723006Pandu m = new Manager1941723006Pandu();
        m.mNama = "Vivin";
        m.mAlamat = "Jl. Vinola";
        m.mUmur = 25;
        m.mJK = "Perempuan";
        m.mGaji = 3000000;
        m.mTunjangan = 1000000;
        m.tampilDataManagerPandu();
        
        System.out.println("============================");
        
        Staff1941723006Pandu s = new Staff1941723006Pandu();
        s.mNama = "Lestari";
        s.mAlamat = "Malang";
        s.mUmur = 25;
        s.mJK = "Perempuan";
        s.mGaji = 2000000;
        s.mLembur = 500000;
        s.mPotongan = 250000;
        s.tampilDataStaffPandu();
    }
}
