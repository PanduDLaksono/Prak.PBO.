/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js4_tugas_lpg_pandu;

/**
 *
 * @author user
 */
public class LPG1941723006Pandu {
   private String mNamaTabung;
   private int mBerat, mHarga, mJumlah;

    public LPG1941723006Pandu(String mNamaTabung, int mBerat, int mHarga) {
        this.mNamaTabung = mNamaTabung;
        this.mBerat = mBerat;
        this.mHarga = mHarga;
    }

    public LPG1941723006Pandu() {
    }

    public String getNamaTabungPandu() {
        return mNamaTabung;
    }

    public void setNamaTabungPandu(String namatabung) {
        this.mNamaTabung = namatabung;
    }

    public int getBeratPandu() {
        return mBerat;
    }

    public void setBeratPandu(int berat) {
        this.mBerat = berat;
    }

    public int getHargaPandu() {
        return mHarga;
    }

    public void setHargaPandu(int harga) {
        this.mHarga = harga;
    }

    public int getJumlahPandu() {
        return mJumlah;
    }

    public void setJumlahPandu(int jumlah) {
        this.mJumlah = jumlah;
    }
       
    public int hitungBiayaTabungPandu(int jumlah){
        return mHarga * jumlah;
    }
    
    public String infoPandu(){
        String info="";
        info += "Nama Tabung : "+this.mNamaTabung + "\n";
        info += "Ukuran : "+this.mBerat + " Kg\n";
        info += "Harga : Rp."+this.mHarga;
        return info;
       
   }
}
