/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js7_lathian2;

/**
 *
 * @author user
 */
public class Perkalianku1941723006Pandu {
    void perkalianPandu(int mA, int mB){
        System.out.println(mA * mB);
    }
    
    void perkalianPandu(double mA, double mB){
        System.out.println(mA * mB);
    }
    
    public static void main(String[] args) {
        Perkalianku1941723006Pandu objek = new Perkalianku1941723006Pandu();
        
        objek.perkalianPandu(25, 43);
        objek.perkalianPandu(34.56, 23.7);
    }
}
