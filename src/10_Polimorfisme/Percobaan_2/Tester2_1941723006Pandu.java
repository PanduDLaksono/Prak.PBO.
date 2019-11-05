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
public class Tester2_1941723006Pandu {
    public static void main(String[] args) {
        PermanentEmployee1941723006Pandu pEmp = new PermanentEmployee1941723006Pandu("Dendi", 500);
        Employee1941723006Pandu e;
        e = pEmp;
        
        System.out.println("" + e.getEmployeeInfoPandu());
        System.out.println("----------------------------");
        System.out.println("" + pEmp.getEmployeeInfoPandu());
    }
}
