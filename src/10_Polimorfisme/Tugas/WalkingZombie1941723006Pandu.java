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
public class WalkingZombie1941723006Pandu extends Zombie1941723006Pandu{

    public WalkingZombie1941723006Pandu(int mHealth, int mLevel) {
        super.mHealth = mHealth;
        super.mLevel = mLevel;
    }

    @Override
    public void healPandu() {
       switch(this.mLevel){
            case 1: this.mHealth += (20/100 * this.mHealth);break;
            case 2: this.mHealth += (30/100 * this.mHealth);break;
            case 3: this.mHealth += (40/100 * this.mHealth);break;
        }
    }
    
    @Override
    public String getZombieInfoPandu() {
        String info = super.getZombieInfoPandu();
        return "Walking Zombie Data = \n"
        + info;
    }

    @Override
    public void destroyedPandu() {
        this.mHealth -= (20 * this.mHealth / 100);
    }
    
}
