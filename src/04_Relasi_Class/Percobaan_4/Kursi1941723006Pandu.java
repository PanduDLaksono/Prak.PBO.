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
public class Kursi1941723006Pandu {
    private String mNomor;
    private Penumpang1941723006Pandu mPenumpang;

    public Kursi1941723006Pandu(String mNomor) {
        this.mNomor = mNomor;
    }
    
    public void setNomorPandu(String nomor){
        this.mNomor = nomor;
    }
    
    String getNomorPandu(){
        return mNomor;
    }
    
    public void setPenumpangPandu(Penumpang1941723006Pandu penumpang){
        this.mPenumpang = penumpang;
    }
    
    Penumpang1941723006Pandu getPenumpangPandu(){
        return mPenumpang;
    }
    
    public String infoPandu(){
        String info = "";
        info +="Nomor : " + mNomor + "\n";
        if (this.mPenumpang != null) {
            info +="Penumpang : " + mPenumpang.infoPandu() + "\n";
        }
        return info;
    }
}
