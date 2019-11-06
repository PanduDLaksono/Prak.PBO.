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
public class Suplier1941723006Pandu {
    private String mNamaAgen;
    private Penjual1941723006Pandu[] mArrayPenjual;
    private int mJumlah;
    
    public Suplier1941723006Pandu(String mNamaAgen, int mJumlah) {
        this.mNamaAgen = mNamaAgen;
        this.mArrayPenjual = new Penjual1941723006Pandu[this.mJumlah];
        this.initPenjualPandu();
    }

    public String getNamaAgenPandu() {
        return mNamaAgen;
    }

    public void setNamaAgenPandu(String agen) {
        this.mNamaAgen = agen;
    }

    public Penjual1941723006Pandu[] getArrayPenjualPandu() {
        return mArrayPenjual;
    }
    private void initPenjualPandu(){
        for (int i = 0; i < mArrayPenjual.length; i++){
            this.mArrayPenjual[i] = new Penjual1941723006Pandu(String.valueOf(i + 1));
        }
    }
    public void setArrayPenjualPandu(int urut) {
        this.mArrayPenjual[urut -1].setNamaPandu(mNamaAgen);
    }
        
    public String infoPandu(){
        String info="Penjual\n";
        info += "Nama Agen= "+this.mNamaAgen + "\n";
        for (Penjual1941723006Pandu penjual : mArrayPenjual) {
            info += penjual.infoPandu();
        }
        return info;
    }
    
    
}
