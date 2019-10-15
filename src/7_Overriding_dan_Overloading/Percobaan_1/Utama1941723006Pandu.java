/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js7_percobaan1;

/**
 *
 * @author user
 */
public class Utama1941723006Pandu {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager dan Staff");
        Manager1941723006Pandu man[] = new Manager1941723006Pandu[2];
        Staff1941723006Pandu staff1[] = new Staff1941723006Pandu[2];
        Staff1941723006Pandu staff2[] = new Staff1941723006Pandu[3];
        
        man[0] = new Manager1941723006Pandu();
        man[0].setNamaPandu("Tedjo");
        man[0].setNIPPandu("123");
        man[0].setGolonganPandu("1");
        man[0].setTunjanganPandu(5000000);
        man[0].setBagianPandu("Administrasi");
                
        man[1] = new Manager1941723006Pandu();
        man[1].setNamaPandu("Atika");
        man[1].setNIPPandu("102");
        man[1].setGolonganPandu("1");
        man[1].setTunjanganPandu(2500000);
        man[1].setBagianPandu("Pemasaran");
        
        staff1[0] = new Staff1941723006Pandu();
        staff1[0].setNamaPandu("Usman");
        staff1[0].setNIPPandu("0003");
        staff1[0].setGolonganPandu("2");
        staff1[0].setLemburPandu(10);
        staff1[0].setGajiLemburPandu(10000);
        
        staff1[1] = new Staff1941723006Pandu();
        staff1[1].setNamaPandu("Anugrah");
        staff1[1].setNIPPandu("0005");
        staff1[1].setGolonganPandu("2");
        staff1[1].setLemburPandu(10);
        staff1[1].setGajiLemburPandu(55000);
        man[0].setStaffPandu(staff1);
        
        staff2[0] = new Staff1941723006Pandu();
        staff2[0].setNamaPandu("Hendra");
        staff2[0].setNIPPandu("0004");
        staff2[0].setGolonganPandu("3");
        staff2[0].setLemburPandu(15);
        staff2[0].setGajiLemburPandu(5500);
        
        staff2[1] = new Staff1941723006Pandu();
        staff2[1].setNamaPandu("Arie");
        staff2[1].setNIPPandu("0006");
        staff2[1].setGolonganPandu("4");
        staff2[1].setLemburPandu(5);
        staff2[1].setGajiLemburPandu(100000);
        
        staff2[2] = new Staff1941723006Pandu();
        staff2[2].setNamaPandu("Mentari");
        staff2[2].setNIPPandu("0007");
        staff2[2].setGolonganPandu("3");
        staff2[2].setLemburPandu(6);
        staff2[2].setGajiLemburPandu(20000);
        man[1].setStaffPandu(staff2);
        
        man[0].lihatInfoPandu();
        man[1].lihatInfoPandu();
    }
}
