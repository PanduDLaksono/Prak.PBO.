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
public class Processor1941723006Pandu {
    private  String mMerk;
    private double mCache;

    public Processor1941723006Pandu() {
    }
    
    public Processor1941723006Pandu(String mMerk, double mCache) {
        this.mMerk = mMerk;
        this.mCache = mCache;
    }
    
    public void setMerkPandu(String merk){
        this.mMerk = merk;
    }
    
    public void setCachePandu(double cache){
        this.mCache = cache;
    }
    
    public String getMerkPandu(){
        return mMerk;
    }
    
    public double getCachePandu(){
        return mCache;
    }
    
    public void infoPandu(){
        System.out.printf("Merk Processor = %s\n ", mMerk );
        System.out.printf("Cache Memory = %.2f\n ", mCache);
    }
}
