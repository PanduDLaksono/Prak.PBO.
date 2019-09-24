/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js4_tugas_lpg_pandu;

/**
 *
 * @author user
 */
public class MainTugas1941723006Pandu {
    public static void main(String[] args) {
        Penjual1941723006Pandu penjual = new Penjual1941723006Pandu("Pandu",50);
        Suplier1941723006Pandu agen = new Suplier1941723006Pandu("PT Preasetya",0);
        LPG1941723006Pandu k = new LPG1941723006Pandu("LPG 3Kg",3,16000);
        Pembeli1941723006Pandu buyer = new Pembeli1941723006Pandu("Joko Anwar",k, 5);
                
        System.out.println("====================================");
        System.out.println(buyer.infoPandu());
        System.out.println("====================================");
        System.out.println(agen.infoPandu());
        System.out.println(penjual.infoPandu());
        System.out.println("====================================");
        
    
    }
}
