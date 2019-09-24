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
public class Gerbong1941723006Pandu {
    private String mKode;
    private Kursi1941723006Pandu[] mArrayKursi;
    private int mJumlah;

    public Gerbong1941723006Pandu(String mKode, int mJumlah) {
        this.mKode = mKode;
        this.mArrayKursi = new Kursi1941723006Pandu[mJumlah];
        this.initKursiPandu();
    }
    
    private void initKursiPandu(){
        for (int i = 0; i < mArrayKursi.length; i++){
            this.mArrayKursi[i] = new Kursi1941723006Pandu(String.valueOf(i + 1));
        }
    }
        
    public void setKodePandu(String kode){
        this.mKode = kode;
    }    
    
    public String getKodePandu(){
        return mKode;
    }
    
    public void setPenumpangPandu(Penumpang1941723006Pandu penumpang, int nomor){
        this.mArrayKursi[nomor -1].setPenumpangPandu(penumpang);
    }
    
    public Kursi1941723006Pandu[] getArrayKursiPandu(){
        return mArrayKursi;
    }
    
    public String infoPandu(){
        String info = "";
        info += "Kode: " + mKode + "\n";
        for (Kursi1941723006Pandu kursi : mArrayKursi) {
            info += kursi.infoPandu();
        }
        return info;
    }
}    