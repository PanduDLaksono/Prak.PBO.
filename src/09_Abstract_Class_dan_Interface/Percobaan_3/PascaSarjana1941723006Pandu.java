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
public class PascaSarjana1941723006Pandu extends Mahasiswa1941723006Pandu implements ICumlaude1941723006Pandu, IBerprestasi1941723006Pandu{

    public PascaSarjana1941723006Pandu(String nama) {
        super(nama);
    }
    
    @Override
    public void lulusPandu() {
        System.out.println("Aku Sudah Menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggiPandu() {
        System.out.println("IPK-ku lebihd ari 3.71");
    }

    @Override
    public void kuliahDiKampusPandu() {
        super.kuliahDiKampusPandu(); 
    }

    @Override
    public void menjuaraiKompetisiPandu() {
        System.out.println("Saya Telah Menjuarai Kompetisi Internasional");
    }

    @Override
    public void membuatPublikasiIlmiahPandu() {
        System.out.println("Saya Menerbitkan Artikel di Jurnal Internasional");
    }
    
    
}
