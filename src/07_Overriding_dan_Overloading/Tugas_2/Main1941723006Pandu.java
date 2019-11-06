/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.js7_tugas2;

/**
 *
 * @author user
 */
public class Main1941723006Pandu {
    public static void main(String[] args) {
        Manusia1941723006Pandu man = new Manusia1941723006Pandu();
        Manusia1941723006Pandu dos = new Dosen1941723006Pandu();
        Manusia1941723006Pandu mhs = new Mahasiswa1941723006Pandu();
        
        System.out.println("==================");
        man.makanPandu();
        man.bernafasPandu();
        System.out.println("==================");
        dos.makanPandu();
        System.out.println("==================");
        mhs.makanPandu();
        System.out.println("==================");
    }
}
