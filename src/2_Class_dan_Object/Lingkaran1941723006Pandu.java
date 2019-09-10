package com.mycompany.lingkaran;

public class Lingkaran1941723006Pandu {
    double mPhi, mR, mHitungLuas, mHitungKll;
    
    public void sTampilLingkaran(){
        System.out.println("Nilai Phi : " + mPhi);
        System.out.println("Nilai jari - jari : " + mR);
        System.out.println("Keliling Lingkaran : " + sHitungKll() +("cm"));
        System.out.println("Luas Lingkaran : " + sHitungLuas());
    }
    
    double sHitungLuas(){
        return mPhi*mR*mR;
    }
    
    double sHitungKll(){
        return mPhi*(2*mR);
    }
}
