/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasigettersetter;

/**
 *
 * @author user
 */
public class Anggota1941723006Pandu {
    private String mNama, mAlamat;
    private float mSimpanan;

    Anggota1941723006Pandu(String nama, String alamat) {
        this.mNama = nama;
        this.mAlamat = alamat;
        this.mSimpanan = 0;
    } 
    
    
    public void setNama(String nama){
        this.mNama = nama;
    }
    
    public void setAlamat(String alamat){
        this.mAlamat = alamat;
    }
    
    public String getNama(){
        return mNama;
    }
    
    public String getAlamat(){
        return mAlamat;
    }
    
    public float getSimpan(){
        return mSimpanan;
    }
    
    public void setor(float uang){
        mSimpanan += uang;
    }
    
    public void pinjam(float uang){
        mSimpanan -= uang;
    }
}
