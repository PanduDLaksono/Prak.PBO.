/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author user
 */
public class Mahasiswa1941723006Pandu {
    protected String mNama;

    public Mahasiswa1941723006Pandu(String nama) {
        this.mNama = nama;
    }
    
    public void kuliahDiKampusPandu(){
        System.out.println("Aku Mahasiswa, Namaku " + this.mNama);
        System.out.println("Aku berkuliah di Kampus.");
    }
}
