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
public class Sopir1941723006Pandu {
    private String mNama;
    private int mBiaya;

    public Sopir1941723006Pandu() {
    }
    
    public void setNama(String nama){
        this.mNama = nama;
    }
    
    public void setBiaya(int biaya){
        this.mBiaya = biaya;
    }
    
    String getNama(){
        return mNama;
    }
    
    int getBiaya(){
        return mBiaya;
    }
    
    public int hitungBiayaSopir(int hari){
        return mBiaya * hari;
    }
}


