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
public class Staff1941723006Pandu extends Karyawan1941723006Pandu{
    private int mLembur;
    private double mGajiLembur;

    public int getLemburPandu() {
        return mLembur;
    }

    public void setLemburPandu(int lembur) {
        this.mLembur = lembur;
    }

    public double getGajiLemburPandu() {
        return mGajiLembur;
    }

    public void setGajiLemburPandu(double gajilembur) {
        this.mGajiLembur = gajilembur;
    }
    
    public double getGajiPandu(int mLembur, double mGajiLembur) {
        return super.getGajiPandu() + mLembur * mGajiLembur;
    }

    @Override
    public double getGajiPandu() {
        return super.getGajiPandu() + mLembur * mGajiLembur;
    }
    
    public void lihatInfoPandu(){
        System.out.println("Nama            : " + this.getNamaPandu());
        System.out.println("NIP             : " + this.getNIPPandu());
        System.out.println("Golongan        : " + this.getGolonganPandu());
        System.out.println("Jumlah Lembur   : " + this.getLemburPandu());
        System.out.printf("Gaji Lembur     : %.0f\n", this.getGajiLemburPandu());
        System.out.printf("Gaji            : %.0f\n", this.getGajiPandu());
    }
}
