/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandu.relasiclass.percobaan3;

/**
 *
 * @author user
 */
public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai1941723006Pandu masinis = new Pegawai1941723006Pandu("1234", "Spongebob Squarepants");
        Pegawai1941723006Pandu asisten = new Pegawai1941723006Pandu("4567", "Patrick Star");
        KeretaApi1941723006Pandu keretaApi = new KeretaApi1941723006Pandu("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
