package com.mycompany.barang;

public class Barang1941723006Pandu {
    public String mKode, mNamaBarang;
    public int mHargaDasar;
    public float mDiskon;
    
    public void sTampilData(){
        System.out.println("Kode Barang : " + mKode);
        System.out.println("Nama Barang : " + mNamaBarang);
        System.out.println("Harga : "       + mHargaDasar);
        System.out.println("Diskon : "      + mDiskon*100 + ("%"));
        System.out.println("Biaya Total : " + sHitungHargaJual() + ("Rupiah"));        
    }
    
    float sHitungHargaJual(){
        return mHargaDasar-(mDiskon*mHargaDasar);
    }
}
