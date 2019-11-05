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
public class Owner1941723006Pandu {
    public void payPandu(IPayable1941723006Pandu p){
        System.out.println("Total Payment = " + p.getPaymentAmountPandu());
        if (p instanceof ElectricityBill1941723006Pandu){
            ElectricityBill1941723006Pandu eb = (ElectricityBill1941723006Pandu) p;
            System.out.println("" + eb.getBillInfoPandu());
        }else if(p instanceof PermanentEmployee1941723006Pandu){
            PermanentEmployee1941723006Pandu pe = (PermanentEmployee1941723006Pandu) p;
            pe.getEmployeeInfoPandu();
            System.out.println("" + pe.getEmployeeInfoPandu());
        }
    }
    
    public void showMyEmployeePandu(Employee1941723006Pandu e){
        System.out.println("" + e.getEmployeeInfoPandu());
        if (e instanceof PermanentEmployee1941723006Pandu) {
            System.out.println("You have to pay her/him monthly !!!");
        }else
            System.out.println("No need to pay him/her...");
    }
}
