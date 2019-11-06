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
public class Penjual1941723006Pandu {
    private String mNama;
    private int mStok, mUrut;
    private LPG1941723006Pandu mTabung;

    public Penjual1941723006Pandu(String mNama, int mStok) {
        this.mNama = mNama;
        this.mStok = mStok;
    }
    
    public Penjual1941723006Pandu() {
    }

    Penjual1941723006Pandu(String valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNamaPandu() {
        return mNama;
    }

    public void setNamaPandu(String nama) {
        this.mNama = nama;
    }

    public int getStokPandu() {
        return mStok;
    }

    public void setStokPandu(int stok) {
        this.mStok = stok;
    }

    public LPG1941723006Pandu getTabungPandu() {
        return mTabung;
    }

    public void setTabungPandu(LPG1941723006Pandu tabung) {
        this.mTabung = tabung;
    }

    public int getUrutPandu() {
        return mUrut;
    }

    public void setUrutPandu(int urut) {
        this.mUrut = urut;
    }
           
     public String infoPandu(){
        String info="Penjual\n";
        info += "Nama = "+this.mNama + "\n";
        info += "Stok = "+this.mStok + "\n";
        return info;
    }
}
