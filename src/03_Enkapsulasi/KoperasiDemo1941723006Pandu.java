/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasigettersetter;

/**
 *
 * @author user
 */
public class KoperasiDemo1941723006Pandu {
    public static void main(String[] args) {
        Anggota1941723006Pandu anggota1 = new Anggota1941723006Pandu("Iwan","Jalan Mawar");
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp " +anggota1.getSimpan());
        
        anggota1.setNama("Iwan Setyawan");
        anggota1.setAlamat("Jalan Soekarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp " +anggota1.getSimpan());
        
        anggota1.pinjam(5000);
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp " +anggota1.getSimpan());
    }
}
