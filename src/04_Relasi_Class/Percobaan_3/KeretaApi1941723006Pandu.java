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
public class KeretaApi1941723006Pandu {
    private String mNama, mKelas;
    private Pegawai1941723006Pandu mMasinis, mAsisten;
    
    public KeretaApi1941723006Pandu(String mNama, String mKelas, Pegawai1941723006Pandu mMasinis) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
        
    }
    
    public KeretaApi1941723006Pandu(String mNama, String mKelas, Pegawai1941723006Pandu mMasinis, Pegawai1941723006Pandu mAsisten) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
        this.mAsisten = mAsisten;
    }
    
    public void setNama (String nama){
        this.mNama = nama;
    }
    
    public void setKelas(String kelas){
        this.mKelas = kelas;
    }
    
    public void setMasinis(Pegawai1941723006Pandu masinis){
        this.mMasinis = masinis;
    }
    
    public void setAsisten(Pegawai1941723006Pandu asisten){
        this.mAsisten = asisten;
    }
    
    String getNama(){
        return mNama;
    }
    
    String getKelas(){
        return mKelas;
    }
    
    Pegawai1941723006Pandu getMasinis(){
        return mMasinis;
    }
    
    Pegawai1941723006Pandu getAsisten(){
        return mAsisten;
    }
    
    public String info() {
        String info = "";
        info += "Nama: " + this.mNama + "\n";
        info += "Kelas: " + this.mKelas + "\n";
        info += "Masinis: " + this.mMasinis.info() + "\n";
        info += "Asisten: " + this.mAsisten.info() + "\n";
        return info;
    }
}
