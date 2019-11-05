/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js10_tugas;

/**
 *
 * @author user
 */
public class Tester1941723006Pandu {
    public static void main(String[] args) {
        WalkingZombie1941723006Pandu wz = new WalkingZombie1941723006Pandu(100, 1);
        JumpingZombie1941723006Pandu jz = new JumpingZombie1941723006Pandu(100, 2);
        Barrier1941723006Pandu b = new Barrier1941723006Pandu(100);
        Plant1941723006Pandu p = new Plant1941723006Pandu();
        System.out.println("" + wz.getZombieInfoPandu());
        System.out.println("" + jz.getZombieInfoPandu());
        System.out.println("" + b.getBarrierInfoPandu());
        System.out.println("------------------------------------");

        for (int i = 0; i < 4; i++) {
            p.doDestroyedPandu(wz);
            p.doDestroyedPandu(jz);
            p.doDestroyedPandu(b);
        }
        
        System.out.println("" + wz.getZombieInfoPandu());
        System.out.println("" + jz.getZombieInfoPandu());
        System.out.println("" + b.getBarrierInfoPandu());
    }
}
