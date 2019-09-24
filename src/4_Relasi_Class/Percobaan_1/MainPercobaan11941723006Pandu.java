/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandu.relasiclass.percobaan1;

/**
 *
 * @author user
 */
public class MainPercobaan11941723006Pandu {
    public static void main(String[] args) {
        Processor1941723006Pandu p = new Processor1941723006Pandu("Intel i5", 3);
        Laptop1941723006Pandu L = new Laptop1941723006Pandu("Thinkpad", p);
        L.infoPandu();
        
        Processor1941723006Pandu p1 = new Processor1941723006Pandu();
        p1.setMerkPandu("Intel i5");
        p1.setCachePandu(4);
        
        Laptop1941723006Pandu L1 = new Laptop1941723006Pandu();
        L1.setMerkPandu("Thinkpad");
        L1.setProcPandu(p1);
        L1.infoPandu();
    }
}
