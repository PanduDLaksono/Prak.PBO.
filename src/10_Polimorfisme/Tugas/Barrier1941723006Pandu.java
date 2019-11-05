/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js10_tugas;

/**
 *
 * @author user
 */
public class Barrier1941723006Pandu implements IDestroyable1941723006Pandu{
    private int mStrength;

    public Barrier1941723006Pandu(int mStrength) {
        this.mStrength = mStrength;
    }

    public int getStrengthPandu() {
        return mStrength;
    }

    public void setStrengthPandu(int strength) {
        this.mStrength = strength;
    }
        
    @Override
    public void destroyedPandu() {
        this.mStrength -= (0.1 * this.mStrength);
    }
    
    public String getBarrierInfoPandu(){
        return "Barrier Strength = " + this.mStrength;
    }
        
}
