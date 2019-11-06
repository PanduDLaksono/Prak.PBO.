/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandu.relasiclass.percobaan4;

/**
 *
 * @author user
 */
public class MainPercobaan41941723006Pandu {
    public static void main(String[] args) {
        Penumpang1941723006Pandu p = new Penumpang1941723006Pandu("12345", "Mr. Krab");
        Penumpang1941723006Pandu budi = new Penumpang1941723006Pandu("67890", "Budi");
        Gerbong1941723006Pandu gerbong = new Gerbong1941723006Pandu("A", 10);
        gerbong.setPenumpangPandu(p, 1);
        gerbong.setPenumpangPandu(budi, 2);
        System.out.println(gerbong.infoPandu());
    }
}
