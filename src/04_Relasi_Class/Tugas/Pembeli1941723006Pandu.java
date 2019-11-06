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
public class Pembeli1941723006Pandu {

    private String mNama;
    private LPG1941723006Pandu mTabung;
    private Penjual1941723006Pandu mStok;
    private int mJumlah, mStokTbg;

    public Pembeli1941723006Pandu(String mNama, LPG1941723006Pandu mTabung, int mJumlah) {
        this.mNama = mNama;
        this.mTabung = mTabung;
        this.mJumlah = mJumlah;
    }

    public String getNamaPandu() {
        return mNama;
    }

    public void setNamaPandu(String nama) {
        this.mNama = nama;
    }

    public int getJumlahPandu() {
        return mJumlah;
    }

    public void setJumlahPandu(int jumlah) {
        this.mJumlah = jumlah;
    }

    public int getStokTbgPandu() {
        return mStokTbg;
    }

    public void setStokTbgPandu(int stoktabung) {
        this.mStokTbg = stoktabung;
    }

    public LPG1941723006Pandu getTabungPandu() {
        return mTabung;
    }

    public void setTabungPandu(LPG1941723006Pandu tabung) {
        this.mTabung = tabung;
    }

    public Penjual1941723006Pandu getStokPandu() {
        return mStok;
    }

    public void setStokPandu(Penjual1941723006Pandu stok) {
        this.mStok = stok;
    }

    public int hitungBiayaTotalPandu() {
        return mTabung.hitungBiayaTabungPandu(mJumlah);
    }

    public String infoPandu() {
        String info = "Pembeli\n";
        info += "Nama = " + this.mNama + "\n";
        info += "Tabung = \n" + this.mTabung.infoPandu() + "\n\n";
        info += "Jumlah Beli = " + this.mJumlah + "\n";
        info += "Biaya Total = Rp." + this.hitungBiayaTotalPandu();
        return info;
    }
}
