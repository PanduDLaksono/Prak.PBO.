/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js6_tugas;

/**
 *
 * @author user
 */
public class MainTugas1941723006Pandu {
    public static void main(String[] args) {
        System.out.println("==========Data PC===============");
        PC1941723006Pandu PC  = new PC1941723006Pandu();
        PC.mMerek = "Razer";
        PC.mJnsProcessor = "Intel Core i9 9th gen";
        PC.mKecProcessor = 2;
        PC.mSizeMemory = 4;
        PC.mUkuranMonitor = 27;
        PC.tampilPcPandu();
        System.out.println("==========Data Windows==========");
        Windows1941723006Pandu win = new Windows1941723006Pandu("Touchscreen", "Li-On", "Windows 10", "Intel core i7 10th gen", 3, 16);
        win.tampilWindowsPandu();
        System.out.println("==========Data Mac==============");
        Mac1941723006Pandu mac = new Mac1941723006Pandu("Catalina", "Li-On", "Macbook T2", "Intel core i9 9th gen", 3, 32);
        mac.tampilMacPandu();
        System.out.println("================================");
    }
}
