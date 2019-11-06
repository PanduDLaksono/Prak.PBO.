/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js7_latihan1;

/**
 *
 * @author user
 */
public class Perkalianku194172300Pandu {
    void perkalianPandu(int mA, int mB){
        System.out.println(mA * mB);
    }
    
    void perkalianPandu(int mA, int mB, int mC){
        System.out.println(mA * mB * mC);
    }
    
    public static void main(String[] args) {
        Perkalianku194172300Pandu objek = new Perkalianku194172300Pandu();
        
        objek.perkalianPandu(25, 43);
        objek.perkalianPandu(34, 23, 46);
    }
}
