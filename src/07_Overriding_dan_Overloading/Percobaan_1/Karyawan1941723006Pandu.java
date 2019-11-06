/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js7_percobaan1;

/**
 *
 * @author sisio
 */
public class Karyawan1941723006Pandu {
    private String mNama, mNIP, mGolongan;
    private double mGaji;

    public String getNamaPandu() {
        return mNama;
    }

    public void setNamaPandu(String nama) {
        this.mNama = nama;
    }

    public String getNIPPandu() {
        return mNIP;
    }

    public void setNIPPandu(String nip) {
        this.mNIP = nip;
    }

    public String getGolonganPandu() {
        return mGolongan;
    }

    public void setGolonganPandu(String golongan) {
        this.mGolongan = golongan;
        
        switch(golongan.charAt(0)){
            case '1':this.mGaji=5000000;
                break;
            case '2':this.mGaji=3000000;
                break;
            case '3':this.mGaji=2000000;
                break;
            case '4':this.mGaji=1000000;
                break;
            case '5':this.mGaji=750000;
                break;
        }
    }

    public double getGajiPandu() {
        return mGaji;
    }

    public void setGajiPandu(double gaji) {
        this.mGaji = gaji;
    }    
}
