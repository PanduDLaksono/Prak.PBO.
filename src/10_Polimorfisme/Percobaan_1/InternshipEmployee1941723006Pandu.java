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
public class InternshipEmployee1941723006Pandu extends Employee1941723006Pandu{
    private int mLength;

    public InternshipEmployee1941723006Pandu(String mName, int mLength) {
        this.mLength = mLength;
        this.mName = mName;
    }

    public int getLengthPandu() {
        return mLength;
    }

    public void setLengthPandu(int length) {
        this.mLength = length;
    }

    @Override
    public String getEmployeeInfoPandu() {
        String info = super.getEmployeeInfoPandu() + "\n";
        info += "Registeged as intership employee for " + mLength + "month/s\n";
        return info;
    }
    
    
}
