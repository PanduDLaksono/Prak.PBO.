/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandu.relasiclass.percobaan1;

/**
 *
 * @author user
 */
public class Laptop1941723006Pandu {
    private String mMerk;
    private Processor1941723006Pandu mProc;

    public Laptop1941723006Pandu() {
    }
    
    public Laptop1941723006Pandu(String mMerk, Processor1941723006Pandu mProc) {
        this.mMerk = mMerk;
        this.mProc = mProc;
    }
    
    public void setMerkPandu(String merk){
    
        this.mMerk = merk;
    }
    
    public void setProcPandu(Processor1941723006Pandu proc){
        this.mProc = proc;
    }
    
    public void infoPandu(){
        System.out.println("Merk Laptop" + mMerk);
        mProc.infoPandu();
    }
}
