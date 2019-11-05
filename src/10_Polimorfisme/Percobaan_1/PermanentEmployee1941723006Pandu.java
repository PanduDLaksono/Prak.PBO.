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
public class PermanentEmployee1941723006Pandu extends Employee1941723006Pandu implements IPayable1941723006Pandu{
    public int mSalary;

    public PermanentEmployee1941723006Pandu(String mName, int mSalary) {
        this.mSalary = mSalary;
        this.mName = mName;
    }

    public int getSalaryPandu() {
        return mSalary;
    }

    public void setSalaryPandu(int salary) {
        this.mSalary = salary;
    }

    @Override
    public int getPaymentAmountPandu() {
        return (int) (mSalary + 0.5 * mSalary);
    }

    @Override
    public String getEmployeeInfoPandu() {
        String info = super.getEmployeeInfoPandu() + "\n";
        info += "Registeged as intership employee for " + mSalary + "month/s\n";
        return info;
    }
    
    
}
