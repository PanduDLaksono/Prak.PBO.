 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js6_percobaan3;

/**
 *
 * @author user
 */
public class Tabung1941723006Pandu extends Bangun1941723006Pandu{
    protected int mT;
    
    public void setSuperPhiPandu(double phi){
        super.mPhi = phi;
    }
    
    public void setSuperRPandu(int r){
        super.mR = r;
    }
    
    public void setTPandu(int t){
        this.mT = t;
    }
    
    public void volumeTabungPandu(){
            System.out.println("Volume tabung : " + (super.mPhi * super.mR * super.mR * mT));
    }
}
