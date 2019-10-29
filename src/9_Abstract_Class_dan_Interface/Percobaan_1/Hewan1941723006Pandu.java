/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js9_percobaan1;

/**
 *
 * @author user
 */
public abstract class Hewan1941723006Pandu {
    private int mUmur;

    protected Hewan1941723006Pandu() {
        this.mUmur = 0;
    }
    
    public void bertambahUmurPandu(){
        this.mUmur += 1;
    }
    
    public abstract void bergerakPandu();
}
