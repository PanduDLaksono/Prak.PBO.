/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js7_percobaan1;

/**
 *
 * @author user
 */
public class Manager1941723006Pandu extends Karyawan1941723006Pandu{
    private double mTunjangan;
    private String mBagian;
    private Staff1941723006Pandu[] mSt;

    public double getTunjanganPandu() {
        return mTunjangan;
    }

    public void setTunjanganPandu(double tunjangan) {
        this.mTunjangan = tunjangan;
    }

    public String getBagianPandu() {
        return mBagian;
    }

    public void setBagianPandu(String bagian) {
        this.mBagian = bagian;
    }

    public void setStaffPandu(Staff1941723006Pandu[] st) {
        this.mSt = st;
    }
    
    public void viewStaffPandu(){
        int i;
        System.out.println("---------------");
        for (i = 0; i < mSt.length; i++) {
            mSt[i].lihatInfoPandu();
        }
        System.out.println("---------------");
    }
    
    public void lihatInfoPandu(){
        System.out.println("Manager     : " + this.getBagianPandu());
        System.out.println("NIP         : " + this.getNIPPandu());
        System.out.println("Nama        : " + this.getNamaPandu());
        System.out.println("Golongan    : " + this.getGolonganPandu());
        System.out.printf("Tunjangan   : %.0f\n", this.getTunjanganPandu());
        System.out.printf("Gaji        : %.0f\n", this.getGajiPandu());
        System.out.println("Bagian      : " + this.getBagianPandu());
        this.viewStaffPandu();
    }
    
    public double getGajiPandu(){
        return super.getGajiPandu() + mTunjangan;
    }
}
