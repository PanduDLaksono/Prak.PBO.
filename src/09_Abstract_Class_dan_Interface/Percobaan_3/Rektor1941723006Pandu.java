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
public class Rektor1941723006Pandu {
    public void bersertifikatCumlaudePandu(ICumlaude1941723006Pandu MahaICumlaude1941723006Pandu){
        System.out.println("Saya REKTOR, Memberikan Sertifilkat Cumlaude.");
        System.out.println("Selamat, Bagaimana adna bisa Cumlause ?");
        
        MahaICumlaude1941723006Pandu.kuliahDiKampusPandu();
        MahaICumlaude1941723006Pandu.lulusPandu();
        MahaICumlaude1941723006Pandu.meraihIPKTinggiPandu();
        
        System.out.println("---------------------------------------------"); 
    }
    public void beriSertifikatMawapres(IBerprestasi1941723006Pandu MaIBerprestasi1941723006Pandu){
        System.out.println("Saya REKTOR, Memberikan Sertifilkat MAWAPRES.");
        System.out.println("Selamat, Bagaimana adna bisa Berrpestasi ?");
        
        MaIBerprestasi1941723006Pandu.menjuaraiKompetisiPandu();
        MaIBerprestasi1941723006Pandu.membuatPublikasiIlmiahPandu();
        
        System.out.println("---------------------------------------------");
    }
}
