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
public class Tester3_1941723006Pandu {
    public static void main(String[] args) {
        PermanentEmployee1941723006Pandu pEmp = new PermanentEmployee1941723006Pandu("Dendi", 500);
        InternshipEmployee1941723006Pandu iEmp = new InternshipEmployee1941723006Pandu("Sunarto", 5);
        ElectricityBill1941723006Pandu eBill = new ElectricityBill1941723006Pandu(5, "A-1");
        Employee1941723006Pandu e[] = {pEmp, iEmp};
        IPayable1941723006Pandu p[] = {pEmp, eBill};
//        Employee1941723006Pandu e2[] = {pEmp, iEmp, eBill};
    }
   
}
