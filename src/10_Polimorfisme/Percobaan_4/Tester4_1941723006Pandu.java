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
public class Tester4_1941723006Pandu {
    public static void main(String[] args) {
        Owner1941723006Pandu ow = new Owner1941723006Pandu();
        ElectricityBill1941723006Pandu eBill = new ElectricityBill1941723006Pandu(5, "R-1");
        ow.payPandu(eBill);
        System.out.println("----------------------------------");
        
        PermanentEmployee1941723006Pandu pEmp = new PermanentEmployee1941723006Pandu("Dendi", 500);
        ow.payPandu(pEmp);
        System.out.println("----------------------------------");
        
        InternshipEmployee1941723006Pandu iEmp = new InternshipEmployee1941723006Pandu("Sinarto", 5);
        ow.showMyEmployeePandu(pEmp);
        System.out.println("----------------------------------");
        ow.showMyEmployeePandu(iEmp);
    }
}
