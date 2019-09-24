/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandu.relasiclass.percobaan4;

/**
 *
 * @author user
 */
public class Penumpang1941723006Pandu {
    String mKTP, mNama;

    public Penumpang1941723006Pandu(String mKTP, String mNama) {
        this.mKTP = mKTP;
        this.mNama = mNama;
    }
    
    public void setKTPPandu(String KTP){
        this.mKTP = KTP;
    }
    
    String getKTPPandu(){
        return mKTP;
    }
    
    public void setNamaPandu(String nama){
        this.mNama = nama;
    }
    
    String getNamaPandu(){
        return mNama;
    }
    
    public String infoPandu(){
        String info = "";
        info += "KTP : " + mKTP + "\n";
        info += "Nama : " + mNama + "\n";
        return info;
    }
}
