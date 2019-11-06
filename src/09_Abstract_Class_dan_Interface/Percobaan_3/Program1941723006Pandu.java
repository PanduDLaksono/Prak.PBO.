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
public class Program1941723006Pandu {
    public static void main(String[] args) {
        Rektor1941723006Pandu pakRektor = new Rektor1941723006Pandu();
        
        Mahasiswa1941723006Pandu mahasiswaB = new Mahasiswa1941723006Pandu("Charlie");
        Sarjana1941723006Pandu sarjanaC = new Sarjana1941723006Pandu("Dhina");
        PascaSarjana1941723006Pandu masterC = new PascaSarjana1941723006Pandu("Elok");
        
//        pakRektor.bersertifikatCumlaudePandu(mahasiswaB);
//        pakRektor.bersertifikatCumlaudePandu(sarjanaC);
//        pakRektor.bersertifikatCumlaudePandu(masterC);

        pakRektor.beriSertifikatMawapres(sarjanaC);
        pakRektor.beriSertifikatMawapres(masterC);
    }
}
