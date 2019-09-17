/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasisimpanpinjam;

/**
 *
 * @author user
 */
public class TestKoperasi1941723006Pandu {
    public static void main(String[] args) {
        Anggota1941723006Pandu donny = new Anggota1941723006Pandu("111333444","Donny",5000000);
        
        System.out.println("Nama Angggota : " +donny.getNama());
        System.out.println("Limit Pinjaman : " +donny.getLimitPinjaman());
        
        System.out.println("\nMeminjam uang 10.000.000 ...");
        donny.limit(10000000);
        System.out.println("Maaf jumlah pinjaman melebihi limit");
        
        System.out.println("\nMeminjam uang 4.000.000 ...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini : " +donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini : " +donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini : " +donny.getJumlahPinjaman());
    }
}
