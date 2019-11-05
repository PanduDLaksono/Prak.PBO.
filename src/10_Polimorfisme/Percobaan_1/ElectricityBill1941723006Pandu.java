/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js10_percobaan1;

/**
 *
 * @author user
 */
public class ElectricityBill1941723006Pandu implements IPayable1941723006Pandu{
    private int mKwh;
    private String mCategory;

    public ElectricityBill1941723006Pandu(int mKwh, String mCategory) {
        this.mKwh = mKwh;
        this.mCategory = mCategory;
    }

    public int getKwhPandu() {
        return mKwh;
    }

    public void setKwhPandu(int kwh) {
        this.mKwh = kwh;
    }

    public String getCategoryPandu() {
        return mCategory;
    }

    public void setCategoryPandu(String category) {
        this.mCategory = category;
    }
    
    public int getBasedPricePandu(){
        int bPrice = 0;
        switch(mCategory){
            case "R-1" : bPrice = 100;break;
            case "R-2" : bPrice = 200;break;
        }
        return bPrice;
    }
    
    @Override
    public int getPaymentAmountPandu() {
        return mKwh * getBasedPricePandu();
    }
    
    public String getBillInfoPandu(){
        return "kWH = " + mKwh + "\n" + "Category = " + mCategory + "(" + getBasedPricePandu() + " per kWH) \n";
    }
}
