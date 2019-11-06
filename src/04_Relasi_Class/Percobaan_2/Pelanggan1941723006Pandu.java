/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandu.relasiclass.percobaan2;

/**
 *
 * @author user
 */
public class Pelanggan1941723006Pandu {
    private String mNama;
    private Mobil1941723006Pandu mMobil;
    private Sopir1941723006Pandu mSopir;
    private int mHari;

    public Pelanggan1941723006Pandu() {
    }
    
    public void setNama(String nama){
        this.mNama = nama;
    }
    
    public void setMobil(Mobil1941723006Pandu mobil){
        this.mMobil = mobil;
    }
    
    public void setSopir(Sopir1941723006Pandu sopir){
        this.mSopir = sopir;
    }
    
    public void setHari(int hari){
        this.mHari = hari;
    }
    
    String getNama(){
        return mNama;
    }
    
    Mobil1941723006Pandu getMobil(){
        return mMobil;
    }
    
    Sopir1941723006Pandu getSopir(){
        return mSopir;
    }
    
    int getHari(){
        return mHari;
    }
    
    public int hitungBiayaTotal(){
        return mMobil.hitungBiayaMobil(mHari) + mSopir.hitungBiayaSopir(mHari);
    }
}
