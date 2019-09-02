
package com.mycompany.lpg;

public class EaseLPG extends LPG{
    private String warna;
    
    public void warnaTabung(String newValue){
        warna = newValue;
    }
    
    public void tampilHasil(){
        System.out.println("Warna Tabung : " + warna);
    }
}
