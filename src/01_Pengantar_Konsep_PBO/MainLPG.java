package com.mycompany.lpg;

public class MainLPG {
    public static void main(String[] args) {
        LPG lpg1 = new LPG();
        LPG lpg2 = new LPG();
        LPG lpg3 = new LPG();
        EaseLPG lpg4 = new EaseLPG();
        
        lpg1.defJenis("Elpiji 3KG");
        lpg1.Berat(3);
        lpg1.Price(16000);
        lpg1.tambahStok(30);
        lpg1.kurangStok(8);
        lpg1.tampilHasil();
        
        lpg2.defJenis("Elpiji Biru 12KG");
        lpg2.Berat(12);
        lpg2.Price(72000);
        lpg2.tambahStok(15);
        lpg2.kurangStok(3);
        lpg2.tampilHasil();
        
        lpg3.defJenis("Bright Gas 12KG");
        lpg3.Berat(12);
        lpg3.Price(130000);
        lpg3.tambahStok(5);
        lpg3.kurangStok(2);
        lpg3.tampilHasil();
        
        lpg4.defJenis("Ease Gas 3KG");
        lpg4.Berat(3);
        lpg4.Price(95000);
        lpg4.tambahStok(5);
        lpg4.kurangStok(2);
        lpg4.warnaTabung("Emas");
        lpg4.tampilHasil();
    }
}
