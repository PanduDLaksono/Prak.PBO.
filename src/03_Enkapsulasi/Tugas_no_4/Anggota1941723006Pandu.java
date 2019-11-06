/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasisimpanpinjam;

/**
 *
 * @author user
 */
public class Anggota1941723006Pandu {
    private String mID, mNama;
    private int mLimitPinjaman, mJmlPinjaman, mAngsuran;

    public Anggota1941723006Pandu(String ID, String nama, int limitpinjaman) {
        this.mID = ID;
        this.mNama = nama;
        this.mLimitPinjaman = limitpinjaman;
       
    }
    
    public void setNama(String nama){
        this.mNama = nama;
    }
    
    public void setID(String ID){
        this.mID = ID;
    }
    
    public void setLimitPinjaman(int limitpinjaman){
        this.mLimitPinjaman = limitpinjaman;
    }
    
    public void setJmlPinjaman(int pinjaman){
        this.mJmlPinjaman = pinjaman;
    }
    
    public void setAngsuran(int angsuran){
        this.mAngsuran = angsuran;
    }
    
    public String getNama(){
        return mNama;
    }
    
    public String getID(){
        return mID;
    }
    
    public int getLimitPinjaman(){
        return mLimitPinjaman;
    }
    
    public int getJumlahPinjaman(){
        return mJmlPinjaman;
    }
    
    public int getAngsuran(){
        return mAngsuran;
    }
   
    public void pinjam(int saldo){
        mJmlPinjaman += saldo;
    }
    
    public void angsur(int saldo){
        mJmlPinjaman -= saldo;
    }
    
    public void limit(int saldo){
        mLimitPinjaman -= saldo;
    }
}
