/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js7_tugas;

/**
 *
 * @author user
 */
public class Segitiga1941723006Pandu {
    private int mSudut;
    
    public int totalSudutPandu(int sudutA){
        return mSudut = 180 - sudutA;
    }
    
    public int totalSudutPandu(int sudutA, int sudutB){
        return mSudut = 180 - (sudutA + sudutB);
    }
    
    public int kelilingPandu(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }
    
    public double kelilingPandu(int sisiA, int sisiB){
        return Math.sqrt(sisiA * sisiA) + Math.sqrt(sisiB * sisiB);
    }
    
    public void infoPandu(){
        System.out.println("Keliling Segitiga sudut : " + kelilingPandu(mSudut, mSudut));
        System.out.println("Keliling Segitiga : " + kelilingPandu(mSudut, mSudut, mSudut));
        System.out.println("Total Sudut : " + totalSudutPandu(mSudut));
        System.out.println("Total Sudut : " + totalSudutPandu(mSudut, mSudut));
    }
}
