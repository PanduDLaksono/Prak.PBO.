/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motorencapsulation;

/**
 *
 * @author user
 */
public class Motor1941723006Pandu {
    private int mKecepatan = 0;
    private boolean mKontakOn = false;
    
    public void nyalakanMesin(){
        mKontakOn = true;
    }
    
    public void matikanMesin(){
        mKontakOn = false;
        mKecepatan = 0;
    }
    
    public void tambahKecepatan(){
        if (mKontakOn == true ) {
            if (mKecepatan<=100) {
                mKecepatan += 5;                
            }else{
                System.out.println("Kecepatan Maksimum");
            }
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off! \n");
        }
    }
    
    public void kurangiKecepatan(){
        if (mKontakOn == true) {
            mKecepatan -= 5;
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena mesin Off! \n");
        }
    }
    
    public void printStatus(){
        if (mKontakOn == true) {
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " +mKecepatan+ "\n");
    }
}
