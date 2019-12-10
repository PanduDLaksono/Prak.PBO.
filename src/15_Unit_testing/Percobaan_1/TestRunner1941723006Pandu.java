/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js15_unittest;

import js15_unittest.database.Anggota1941723006PanduTest;
import js15_unittest.database.Kategori1941723006PanduTest;
import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

/**
 *
 * @author bonek
 */
public class TestRunner1941723006Pandu {
    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessor1941723006PanduTest.class);
        showMessageResult(mResult, MessageProcessor1941723006PanduTest.class.getSimpleName());
        
//        mResult = new JUnitCore().runClasses(Kategori1941723006PanduTest.class);
//        showMessageResult(mResult, Kategori1941723006PanduTest.class.getSimpleName());
//        
//        mResult = new JUnitCore().runClasses(Anggota1941723006PanduTest.class);
//        showMessageResult(mResult, Anggota1941723006PanduTest.class.getSimpleName());
    }
    
    private static void showMessageResult(Result mResult, String className){
        if (mResult.wasSuccessful()) {
            System.out.format("The result test from %s : %s\n", className, mResult.wasSuccessful());
        }
        else{
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
