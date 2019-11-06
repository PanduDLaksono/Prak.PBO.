package com.mycompany.tokovideogame;

public class PeminjamanGame1941723006Pandu {
    String mNamaMember, mNamaGame;
    int mIdGame, mHarga, mLamaSewa, mTotalPinjam;
    
    public void sTampilPinjam1941723006Pandu(){
        System.out.println("Kode Game : " + mIdGame);        
        System.out.println("Nama Member : " + mNamaMember);        
        System.out.println("Judul Game : " + mNamaGame);        
        System.out.println("Lawa Pinjam : " + mLamaSewa);        
        System.out.println("Harga Pinjam : " + mHarga);        
        System.out.println("Total Biaya : " + sTotalPinjam1941723006Pandu());        
    }
    
    int sTotalPinjam1941723006Pandu(){  
        return mLamaSewa*mHarga;
    }
}
