/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandu.relasiclass.percobaan3;

/**
 *
 * @author user
 */
public class Pegawai1941723006Pandu {
    private String mNIP, mNama;

    public Pegawai1941723006Pandu(String mNIP, String mNama) {
        this.mNIP = mNIP;
        this.mNama = mNama;
    }
    
    public void setNIP(String nip){
        this.mNIP = nip;
    }
    
    public void setNama(String nama){
        this.mNama = nama;
    }
    
    String getNIP(){
        return mNIP;
    }
    
    String getNama(){
        return mNama;
    }
    
    public String info(){
        String info = "";
        info += "NIP : " + this.mNIP + "\n";
        info += "Nama : " + this.mNama + "\n";
        return info;
    }
}
