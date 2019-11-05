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
public class JumpingZombie1941723006Pandu extends Zombie1941723006Pandu{

    public JumpingZombie1941723006Pandu(int mHeath, int mLevel) {
        super.mHealth = mHeath;
        super.mLevel = mLevel;
    }

    @Override
    public String getZombieInfoPandu() {
        String info = super.getZombieInfoPandu();
        return "Jumping Zombie Data = \n"
        + info;
    }

    @Override
    public void destroyedPandu() {
        this.mHealth -= (10 * this.mHealth / 100);
    }

    @Override
    public void healPandu() {
        switch(this.mLevel){
            case 1: this.mHealth += (30/100 * this.mHealth);
            break;
            
            case 2: this.mHealth += (40/100 * this.mHealth);
            break;
            
            case 3: this.mHealth += (50/100 * this.mHealth);
            break;
        }
    }
    
}
