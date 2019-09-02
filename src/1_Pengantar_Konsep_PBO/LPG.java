package com.mycompany.lpg;

public class LPG {
    private String jenis;
    private int kapasitas, jumlah, kurang, harga, sisa;
    
    public void defJenis(String newValue){
        jenis = newValue; 
    }
    
    public void Berat(int newValue){
        kapasitas = newValue;
    }
    
    public void Price(int newValue){
        harga = newValue;
    }
    
    public void tambahStok(int increment){
        jumlah = jumlah + increment;
    }
    
    public void kurangStok(int decrement){
        kurang = jumlah - decrement;
    }
    
    public void tampilHasil(){
        System.out.println("Nama Tabung : " + jenis);
        System.out.println("Berat Tabung dalam KG : " + kapasitas);
        System.out.println("Harga : " + harga);
        System.out.println("Tambah Stok : " + jumlah);
        System.out.println("Terjual : " + kurang);
               
    }
    
}
