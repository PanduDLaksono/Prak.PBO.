/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js6_percobaan2;

/**
 *
 * @author user
 */
public class ClassB1941723006Pandu extends ClassA1941723006Pandu{
    private int mZ;
    
    public void setZPandu(int z){
        this.mZ = z;
    }

    public int getZPandu() {
        return mZ;
    }
    
    public void getNilaiZPandu(){
        System.out.println("Nilai z : " + mZ);
    }
    
    public void getJumlahPandu(){
        System.out.println("Jumlah : " + (super.getXPandu() + super.getYPandu() + mZ));
    }
}
