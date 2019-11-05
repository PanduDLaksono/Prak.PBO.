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
public abstract class Zombie1941723006Pandu implements IDestroyable1941723006Pandu{
    protected int mHealth, mLevel;

    public void healPandu(){
        
    }
    
    @Override
    public void destroyedPandu(){
        
    }
    
    public String getZombieInfoPandu(){
        return "Health = " + this.mHealth + "\n" + "Level = " + this.mLevel + "\n";
    }
}
