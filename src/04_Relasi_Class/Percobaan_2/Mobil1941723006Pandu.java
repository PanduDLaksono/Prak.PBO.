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
public class Mobil1941723006Pandu {
  private String mMerk;
  private int mBiaya;

  public Mobil1941723006Pandu() {
  }
  
  public void setMerk(String merk){
      this.mMerk = merk;
  }
  
  public void setBiaya(int biaya){
      this.mBiaya = biaya;
  }
  
  String getMerk(){
      return mMerk;
  }
  
  int getBiaya(){
      return mBiaya;
  }
  
  public int hitungBiayaMobil(int hari){
      return mBiaya * hari;
  }
}
